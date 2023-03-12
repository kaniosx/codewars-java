package codewars.kaniosx;

import java.util.ArrayList;


public class SqInRect {

    public static ArrayList<Integer> sqInRect(int lng, int wdth) {
        if (lng == wdth) return null;

        ArrayList<Integer> result = new ArrayList<Integer>();

        int tmp = lng > wdth ? wdth : lng;

        while(tmp > 0) {
            result.add(tmp);

            if (lng > wdth) lng -= tmp;
            else wdth -= tmp;

            tmp = lng > wdth ? wdth : lng;
        }

        return result;
    }
}