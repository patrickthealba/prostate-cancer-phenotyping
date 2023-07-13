Prostate Cancer Phenotyping NLP
=============

This is the code for the metastatic prostate cancer NLP system described in JCO informatics here: https://ascopubs.org/doi/full/10.1200/CCI.21.00030

And adapted and expanded for castrate resistant diagnosis in another paper currently under review. 


Project description:
--------------------

The goal of the current application is to extract an explicit documented diagnosis of prostate cancer that has progressed to metastasis.

### Leo pipeline
Defined in the Metastasis_Pipeline class, uses a collection of annotation components from the NLP Leo framework, a framework for building NLP pipelines. Each of these components (annotators) in the pipeline performs a specific task to extract and structure the information. Here are the main steps:

- Regex annotation: This step involves identifying terms related to metastasis and terms to exclude from consideration using regular expressions (RegexAnnotator). The terms and patterns for this step are read from the resource files Metastasis_Terms.groovy and Exclude.groovy.

- Merge overlapped annotations: Any overlapping annotations from the previous step are merged using the MergeAnnotator to form a single annotation.

- Component patterns identification: Several component patterns like hormone patterns, medication patterns, etc., are identified using the AnnotationPatternAnnotator and merged.

- Anchored sentence creation: Around the identified terms, an "anchored sentence" is created. The AnchoredSentenceAnnotator is used for this task, which considers a span of 200 characters around the term for the sentence.

- Context application: The ContextAnnotator is used to apply a context to the sentences from the previous step based on the context rules specified in contextRules.txt.

- Logic: Finally, the MetastasisLogic annotator is applied which creates the final output types. 

### Output Types

The current implementation of this system will output all instances of a  cancer pattern identified (regardless of site, mpca or crpc status).  This output will contain any combination of the components identified in the output table below, however, the only validated output of this system is the following flags which are populated in the logic annotator:

mPCa_flag: An instance of a metastatic prostate cancer diagnosis.

OR

Castrate_resistant: A flag to identify if the complete pattern is a positive castrate-resistant diagnosis.

Meaning if the intent of using this system is to identify patients with metastatic castrate-resistant prostate cancer, both the mpca_flag and castrate_resistant variable should = 1.

| Output Type               | Data Type     | Description                                                                                                                                 |
|---------------------------|---------------|---------------------------------------------------------------------------------------------------------------------------------------------|
| Text_ID                   | bigint        | A unique identifier for each document or text that is being processed. This helps to trace the origin of each annotation.                   |
| Term                      | varchar(300)  | The actual term that was identified in the text and annotated. This term relates to the Metastasis-related annotations.                     |
| Experiencer               | varchar(100)  | Context Component:  describe if the instances is related to the patient or somebody else.                |
| Negation                  | varchar(100)  | Context Component:  Indicates if the term identified in the text is negated, e.g., if the text indicates that a certain condition does not exist.                |
| Temporality               | varchar(100)  | Context Component: Provides context about the timing or sequence of the term in relation to the patient's condition. This could be historical, current, or hypothetical. |
| Modifier                  | varchar(100)  | Additional information that modifies the context or meaning of the term. E.g., a term could be "severe pain" where "severe" is the modifier for "pain". |
| Metastatic_term           | varchar(150)  | This is the metastic term identified in the text.                                                                                |
| Hormone_modifier          | varchar(150)  | Normalized "Hormone" term type. This modifier relates to the hormonal context of the term, such as indicating hormonal therapy or hormone-responsive condition.             |
| Hormone_modifier_term     | varchar(150)  | The term in the text that is associated with the hormone modifier.                                                                          |
| Treatment_modifier        | varchar(150)  | Normalized "Treatment" term type. This modifier gives information related to the treatment of the condition mentioned in the term.                                            |
| Treatment_term            | varchar(150)  | The term in the text that is associated with the treatment modifier.                                                                        |
| Castrate_sensitive        | varchar(150)  | Flag indicating if the diagnosis was described as being castrate senstive.  (NOTE:  This was output because identifying these components was a necessary aspect of identifying castrate resistance, however the system was never validated on its ability to explicitly identify castrate-sensitive patients.)                                          |
| Castrate_resistant        | varchar(150)  | Flag indicating if the diagnosis was described as being castrate resistant.                                           |
| Anatomy                   | varchar(150)  | Anatomy identified in a cancer pattern.  (Only cases where anatomy = prostate were validated for this implementation)                                                               |
| mPCa_flag                 | int           | A flag to indicate whether the term is related to metastatic prostate cancer (mPCa). The flag could be 0 (not related) or 1 (related).       |
| SpanStart                 | int           | The position in the text where the term starts.                                                                                             |
| SpanEnd                   | int           | The position in the text where the term ends.                                                                                               |
| Snippets                  | varchar(5000) | Portions of the original text where the term and related modifiers are found. This is useful for providing context for the annotations.     |


## Installation and deployment


This system is based on Leo architecture extending UIMA AS. For more info on Leo [http://department-of-veterans-affairs.github.io/Leo/]

To use this pipeline:

Follow the instructions to install and configure UIMA AS Steps 2.1-2.9.
- Start UIMA AS Broker.
- Configure reader and listeners.
- Three readers are available:
    - FileCollectionReaderConfig.groovy - Enter the path to the input directory to read simple text files. The files need to have .txt extension.
    - BatchDatabaseCollectionReaderConfig.groovy - Enter the database engine, database name, and input query. Update the batch parameters. If you have only one batch, change the ending index to be less than the batch size. If you are using this reader for batch reads, add a sequential numbering column called "RowNo" to your input table. The tags {min} and {max} will be automatically replaced with starting and ending RowNo for each batch until ending RowNo reaches the last endingIndex.
    - DatabaseCollectionReaderConfig.groovy - Enter the database engine, database name, and input query.
- Three listeners are available:
    - SimpleXmiListenerConfig. groovy - Enter the path to the output directory. A new directory with xmi files will be created.
    - CsvListenerConfig.groovy - this is an example of a custom CSV listener
    - MetastasisDatabaseListenerConfig.groovy - this is an example of a custom database listener.


