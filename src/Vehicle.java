import java.util.Scanner;

public class Vehicle {
    private String modelNumber;
    private String engineType;
    private int enginePower;
    private float tyreSize;
    private static int ID = 101;
    private String vehicleId;
    public int visitor = 0;

    private String vehicleTypes;
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

        setTypeOfVehicle();



    }

    public String printAll()
    {
        return "\nID "+ vehicleId +
                "\nModel Number:"+ modelNumber + " Engine type:"+ engineType + " Engine Power:"+ enginePower+ " Tyre Size:"+ tyreSize +
                 "\n1"+ vehicleTypes +
                "\nTotal visitors are: "+ visitor + " in number";
    }
    public String printIDandModel()
    {
        return "\nID: "+ vehicleId + " Model Number:"+ modelNumber;
    }
    public String printIDOnly()
    {
        return vehicleId;
    }

    //setting each vehicle with distinct id
    private void setVehicleId(){
        ID++;
        this.vehicleId= modelNumber+ "" + ID;

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
    private void setTypeOfVehicle(){
        //set the three types of vehicles for counting the visitors
        System.out.println("Enter the Type of vehicle (Q for quit): " +
                "\n\t1. Normal- No extra property" +
                "\n\t2. Sports- " +
                "\n\t\ta. Turbo" +
                "\n\t\ta. Engine type oil only" +
                "\n\t3.Heavy-" +
                "\n\t\ta.Weight" +
                "\n\t\tb. Engine type diesel only");
        String type1 = "Normal";
        String type2 = "Sports";
        String type2a = "Turbo";
        String type2b = "Engine type oil only";
        String type3 = "Heavy";
        String type3a = "Weight";
        String type3b = "Engine type diesel only";

        Scanner inp = new Scanner(System.in);
        String vehicle_type = inp.nextLine();
        if (!vehicle_type.equals("Q")){
            //1.Normal type
            if (vehicle_type.toLowerCase().equals(type1.toLowerCase())||vehicle_type.equals("1")){
                vehicleTypes = "Vehicle Type: " + type1;
            }
            else if (vehicle_type.toLowerCase().equals(type2.toLowerCase())||vehicle_type.equals("2")){
                //2.Sports
                System.out.println("ESEchi");
                vehicleTypes = "Vehicle Type: " + "(" +  type2 ;
                vehicle_type = inp.nextLine();
                if (vehicle_type.toLowerCase().equals(type2a.toLowerCase())||vehicle_type.equals("a")){
                   //2a. Turbo
                    vehicleTypes = vehicleTypes + type2a + ")";
                }
                else if (vehicle_type.toLowerCase().equals(type2b.toLowerCase())||vehicle_type.equals("b")){

                    //2b. Engine type oil
                    vehicleTypes = vehicleTypes+ type2b +")";
                }
            }
            else if (vehicle_type.toLowerCase().equals(type3.toLowerCase())||vehicle_type.equals("3")){
                //2.Sports
                vehicleTypes = "Vehicle Type: " + "(" +type3;
                vehicle_type = inp.nextLine();
                if (vehicle_type.toLowerCase().equals(type3a.toLowerCase())||vehicle_type.equals("a")){
                    //2a. Turbo
                    vehicleTypes = vehicleTypes + type3a + ")";
                }
                else if (vehicle_type.toLowerCase().equals(type3b.toLowerCase())||vehicle_type.equals("b")){

                    //2b. Engine type oil
                    vehicleTypes = vehicleTypes+ type3b +")";
                }
            }

            visitor = visitor + 10;

        }
        else {
            System.out.println("Invalid Character");
        }
    }



}