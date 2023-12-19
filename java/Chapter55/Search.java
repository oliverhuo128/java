// Search an array using for-each styple for.
class Search {
    public static void main(String[] args) {
        int[] nums = { 6, 8, 3, 7, 5, 6, 1, 4 };
        int val = 2;
        boolean found = false;

        // Use for-each style for to search nums for val.
        for(int x : nums) {
            if(x == val) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println("Value found!");
        else
            System.out.println("Value can't be found");
    }
}