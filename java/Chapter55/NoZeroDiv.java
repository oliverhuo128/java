// Prevent a division by zero using the ?
class NoZeroDiv {
    public static void main(String[] args) {
        int result;

        for(int i = -5; i < 6; i++) {
            result = i != 0 ? 100 / i : 0;
            System.out.println("100 / " + i + " is " + result);
        }
    }
}