/*
 The demonstrates a variable
 call thie file Example2.java
 */
class Example2 {
    public static void main(String[] args) {
        int myVar1; //this declares a variable
        int myVar2; //this declares another variable
        
        myVar1 = 1024; //this assigns 1024 to myVar1

        System.out.println("myVar1 contains " + myVar1);

        myVar2 = myVar1 / 2;

        System.out.print("myVar2 contains myVar1 / 2: ");
        System.out.println(myVar2);
    }
}