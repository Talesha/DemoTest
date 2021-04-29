package component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConn {

	private static String connectionURL;
	private static String userName;
	private static String passWord;
	private static DataBaseConn dbConn;

	
	// Need to pass the URL , UserName , Password in Config File
	private DataBaseConn() throws ClassNotFoundException {
		String driver = BaseClass.getValFromProp("jdbc.driver");
		connectionURL = BaseClass.getValFromProp("jdbc.url");
		userName = BaseClass.getValFromProp("jdbc.username");
		passWord = BaseClass.getValFromProp("jdbc.password");
		Class.forName(driver);
	}

	public static DataBaseConn getInstance() throws ClassNotFoundException {
		if (null == dbConn) {
			dbConn = new DataBaseConn();
		}
		return dbConn;
	}

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(connectionURL, userName, passWord);
	}
}
