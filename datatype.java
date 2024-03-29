public class datatype {
    
    // Function to display size of different data types
    public static void displayDataTypeSizes() {
        System.out.println("Size of byte: " + Byte.BYTES + " bytes");
        System.out.println("Size of short: " + Short.BYTES + " bytes");
        System.out.println("Size of int: " + Integer.BYTES + " bytes");
        System.out.println("Size of long: " + Long.BYTES + " bytes");
        System.out.println("Size of float: " + Float.BYTES + " bytes");
        System.out.println("Size of double: " + Double.BYTES + " bytes");
        System.out.println("Size of char: " + Character.BYTES + " bytes");
        System.out.println("Size of boolean: Not applicable (depends on JVM)");
    }

    public static void main(String[] args) {
        // Call the displayDataTypeSizes function
        displayDataTypeSizes();
    }
}
