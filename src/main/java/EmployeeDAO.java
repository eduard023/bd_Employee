import java.sql.Connection;
import java.util.List;

public interface EmployeeDAO {
    //создание сотрудника
    void createEmployee(Employee employee);
    //поиск сотрудника по id
    Employee searchById(int id);
    //вывод всех сотрудников
    List<Employee> readAll();
    //изменение сотрудника
    void updateById(Employee employee);
    //удаление сотрудника
    void deleteById(Employee employee);
}
