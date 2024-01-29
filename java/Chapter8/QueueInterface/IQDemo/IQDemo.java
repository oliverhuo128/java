package QueueInterface.IQDemo;
import QueueInterface.ICharQ.*;

// A fixed-size queue class for characters.
class FixedQueue implements ICharQ {
    private char[] q; // this array holds the queue
    private int putloc, getloc; // the put and get indices

    // Construct an ampty queue given its size.
    public FixedQueue(int size) {
        q = new char[size]; // allocate memory for queue
        putloc = getloc = 0;
    }

    // Put a character into the queue.
    public void put(char ch) {
        if(putloc==q.length) {
            System.out.println(" - Queue is full.");
            return;
        }

        q[putloc++] = ch;
    }

    // Get a character from the queue.
    public char get() {
        if(getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }

        return q[getloc++];
    }
}

// a circular queue.
class CircularQueue implements ICharQ {
    private char[] q; // this array holds the queue
    private int putloc, getloc; // the put and get indices

    // Construct an empty queue given its size.
    public CircularQueue(int size) {
        q = new char[size+1]; // allocate memory for queue
        putloc = getloc = 0;
    }

    // Put a character into the queue.
    public void put(char ch) {
        /* Queue is full if either putloc is one less than getloc,
         * or if putloc is at the end of the array and getloc is at 
         * beginning.
         */
        if(putloc+1 == getloc |
            ((putloc==q.length-1) & (getloc==0))) {
                System.out.println(" - Queue is full.");
                return;
            }

            q[putloc++] = ch;
    }
}