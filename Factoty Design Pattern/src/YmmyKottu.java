import Kottus.*;

public class YmmyKottu {

    public static Kottu makeKottu(KottuCode kottuCode){

        switch (kottuCode){
            case CHICKEN:
                return new ChickenKottu();
            case EGG:
                return new EggKottu();
            case VEGETABLE:
                return new VegetableKottu();
            case SHCHICKEN:
                return new SHChickenKottu();
            case CHEESECHICKEN:
                return new CheeseChickenKottu();
            case MIX:
                return new MixKottu();
            default:
                return null;
        }

    }

}
