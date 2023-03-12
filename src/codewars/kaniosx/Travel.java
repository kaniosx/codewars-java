package codewars.kaniosx;

import java.util.List;

public class Travel {

    public static String travel(String r, String zipcode) {
        System.out.println();
        if (!r.contains(zipcode)) {
            return zipcode + ":/";
        }

        StringBuilder addresses = new StringBuilder();
        StringBuilder numbers = new StringBuilder();

        for (String line : r.split(",")) {
            if (line.contains(zipcode)) {
                String lineWithoutZipcode = line.replaceAll(zipcode, "").trim();
                String address = lineWithoutZipcode.replaceAll("^[0-9]+", "").trim();
                String number = lineWithoutZipcode.replaceAll("([A-Z]|[a-z]|\\.)+", "").trim();

                addresses.append(",").append(address);
                numbers.append(",").append(number);
            }
        }

        return zipcode + ":" +
                addresses.replace(0, 1, "") + "/" +
                numbers.replace(0, 1, "");
    }
}
