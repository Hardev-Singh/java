import java.sql.*;

class batchupdate
{
	public static void main(String s[])
	{
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
       Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","srs","srs");
       Statement st=con.createStatement();
	   String s1="insert into student (name,phone,age,email) values('tina','542875427',24,'ghfgha@gmail.com')";
	   String s2="update student set name='john' where userid=5";
	   String s3="delete from student where userid=6";
	   
	   st.addBatch(s1);
	   st.addBatch(s2);
	   st.addBatch(s3);
	   st.executeBatch();
	     }
      catch(Exception e){
         System.out.println(e.getMessage()); 
      } 
		
	}
}