import java.util.ArrayList;
abstract class User{              // Abstraction
    public String name;
    public String location;
    abstract void displayInfo(); 
}
class Rider extends User{            // Inheritance
    ArrayList<String>ride_history=new ArrayList<>();
    
    public Rider(String name,String location){
        this.name=name;
        this.location=location;
    }
    public void displayInfo(){             // Polymorphism:   Method Overriding
        System.out.println("Rider name: "+name+" , location: "+location);
    }
    public void request_ride(String locationStart,String locationend){
        System.out.println("requesting ride from "+locationStart +" to "+locationend);    
    }
}
class Driver extends User{   
    String car_details;
    boolean availability_status=true;
    public Driver(String name,String location,String car_name){
        this.name=name;
        this.location=location;
        this.car_details=car_name;
    }
    public void displayInfo(){         // Polymorphism:Method Overriding
        System.out.println("Driver name: "+name+" ,\nDriver location: "+location+" car name:"+car_details);
    }
    public void acceptRide(){
        System.out.println("accepting ride");
        availability_status=false;    
    }
    public String  update_Availability(){
        if(availability_status){
            return "isAvailable";
        }
        return "on ride" ;
    }   
}
class Ride {
    Rider rider;     // Composition
    Driver driver;   // Composition
    String source;
    String destination;
    double fare=100.0;         //Cost of transportation
    boolean status=true;

    Ride(Rider rider, Driver driver, String source, String destination) {
        this.rider = rider;
        this.driver = driver;
        this.source = source;
        this.destination = destination;
    }
    void startRide() {
        System.out.println("Ride started from " + source + " to " + destination);
    }
    void rideEnd(){
        System.out.println("the ride is completed");
    }
    boolean collected_fare(){
        return true;
    }
}

class RideService{
    ArrayList<Rider> riders=new ArrayList<>();
    ArrayList<Driver> drivers=new ArrayList<>();

    public void addDriver(Driver driver){
        drivers.add(driver);
    }
    public void addriders(Rider rider){
        riders.add(rider);
    }

    public  Driver findAvailableDriver(){
        for(Driver driver : drivers){
            if(driver.availability_status){
                return driver;
            }
        }
        return null;
    }
    public void assignRide(Rider rider,String source,String destination){
        Driver availabile_driver=findAvailableDriver();

        if(availabile_driver!=null){
            Ride ride=new Ride(rider, availabile_driver, source, destination);
            // System.out.println("ride is assigned from "+ride.source+" to "+ride.destination+" to the rider "+rider.name);
            availabile_driver.availability_status=false;
            ride.startRide();
            if(ride.collected_fare()){
                ride.rideEnd();
                availabile_driver.availability_status=true;
                String rider_history="ride is from "+source+" to "+destination;
                rider.ride_history.add(rider_history);
                rider.displayInfo();
                availabile_driver.displayInfo();
                System.out.println();

            }
        }
        else{
            System.out.println("No available driver for " + rider.name);
        }
    }
}
public class RideSharingApp {
    public static void main(String[] args) {

        RideService rideService=new RideService();
        
        Driver driver1=new Driver("Amosh", "Cyber Towers", "Toyota");
        Driver driver2=new Driver("Ravi", "Kondapur", "Suzuki");
        Driver driver3=new Driver("Priya", "Gachibowli", "Honda");

        Rider rider1 = new Rider("Upendra", "Hitec City");
        Rider rider2 = new Rider("Aditi", "Madhapur");
        Rider rider3 = new Rider("Rohan", "KPHB");

        rideService.addDriver(driver1);
        rideService.addDriver(driver2);
        rideService.addDriver(driver3);

        rideService.addriders(rider1);
        rideService.addriders(rider2);
        rideService.addriders(rider3);

        rideService.assignRide(rider1, "HITEC City", "Secunderabad");
        rideService.assignRide(rider2, "Madhapur", "Airport");
        rideService.assignRide(rider3, "KPHB", "Begumpet");

        System.out.println("Ride Histroy:");
        for(Rider rider:rideService.riders){
            System.out.println((rider.ride_history));
        }
        
    }
}
