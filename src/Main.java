public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float index1 = service.calculate (50F, 150F);
        System.out.println(index1);

        float index2 = service.calculate(80.5F, 163.8F);
        System.out.println(index2);

        float index3 = service.calculate(66.1F, 196.5F);
        System.out.println(index3);

    }
}
