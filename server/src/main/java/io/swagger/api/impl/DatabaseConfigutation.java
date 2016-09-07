class DatabaseConfiguration{
    private static string connectionString =
            "Server=localhost;Database=pantheon;Pooling=false;User ID=root;Password=World@1234";
    IDbConnection dbcon;
    dbcon = new MySqlConnection(connectionString);

    public static void databaseConfig() {
        dbcon.Open();
        IDbCommand dbcmd = dbcon.CreateCommand();
        string sql =
                "SELECT AccountNumber,AccountName " +
                        "FROM ACCOUNT";
        dbcmd.CommandText = sql;
        IDataReader reader = dbcmd.ExecuteReader();
        while (reader.Read()) {
            string AccountNumber = (string) reader["AccountNumber"];
            string AccountName = (string) reader["AccountName"];
            Console.WriteLine(AccountNumber + " " + AccountName);
        }
        reader.Close();
        reader = null;
        dbcmd.Dispose();
        dbcmd = null;
        dbcon.Close();
        dbcon = null;
    }
}