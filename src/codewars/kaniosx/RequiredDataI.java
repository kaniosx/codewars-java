package codewars.kaniosx;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RequiredDataI {
    public static Object countSel(int[] array) {
        int total = array.length;
        int unique = (int) IntStream.of(array).distinct().count();

        Map<Integer, Integer> counts = new HashMap<>();
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            if (counts.containsKey(array[i])) {
                counts.put(array[i], counts.get(array[i]) + 1);
            } else {
                counts.put(array[i], 1);
            }
        }

        int singles = 0;

        for (Integer key : counts.keySet()) {
            if (counts.get(key) == 1) {
                singles++;
            }
        }

        Integer max = counts.entrySet()
                .stream()
                .max((x, y) -> x.getValue() > y.getValue() ? 1 : -1)
                .get()
                .getValue();

        List<Integer> listOfMax = counts.entrySet()
                .stream()
                .filter(entry -> Objects.equals(entry.getValue(), max))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(listOfMax);
        System.out.println(max);

        return new Object[]{total, unique, singles, listOfMax.toArray(), max};
    }
}

