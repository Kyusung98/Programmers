package com.example.programmers.basic.day22;

import java.math.BigInteger;

public class Solution107 {
    //0 이상의 두 정수가 문자열 a, b로 주어질 때, a + b의 값을 문자열로 return 하는 solution 함수를 작성해 주세요.
    public String solution(String a, String b) {
        BigInteger num1 = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);
        BigInteger answer = num1.add(num2);
        return answer.toString();
    }
}
