import java.sql.*;

class resultset_metadata
{
	public static void main(String s[])
	{
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
       Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","srs","srs");
       Statement st=con.createStatement();
	   ResultSet rs=st.executeQuery("select * from student");
	   while(rs.next())
	   {
		   System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
	   }
	   ResultSetMetaData rsm=rs.getMetaData();
	   System.out.println(rsm.getColumnCount());
	       }
      catch(Exception e){
         System.out.println(e.getMessage()); 
      } 
		
	}
}