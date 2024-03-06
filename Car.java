public class Car {
    private String name;
    private String colour;
    private int mileage;
    private int passengerCapacity;
    private String engineSize;

    public void setName(String temp) {
        name = temp;
    }

    public String getName(){
        return name;
    }

    public void setColour(String temp) {
        colour = temp ;
    }

    public String getColour(){
        return colour;
    }

    public void setMileage(int temp){
        mileage = temp;
    }

    public int getMileage(){
        return mileage;
    }

    public void setPassengerCapacity(int temp){
        passengerCapacity = temp;
    }

    public int getPassengerCapacity(){
        return passengerCapacity;
    }

    public void setengineSize(String temp){
        engineSize = temp;
    }

    public String engineSize(){
        return engineSize;
    }
}
