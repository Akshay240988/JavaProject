package jdbc;

import java.sql.*;
import java.util.Scanner;

public class PreparedStatDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        int id;
        String name;
        String address;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id=>");
        id = scanner.nextInt();
        System.out.println("Enter name->");
        name = scanner.next();
        System.out.println("Enter Address");
        address = scanner.next();

        String insert = "Insert into employee(id,name,address) values(?,?,?)";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java19jan?characterEncoding=latin1", "root", "password");
        PreparedStatement statement = connection.prepareCall(insert);

        statement.setInt(1,id);
        statement.setString(2,name);
        statement.setString(3,address);



       // String update = "update employee set name = 'rahul' where id=2";
       // String delete = "delete from employee where id=2";
         statement.executeUpdate();



    }
}
