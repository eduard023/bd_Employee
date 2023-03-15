import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) throws SQLException{
          EmployeeDAO employeeDAO = new EmployeeDAOImpl();
         Employee employee1 = new Employee("Oleg", "Ignatiev", "male", 19, 4);
//          employeeDAO.createEmployee(employee1);

          List<Employee> employeeList = employeeDAO.readAll();
              System.out.println(employeeList);

              Employee employee2 = new Employee(25,"Aleksandra", "Petrova", "female", 34, 2);
//              employeeDAO.updateById(employee2);
//          employeeDAO.deleteById(employee2);
      }

    }
