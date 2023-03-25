//recall that the methods and variables that constitute a class are called members of
//class. The data members are also referred to aas instance varaibles

class Vehicle {
    int passengers; //number of passengers
    int fuelcap; // fuel capacity in gallons
    int mpg; // fuel consumption in miles per gallon
}

// This class declares an object of type Vehicle.

class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;

        //assign values to fields in minevan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // compute the range assuming a gull tank of gas
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Minivan can carry " + minivan.passengers + 
        " with a range of " + range);
    }

}
