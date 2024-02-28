package com.example.programmers.starter;

import java.util.Arrays;

public class Solution_day61 {
    //이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때,
    //두 이진수의 합을 return하도록 solution 함수를 완성해주세요.
    public String solution1(String bin1, String bin2) {

        return Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
    }

    //문자열 before와 after가 매개변수로 주어질 때, before의 순서를 바꾸어 after를 만들 수 있으면 1을,
    //만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.
    public int solution2(String before, String after) {
        String[] be = before.split("");
        String[] af = after.split("");

        Arrays.sort(be);
        Arrays.sort(af);

        before = new String(Arrays.toString(be));
        after = new String(Arrays.toString(af));
        if (before.equals(after)){
            return 1;
        }
        return 0;
    }

    //1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다.
    //정수 i, j, k가 매개변수로 주어질 때, i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.
    public int solution3(int i, int j, int k) {
        int answer = 0;
        for (int l = i; l <= j; l++){
            if (Integer.toString(l).contains(Integer.toString(k))){
                String[] arr = Integer.toString(l).split("");
                for (String str : arr){
                    if (str.equals(Integer.toString(k))) answer++;
                }
            }
        }
        return answer;
    }
}
