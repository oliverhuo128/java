// Another example of using break with a label.

class Break5 {
    public static void main(String[] args){
done:
    for(int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                for(int k=0; k<10; k++) {
                    System.out.println(k + " ");
                    if(k == 5) break done; // jump to done
                }
                System.out.println("After K loop"); // won't execute
            }
            System.out.println("After j loop"); // won't execute
        }
        System.out.println("After i loop");
    }
}
