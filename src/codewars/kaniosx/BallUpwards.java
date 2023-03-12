package codewars.kaniosx;

import java.util.ArrayList;

public class BallUpwards {

    public static int maxBall(int v0) {
        float g = 9.81f;
        float vms = (float) v0 * 1000 / 3600;
        float t = 0;
        double maximumHeight = 0.0d;
        double currentHeight = 0.0d;
        int maximumIndex = 0;

        ArrayList<Double> recordedHeights = new ArrayList<>();

        while (vms * t - 0.5 * g * t * t >= 0) {
            currentHeight = vms * t - 0.5 * g * t * t;
            recordedHeights.add(currentHeight);

            t += 0.1;

            if (currentHeight > maximumHeight) {
                maximumHeight = currentHeight;
                maximumIndex = recordedHeights.size() - 1;
            }
        }

        return maximumIndex;
    }
}
