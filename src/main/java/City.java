import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Entity
@Table(name = "city")
public class City {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "city_id")
    private int cityId;
@Column(name = "city_name")
    private String cityName;
@OneToMany(mappedBy = "city", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Employee> employeeList = new ArrayList<>();



    public City() {
    }

    public City(int cityId) {
        this.cityId = cityId;
    }

    public City(String cityName) {
        this.cityName = cityName;
    }

    public City(String cityName, int cityId) {
        this.cityId = cityId;
        this.cityName = cityName;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return
               cityId + " cityName='" + cityName + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return cityId == city.cityId && Objects.equals(cityName, city.cityName) && Objects.equals(employeeList, city.employeeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityId, cityName, employeeList);
    }
}
