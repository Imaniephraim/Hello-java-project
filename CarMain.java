public class CarMain {
    public static void main(String[] args) {
        Car nameRecord = new Car();
        Car colourRecord = new Car();
        Car mileageRecord = new Car();
        Car passengerCapacityRecord = new Car();
        Car engineSizeRecord = new Car();

        nameRecord.setName("Toyota Vanguard");
        colourRecord.setColour("Ash Grey");
        mileageRecord.setMileage(20000);
        passengerCapacityRecord.setPassengerCapacity(5);
        engineSizeRecord.setengineSize("V6");

        System.out.println("Car name: " + nameRecord.getName());
        System.out.println("Car colour: " + colourRecord.getColour());
        System.out.println("Car mileage: " + mileageRecord.getMileage());
        System.out.println("Car passenger capacity: " + passengerCapacityRecord.getPassengerCapacity());
        System.out.println("Car engine size: " + engineSizeRecord.engineSize());
    }
}
