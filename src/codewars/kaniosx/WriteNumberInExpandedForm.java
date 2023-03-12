package codewars.kaniosx;

public class WriteNumberInExpandedForm {

    public static String numberToString(int num)
    {
        return "" + num;
    }

    public static String expandedForm(int num)
    {
        String result = "";
        String text = numberToString(num);

        for (int i = 0; i < text.length(); i++)
        {
            if (text.charAt(i) != '0')
            {
                result += "" + text.charAt(i);

                for (int j = 0; j < text.length() - (i + 1); j++)
                {
                    result += "0";
                }

                result += " + ";
            }
        }

        return result.substring(0, result.length() - 3);
    }
}
