import java.util.ArrayList;
import java.util.Iterator;
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
                //Adding any type of vehicle
                System.out.println("How many vehicles do you want to Add:");
                Scanner inp =  new Scanner(System.in);
                numOfVehicle = inp.nextInt();

                temp = init;
                init+=numOfVehicle;

                for (int i=temp; i<init; i++)
                {
                    vehicles.add(new Vehicle());
                }

                 System.out.println("All the informations are added successfully.");

                System.out.print("----------------------------------------------------------");
                for(Vehicle var: vehicles){
                    System.out.println(var.printAll());
                }

                System.out.println("----------------------------------------------------------");


            }
            else if (select.equals("b")){
                //Removing a vehicle

                System.out.println("Vehicles in stocks are: ");


                for(Vehicle var: vehicles){
                    System.out.print(var.printIDandModel());
                }

                System.out.print("\nPlease enter Vehicle ID to remove:(q to back)");
                Scanner in = new Scanner(System.in);
                String match = in.nextLine();
                if(match.toLowerCase().equals("q")){
                    continue;
                }

                boolean checker = false;


                //for(Vehicle var: vehicles)
                for (Iterator<Vehicle> iterator = vehicles.iterator(); iterator.hasNext(); ) {
                    Vehicle value = iterator.next();
                    //System.out.println("DEBUGGING = var"+var+ "##PrintID"+var.printIDOnly()+"##match"+match);
                    if (value.printIDOnly().equals(match)){
                        //decreasing visitors
                        if (value.vehicleTypes.indexOf("Sports")>0)
                        {

                            value.visitor-=20;
                        }
                        iterator.remove();
                        checker = true;

                    }



                }

                System.out.println("Vehicle removed: "+checker);
                if(checker==false){
                    System.out.println("No Vehicle available at this ID, Try again");
                }
                else
                System.out.print("List of vehicle "); if(checker) System.out.print("After remove:");

                for(Vehicle var: vehicles){
                    System.out.println(var.printIDandModel());
                }

            }
            else if (select.equals("c"))
            {
                //Showing list of vehicles with current expected visitor count
                System.out.println("Showing list of vehicles with current expected visitor count:");
                for(Vehicle var: vehicles){

                    System.out.print(var.VehiclesWithVisitorCount());
                }
                System.out.println("\n-----------------------------------------------------------");
                System.out.println("------------------ Current visitors: "+ Vehicle.visitor + " -------------------" );
                System.out.println("-----------------------------------------------------------");




            }



            else if (select.equals("d"))
            {
                if(numOfVehicle==0)
                {
                    System.out.println("There is no vehicle in your shop. Go back to menu and press a to add.");
                }
                for(Vehicle var: vehicles){

                    System.out.println(var.printAll());
                }
                System.out.println("------------------------------------------------------------");
                System.out.println("Your total visitors: "+ Vehicle.visitor );
                System.out.println("------------------------------------------------------------");

            }

            else
                System.out.println("Invalid Input, Try again...!!");



        }






    }
    private String menu(){
        System.out.println("\nWelcome to X Vehicle Shop" +
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
