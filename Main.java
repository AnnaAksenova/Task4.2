public class Main {
    public static void main(String[] args) {
        //double weight = 58;
        //double hight = 1.68;
        //double index = weight / (hight * hight);
        BmiService service = new BmiService();
        double index = service.culculateIndex(58,1.68);


        System.out.printf("%.1f",index);
    }
}
