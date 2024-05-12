package com.example.programmers.basic.day18;

import java.util.ArrayList;

public class Solution86 {
    //문자열 myString이 주어집니다.
    //myString을 문자 "x"를 기준으로 나눴을 때 나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
    public int[] solution(String myString) {
        ArrayList<Integer> answer = new ArrayList<>();
        String[] myStringStr = myString.split("");
        int cnt = 0;
        for (String str : myStringStr){
            if (str.equals("x")){
                answer.add(cnt);
                cnt = 0;
            }else{
                cnt++;
            }
        }
        if (cnt > 0){
            answer.add(cnt);
        }
        if (myStringStr[myStringStr.length - 1].equals("x")){
            answer.add(0);
        }
        return answer.stream().mapToInt(s -> s).toArray();
    }
}
