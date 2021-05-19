public class BmiService {
    public double culculateIndex (double weight, double hight) {
        double index = weight / (hight * hight);
        return index;

    }
}
