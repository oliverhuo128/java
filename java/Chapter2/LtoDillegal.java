/*
 * this program will not compile
*/
class LtoD {
    public static void main(String[] args) {
        long L;
        double D;

        D = 100123285.0;
        L = D; //illegal!!!!

        System.out.println("L and D: " + L + " " + D);
    }
}