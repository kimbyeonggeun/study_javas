public class ExtendCalculatoions extends Calculations {
    ExtendCalculatoions() {
        System.out.println("ExtendCalculatoions - constructor");
    }

    // multiply
    public int multiplications(int first, int second) {
        int result = first * second;
        return result;
    }

    // Public Methods subtraction
    public int subtraction(int first, int second) {
        int result = second - first;
        return result;
    }
}
