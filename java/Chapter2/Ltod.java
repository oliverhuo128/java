// Demonstrate automatic conversion from long to double.

class Ltod {
    public static void main(String[] args) {
        long L;
        double D;

        L = 100123285L;
        D = L;

        System.out.println("L and D: " + L + " " + D);
    }
}