package mathbasic;

import java.util.ArrayList;

/**
 * 题目：给定一个数字，列出所有可能的乘法组合，如：给出8，可能的组合有8*1,1*8,2*4,2*2*2*1等等
 * 其中1只能出现一次
 */
public class Recursion {
    private static void getResult(int number, ArrayList<Integer> result) {
        //如果相除为1则表示递归结束
        if (number == 1) {
            //如果组合中没有出现1，则在结果中加入1
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
