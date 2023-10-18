import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Wine wine1 = new Wine("Изабелла", "Виноградник", "Россия", LocalDate.of(2020,
                Month.APRIL, 10), "Красное душистое");
        wine1.wineAging(LocalDate.now());

    }
}

class Wine {
    private String name;
    private String brand;
    private String country;
    private LocalDate date;
    private String description;

    public Wine(String name, String brand, String country, LocalDate date, String description) {
        this.name = name;
        this.brand = brand;
        this.country = country;
        this.date = date;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void wineAging(LocalDate now) {
        int years = Period.between(date,now).getYears();
        System.out.println("Выдержка составляет: "+years+" года");
    }

}