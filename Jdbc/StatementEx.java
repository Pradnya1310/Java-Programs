package Jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementEx {
	Connection connection;
	Statement statement;
	ResultSet resultset;
	
	public StatementEx() throws ClassNotFoundException,SQLException{
		connection=MyConnection.getMyConnection();
		System.out.println("connection get open");
		
	}
	public void getCustomers() throws SQLException{
		statement=connection.createStatement();
		resultset=statement.executeQuery("select * from Customer");
		while(resultset.next()) {
			System.out.print(resultset.getInt("custId")+"\t");
			System.out.print(resultset.getString("custName")+"\t");
			System.out.print(resultset.getString("custAddress")+"\t");
			System.out.print(resultset.getString("pjone_no")+"\t");
			System.out.println();
		}
	}
	public void getCustomersById(int id) throws SQLException{
		statement=connection.createStatement();
		resultset=statement.executeQuery("select * from Customer where custId="+id);
		while(resultset.next()) {
			System.out.print(resultset.getInt("custId")+"\t");
			System.out.print(resultset.getString("custName")+"\t");
			System.out.print(resultset.getString("custAddress")+"\t");
			System.out.print(resultset.getString("pjone_no")+"\t");
			System.out.println();
		}
	}



   public void close() throws SQLException{
	   connection.close();
	   
   }
   public static void main(String[] args) throws SQLException, ClassNotFoundException {
	   StatementEx obj=new StatementEx();
	   obj.getCustomers();
	   obj.getCustomersById(101);
	   obj.close();
	
	
}
   }
