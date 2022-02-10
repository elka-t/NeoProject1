import java.sql.*;

public class ConnectionToMS {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/pojo";
        String user = "root";
        String password = "parol";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection =  DriverManager.getConnection(url,user,password);
            System.out.println("Successfully connected to database "+url);
            Statement statement = connection.createStatement();
            String insertingData = "Insert into products(pName, price) values('carrot',21.3)";
            statement.executeUpdate(insertingData);
            //String changeData = "Update products set price=23.5 where pName = 'carrot'";
            statement.executeUpdate(changeData);
            //String deleting = "delete from products where pName = 'carrot'";



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
