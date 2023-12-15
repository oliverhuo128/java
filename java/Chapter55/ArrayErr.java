// Demonstrate an array overrun.

class ArrayErr {
    public static void main(String[] args) {
        int[] sample = new int[110];
        int i;

        //generate an array overrun
        for(i = 10; i < 100; i = i+1)
            sample[i] = i;

        for(i = 0; i < 111; i++) {
            System.out.println("This is sample[" + i + "]: " + 
            sample[i]);
        }
    }

}