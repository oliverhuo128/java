// A program that counts the number of spaces
// program that reads characters from the keyboard until a period
// is received.

class NoSpaces {
    public static void main(String[] args)
    throws java.io.IOException {
        char input;
        int number_of_spaces=0;

        System.out.println("Please input a value (fullstop ends program): ");
        one: for(;;){
            input = (char) System.in.read();

            switch(input) {
                case ' ':
                    number_of_spaces++;
                    break;
                case '.':
                    break one;
            }
        }
        System.out.println("Number of spaces is: " + number_of_spaces);
    }
}