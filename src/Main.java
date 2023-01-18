public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculator(price);

        System.out.println(miles);

//    System.out.println( service.calculator(10_000));
    }
}
