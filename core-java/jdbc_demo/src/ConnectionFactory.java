public class ConnectionFactory {

    private static DBConnection dbConnection=new DBConnection();

    public static DBConnection getDbConnection() {
        return dbConnection;
    }
}
