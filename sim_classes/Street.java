package sim_classes;

public class Street {
    // Variables set
    private String street_name;
    private int streetlanes_A;
    private int streetlanes_B;
    private int street_length;
    // Constructor
    public Street(String x, int y, int z, int w) {
        this.street_name = x;
        this.streetlanes_A = y;
        this.streetlanes_B = z;
        this.street_length = w;
    }
    // Methods
    public String getStreet_name() {
        return street_name;
    }
    public void setStreet_name(String x) {
        this.street_name = x;
    }
    public int getStreetlanes_A() {
        return streetlanes_A;
    }
    public void setStreetlanes_A(int x) {
        this.streetlanes_A = x;
    }
    public int getStreetlanes_B() {
        return streetlanes_B;
    }
    public void setStreetlanes_B(int x) {
        this.streetlanes_B = x;
    }
    public int getStreet_length() {
        return street_length;
    }
    public void setStreet_length(int x) {
        this.street_length = x;
    }
}
