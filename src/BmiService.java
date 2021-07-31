public class BmiService {

    public double calculate(double weight, double high) {
        double index = weight/Math.pow(high, 2);
        return index;
    }


}
