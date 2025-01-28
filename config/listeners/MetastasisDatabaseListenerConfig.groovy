package listeners

import gov.va.vinci.leo.context.types.Context
import gov.va.vinci.leo.context.types.TermContext
import gov.va.vinci.listeners.BasicDatabaseListener
import gov.va.vinci.leo.tools.LeoUtils


int batchSize = 1000
String url = "jdbc:sqlserver://<your_server>:1433;databasename=<your_database>;integratedSecurity=true"
String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver"
String dbUser = ""
String dbPwd = ""

String dbsName = "<your_database>"
String timeStamp = LeoUtils.getTimestampDateUnderscoreTime().substring(0, 8);

String tableName = "[nlp].[mcrpc_output]"


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

boolean dropExisting = false;
listener = BasicDatabaseListener.createNewListener(driver, url, dbUser, dbPwd, dbsName,
        tableName, batchSize, fieldList,
        TermContext.class.getCanonicalName()
        )

//create table
listener.createTable(dropExisting)
