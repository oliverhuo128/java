package SeriesDemo;
//Implement Series

import series.*;

class ByTwos implements Series {
    int start;
    int val;
    int prev;

    ByTwos(){
        start = 0;
        val = 0;
        prev = -2;
    }

    public int getNext() {
        prev = val;
        val += 2;
        return val;
    }

    public void reset() {
        val = start;
        prev = start - 2;
    }

    public void setStart(int x) {
        start = x;
        val = x;
        prev = x - 2;
    }

    int getPrevious() {
        return prev;
    }
}

class SeriesDemo {
    public static void main(String[] args) {
        ByTwos ob = new ByTwos();

        for(int i=0; i < 5; i++)
            System.out.println("Next value is " + ob.getNext());

        System.out.println("\nResetting");
        ob.reset();
        for(int i= 0; i < 5; i++)
            System.out.println("Next value is " + ob.getNext());
        
        System.out.println("\nStarting at 100");
        ob.setStart(100);
        for(int i=0; i < 5; i++) {
            System.out.println("Next value is " + ob.getNext());
        }
    }
}