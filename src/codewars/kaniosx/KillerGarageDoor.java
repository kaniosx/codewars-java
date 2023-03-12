package codewars.kaniosx;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class KillerGarageDoor {

    public static String run(String events) {
        ArrayList<Integer> result = new ArrayList<>();
        int step = 0;
        int pCnt = 0;
        int direction = 1;
        boolean isPaused;

        for (char event : events.toCharArray()) {
            if (event == 'O') {
                direction *= -1;
            }

            if (event == 'P') {
                pCnt++;
            }

            isPaused = pCnt % 2 == 0;

            if (!isPaused) {
                step += direction;
            }

            step = Integer.max(0, step);
            step = Integer.min(5, step);

            if (step == 5) {
                pCnt = 0;
                direction = -1;
            }

            if (step == 0) {
                pCnt = 0;
                direction = 1;
            }

            result.add(step);
        }

        return result.stream().map(Object::toString).collect(Collectors.joining(""));
    }
}
