package com.example.programmers.lv0;

import java.util.Arrays;

public class Solution_day2 {
    //정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
    public double solution1(int[] numbers) {
        double answer = 0;

        for(int i = 0; i < numbers.length; i++){
            answer += numbers[i];
        }
        return answer/numbers.length;
    }

    //첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
    //두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
    public int[] solution2(int numer1, int denom1, int numer2, int denom2) {
        int result1 = (numer1*denom2) + (numer2*denom1);
        int result2 = denom1*denom2;

        for(int i = result1-1; i > 1; i--) {
            if(result1 % i == 0 && result2 % i == 0) {
                result1 /= i;
                result2 /= i;
            }
        }

        int[] answer = {result1, result2};
        return answer;
    }

    //정수 배열 numbers가 매개변수로 주어집니다. numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
    public int[] solution3(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            answer[i] = numbers[i]*2;
        }
        return answer;
    }

    //중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다.
    //예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다. 정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.
    public int solution4(int[] array) {
        int answer = 0;
        Arrays.sort(array);

        int mid = array.length/2;
        answer = array[mid];
        return answer;
    }
}
