package inheritancevehicles;

public class Vans extends Vehicles {
    Vans() {

    }

    public int windows_count(int oneway_count) {
        return oneway_count * 3;
    }

}
