/* an exceptions can be generated by one
 * method and caught by another.
 */

 class ExcTest {
    // Generate an exception.
    static void genException() {
        int[] nums = new int[4];

        System.out.println("Before exception is generated.");

        // generat an index out-of-boudns exception
        nums[7] = 10;
        System.out.println("this won't be displayed");
    }
 }

    class ExcDemo2 {
        public static void main(String[] args) {

            try{
                ExcTest.genException();
            } catch (ArrayIndexOutOfBoundsException exc) {
                // catch the exception
                System.out.println("Index out-of-bounds!");
            }
            System.out.println("After the catch statement.");
        }
    }