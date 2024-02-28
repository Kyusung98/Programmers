package com.example.programmers.starter;

public class Solution_day47 {
    //한 개 이상의 항의 합으로 이루어진 식을 다항식이라고 합니다.
    //다항식을 계산할 때는 동류항끼리 계산해 정리합니다.
    //덧셈으로 이루어진 다항식 polynomial이 매개변수로 주어질 때,
    //동류항끼리 더한 결괏값을 문자열로 return 하도록 solution 함수를 완성해보세요.
    //같은 식이라면 가장 짧은 수식을 return 합니다.
    public String solution(String polynomial) {
        int x = 0;
        int n = 0;
        for (String s : polynomial.split(" ")){
            if (s.contains("x"))
                x += s.equals("x") ? 1 : Integer.parseInt(s.replaceAll("x", ""));
            else if (!s.equals("+"))
                n += Integer.parseInt(s);
        }
        return (x != 0 ? x > 1 ? x + "x" : "x" : "")
                +(n != 0 ?(x != 0 ? " + " : "")
                + n : x == 0 ? "0" : "");
    }
}
