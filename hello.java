import java.sql.*;
class hello
{
	public static void main(String s[])
	{
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
       Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sandhu","sandhu");
       Statement st=con.createStatement();
       ResultSet rs=st.executeQuery("select * from userinfo");
	   while(rs.next())
	   {
		System.out.println("Userid ="+rs.getString(1));
        System.out.println("Name ="+rs.getString(2));
		System.out.println("Phone ="+rs.getString(3));
		System.out.println("Age ="+rs.getString(4));
		System.out.println("email ="+rs.getString(5));
		System.out.println("");
	   }
       System.out.println("Hello");
       con.close();
     
      }
      catch(Exception e){
         System.out.println(e.getMessage()); 
      } 
		
	}
}