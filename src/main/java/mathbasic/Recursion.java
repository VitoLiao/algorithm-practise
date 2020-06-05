package mathbasic;

import java.util.ArrayList;

public class Recursion {
    private static void getResult(int number, ArrayList<Integer> result) {
        if (number == 1) {
            if (!result.contains(1))
                result.add(1);
            System.out.println(result);
        } else {
            for (int i = 1; i <= number; i++) {
                if ((i == 1) && result.contains(1))
                    continue;

                if (number % i != 0) {
                    continue;
                }

                ArrayList<Integer> newList = (ArrayList<Integer>) result.clone();
                newList.add(i);

                getResult(number / i, newList);
            }

        }
    }

    public static void main(String[] args) {

        getResult(8, new ArrayList<Integer>());

    }
}
