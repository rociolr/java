import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {
        Methods methods = new Methods();
        int x = 0;
        while (x != 3)
        {
            try
            {
                System.out.println("choose  a number since 1 to 3:");
                System.out.println("1. add  vehicle");
                System.out.println("2. list vehicles");
                System.out.println("3. exit");
                x = scan.nextInt();
                scan.nextLine();
                switch (x)
                {
                    case 1:
                        int y = 0;
                        while (y != 3)
                        {

                            System.out.println("SUBMENU: choose a number since 1 to 3:");
                            System.out.println("1. add car");
                            System.out.println("2. add motorbike :");
                            System.out.println("3. exit");
                            y = scan.nextInt();
                            scan.nextLine();
                            switch (y)
                            {
                                case 1:
                                    System.out.println("add a brand");
                                    String brand1 = scan.nextLine();
                                    System.out.println("add a model");
                                    String model1 = scan.nextLine();
                                    System.out.println("add a year");
                                    Integer year1 = scan.nextInt();
                                    System.out.println("add a numberOfDoor");
                                    Integer numberOfDoor1 = scan.nextInt();
                                    System.out.println("add a isConvertible");
                                    Boolean isConvertible1 = scan.nextBoolean();
                                    Car c1 = new Car(brand1, model1, year1, numberOfDoor1, isConvertible1);
                                    methods.addVehicle(c1);
                                    break;
                                case 2:
                                    System.out.println("add a brand");
                                    String brand2 = scan.nextLine();
                                    System.out.println("add a model");
                                    String model2 = scan.nextLine();
                                    System.out.println("add a year");
                                    Integer year2 = scan.nextInt();
                                    System.out.println("add a engineDisplacement");
                                    Integer engineDisplacement2 = scan.nextInt();
                                    System.out.println("add a hasSideCare");
                                    Boolean hasSideCar2 = scan.nextBoolean();
                                    Motorbike m = new Motorbike(brand2, model2, year2, engineDisplacement2, hasSideCar2);
                                    methods.addMotorbike(m);
                                    break;
                                case 3:
                                    System.out.println("exiting submenu 1");

                                    break;
                                default:
                                    System.out.println(" incorrect number");

                            }
                        }
                        break;
                    case 2:
                        int z = 0;
                        while (z != 3)
                        {

                            System.out.println("SUBMENU: choose a number since 1 to 3:");
                            System.out.println("1. list vehicles");
                            System.out.println("2. list vehicle by brand's vehicle :");
                            System.out.println("3. list vehicle by model's vehicle :");
                            System.out.println("4. exit");
                            z = scan.nextInt();
                            scan.nextLine();
                            switch (z)
                            {
                                case 1:
                                    methods.listVehicle();
                                    break;
                                case 2:
                                    methods.listVehicleByModel();
                                    break;
                                case 3:
                                    methods.listVehicleByBrand();
                                    break;
                                case 4:
                                    System.out.println("exiting submenu 2");
                                    break;
                                default:
                                    System.out.println(" incorrect number");

                            }


                        }
                        break;
                    case 3:
                        System.out.println("exiting menu");
                        break;
                    default:
                        System.out.println("incorrect number");
                }


            }

            catch (Exception e)
            {
                System.out.println("error");
            }
        }
    }
}