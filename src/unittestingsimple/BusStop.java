package unittestingsimple;

// IMPORTANT: do not change the below BusStop class
public class BusStop {
    private String name; // human-readable name
    private int id; // unique identifier
    private double latitude; // north-south coordinate
    private double longitude; // east-west coordinate

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
// ^^^ IMPORTANT: do not change the above BusStop class