import Kottus.Kottu;

public class Application {

    public static void main(String[] args) {

        Kottu vegitableKottu = YmmyKottu.makeKottu(KottuCode.VEGETABLE);
        System.out.println(vegitableKottu);

        Kottu eggKottu = YmmyKottu.makeKottu(KottuCode.EGG);
        System.out.println(eggKottu);

        Kottu chickenKottu = YmmyKottu.makeKottu(KottuCode.CHICKEN);
        System.out.println(chickenKottu);

        Kottu shChickenKottu = YmmyKottu.makeKottu(KottuCode.SHCHICKEN);
        System.out.println(shChickenKottu);

        Kottu cheeseChickenKottu = YmmyKottu.makeKottu(KottuCode.CHEESECHICKEN);
        System.out.println(cheeseChickenKottu);

        Kottu mixKottu = YmmyKottu.makeKottu(KottuCode.MIX);
        System.out.println(mixKottu);

    }

}
