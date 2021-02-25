package jdbc;

import java.sql.*;

public class InsertDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java19jan?characterEncoding=latin1","root","password");
        Statement statement = connection.createStatement();

        String insert = "Insert into employee(id,name,address) values(2,'Sachin','Nashik')";
        String update = "update employee set name = 'rahul' where id=2";
        String delete = "delete from employee where id=2";
          int i = statement.executeUpdate(delete);

        System.out.println("row inserted=>"+i);

    }





    }
