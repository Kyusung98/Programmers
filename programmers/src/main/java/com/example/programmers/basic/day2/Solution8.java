package com.example.programmers.basic.day2;

import java.util.Scanner;

public class Solution8 {
    //문자열 str이 주어집니다.
    //문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] s = a.split("");
        for (String i : s){
            System.out.println(i);
        }
    }
}
