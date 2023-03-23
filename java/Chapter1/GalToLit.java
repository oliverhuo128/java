/*
 Try This 1-1
 This program converts gallons to liters.
 Call this program GalToLit.java
 */
class GalToLit {
    public static void main(String[] args){
        double Gallons;
        double Litres;
        double conversions_var;
        
        Gallons = 10;
        conversions_var = 3.7854;
        Litres = Gallons * conversions_var;

        System.out.println(Gallons + " gallons is " + Litres + " litres");
    }
}