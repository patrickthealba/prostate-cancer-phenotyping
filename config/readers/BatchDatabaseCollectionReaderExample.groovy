import gov.va.vinci.leo.cr.BatchDatabaseCollectionReader;

String dbDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
String url = "jdbc:sqlserver://<your_server>;databasename=<your_database>;integratedSecurity=true"


// keep username and password blank for Windows authentication
String username = "";
String password = "";


String query = """ Select note_id, note_text, rowno from 
[note].[notes_table]
 where rowno >{min} and rowno<{max}
  and reporttext is not null  """;



String docIDColumnName = "rowno"
String docTextColumnName = "note_text"


int startingIndex = 0;
int endingIndex = 50000;
int batchSize = 10000;

reader = new BatchDatabaseCollectionReader(dbDriver, url ,
        "", "",
        query,
        docIDColumnName.toLowerCase(),
        docTextColumnName.toLowerCase(),
        startingIndex, endingIndex,
        batchSize);
