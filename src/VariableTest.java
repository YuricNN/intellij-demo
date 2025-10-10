public class VariableTest {
    int instanceVar;
    public void printInstanceVar() {
        System.out.println("Instance variable inside method: " + instanceVar);
        int localVar = 5;
        System.out.println("Local variable inside method: " + localVar);
    }
    public static void main(String[] args) {
        // Test the function
        VariableTest obj = new VariableTest();
        obj.printInstanceVar();
    }
}