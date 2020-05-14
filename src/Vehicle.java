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
    public Vehicle () throws Exception {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Model Number of your Vehicle: ");
        this.modelNumber = inp.nextLine();
        System.out.print("Enter the type of Engine: \n\t\tEnter a for Engine Type- oil\n\t\tEnter b for Engine Type- gas\n\t\tEnter c for Engine Type- diesel\n");

            String temp = inp.nextLine();
            if (temp.toLowerCase().equals("a"))
                this.engineType = "Oil";
            else if (temp.toLowerCase().equals("b"))
                this.engineType = "Gas";
            else if(temp.toLowerCase().equals("c"))
            this.engineType = "Diesel";

            else{
                System.out.println("Please follow the instruction properly.");
                throw new Exception ();
            }


        System.out.print("Enter Engine power of your Vehicle: ");
        this.enginePower = inp.nextInt();

        //System.out.println("Engine power should be an Integer!");

        System.out.print("Enter Tyre Size of your Vehicle: ");
        this.tyreSize = inp.nextFloat();

           //System.out.println("Tyre size should be float or integer!");

        setVehicleId();

        setTypeOfVehicle();



    }

    public String printAll() {
        return "\nVehicle ID: " + vehicleId +
                "\n------------------------"+
                "\n\t" + vehicleTypes +
                "\n\tModel Number: " + modelNumber +
                "\n\tEngine type: " + engineType +
                "\n\tEngine Power: " + enginePower +
                "\n\tTyre Size: " + tyreSize;
    }

    public String printIDandModel()
    {
        return "\nID: "+ vehicleId + "    Model: "+ modelNumber +"    "+vehicleTypes;
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
    private void setTypeOfVehicle() throws Exception {
        //set the three types of vehicles for counting the visitors
        System.out.println("Enter the Type of vehicle (Q for quit): " +
                "\n\t   Press a for Normal- No extra property Type" +
                "\n\t   Press b for Sports-" +
                "\n\t   Press c for Heavy-");

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

                vehicleTypes = "Vehicle Type: " + "(" +  typeSports +"-" ;

                if(engineType.toLowerCase().equals("gas")||engineType.toLowerCase().equals("diesel")) {

                    System.out.println("\n\t2. Enter the Type of Sports: " +
                            "\n\t\t   Press a for Turbo" );
                    vehicle_type = inp.nextLine();
                    if (vehicle_type.toLowerCase().equals(typeSportsA.toLowerCase())||vehicle_type.equals("a")){
                        //2a. Turbo
                        vehicleTypes = vehicleTypes + typeSportsA + ")";
                    }
                    else{
                        System.out.println("Please follow the instruction properly.");
                        throw new Exception ();
                    }

                }
                else
                {
                    System.out.println("\n\t2. Enter the Type of Sports: " +
                            "\n\t\t   Press a for Turbo" +
                            "\n\t\t   Press b for Engine type oil only");

                    vehicle_type = inp.nextLine();
                    if (vehicle_type.toLowerCase().equals(typeSportsA.toLowerCase())||vehicle_type.equals("a")){
                        //2a. Turbo
                        vehicleTypes = vehicleTypes + typeSportsA + ")";
                    }
                    else if (vehicle_type.toLowerCase().equals(typeSportsB.toLowerCase())||vehicle_type.equals("b")){
                        //2b. Engine type oil
                        vehicleTypes = vehicleTypes+ typeSportsB +")";
                    }
                    else{
                        System.out.println("Please follow the instruction properly.");
                        throw new Exception ();
                    }



                }

                visitor+=20;
            }

            else if (vehicle_type.toLowerCase().equals(typeHeavy.toLowerCase())||vehicle_type.equals("c")){
                //3.Heavy
                vehicleTypes = "Vehicle Type: " + "(" +typeHeavy+"-";



                if(engineType.toLowerCase().equals("oil")||engineType.toLowerCase().equals("gas"))
                {

                    System.out.println("\n\t3. Enter the Type of Sports: " +
                            "\n\t\t   Press a for Weight");
                    vehicle_type = inp.nextLine();
                    if (vehicle_type.toLowerCase().equals(typeHeavyA.toLowerCase())||vehicle_type.equals("a")){
                        //3a. Weight
                        vehicleTypes = vehicleTypes + typeHeavyA + ")";
                    }
                    else{
                        System.out.println("Please follow the instruction properly.");
                        throw new Exception ();
                    }

                }
                else {
                    System.out.println("\n\t3. Enter the Type of Sports: " +
                            "\n\t\t   Press a for Weight" +
                            "\n\t\t   Press b for Engine type diesel only");
                    vehicle_type = inp.nextLine();
                    if (vehicle_type.toLowerCase().equals(typeHeavyA.toLowerCase())||vehicle_type.equals("a")){
                        //3a. Weight
                        vehicleTypes = vehicleTypes + typeHeavyA + ")";
                    }
                    else if (vehicle_type.toLowerCase().equals(typeHeavyB.toLowerCase())||vehicle_type.equals("b")){

                        //3b. Engine type diesel only
                        vehicleTypes = vehicleTypes+ typeHeavyB +")";
                    }
                    else{
                        System.out.println("Please follow the instruction properly.");
                        throw new Exception ();
                    }
                }


            }

            else{
                System.out.println("Please follow the instruction properly.");
                throw new Exception ();
            }

            System.out.println("Added");




        }
        else {
            System.out.println("Invalid Character");
        }
    }



}