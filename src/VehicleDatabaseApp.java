import java.util.ArrayList;
import java.util.Scanner;

public class VehicleDatabaseApp {
    //private static Vehicle[] vehicles = new Vehicle[100];
    private static ArrayList <Vehicle> vehicles = new ArrayList <Vehicle>();
    private String selectMenu;
    private static int numOfVehicle;
    private static int init=0,temp;

    public static void main(String[] args) {

        while(1!=0){

            String select = new VehicleDatabaseApp().menu();
            if (select.equals("q"))
                break;

            else if (select.equals("a")){
                //add any type of vehicle
                System.out.println("How many vehicles do you want to Add:");
                Scanner inp =  new Scanner(System.in);
                numOfVehicle = inp.nextInt();

                temp = init;
                init+=numOfVehicle;

                System.out.println("beforetemp"+temp+"init"+init);
                for (int i=temp; i<init; i++)
                {
                    vehicles.add(new Vehicle());
                    //vehicles[i] =  new Vehicle();
                }

                System.out.println("aftertemp"+temp+"init"+init);
                System.out.println("All the informations are added successfully.");

                System.out.println("##########");
                for(Vehicle var: vehicles){
                    System.out.println(var.printAll());
                }

                System.out.println("##########");
                /*for (int i=0; i<init; i++)
                {
                    //System.out.println("print numberofvehicle" +numOfVehicle);

                    System.out.println(vehicles[i].printAll());
                }*/


            }
            else if (select.equals("b")){

                System.out.println("Vehicles in stock: ");
                /*for (int i=0; i<init; i++)
                {

                    System.out.print(vehicles[i].printIDandModel());
                }*/

                for(Vehicle var: vehicles){
                    System.out.println(var.printIDandModel());
                }

                System.out.print("\nPlease enter Vehicle ID to remove:");
                Scanner in = new Scanner(System.in);
                String match = in.nextLine();
                /*for (int i=0; i<init; i++)
                {
                    if (vehicles[i].printIDOnly().equals(match)){
                        vehicles[i] = null;
                        break;
                    }
                }*/

                for(Vehicle var: vehicles){
                    if (var.printIDOnly().equals(match)){
                    vehicles.remove(var);
                }
                }

            }
            else if (select.equals("d"))
            {
                /*for (int i=0; i<init; i++)
                {
                    System.out.println("print numberofvehicle" +init);

                    System.out.println(vehicles[i].printAll());
                }*/

                for(Vehicle var: vehicles){
                    System.out.println(var.printAll()
                    );
                }
            }
        }






    }
    private String menu(){
        System.out.println("Welcome to X Vehicle Shop" +
                "\nSelect an option:" +
                "\n\t 1.Press a for adding any type of vehicle" +
                "\n\t 2.Press b for Removing a vehicle" +
                "\n\t 3.Press c for Showing list of vehicles with current expected visitor count" +
                "\n\t 4.Press d for the List of all vehicles with detail" +
                "\n\t 5.For Quit, Press q");
        Scanner inp = new Scanner(System.in);
        selectMenu = inp.nextLine();
        return selectMenu;


    }


}
