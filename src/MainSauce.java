public class MainSauce {
    public static void main(String[] args) {
        Sauce s1 = new Sauce("Табаско", Sauce.Spiciness.VERY_SPICY);
        Sauce s2 = new Sauce("Кетчуп", Sauce.Spiciness.NOT_SPICY);
        Sauce s3 = new Sauce("Чили", Sauce.Spiciness.SPICY);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}