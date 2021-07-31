public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double weight = 60;
        double high = 1.8; //в метрах
        double index = service.calculate(weight, high);
        String result = String.format("%.1f",index); //округление до 1 знака после запятой
        System.out.println("Индекс массы тела: " + result);
    }
}
