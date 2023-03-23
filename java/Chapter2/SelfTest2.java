/*
 A program that works out prime numbers
 */

class SelfTest2 {
    public static void main(String[] args) {
        int i;
        for(i = 2; i < 100000; i++) {
            int factor;
            int nooffactors;
            nooffactors = 0;
            for(factor = 2; factor < i; factor++ ) {
                if ((i%factor) == 0) {
                    nooffactors++;
                }
            }
            if (nooffactors == 0) {
                System.out.println(i + " is prime.");
            }
        }
    }
}