// Use the length array member.

class LengthDemo {
    public static void main(String[] args) {
        int[] list = new int[10];
        int[] nums = { 1, 2, 3 };
        int [][] table = { // a variable-length table
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        System.out.println("length of list is " + list.length);
        System.out.println("length of nums is " + nums.length);
        System.out.println("lenght of table is " + table.length);
        System.out.println("length of table[0] is " + table[0].length);
        System.out.println("length of table[1] is " + table[1].length);
        System.out.println("length of table[2] is " + table[2].length);
        System.out.println();

        // use length to initialize list
        for(int i=0; i< list.length; i++)
            list[i] = i * i;
        
        System.out.print("Here is list: ");
        //now use length to display list
        for(int i=0; i<list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }
}