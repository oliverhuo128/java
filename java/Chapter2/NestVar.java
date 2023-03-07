/*
    This program attempts to declare a variable
    in an inner scope with the same name as one
    defined in an outer scope
*/

class NestVar {
    public static void main(String[] args){
        int count;

        for(count = 0; count < 10; count = count+1) {
            System.out.println("This is count: " + (count + 1));

            // int count; //illegal
            // for(count = 0; count < 2; count++)
            // System.out.println("This program is in error!");
        }
    }
}