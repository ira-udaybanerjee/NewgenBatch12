package jdbc;


import java.sql.*;
import java.util.*;

public class CustomerDisplay {

	 Connection con;
	 ResultSet select() throws Exception
	 {
		 con = DbOps.getConnection();
		 Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		 ResultSet rs = stmt.executeQuery("select customerid as [id], customername as [name], address, city, mobileno, additionalinfo as [remarks] from customer");
		 
		 return rs;
	 }
	 
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       CustomerDisplay disp = new CustomerDisplay();
       ResultSet dataset = disp.select();
       ResultSetMetaData meta = dataset.getMetaData();
       
       dataset.first();
       System.out.println(meta.getColumnName(1)+"\t"+meta.getColumnName(2)+"\t"+meta.getColumnName(3)+"\t"+meta.getColumnName(4)+"\t"+meta.getColumnName(5)+"\t"+meta.getColumnName(6));
       System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
       System.out.println(dataset.getString(1)+"\t"+dataset.getString(2)+"\t"+dataset.getString(3)+"\t"+dataset.getString(4)+"\t"+dataset.getString(5)+"\t"+dataset.getString(6));
       Scanner scan = new Scanner(System.in);
       String choice = "";
       while(true)
       {
    	   choice = scan.next().toLowerCase();
    	   switch(choice)
    	   {
    	   case "n":
    		   dataset.next();
    		   break;
    	   case "p":
    		   dataset.previous();
    		   break;
    	   case "f":
    		   dataset.first();
    		   break;
    	   case "l":
    		   dataset.last();
    		   break;
    	   case "x":
    		   System.exit(0);    		   
    		   break;
    	   default:
    		   dataset.absolute(Integer.parseInt(choice));
    		   break;
    	   }   
    	   System.out.println(dataset.getString(1)+"\t"+dataset.getString(2)+"\t"+dataset.getString(3)+"\t"+dataset.getString(4)+"\t"+dataset.getString(5)+"\t"+dataset.getString(6));
           
       }
       
       
	}

}
