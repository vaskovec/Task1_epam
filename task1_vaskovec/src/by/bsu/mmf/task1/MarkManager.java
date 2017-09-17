package by.bsu.mmf.task1;

import java.util.Collection;

/**
 * Created by vaskovec on 15.9.17.
 */
public class MarkManager {



    public static Double avgMark(Collection<Integer> marks) {


        return 1.0*marksSum(marks)/marks.size();

    }

    private static Integer marksSum(Collection<Integer> marks) {

        Integer sum = 0;

        for (Integer mark : marks) {
            sum += mark;
        }

        return sum;
    }

}
