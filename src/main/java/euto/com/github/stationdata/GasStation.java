package euto.com.github.stationdata;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "stations")
public class GasStation {
    private final String id;
    private final String street;
    private final String houseNumber;
    private final int postCode;
    private final String name;
    private final String brand;
    private final double lat;
    private final double lng;
    private final String place;

    public GasStation(String id, String street, String houseNumber, int postCode,
                      String name, String brand, double lat, double lng, String place) {
        this.id = id;
        this.street = street;
        this.houseNumber = houseNumber;
        this.postCode = postCode;
        this.name = name;
        this.brand = brand;
        this.lat = lat;
        this.lng = lng;
        this.place = place;
    }

    @Override
    public String toString() {
        return "GasStation{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", postCode=" + postCode +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", lat=" + lat +
                ", lng=" + lng +
                ", place='" + place + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public int getPostCode() {
        return postCode;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }

    public String getPlace() {
        return place;
    }
}
