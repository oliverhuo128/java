//Character varaible can be handles like integers.

class CharArithDemo {
    public static void main(String[] args) {
        char ch;

        ch = 'X';
        System.out.println("ch contains " + ch);

        ch++; //increment ch
        System.out.println("ch is now " + ch);

        ch = 90; // give ch the value Z
        System.out.println("ch is now " + ch);
        int x;
        x=1;
        for(ch=1; ch<=5000;ch++){
            // x = 1;
            System.out.println(x + " ch is now " + ch);
            x++;
        }
    }
}