package resources

import gov.va.vinci.leo.regex.types.RegularExpressionType

/* An arbitrary name for this annotator. Used in the pipeline for the name of this annotation. */
name = "Metastatic Prostate Cancer Terms Terms"

configuration {
    /* All configuration for this annotator.

    *
    *
    * */
    defaults {
        /* Global for all configrations below if a property specified here is not overridden in a section below. */

        outputType = RegularExpressionType.class.canonicalName
        case_sensitive = false
        matchedPatternFeatureName = "pattern"
        concept_feature_name = "concept"
        groupFeatureName = "group"
    }

/*
* Concept Term Dictionaries in this System:
*
*  */


    "Metastatic" {
        expressions = [
                //'1-metastatic',
                //'2-metastatic',
                'metastatic',
                //Semantic Variants
                'mets',
                'metz',
                'met\'s',
                ' met ',
                'met\\.',
                'oligometastatic',
                'metastatic',
                //Lexical Variants
                'matastatic',
                'meastatic',
                'metastesis',
                'meatastatic',
                'metastatic,',
                'meatstatic',
                'mestastatic',
                'mestatatic',
                'mestatic',
                'metaastatic',
                'metasatatic',
                'metasatic',
                'metastaic',
                'metastais',
                'metastases',
                'metastasic',
                'metastasis',
                'metastastic',
                'metastastis',
                'metastat',
                'metastataic',
                'metastatatic',
                'metastatc',
                'metastates',
                'metastati',
                'metastatic',
                'metastatice',
                'metastatin',
                'metastatis',
                'metastatsis',
                'metastattic',
                'metastic',
                'metastitic',
                'metastsatic',
                'metastsic',
                'metaststic',
                'metasttaic',
                'metasttic',
                'metatastatic',
                'metatastic',
                'metatatic',
                'metatsatic',
                'metatstaic',
                'metatstatic',
                'metatstic',
                'metestatic',
                'methastatic',
                'metistatic',
                'metsatatic',
                'metstatic',
                'mtastatic',
                //Site specific phrase included here for now.  don't want to include terms separately, because may be confused for different cancers
                'liver\\s*metastasis'

        ]
        concept_feature_value = "Metastatic"
        outputType = "gov.va.vinci.types.Metastasis_Term"
    }


    "Prostate_specific_mets" {
        expressions = [
                'MRCPC',
                'MCRPC',
                'mPCa'

        ]
        concept_feature_value = "Prostate_Specific"
        outputType = "gov.va.vinci.types.Metastasis_Term"
    }

    "Prostate_specific_cancer" {
        expressions = [

                'PCA',
                'ONC PCA',
                ' APC ',
                ' ACP ',
                'CAP',
                'p-ca',
                'Px Ca',
                ' p ca ',

        ]
        concept_feature_value = "Prostate_Specific_Cancer"
        outputType = "gov.va.vinci.types.Metastasis_Disease"
    }

    "cr_resistant_prostate_specific_cancer" {
        expressions = [

                'CRPCa?',
                'HRPC',
                'HRPCa?',
                'AIPC'

        ]
        concept_feature_value = "cr_resistant_Specific_Cancer"
        outputType = "gov.va.vinci.types.Metastasis_Disease"
    }

    "cr_sensitive_prostate_specific_cancer" {
        expressions = [

                'CSPCa?',
                'HSPCa?',

        ]
        concept_feature_value = "cr_sensitive_Specific_Cancer"
        outputType = "gov.va.vinci.types.Metastasis_Disease"
    }

    "Staging_Criteria" {
        expressions = [


                //In this system stage IV, N1, and M1 cases identified as synonymous with metastatic,
                // All other stages found are output as 'cancer' terms instead of a metastatic terms
                //Next iteration utilizes the complete and validated stage system for these components, however, the initial validated system utilized these bulk regexes
                ' m1 ',
                'stage\\s*IV',
                'stage\\s*IV\\s*\\(D\\s*\\d\\)', //
                'AJCC\\s*stage\\s*IV',
                'stage\\s*4',
                'stage\\s*4\\s*\\(D\\s*\\d\\s*\\)',
                'AJCC\\s*stage\\s*4',
                'stage\\s*four',
                'AJCC\\s*stage\\s*four',
                'stage IV',
                'Stage 1V',
                'ST IV',
                'end stage',
                'end-stage',
                'stage D',
                'stage D\\s*2',
                'stage D\\s*II',
                'Stage: IV',
                'Stage:IV',
                'N1   M0',
                'Stage:  IV',
                'pT3bN1',
                'pT3aNxM1b',
                'pT3,N1,M1',
                'Stage IVA',
                'T2bN1Mx',
                'pT3aN1',
                'T4N0M0',
                'T2cNxM1b',
                'T2c, N2, MX',
                'TxNxM1',
                'T3bN1M0',
                'T3b N1 MX',
                'pT3aN1Mx',
                'pT3bN1Mx',
                'pT3bN1M0',
                'CLINICAL STAGE IV',
                'clinical stage T4',
                'T3bN1',
                'T3N1Mx',
                'T3N1',
                'pT3N1',
                'N1M0',
                'T3aN1M0',
                'Staging: IV - B',
                'T1cN1M0',
                'pT3cN1M0',
                'T3,\\s*NX,\\s*M1',
                'T1cN1M1b/IV',
                'T1c,Nx,M1b',
                'stage   IV',
                'T3N1M0',
                'T4N1M1',
                'T4 N1M1',
                'Tx,Nx,M1',
                'STAGE  IV',
                'T2cN1M0',
                'pT2cN1',
                'pT3aN1M0',
                'pT3a, N1, M0,',
                'pT3b N1',
                'cT4N0M0',
                'Stage  IV',
                'Stage IVB',
                'T4NxMx',
                'TX NX M1',
                'cTX NX M1',
                'pTX NX M1',
                'T4N1',
                't3n1mo',
                'T4NxM0',
                'TXN1M1',
                'STAGE:      IV',
                'pT3N1Mx',
                'pT4N0',
                'T2N1M0',
                'T2N1Mx',
                'T2N1M1',
                'T3 N1 M0',
                'T3aN1',
                'T3bN1Mx',
                'STAGE:Stage IV',
                'cT3aN1M0',
                'pT3cN3',
                'cT3bN1M1a',
                'pT3a N1',
                'pT2N1',
                'pT2cN1M0',
                'pT3N1M0',
                'NxM1',
                'clinical T4',
                'StageIV',
                'STAGING: IV',
                'T2b N1 M0',
                'T2bN1M0',
                't2bn0m1',
                'T3bN1M1',
                'T2N1',
                'T2cN1M1b',
                'pT4N0M0',
                'pT4N1',
                'T4N1Mx',
                'TNM: M1',
                'T3N1M1',
                'T4 N0',
                'T4 N0 M0',
                'T4N0Mx',
                'T3N2Mx',
                'T4N2M0',
                'T4Nx',
                'Stage IV',
                'STAGE:          iv',
                'T2CN1M1A',
                'T3b, N1, MX',
                'T3b N1 M0',
                'T2cN1',
                'T1cNXM1',
                'T2aN1M0',
                'T1c N1 M0',
                'cT1cNXM1b',
                'cT1cN0M1',
                'N1 M0',
                'cT3N1M0',
                'N1M1',
                'pT3b pN1',
                'pT2cN1Mx',
                'pT2bN1',
                'pT3 N1',
                'pT3a N1 M0',
                'PT3b N1 Mx',
                'pT3N1MO',
                'n3mo',
                'pT4 N1 Mx',
                'cT2cN1M0',
                'cT2bNxM1',
                'T1CN1M1',
        ]
        concept_feature_value = "Staging_Criteria"
        outputType = "gov.va.vinci.types.Metastasis_Term"
    }

    "Castrate" {
        expressions = [
                'androgen',
                'androgenic',
                'hormone',
                'harmone',
                'castrat',
                'castrate',
                'castration',
                'castrat',
                'castrtae',
                'catastrate',
                //Added with edit distance
                'androgens',
                'adrogen',
                'andorgen',
                'androgren',
                'andogen',
                'andrgen',
                'ADT',
                'indefinite\\s*ADT',
                //Hormone edit distance
                'hormine',
                'hormome',
                'hormon',
                'homone',
                'hormaone',
                'hormne',
                'harmone',
                'horomone',
                'hermone',
                'hormne',
                'hormine',
                'hromone',

        ]
        concept_feature_value = "castrate"
        outputType = "gov.va.vinci.types.Metastasis_Hormone_Term"
    }



    "refactory" {
        expressions = [

                //independent
                'independent',
                'independant',
                //'sensitive',
                //'sensative',
                //'senstive',
                'insensative',
                'insens',
                'insensitive',
                'refactor',
                'refractor',
                'refractory',
                'refactory',
                'refactory',
                //resist(a|e)nt
                'resist',
                'resistant',
                'resistamt',
                'resistent',
                'resistant',
                'resitent',
                'resitant',
                'resistance',
                'resistence',
                //Edit distance additions
                'resistive',
                'reistant',
                'resistnat',
                'resistnat',
                'resisant',
                'restistant',
                'resistane',
                'ressitant',
                'ressitant',
                'resistatn',
                'rsistant',
                'reistent',
                'resistand',
                'resistantce'

        ]
        concept_feature_value = "resistant"
        outputType = "gov.va.vinci.types.Metastasis_Hormone_Modifier"
    }


    "sensitive" {
        expressions = [

                //independent
                'sensitive',
                'sensative',
                'senstive',
                'responsive',
                'responding\\s*to',
                'naii?ve',


        ]
        concept_feature_value = "sensitive"
        outputType = "gov.va.vinci.types.Metastasis_Hormone_Modifier"
    }


    "Prostatectomy" {
        expressions = [

                //NOT PSA, but contextually similar feature
                'RRP',
                'prostatectomy',
                'radical\\s*prostatectomy',
                'Radical retropubic prostatectomy',
                'retropubic prostatectomy'

        ]
        concept_feature_value = "Prostatectomy"
        outputType = "gov.va.vinci.types.Metastasis_Anatomy"
    }

    "PSA" {
        expressions = [
                'PSA',
                'Prostate specific ant(o|i|e|a)g(e|o|i|a)n',
                'PSA\\s*level',
                'elevated\\s*PSA',
                'rising\\s*PSA',
                'PSA rising',
                'PSA\\s*level\\s*up\\s*to\\s*(\\d\\d?\\d?\\d?)?',
                'residual\\s*PSA',
                'psa > \\d\\d\\d?\\d?',
                //PSA 1.0
                'psa\\s*\\d\\.\\d',
                //PSA 19.0 &&PSA 190.0
                'psa\\s*\\d\\d\\d?\\.\\d\\d?',
                'psa\\s*\\d\\d\\d\\d\\.\\d\\d?',
                'psa\\s*rose\\s*from',
                'psa\\s*was\\s*\\d\\d\\d?\\d?',
                'psa\\s*>\\s*\\d\\d\\d?\\d?',  //PSA > 1000


        ]
        concept_feature_value = "PSA"
        outputType = "gov.va.vinci.types.Metastasis_Anatomy"
    }

    "Gleason" {
        expressions = [
                //Not complete, but capturing most here
                // Similar to stage, the next iteration incorporates the complete separate gleason system.
                // These bulk regexes were used in the current implementation
                'gleason\\s*grade\\s*',
                'gleason\\s*score\\s*',
                'gleason\\s*',
                'gleasons',
                'gleason\'s\\s*',
                'gleason\\s*score\\s*\\d\\s*\\+\\d',
                ' gs\\s*\\d\\s*', //White Space Required
                '\\d\\s*\\+\\s*\\d',
                'gl\\s*\\d\\s*\\+\\s*\\d',
                'gg\\s*\\d\\s*\\+\\s*\\d',
                'gs\\s*\\d\\s*\\+\\s*\\d',
                'g\\s*\\d\\s*\\+\\s*\\d',
                'gleason\\s*VI?I?I?',
                '\\d\\s*\\+\\s*\\d\\s*=\\d\\d?',
                'gleason\\s*\\d\\d?',
                'gleasons\\s*\\d\\d?',
                'gleason\'s\\s*\\d\\d?',
                ' gs\\s*\\d\\d?', //White Space Required
                'gleason\\s*of\\s*\\d\\d?',
                '\\(\\s*gleason\\s*\\d\\d?\\s*\\)',
                '\\d\\s*\\+\\s*\\d\\s*=\\s*\\d\\d?',
                'Gleason\\s*\\d\\s*\\+\\s*\\d\\s*=\\s*\\d\\d?',
                '\\d\\s*\\+\\s*\\d',
                'gleason\\s*\\d\\s*\\+\\s*\\d',
                'gs\\s*\\d\\s*\\+\\s*\\d',
                'GS\\s*\\d\\s*\\(\\d\\+\\d\\)',
                '\\d\\s*\\(\\s*\\d\\+\\s*\\d\\)',
                'gleason\\s*\\d\\s*\\(\\s*\\d\\+\\s*\\d\\)',

        ]
        concept_feature_value = "Gleason"
        outputType = "gov.va.vinci.types.Metastasis_Anatomy"
    }

    "Osseous" {
        expressions = [
                //Semantic
                'osseous',
                'osteoblastic',
                'osteolytic',
                'blastic',
                //Osseous Lexical
                'osseus',
                'sclerotic osseous',
                'ossesous',
                'oseous',
                'extraoss?eous',
                'oseos',
                'ossious',
                'osseious',
                'ossseous',
                'osseous',
                'osseos',
                'ossous',
                'ossoeus',
                'osseuos',
                //Osseoblastic Lexical
                'osteblastic',
                'osteoblastic'
        ]
        concept_feature_value = "osseous"
        outputType = "gov.va.vinci.types.Metastasis_Term"
    }

    "Diagnosis_likely" {
        expressions = [

                //Less precise diagnostic terms,
                'consist(a|e)nt\\s*with',
                'consistent\\s*with\\s*',
                'consistent\\s*w/\\s*',
                'evidence\\s*of\\s*',
                'reff?err?ed\\s*to\\s*clinic\\s*for',
                //Falls closer to the differential or possible category
                'evidence\\s*of\\s*recurrent(\\s*or)?',
                'with\\s*evidence',
        ]
        concept_feature_value = "Diagnosis_likely"
        outputType = "gov.va.vinci.types.Metastasis_Modifier"
    }


    "Diagnosis" {
        expressions = [
                'diagnosis',
                'dx',
                'dxed',
                'dx\'ed',
                'new\\s*dx',
                'Stage - TNM at Dx',
                'Stage at Dx',
                'with',
                'now\\s*with',
               // 'consist(a|e)nt\\s*with',
                'with\\s*known',
                '(with|w/)\\s*(a\\s*)?history\\s*(of)?',
                'w/',
                ' w ',
                // This still performs well when part of a complete pattern, but needs to be assessed again or refined for precision as needed
                // Any changes of the system utilizing partial patterns will likely result in frequent False positive cases from this term.
                'now\\s*w/',
                'known\\s*to\\s*have',
                'POSITIVE',
                'bone scan demonstrating',
                'revealed',
                'revealing',
                'newly\\s*diagnosed',
                'demonstrated',
                'demonstrating',
                'now demonstrating',
                'showing',
                'now showing',
                'secondary to',
                'PROGRESSION',
                'PROGRESSION IN',
                'd/t',
                's/p',
                'status post',
                'status/post',
                's/p\\s*EBRT',
                'C/A/P',
                'confirmed',
                'to\\s*Urology\\s*for',
                'in\\s*Urology\\s*for',
                'f/u',
                'f/u\\s*visit',
                'f/u of',
                'f/u of his',
                'follow(-|\\s*)up',
                'follow(-|\\s*)up\\s*visit',
                'follow(-|\\s*)up of',
                'follow(-|\\s*)up of his',
                //05-21-2019 additions to discuss
                'prognosis',
                'found to have',
                'has',
                'had',
                'now\\s*has',
                'recurrent',
                'recurrent\\s*and',
                'relapsed',
                'purpose\\s*of\\s*visit:?',
                'commenced\\s*treatment\\s*for',
                'started\\s*treatment\\s*for',
                'began\\s*treatment\\s*for',
                'saltz regimen for',
                'regimen for',
                'considered a',
                'decline(s|d)?\\s*treatment\\s*for',
                'diagnosed with a clinical',
                'diagnosed with a pathologic(al)?',
                'seen\\s*for',
                'treatment\\s*of\\s*his',
                'treatment\\s*for\\s*his',
                'treating\\s*his',
                'treated\\s*for',
                'treated\\s*for\\s*his',
                's/p\\s*(radical)?\\s*prostatectomy',
                'this\\s*is\\*a',
                'per\\s*dr.?\\s*',
                'BIOPSY-PROVEN',
                'staged as having',
                'staged as having clinical',
                //Likely complete new pattern type [Confirmation type]
                'confirmed\\s*with\\s*immunohistochemical\\s*stains',
                //Lexical Variants - Diagnosis
                'diagnoses',
                'diagnosed',
                'diagnoses',
                'diagnois',
                'dignosis',
                'diagosis',
                'dianosis',
                'diagnosic',
                'diagnosos',
                'diagnisis',
                'diagnsosis',
                'diagonosis',
                'iagnosis',
                'disgnosis',
                'diagnoisis',
                'diagnosi',
                'diagnsis',
                'diangnosis',
                'dagnosis',
                'diagnostis',
                'diaganosis',
                'diagnosisi',
                'diagnosies',
                'diagniosis',
                'disagnosis',
                'diagnonsis',
                'diagnossis',
                'diagnoss',
                'diagnosics',
                'diaggnosis',
                'diagnosiss',
                'adiagnosis',
                'diagn0sis',
                'diaagnosis',
                'diadnosis',
                'diagmosis',
                'doagnosis',
                'diagnosit',
                'diagnoosis',
                'diagnosois',
                'ddiagnosis',
                'diagnonis',
                'diagnnosis',
                'diabnosis',
                'diognosis',
                'xdiagnosis',
                'diagnposis',
                'diasnosis',
                'diagnosisl',
                'diasgnosis',
                'diagnosiis',
                'duagnosis',
                'diagmnosis',
                'diagnosist',
                'diagnoseis',
                'diagsnosis',
                'diagnosisa',
                'diagnopsis',
                'dioagnosis',
                'doiagnosis',
                'diagnosise',
                'diiagnosis',
                'daiagnosis',
                'diagnosie',
                'diagnosia',
                'diagnosisr',
                'diagsosis',
                'diagnosed',
                'diagnose',
                'diagnosised',
                'diangosis',
                'daignosis',
                'diagonis',
                'diagonsis',
                'diagnosied',
                'diganosis',
                'dianoses',
                'dignoses',
                'diagnsois',
                'diagnosd',
                'diagnoes',
                'diagnsoses',
                'diagnoises',
                'diagnosesd',
                'diagnsosi',
                'disgnoses',
                'diagnoiss',
                'diagneses',
                'diagnonses',
                'diagnosisis',
                'diaphosis',
                'diagnoised',
                'diagosed',
                'dianosed',
                'disgnosed',
                'diagnised',
                'diagnossed',
                'daignoses',
                'diganoses',
                'diagnoesed',
        ]
        concept_feature_value = "Diagnosis"
        outputType = "gov.va.vinci.types.Metastasis_Modifier"
    }



    "Diagnosis_AP_Section" {
        expressions = [
                //Relevant sections to be treated as 'diagnosis' section
                //Section markers (:|-) are identified and merged with middle concepts.
                //Occasionally they will be set here when required for precision (e.g "cc" requires a space or :, otherwise it pulls in garbage)
                'REASON\\s*FOR\\s*CONSULT',
                ' CC',
                'CC:', //Accounts for start of line instances
                'Impression',
                'ASSESS?MENT\\s*AND\\s*PLAN',
                'ASSESSMENT & PLAN',
                'ASSESS?MENT\\s*/\\s*PLAN',
                'ASSESS?MENT/PLAN/RECOMMENDATIONS',
                'Impression and Recommendations',
                'IMPR',
                'ASSESS?MENT\\s*',
                'EXCISIONAL\\s*BIOPSY',
                'EXCISION',
                'chief\\s*complaint',
                //Additional sections from pneumonia/Beta-Blocker
                'ADDITIONAL ASSESSMENT',
                'ASSESS?MENT',
                'ASSESS',
                'evaluation of',
                'ASSESS?MENT and CONCLUSIONS:',
                ' imp',
                'IMPRESSION SECTION',
                'INITIAL IMPRESSION/ASSESSMENT',
                'A/P',
                ' A:',  //Required space and section middle term here
                'A: -',  //Required space and section middle term here
                ' A :',  //Required space and section middle term here
                ' A-',  //Required space and section middle term here
                ' A -',  //Required space and section middle term here
                'assessment and recomm?endation',
                'assessment and recommendations',
                'assess?ment plan',
                'assess?ment recommendation',
                'assess?ment/plan',
                'assess?ment',
                'assess?ment_and_plan',
                'impression and plan',
                'impression plan',
                'impression/plan',
                'impression',
                'SUBJECTIVE',
                'PROBLEM/COMMENT/PLAN',
                '\\bplan',
                'REASON FOR CONSULTATION',
                'REASON FOR VISIT',
                'DIAGNOSIS/CC',
                'e(-|\\s*)consult',
                'e(-|\\s*)consult\\s*for',
                'Consult Service for',
                'DIAGNOSIS\\s*\\&\\s*STAGE',
                //HPI
                'hpi',
                'hpi/interval history',
                'hpi interval history',
                'patient hpi',
                'present illness',
                'history_present_illness',
                'history of the present illness',
                'history of present illness',
                'history present illness',
                'summary of present illness',
                'summary present illness',
                //Path Reports
                'operation and findings',
                'operative findings',
                'pathologic staging',
                'pathology report',
                'reporting lab',
                '\\bo:',
                'objective',
                's/o',
                'indication',
                'clinical indication',
                'indication',
                'indications'

        ]
        concept_feature_value = "Diagnosis_Assessment_Section"
        outputType = "gov.va.vinci.types.Metastasis_Modifier"
    }

    "Diagnosis_hx" {
        expressions = [
                'hx',
                'history',
                'history of',
                'pmh',
                'pmhx',
                'h/o',
                '(past )?medical\\s+(history|hx)',
                ' mhx?',
                'mh/pshx',
                ' mh',
                'pohx',
                'pmh[sx]',
                'pmhx\\/pshx',
                'past\\s*history',
                'significant\\s*medical\\s*hx',
                'past\\smedical\\shistory\\s?\\/\\s?problem list'

        ]
        concept_feature_value = "History"
        outputType = "gov.va.vinci.types.Metastasis_Modifier"
    }


    "cr_progression" {
        expressions = [

                //In the first iteration these were treated as middle terms.  Keeping them that was a s a major type for this instance, will likely update to their own type in future iterations
                'biochemical',
                'bio-chemical',
                'bio chemical',
                'bio(-| )?charmical',
                'oligometastatic',
                'low\\s*volume',
                'solitary',
                'widespread'

        ]
        concept_feature_value = "cr_progression"
        outputType = "gov.va.vinci.types.Metastasis_Middle"
    }


    "Diagnosis_Middle" {
        expressions = [
                // Frequent terms that occur within a diagnostic pattern but do not have semantic meaning for this system
                //These terms include a space so that they can be merged with the merge annotator dx [58 yr male] with mPCa
                'of\\s*',
                'of\\s*(the|his|their)',
                '(his|the|their)',
                ':\\s*',
                //'with\\s*',
                'for\\s*',
                ' is\\s*',
                'and\\s*',
                'at\\s*',
                'for\\s*(the|his|their)',
                'from\\s*',
                ',\\s*',
                ';\\s*',
                '-\\s*',
                'that\\s*',
                '-{2,8}',  //Frequent line breaks found after an AP section
                '-{2,8}\\s*',  //Frequent line breaks found after an AP section
                '={2,8}',
                '={2,8}\\s*',
                '/',
                '//\\s*',
                '\\(\\s*',  //Staging frequently found in parenthesis
                '\\)\\s*',
                '\\d\\d\\d\\d',  //Diagnosed 2009 with
                'in\\s*\\d\\d\\d?\\d?',  //Diagnosed in 2009 with
                '\\d\\d?/\\d\\d\\d?\\d?',
                '\\d\\d/\\d\\d\\s*',
                //Demographic information found between impression/diagnosis
                '\\d\\d\\s*yo\\s*',
                '\\d\\d\\s*y\\.o\\.\\s*',
                '\\d\\d\\s*y\\.o\\s*',
                '\\d\\d\\s*year(\\s*|-)old\\s*',
                '\\d\\d\\s*y\\/o\\s*',
                '\\d\\d-year-old\\s*',
                '(Jan|january),?\\s*\\d\\d\\d?\\d?',
                '(Feb|February),?\\s*\\d\\d\\d?\\d?',
                '(Mar|March),?\\s*\\d\\d\\d?\\d?',
                '(Apr|April),?\\s*\\d\\d\\d?\\d?',
                'MAY,?\\s*\\d\\d\\d?\\d?',
                '(jun|june),?\\s*\\d\\d\\d?\\d?',
                '(jul|july),?\\s*\\d\\d\\d?\\d?',
                '(aug|august),?\\s*\\d\\d\\d?\\d?',
                '(sep|september),?\\s*\\d\\d\\d?\\d?',
                '(oct|october),?\\s*\\d\\d\\d?\\d?',
                '(nov|november),?\\s*\\d\\d\\d?\\d?',
                '(dec|december),?\\s*\\d\\d\\d?\\d?',
                'pt\\s*is\\s*a\\s*',
                '\\bis\\s*a\\s*',
                's?he\\s*is\\s*a?',
                '\\bhe\'s',
                'veteran\\s*is\\s*',
                'veteran\\s*is\\s*an?\\s*',
                'patient\\s*is\\s*an?\\s*',
                'this\\s*is\\s*an?\\s*',
                'the\\s*patient\\s*is\\s*a',
                'veteran\\s*',
                'male\\s*',
                'gentleman\\s*',
                '\\d\\d\\s*male\\s*', //67 Male
                'man\\s*',
                '\\d\\d\\s*man\\s*',
                ' m ', //Requires complete space if used
                '\\d\\d m ',
                ' wm ', //White male
                ' bm ',
                ' AAM ',
                 'hispanic\\s*'
                , 'latin(o|a|x)\\s*'
                , 'American\\s*indian\\s*'
                , 'caucasian\\s*'
                , 'asian\\s*'
                , 'white\\s*'
                , 'non-hispanic\\s*'
                , 'pacific\\s*islander\\s*'
                , 'alaskan\\s*native\\s*'
                , 'african-american\\s*'
                , 'african american\\s*'
                , 'african/american\\s*'
                , 'black\\s*',
                'PPI',
                //with widespread metastatic...
                //widespread, extensive, diffuse, etc.
                //Adding a space after them lets multiple middle terms merge into one
                'diffuse\\s*',
                'regional\\s*',
                'grossly\\s*stable\\s*',
                'stable\\s*',
                'dense\\s*',
                'stage',
                'significant',
                'disseminated',
                'new\\s*',
                'newly\\s*',
                'extensive\\s*',
                'likely\\s*',
                'lesions\\s*',
                'sclerotic\\s*',
                'clinical\\s*',
                'pathological',
                'wide(-|\\s*)spread\\s*',
                'widely\\s*',
                'agressive\\s*',
                'progress?ive\\s*',
                'extensive\\s*',
                '#\\s*',
                '#', //Exists with and without a space prior to specific patterns
                'bone\\s*',
                'high\\s*risk\\s*',
                'high\\s*grade\\s*',
                'high\\s*volume\\s*',
                'poorly\\s*differentiated\\s*',
                //'high\\s*grade\\s*high\\s*volume',
                'hr\\s*',
                'unfavorable\\s*',
                'now\\s*',
                '(:\\s*)?1\\.\\s*',
                '\\s*1\\.',
                '(:\\s*)?1\\)\\s*',
                '(:\\s*)?1\\s*\\.\\)\\s*',
                '#\\s*1\\.?\\s*',
        ]
        concept_feature_value = "middle_terms"
        outputType = "gov.va.vinci.types.Metastasis_Middle"
    }
    "Middle_Term_Invasion" {
        expressions = [

                'involv(e(s)?|ment|ing)\\s*',
                'invasi(ve|on)\\s*',
                'invade(s)?\\s*',
                'infiltrate(d|s)?\\s*',
                'exten(d(s|ed)?|sion|ing)\\s*',
                'locally\\s*invasive\\s*',


        ]
        concept_feature_value = "Invasion_terms"
        outputType = "gov.va.vinci.types.Metastasis_Middle"
    }

    "Treatments_terms_chemo" {
        expressions = [

                //Chemotherapy
                'adriamycin',
                'cabazitaxel',
                'cisplatin',
                'docetaxel',
                'docetaxl',
                'docetaxel-estramustine',
                'estramustine',
                'mitoxantrone',
                'prednisone',
                'sipuleucel-T',


        ]
        concept_feature_value = "Chemotherapy"
        outputType = "gov.va.vinci.types.Metastasis_Medication"
    }
    "Treatments_terms_anti_androgen" {
        expressions = [

                //Get advice on treatment terms to incorporate
                //5a-reductase inhibition
                'dutasteride',
                'finasteride',
                //Non_steroidal
                'bicalutamide',
                'bicaludamide',
                'enzalutamide',
                'enzaludamide',
                'flutamide',
                'nilutamide',
                //steroidal
                'cyproterone\\s*acetate',
                'medoxyprogesterone\\s*acetate',
                'megestrol\\s*acetate',
                //castration
                'degarelix',
                'goserelin',
                'leuporelin',
                'triptorelin',
                'abiraterone',
                'abiraterone\\s*acetate',
                'antiandrogen',
                'anti-androgen',
                'anti androgen',
                'androgenic',
                'Xtandi',
                'XRT',
                'eligard',
                'adjuvant androgen deprivation',
                'total androgenic supression',
                'complete androgenic supression',
                'complete androgen blockade',
                'androgen deprivation',
                'adjuvant RT',
                'adjuvant therapy',
                //added with androgen edit distance
                'androzene',
                'androgel',
                'andogel',
                'andro-gel',
                'androjel',
                'adrogel',
                'andreogel',
        ]
        concept_feature_value = "Anti_Androgen"
        outputType = "gov.va.vinci.types.Metastasis_Medication"
    }

    "Treatments_terms_other" {
        expressions = [
                // Not robust, future implementations should expand upon this, expansion was not found necessary for current implementation.
                'radiation',
                'radiation therapy',
                'EBRT',
                'zometa',
                'RP and adjuvant RT',
        ]
        concept_feature_value = "Other"
        outputType = "gov.va.vinci.types.Metastasis_Medication"
    }

    "Medication_Modifier_terms" {
        expressions = [

                'treated',
                'treated\\s*with',
                'treatment',
                'managed\\s*with',
                'managed',
                'tx',
                'for',
                'on',
                'while\\s*on',
                'initiation\\s*of',
                'is\\*on',
                'now\\*on',
                '(:|\\()?\\s*currently \\s*on',
                '(:|\\()?\\s*currently \\s*managed',
                '(:|\\()?\\s*currently \\s*managed\\s*with',
                'recieving',
                'started',
                'so\\s*started',
                'on\\s*therapy\\s*with',
                //on enzaludamide since 2015 for
                'since\\s*\\d\\d\\d\\d\\s*for',
                //
                'Recommend\\s*preRx\\s*w/',
                'Recommend\\s*preRx\\s*with',
                'Recommend\\s*Rx\\s*w/',
                'preRx\\s*w/',
                //From beta-blockers vocab
                'CW',
                '-CW',
                '(re-?)?start(ed|ing)?',
                'start',
                'restarted',
                'add(ed)?',
                'administer(ed|ing)?',
                'cont.?',
                'cont.\\s*with',
                'continued?(\\s*on\\s*)?',
                'continuing',
                'controlled\\s*on\\s*current',
                'control(led)?\\s*with',
                'adding',
                'cover(ed)?\\s*with',
                'currently\\s*on?',
                'given',
                'give',
                'got',
                'gotten',
                'incr',
                'increased?',
                'increasing',
                'initiate',
                'placed\\s*on',
                'placed\\s*him\\s*on',
                'prescribed',
                'took\\s*prescribed',
                'start\\s*pt\\s*on',
                'pt\\s*on',
                'received',
                'recieved',
                'recieving',
                'receiving',
                'responsive\\s*to',
                'resumed?',
                //on hf regimen with
                'regimen\\s*with',
                'takes',

        ]
        concept_feature_value = "Medication"
        outputType = "gov.va.vinci.types.Metastasis_Medication_Modifier"
    }
    "Anatomy_Prostate" {
        expressions = [
                //Semantic
                'prostate',
                'prostatic',
                //Lexical
                'prostat',
                'prostae',
                'prostata',
                'prostate',
                'prstate',
                'porstate',
                'postate',
                'prostatci',
                'prosttae',
                'prosatate',
                'prostte',
                'proatate',
                'prsotate',
                'prosatte',
                'prostaet',
                'rostate',
                'prostateca',
                'porstaet',
                'protstate',
                'proastate',
                'prastate',
                'prostaste',
                'prostatae',
                'prostsate',
                'prostaate',
                'prosstate',
                'prostatre',
                'prostete',
                'prostatte',
                'pprostate',
                'ptostate',
                'prostatate',
                'prosttate',
                'prostrated',
                'prostatec',
                'cprostate',
                'prostatee',
                'prostet',
                'rpostate',
                'porostate',
                'prosatet',
                'prosate',
                'aprostate',
                'prostats',
                'proistate',
                'oprostate',
                'prsostate',
                'prostateic',
                'dprostate',
                'prosatae',
                'proostate',
                'prostater',
                'prosrate',
                'protane',
                'preostate',
                'tprostate',
                'phostate',
                'prsoate',
                'pristate',
                'prosytate',
                'prosteate',
                'prostse',
                'propstate',
                'fprostate',
                'pr0state',
                'prodstate',
                'peostate',
                'priostate',
                'prodtate',
                'prtostate',
                'rprostate',
                'prostrat',
                'prostatea',
                'prestate',
                'prostatce',
                'prrostate',
                'prpostate',
                'praostate',
                'prostatet',
                'prostaes',
                'protsate',
                'eprostate',
                'prosates',
                'prostate1',
                'xprostate',
                'icprostate',
                'prostyate',
                'prpstate',
                'psotate',
                'urprostate',
                'psostate',
                'prostatc',
                'prostati',
                'proststate',
                'parostate',
                'prostaete',
                'prstrate',
                'protstae',
                'cmprostate',
                'prostrtae',
                'protstat',
                'prosrtate',
                'mprostate',
                'lprostate',
                'prostagen',
                'prostatex',
                'prostatesv',
                'prosotate',
                'prostatr',
                'prostrata',
                'vprostate',
                'prostatye',
                'proststae',
                'proatste',



        ]
        concept_feature_value = "prostate"
        outputType = "gov.va.vinci.types.Metastasis_Anatomy"
    }
    "Anatomy_Other" {
        expressions = [
                //bulk set of terms for other sites, improved precision of the prostate system, but does not act as an accurate system if attempting to identify these other sites
                'lung',
                'colon',
                'CKD',
                'Lung',
                'penis',
                'colon',
                'kidney',
                'skin',
                'lung',
                'bladder',
                'lymphoma',
                'rectal',
                'breast',
                'Renal',
                'RCC',
                //Other cancers here added from the Stage System
                'CKD',
                //future work should update pattern to include cancer type here.
                'Lung',
                'Lung\\s*cancer',
                'penis',
                'penis\\s*cancer',
                'colon',
                'colon\\s*cancer',
                'kidney',
                'kidney dis',
                'kidney\\s*disease',
                'kidney\\s*cancer',
                'skin\\s*cancer',
                'tonsil',
                '(left|right)\\s*tonsil',
                'tongue',
                'base\\s*of\\s*tongue',
                'base\\s*of\\s*the\\s*tongue',
                'tongue\\s*cancer',
                'pancreatic',
                'pancreatic\\s*',
                'lung',
                'lung\\s*cancer',
                'rectal',
                'rectal\\s*cancer',
                'rectal\\s*cancer,?',
                'thyroid',
                'thyroid\\s*cancer',
                'Malignant\\s*Melanoma',
                'bladder\\s*cancer',
                'lymphoma',
                'COPD',
                //'SCC',
                'unknown primary',
                'SCC\\s*of\\s*the\\s*LLL',
                //'squamous cell carcinoma',
                 'squamous\\s*cell carcinoma of the lll',
                'squamous cell CA, unknown primary',
                'squamous\\s*cell carcinoma of the (left|right)?\\s*tonsil',
                'squamous\\s*cell carcinoma of lll',
                'sq\\s*cell\\s*ca\\s*left\\s*tonsil',
                'urethel',
                'urothel',
                'urothelial\\s*carcinoma',
                'TCC',
                'high(\\s*-)?\\s*grade\\s*urothel',
                'cervical',
                'cervical\\s*node',
                'typical\\s*bronchial\\s*carcinoid',
                'bronchial',
                'DLBCL',
                'oropharynx',
                '(l|r)\\s*oropharynx',
                'NSCLC',
                'mantle cell lymphoma'


        ]
        concept_feature_value = "Other_Organ"
        outputType = "gov.va.vinci.types.Metastasis_Anatomy"
    }
    "Cancer" {
        expressions = [
                //Semantic
                'cancer',
                'carcinoma',
                'malignant\\s*neoplasm',
                'adenoCA',
                'Adeno CA',
                'Carcinoid\\s*ca',
                'Carcinoid',
                //Works for complete metastatic patterns, causes frequent false positives if attempting to use system for a pca diagnosis
                'ca',
                'ca\\.',
                'adenocarcenoma',
                'adencarcinoma',
                // stages 1 2 and 3 are used synonymously with other cancer terms, however stage four needs to be handled in this logic as a metastatic term
                'stage\\s*\\1',
                'stage\\s*\\2',
                'stage\\s*\\3',
                'stage\\s*I ', //Space required here so it's not confused with IV
                'stage\\s*II',
                'stage\\s*III',
                'D3',
                'AJCC',
                //Lexical
                'canceer',
                'canncer',
                'cancr',
                'camcer',
                'camcer',
                'ccancer',
                'canacer',
                'canccer',
                'caancer',
                'cancerr',
                'canecer',

        ]
        concept_feature_value = "cancer"
        outputType = "gov.va.vinci.types.Metastasis_Disease"
    }
    "disease" {
        expressions = [

                'disease',
                'desease',
                'disaese',
                'dz'

        ]
        concept_feature_value = "disease"
        outputType = "gov.va.vinci.types.Metastasis_Disease"
    }
    "mets_invasion" {
        expressions = [
//Different from osseus in that it requires metastatic_terms to be considered
                'to\\s*the\\s*(bone|ribs?|lymph|nodes?|brain)',
                'in\\s*to\\s*the\\s*(bone|ribs?|lymph|nodes?|brain)',
                'in\\s*the\\s*(bone|ribs?|lymph|nodes?|brain)',
                'in\\s*the\\s*bone\\s*from',
                'to\\s*(bone|ribs?|lymph|nodes?|brain)',
                'to\\s*(bone|ribs?|lymph|nodes?|brain)\\s*and\\s*(bone|ribs?|lymph|nodes?|brain)',
                'to vertebrae and rib',
                'to vertebrae',
                'involvement\\s*of\\s*bone',
                'LN\\s*\\+',
                'lymph node positive',
                'lymph\\s*node\\s*\\+',
                'bony',
                'boney',
                'bone-only',
                'lesions',
                'multiple\\s*bony',
                'multiple\\s*bone',
                'multiple\\s*brain',
                'multiple\\s*boney',
                'axial\\s*spine',
                'axial\\s*skeleton',
                'BONE AND LIVER',
                'BONE AND nodal',
                'involving\\s*bones?',
                // Some redundancies here to handle bone when by itself  (otherwise 'bone scan' is getting picked up as a metastatic term)
                'bone met',
                'bone mets',
                'bone metastasis',
                'bone metastasis',
                'bone metastases',

        ]
        concept_feature_value = "bone"
        outputType = "gov.va.vinci.types.Metastasis_Depth"
    }

    "negation" {
        expressions = [
                //additional and more strict negation terms/patterns either missed by Context, or specific to mPCa
                'non-metastatic',
                'nonmetastatic',
                'non metastatic',
                'non',
                'no ', //Requires space
                'not',
                'no\\s*obvious',  //no clear evidence of  . . .
                'no\\s*clear',
                //Hypothetical exclusions
                'If patient is',
                'If patient is ultimately',
                'no\\s*definitive',
                'not\\s*definitive',
                'no\\s*convincing',
                //Saving individual means of diagnosis, may be needed in future
                'No\\s*definite',
                'does\\s*not\\s*have',
                'does\\s*not\\s*have\\s*sx',
                'does\\s*not\\s*have\\s*sx\\s*associated\\s*with',
                'does\\s*not\\s*show',
                'doesn\'t\\s*show',
                'neg\\s*for',
                'neg\\s*for',
                'absence of',
                'bone scan negative',
                'scan negative',
                'absent',
                'did not observe',
                'didn\'t observe',
                'do not observe',
                'exclude(s|d)',
                'wihtout',
                'without',
                'without any',
                'w/o',
                'w/o any',
                'wo ',
                'wo any',
                //Right sided
                'is\\s*not\\s*suspected',
                'not\\s*suspected'

        ]
        concept_feature_value = "Negation"
        outputType = "gov.va.vinci.types.Metastasis_Negation"
    }
    "Diagnosis_Method" {
        expressions = [
                'morphologic\\s*or\\s*immunohistochemical',
                'immunohistochemical',
                'immunohistochemical\\s*stains',
                //Saving individual means of diagnosis, may be needed in future
                'imaging found',
                'CT',
                'CT imaging',
                'CT imaging',
                'scintigraphic',
                'prostascint',
                'prostascint scan',
                'PET',
                'plain\\s*film',
                'plain\\s*radiographic',
                'MRI',
                'bone\\s*scan',
                'body\\s*scan',
                'pet/ct',
                'xray',
                'x-ray'


        ]
        concept_feature_value = "Method_of_evidence"
        outputType = "gov.va.vinci.types.Metastasis_Image"
    }

    "Family histoy" {
        expressions = [
                ' FH ',
                'FH of',
                'Family History',
                'Family History of',

        ]
        concept_feature_value = "Family_History"
        outputType = "gov.va.vinci.types.Metastasis_Modifier"
    }


}



