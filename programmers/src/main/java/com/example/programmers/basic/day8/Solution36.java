package com.example.programmers.basic.day8;

public class Solution36 {
    //boolean 변수 x1, x2, x3, x4가 매개변수로 주어질 때,
    //다음의 식의 true/false를 return 하는 solution 함수를 작성해 주세요.
    //(x1 ∨ x2) ∧ (x3 ∨ x4)
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean b1 = x1 || x2;
        boolean b2 = x3 || x4;
        boolean answer = b1 && b2;
        return answer;
    }
}
