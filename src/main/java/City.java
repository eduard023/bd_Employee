import javax.persistence.*;
import java.util.Objects;

public class City {

    public City() {
    }

     private int cityId;

    private String cityName;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return cityId == city.cityId && Objects.equals(cityName, city.cityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityId, cityName);
    }

    @Override
    public String toString() {
        return
               "cityName='" + cityName + '\'';
    }
}
