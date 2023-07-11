package readers
String dbDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
String url = "jdbc:sqlserver://<your_server>;databasename=<your_database>;integratedSecurity=true"


// keep username and password blank for Windows authentication
String username = "";
String password = "";



//mcrPCa TIU Query

String query = """ Select note_id, note_text from 
[note].[notes_table]
 where reporttext is not null  """;
reader = new gov.va.vinci.leo.cr.DatabaseCollectionReader(driver, url,
        "", "", query, "TiuDocumentsid","reporttext"
);


