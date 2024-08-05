public class Car extends vehicle
{
    private Integer numberOfDoor;
    private Boolean isConvertible;
    public void honk(){

    }
    public void putSeabelt(){

    }
    public void drift(){

    }

    public Integer getNumberOfDoor()
    {
        return numberOfDoor;
    }

    public void setNumberOfDoor(Integer numberOfDoor)
    {
        this.numberOfDoor = numberOfDoor;
    }

    public Boolean getConvertible()
    {
        return isConvertible;
    }

    public void setConvertible(Boolean convertible)
    {
        isConvertible = convertible;
    }

    public Car(Integer numberOfDoor, Boolean isConvertible)
    {
        this.numberOfDoor = numberOfDoor;
        this.isConvertible = isConvertible;
    }

    public Car(String brand, String model, Integer year, Integer numberOfDoor, Boolean isConvertible)
    {
        super(brand, model, year);
        this.numberOfDoor = numberOfDoor;
        this.isConvertible = isConvertible;
    }

    @Override
    public String toString()
    {
        return "Car{" +
                "numberOfDoor=" + numberOfDoor +
                ", isConvertible=" + isConvertible  + super.toString()+
                "} ";
    }
}
