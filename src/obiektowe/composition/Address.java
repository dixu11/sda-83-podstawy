package obiektowe.composition;

public class Address {
    private String street;
    private String country;
    private String houseNo;
    private String zip;

    public Address(String street, String country, String houseNo, String zip) {
        this.street = street;
        this.country = country;
        this.houseNo = houseNo;
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", country='" + country + '\'' +
                ", houseNo='" + houseNo + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
