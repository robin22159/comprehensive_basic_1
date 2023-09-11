
public class RoadToll {
	
	 String typeOfVehicle;
	    int numberOfTires;
	    
	    public RoadToll(String typeOfVehicle, int numberOfTires) {
	        this.typeOfVehicle = typeOfVehicle;
	        this.numberOfTires = numberOfTires;
	}

	 // Method to calculate toll
	    public void calculateToll() {
	        if (numberOfTires == 2) {
	            System.out.println("The toll amount for your " + typeOfVehicle + " is Rs. 0.00");
	        } else if (numberOfTires == 4) {
	            System.out.println("The toll amount for your " + typeOfVehicle + " is Rs. 50.00");
	        } else if (numberOfTires > 4) {
	            System.out.println("The toll amount for your " + typeOfVehicle + " is Rs. 100.00");
	        }
	    }

	    public static void main(String[] args) {
	        RoadToll car = new RoadToll("Car", 4);
	        car.calculateToll();

	        RoadToll truck = new RoadToll("Truck", 6);
	        truck.calculateToll();

	        RoadToll bike = new RoadToll("Bike", 2);
	        bike.calculateToll();
	    }
	}
