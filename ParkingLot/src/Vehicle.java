public class Vehicle {
    private String registrationNumber;
    private String color;
    private String vehicleType;

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getColor() {
        return color;
    }

    Vehicle(String registrationNumber, String color, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.color = color;
        this.vehicleType = vehicleType;
    }
}