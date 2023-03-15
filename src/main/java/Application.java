import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) throws SQLException{
      final String user = "postgres";
      final String password = "11";
      final String url = "jdbc:postgresql://localhost:5432/skypro";


      try (final Connection connection = DriverManager.getConnection(url, user, password);
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM employee WHERE id = (?)")){
          statement.setInt(1, 3);

          final ResultSet resultSet = statement.executeQuery();

          while (resultSet.next()) {
              String firstName = "First name: " + resultSet.getString("first_name");
              String lastName = "Last name: " + resultSet.getString("last_name");
              String gender = "Gender: " + resultSet.getString("gender");
              String age = "Age: " + resultSet.getInt("age");
              String cityId = "City id: " + resultSet.getInt("city_id");

              System.out.println(firstName);
              System.out.println(lastName);
              System.out.println(gender);
              System.out.println(age);
              System.out.println(cityId);
          }

          System.out.println();
          EmployeeDAO employeeDAO = new EmployeeDAOImpl();
          //поиск сотрудника по id
//          System.out.println(employeeDAO.searchById(2, connection));
//          employeeDAO.createEmployee(new Employee("Anastasiya", "Alekseeva", "female", 45, new City(3)),connection);
//          employeeDAO.deleteById(8,connection);
          employeeDAO.updateById(9, "Vladimir", "Olegov", "male", 33, 4, connection);
          List<Employee> employeeList = new ArrayList<>(employeeDAO.readAll(connection));
          for (Employee employee : employeeList) {
              System.out.println(employee);
          }
      }
    }
}
