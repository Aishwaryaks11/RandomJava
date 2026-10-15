package Array;

//public class  {

	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.Driver;
	import java.sql.Statement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	import com.mysql.cj.jdbc.Driver;

	public class VerifyDB {

	    Connection con = null;

	    public void getDbConnection(String url, String un, String pwd) throws SQLException {

	        Driver d = new Driver();
	        DriverManager.registerDriver(d);

	        con = DriverManager.getConnection(url, un, pwd);
	    }

	    public void verifyDb(String query, int index, String expData) throws SQLException {

	        Statement st = con.createStatement();
	        ResultSet result = st.executeQuery(query);

	        boolean flag = false;

	        while (result.next()) {

	            String actData = result.getString(index);

	            if (actData.equals(expData)) {
	                flag = true;
	                break;
	            }
	        }

	        if (flag) {
	            System.out.println("Verified");
	        } else {
	            System.out.println("Not Verified");
	        }

	        result.close();
	        st.close();
	    }

	    public void closeDbConnection() throws SQLException {
	        if (con != null) {
	            con.close();
	        }
	    }
	}
}
