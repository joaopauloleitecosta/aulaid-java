package services;

public class DeliverService {

    public double fee(String state) {
        if ("SP".equalsIgnoreCase(state)) {
            return 10.0;
        }
        else {
            return 20.0;
        }
    }
}
