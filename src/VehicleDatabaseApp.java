import java.util.Scanner;

public class VehicleDatabaseApp {

    public static void main(String[] args) {
        System.out.println("How many vehicles do you want to Add:");
        Scanner inp =  new Scanner(System.in);
        int numOfVehicle = inp.nextInt();
        Vehicle[] vehicles= new Vehicle[numOfVehicle];
        for (int i=0; i<numOfVehicle; i++)
        {

            vehicles[i] =  new Vehicle();
        }

        for (int i=0; i<numOfVehicle; i++)
        {

            System.out.println(vehicles[i].printAll());
        }


        //add any type of vehicle

    }


}
