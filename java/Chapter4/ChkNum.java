// A simple example that uses a parameter.

class ChkNum {
    // return true if x is even
    boolean isEven(int x) {
        if((x%2)==0) return true;
        else return false;
    }
}

class ParmDemo {
    public static void main(String[] args) {
        ChkNum e = new ChkNum();

        if(e.isEven(10)) System.out.println("10 is even.");
        if(e.isEven(9)) System.out.println("9 is even.");
        if(e.isEven(8)) System.out.println("8 is even");
    }
}

class Factor {
    boolean isFactor(int a, int b) {
        if((b%a) == 0) return true;
        else return false;
    }
}

class IsFact {
    public static void main(String[] args) {
        
        Factor x = new Factor();

        if(x.isFactor(2, 20)) System.out.println("2 is factor");
        if(x.isFactor(3,20)) System.out.println("this won't be displayed");
    }
}

//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
