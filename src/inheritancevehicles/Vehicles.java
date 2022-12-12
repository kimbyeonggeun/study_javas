package inheritancevehicles;

public class Vehicles {
    Vehicles() {
        
    }

    public int speed(int kms, int hours) {
        return kms / hours;
    }

    public int weight(int height, int width, int depth) {
        return height * width * depth;
    }
}
