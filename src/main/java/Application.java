import java.sql.*;
import java.util.List;

public class Application {

    public static void main(String[] args) throws SQLException{
          EmployeeDAO employeeDAO = new EmployeeDAOImpl();
          CityDAO cityDAO = new CityDAOImpl();
          City city6 = new City("Nizhniy Novgorod", 10);
//          cityDAO.create(city6);
//        cityDAO.delete(city6);
        City city7 = new City("London", 10);
//        cityDAO.update(city7);
        List<City>cityList = cityDAO.readAll();
        System.out.println(cityList);


         Employee employee6 = new Employee("Kirill", "Ignatiev", "male", 19, city7);
//          employeeDAO.createEmployee(employee6);

          List<Employee> employeeList = employeeDAO.readAll();
              System.out.println(employeeList);

//              Employee employee2 = new Employee(25,"Aleksandra", "Petrova", "female", 34, 2);
//              employeeDAO.updateById(employee2);
//          employeeDAO.deleteById(employee2);
      }

    }
