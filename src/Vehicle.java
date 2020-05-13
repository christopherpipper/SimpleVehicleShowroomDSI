import java.util.Scanner;

public class Vehicle {
    private String modelNumber;
    private String engineType;
    private int enginePower;
    private float tyreSize;
    private int ID = 101;
    private String vehicleId;
    /*  constructor: vehicle has attributes of - -
                                                1. model number
                                                2. engine type
                                                    a. oil
                                                    b. gas
                                                    c. diesel
                                                3. engine power
                                                4. tire size
    */
    public Vehicle (){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Model Number of your Vehicle: ");
        this.modelNumber = inp.nextLine();
        System.out.print("Enter the type of Engine: \n a.oil\n b.gas\n c.diesel\n");
        this.engineType = inp.nextLine();
        System.out.print("Enter Engine power of your Vehicle: ");
        this.enginePower = inp.nextInt();
        System.out.print("Enter Tyre Size of your Vehicle: ");
        this.tyreSize = inp.nextFloat();

        setVehicleId();

        System.out.println("Model Number:"+ modelNumber + " Engine type:"+ engineType + " Engine Power:"+ enginePower+ " Tyre Size:"+ tyreSize);
        System.out.println("ID "+ vehicleId);
    }



    /*
        Vehicle has 3 type
            1. normal - no extra property
            2. sports -
                 a. turbo
                 b. engine type oil only
            3. heavy -
                 a. weight
                 b. engine type diesel only

     */

    //setting each vehicle with distinct id
    private void setVehicleId(){
        ID++;
        this.vehicleId= modelNumber+ "" + ID;

    }



}