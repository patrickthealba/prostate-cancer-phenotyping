package listeners

import gov.va.vinci.listeners.BasicCsvListener;
fieldList = [

        ["Text_ID", "0", "bigint"],
        ["Term", "-1", "varchar(300)"],
        ["Experiencer", "-1", "varchar(100)"],
        ["Negation", "-1", "varchar(100)"],
        ["Temporality", "-1", "varchar(100)"],
        ["Modifier", "-1", "varchar(100)"],
        //["Modifier_Term", "-1", "varchar(150)"],
        ["Metastatic_term", "-1", "varchar(150)"],
        ["Hormone_modifier", "-1", "varchar(150)"],
        ["Hormone_modifier_term", "-1", "varchar(150)"],
        ["Treatment_modifier", "-1", "varchar(150)"],
        ["Treatment_term", "-1", "varchar(150)"],
        ["Castrate_sensitive", "-1", "varchar(150)"],
        ["Castrate_resistant", "-1", "varchar(150)"],
        ["Anatomy", "-1", "varchar(150)"],
        ["mPCa_flag", "-1", "int"],
        ["SpanStart", "-1", "int"],
        ["SpanEnd", "-1", "int"],
        ["Snippets", "-1", "varchar(5000)"]
]

File filePath = new File("data\\Output\\outputData.csv")
listener = new BasicCsvListener(filePath, true , fieldList, "gov.va.vinci.kttr.types.Positive");
listener.writeHeaders()
