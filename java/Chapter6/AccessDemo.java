// Public vs private access.

class MyClass {
    private int alpha; // private access
    public int beta; // public access
    int gamma; // default access

    /*
     * Methods to access alpha. It is OK for a
     * member of a class to access a private member
     * of the same class
     */
    void setAlpha(int a) {
        alpha = a;
    }

    int getAlpha() {
        return alpha;
    }
}

class AccessDemo {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        /* Access to alpha is allowed only through
         * its accessor methods
         */
        ob.setAlpha(-99);
        System.out.println("ob.alpha is " + ob.getAlpha());

        //you cannot access alpha like this:
        //ob.alpha = 10; // Wring! because alpha is private!

        //These are OK because beta and gamme are public
        ob.beta = 88;
        ob.gamma = 99;
    }
}