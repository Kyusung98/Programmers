package com.example.programmers.pcce;

import java.util.Scanner;

public class pcce2 {
    //디버깅(Debugging)은 이미 완성된 코드에서 버그를 찾아 수정하는 문제 타입입니다.
    //1줄만 수정하여 버그를 고치세요.
    //2줄 이상 수정할 경우, 실행 결과에 에러 메시지가 표시됩니다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();
        //int b_square = c - a;
        int b_square = (c * c) - (a * a);

        System.out.println(b_square);
    }

}
