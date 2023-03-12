package codewars.kaniosx;

public class IsItANumber {

    public boolean isDigit(String s)
    {
        try {
            Float.parseFloat(s);
        } catch (Exception e) {
            return false;
        }

        return true;
    }
}
