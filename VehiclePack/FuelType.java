package VehiclePack;

public enum FuelType {
    Gasoline(1, "Gasoline"),
    Diesel(2, "Diesel"),
    WhiteGasoline(3, "WhiteGasoline");

    private String value;
    private int key;

    FuelType(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
}
