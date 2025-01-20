/* 
 * Display a text file.
 * To use this program, specify the name
 * of the file that you want to see.
 * For example, to see a file called TEST.TXT,
 * use the following command line:
 * java ShowFile TEST.TXT
 */

import java.io.*;

class ShowFile2 {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;

        // First, make sure that a file has been specified.
        if (args.length != 1) {
            System.out.println("Usage: ShowFile <File>");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException exc) {
            System.out.println("File Not Found");
            return;
        }

        try {
            // Read bytes until EOF is encountered
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Error reading file.");
        } finally {
            try {
                fin.close();
            } catch (IOException exc) {
                System.out.println("Error closing file.");
            }
        }
    }
}
