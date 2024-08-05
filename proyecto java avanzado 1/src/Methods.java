import java.util.ArrayList;

public class Methods
{
    private ArrayList<vehicle> vehicleList;

    public ArrayList<vehicle> getVehicleList()
    {
        return vehicleList;
    }

    public void setVehicleList(ArrayList<vehicle> vehicleList)
    {
        this.vehicleList = vehicleList;
    }

    public Methods(ArrayList<vehicle> vehicleList)
    {
        this.vehicleList = vehicleList;
    }

    public Methods()
    { this.vehicleList=new ArrayList<vehicle>();
    }
    public void addVehicle(Car c){

        vehicleList.add(c);
    }
    public void addMotorbike(Motorbike m){

        vehicleList.add(m);
    }
    public void listVehicle(){

    vehicleList.stream().forEach(vehicle ->  System.out.println(vehicle));
    }
    public void listVehicleByBrand(){

        vehicleList.stream().forEach(vehicle ->  System.out.println(vehicle.getBrand()));
    }
    public void listVehicleByModel(){

        vehicleList.stream().forEach(vehicle ->  System.out.println(vehicle.getModel()));
    }

    @Override
    public String toString()
    {
        return "Methods{" +
                "vehicleList=" + vehicleList +
                '}';
    }
}
