import java.sql.Connection;
import java.util.List;

public interface EmployeeDAO {
    //создание сотрудника
    void createEmployee(Employee employee, Connection connection);
    //поиск сотрудника по id
    Employee searchById(int id, Connection connection);
    //вывод всех сотрудников
    List<Employee> readAll(Connection connection);
    //изменение сотрудника
    void updateById(int id, String firstName, String lastName, String gender, int age, int cityId, Connection connection);
    //удаление сотрудника
    void deleteById(int id, Connection connection);
}
