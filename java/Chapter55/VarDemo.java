// A simple demonstration of local variabl type inference.

class VarDemo {
    public static void main(String[] args) {
        
        // Use type inference to determin the type of the
        // variable named avg. In this case, double is inferred.

        var avg = 10.0;
        System.out.println("Value of avg: " + avg);

        // In the following context, var is not a predefined identifier.
        // It is simply a user-defined variable name.
        int var = 1;
        System.out.println("Value of var: " + var);

        // Interestingly, in the following sequence, var is used
        // as both the type of the declarartion and as a variable name
        // in the initializaer
        var k = -var;
        System.out.println("Value of k: " + k);
    }
}