
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

public class College  {

 public static void main(String[] args) throws IOException, SQLException {
		  

	  String userName = "root";
	  String password = "admin";
	  String url = "jdbc:mysql://localhost:3306/world";
	  
		  
	  
	  Connection con = DriverManager.getConnection(url,userName,password);
	  //System.out.print(con);
	  
	  Statement stmt = con.createStatement();
		  
		  String FilePath="college.csv";
		  int batchSize=10;
		  //String delete="delete from courselist";
		  //Statement st=con.createStatement();
		  //st.execute(delete);
		  String sql="insert into college(sid,name,dept,section,address,number)"+ "values(?,?,?,?,?,?)";
		  PreparedStatement statement = con.prepareStatement(sql);
		  BufferedReader lineReader=new BufferedReader(new FileReader(FilePath));
		  String lineText=null;
		  int count=0;
		  lineReader.readLine();
		  
		  while((lineText=lineReader.readLine())!=null) {
		   String[] data=lineText.split(",");
		   String sid = data[0];
		   String name = data[1];
		   String dept = data[2];
		   String section = data[3];
		   String address = data[4];
		   String number = data[5];
		   statement.setString(1,sid);
		   statement.setString(2,name);
		   statement.setString(3, dept);
		   statement.setString(4, section);
		   statement.setString(5, address);
		   statement.setString(6, number);
		   statement.addBatch();
		   if(count%batchSize==0) {
		    statement.executeBatch();
		   }
		  }
		  
		  lineReader.close();
		  System.out.println("values Inserted");
		  //con.commit();
		  con.close();
		  
		   }
		  // TODO Auto-generated method stub


}
