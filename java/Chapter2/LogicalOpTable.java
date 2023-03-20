// Try This 2-2: a truth table for the logical operators.
class LogicalOpTable {

    public static int booleanToInt(boolean value) {
        // Convert true to 1 and false to 0.
        return value ? 1 : 0;
    }

    public static void main(String[] args) {

   boolean p, q;

   System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

   p = true; q = true;
   System.out.print(booleanToInt(p) + "\t" + booleanToInt(q) +"\t");
   System.out.print((p&q) + "\t" + (p|q) + "\t");
   System.out.println((p^q) + "\t" + (!p));

   p = true; q = false;
   System.out.print(p + "\t" + q +"\t");
   System.out.print((p&q) + "\t" + (p|q) + "\t");
   System.out.println((p^q) + "\t" + (!p));

   p = false; q = true;
   System.out.print(p + "\t" + q +"\t");
   System.out.print((p&q) + "\t" + (p|q) + "\t");
   System.out.println((p^q) + "\t" + (!p));

   p = false; q = false;
   System.out.print(p + "\t" + q +"\t");
   System.out.print((p&q) + "\t" + (p|q) + "\t");
   System.out.println((p^q) + "\t" + (!p));
    }
}

