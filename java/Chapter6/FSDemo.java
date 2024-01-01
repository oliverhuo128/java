/* This class implements a "fail-soft" arragy which 
prevents runtime errors. */

class FailSoftArray {
    private int[] a; // reference to array
    private int errval; // value to return if get() fails
    public int length; // length is public
}