public class CompoundAssignmentOperators {

    // Function to perform compound assignment operations
    public static void performCompoundAssignments() {
        int num = 10;

        // Compound assignment operators
        num += 5;  // num = num + 5
        System.out.println("After +=: " + num);

        num -= 3;  // num = num - 3
        System.out.println("After -=: " + num);

        num *= 2;  // num = num * 2
        System.out.println("After *=: " + num);

        num /= 4;  // num = num / 4
        System.out.println("After /=: " + num);

        num %= 3;  // num = num % 3
        System.out.println("After %=: " + num);

        
    }

    public static void main(String[] args) {
        // Call the performCompoundAssignments function
        performCompoundAssignments();
    }
}
