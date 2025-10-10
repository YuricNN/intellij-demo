public class VariableTest { // Class scope for methods/non-static blocks
    // Instance Variable
    int instanceVar;
    public void printInstanceVar() {
        // Accessing the instance variable is valid inside a non-static method
        System.out.println("Instance variable inside method: " + instanceVar);
        // Local variable - Method Level Scope
        int localVar = 5;
        System.out.println("Local variable inside method: " + localVar);
    }
    public static void main(String[] args) {
        // Test the function
        VariableTest obj = new VariableTest();
        obj.printInstanceVar();
        // Uncommenting the line below would cause a compile-time error
        // System.out.println(obj.localVar);
        // Local variables (like localVar) are not accessible outside their method
    }
}