package codewars.kaniosx;

public class SharkPontoon {

    public static String shark(int pontoonDistance, int sharkDistance,
                               int youSpeed, int sharkSpeed, boolean dolphin) {
        if (sharkSpeed == 0) {
            return "Alive!";
        }

        if (youSpeed == 0) {
            return "Shark Bait!";
        }

        if (dolphin) {
            sharkSpeed /= 2;
        }

        if (pontoonDistance / youSpeed >= sharkDistance / sharkSpeed) {
            return "Shark Bait!";
        }

        return "Alive!";
    }
}
