package address;

public class Address {

    private String Country;

    private int cityNumber;

    private String street;

    private int level;

    public Address(String country, int cityNumber, String street, int level) {
        this.Country = country;
        this.cityNumber = cityNumber;
        this.street = street;
        this.level = level;
    }


    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public int getCityNumber() {
        return cityNumber;
    }

    public void setCityNumber(int cityNumber) {
        this.cityNumber = cityNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Address{" +
                "Country='" + Country + '\'' +
                ", cityNumber=" + cityNumber +
                ", street='" + street + '\'' +
                ", level=" + level +
                '}';
    }
}
