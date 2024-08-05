public class Motorbike extends vehicle
{
    private Integer engineDisplacement;
    private  Boolean hasSideCar;
    public void wheelie(){

    }
    public void putHelment(){

    }

    public Integer getEngineDisplacement()
    {
        return engineDisplacement;
    }

    public void setEngineDisplacement(Integer engineDisplacement)
    {
        this.engineDisplacement = engineDisplacement;
    }

    public Boolean getHasSideCar()
    {
        return hasSideCar;
    }

    public void setHasSideCar(Boolean hasSideCar)
    {
        this.hasSideCar = hasSideCar;
    }



    public Motorbike(String brand, String model, Integer year, Integer engineDisplacement, Boolean hasSideCar)
    {
        super(brand, model, year);
        this.engineDisplacement = engineDisplacement;
        this.hasSideCar = hasSideCar;
    }

    public Motorbike()
    {super();
    }

    @Override
    public String toString()
    {
        return "Motorbike{" +
                "engineDisplacement=" + engineDisplacement +
                ", hasSideCar=" + hasSideCar +
                 super.toString()+ "} ";
    }
}
