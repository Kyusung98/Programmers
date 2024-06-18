package com.example.programmers.basic.day24;

import java.util.ArrayList;
import java.util.List;

public class Solution117 {
    //직사각형 형태의 그림 파일이 있고, 이 그림 파일은 1 × 1 크기의 정사각형 크기의 픽셀로 이루어져 있습니다. 이 그림 파일을 나타낸 문자열 배열 picture과 정수 k가 매개변수로 주어질 때,
    //이 그림 파일을 가로 세로로 k배 늘린 그림 파일을 나타내도록 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
    public String[] solution(String[] picture, int k) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < picture.length; i++){
            String[] pic = picture[i].split("");
            String str = "";
            for (int j = 0; j < pic.length; j++){
                for (int l = 0; l < k; l++){
                    str += pic[j];
                }
            }
            for (int n = 0; n < k; n++){
                list.add(str);
            }

        }
        return  list.toArray(new String[list.size()]);
    }
}
//[".","x","x",".","."]
