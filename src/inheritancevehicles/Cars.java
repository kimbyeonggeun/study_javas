package inheritancevehicles;

public class Cars extends Vehicles {
    int oneway_count = 0;

    Cars(int oneway_count) {
        this.oneway_count = oneway_count;
    }

    public int speed(int kms, int hour) {
        return kms / hour + this.oneway_count;
    }
}
