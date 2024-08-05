public class vehicle
{
    private String brand;
    private String model;
    private Integer year;
    public void  startEngine()  {

    }
    public void accelerate(int speed){

    }
    public void brake(int speed){
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public Integer getYear()
    {
        return year;
    }

    public void setYear(Integer year)
    {
        this.year = year;
    }

    public vehicle()
    {
    }

    public vehicle(String brand, String model, Integer year)
    {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString()
    {
        return "" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ' ';
    }
}
