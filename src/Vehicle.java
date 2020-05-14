import java.util.Scanner;

public class Vehicle {
    private String modelNumber;
    private String engineType;
    private int enginePower;
    private float tyreSize;
    private static int ID = 101;
    private String vehicleId;
    public static int visitor = 30;

    String vehicleTypes;
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
                "\nModelNumber:"+ modelNumber + " Enginetype:"+ engineType + " EnginePower:"+ enginePower+ " TyreSize:"+ tyreSize +
                 "\n"+ vehicleTypes;
    }
    public String printIDandModel()
    {
        return "\nID:"+ vehicleId + " Model Number:"+ modelNumber +" "+vehicleTypes;
    }
    public String VehiclesWithVisitorCount()
    {
        return "\nModel Number:"+ modelNumber + "  "+" "+vehicleTypes;
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
                "\n\t1. Press a for Normal- No extra property Type" +
                "\n\t2. Press b for Sports-" +
                "\n\t3. Press c for Heavy-");

        String typeNormal = "Normal";
        String typeSports = "Sports";
        String typeSportsA = "Turbo";
        String typeSportsB = "Engine type oil only";
        String typeHeavy = "Heavy";
        String typeHeavyA = "Weight";
        String typeHeavyB = "Engine type diesel only";

        Scanner inp = new Scanner(System.in);
        String vehicle_type = inp.nextLine();
        if (!vehicle_type.equals("Q")){
            //1.Normal type
            if (vehicle_type.toLowerCase().equals(typeNormal.toLowerCase())||vehicle_type.equals("a")){
                vehicleTypes = "Vehicle Type: " + typeNormal;
            }
            else if (vehicle_type.toLowerCase().equals(typeSports.toLowerCase())||vehicle_type.equals("b")){
                //2.Sports

                vehicleTypes = "Vehicle Type: " + "(" +  typeSports ;
                System.out.println("\n\t2. Enter the Type of Sports: " +
                        "\n\t\t2.1 Press a for Turbo" +
                        "\n\t\t2.2 Press b for Engine type oil only");
                vehicle_type = inp.nextLine();
                if (vehicle_type.toLowerCase().equals(typeSportsA.toLowerCase())||vehicle_type.equals("a")){
                   //2a. Turbo
                    vehicleTypes = vehicleTypes + typeSportsA + ")";
                }
                else if (vehicle_type.toLowerCase().equals(typeSportsB.toLowerCase())||vehicle_type.equals("b")){

                    //2b. Engine type oil
                    vehicleTypes = vehicleTypes+ typeSportsB +")";
                }
                visitor+=20;
            }
            else if (vehicle_type.toLowerCase().equals(typeHeavy.toLowerCase())||vehicle_type.equals("c")){
                //3.Heavy
                vehicleTypes = "Vehicle Type: " + "(" +typeHeavy;
                System.out.println("\n\t3. Enter the Type of Sports: " +
                        "\n\t\t3.1 Press a for Weight" +
                        "\n\t\t3.2 Press b for Engine type diesel only");
                vehicle_type = inp.nextLine();
                if (vehicle_type.toLowerCase().equals(typeHeavyA.toLowerCase())||vehicle_type.equals("a")){
                    //3a. Weight
                    vehicleTypes = vehicleTypes + typeHeavyA + ")";
                }
                else if (vehicle_type.toLowerCase().equals(typeHeavyB.toLowerCase())||vehicle_type.equals("b")){

                    //3b. Engine type diesel only
                    vehicleTypes = vehicleTypes+ typeHeavyB +")";
                }
            }

            System.out.println("Added");




        }
        else {
            System.out.println("Invalid Character");
        }
    }



}