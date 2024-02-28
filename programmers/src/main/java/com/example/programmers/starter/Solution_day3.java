package com.example.programmers.starter;

import java.util.Arrays;

public class Solution_day3 {
    //최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때,
    //최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.
    public int solution1(int[] array) {
        int answer = 0;
        int count = 0;
        int maxCount = 0;

        Arrays.sort(array);

        for(int i = 0; i < array.length; i++) {
            if(i == 0 || array[i-1] != array[i]) {
                count = 1;
            } else {
                count++;
            }

            if(count > maxCount) {
                maxCount = count;
                answer = array[i];
            } else if(count == maxCount) {
                answer = -1;
            }
        }
        return answer;
    }

    //정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
    public int[] solution2(int n) {
        int[] answer = new int[(n+1)/2];
        int index = 0;
        for(int i = 1; i <= n; i+= 2){
            answer[index++] = i;
        }
        return answer;
    }

    //머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 주어질 때,
    //모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.
    public int solution3(int n) {
        int answer = 0;
        int piz = 7;
        int count = 1;

        if(n <= piz){
            return count;
        }else if(n > piz){
            if(n%7 == 0){
                count = n/7;
            }else {
                count = n/7 +1;
            }
        }
        return count;
    }

    //머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때,
    //n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면 최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
    public int solution4(int n) {
        int answer = 0;

        if(n <= 3){
            return 1;
        }
        if(n == 5){
            return 5;
        }
        if(n == 6){
            return 1;
        }

        for(int i = 1; i < n; i++){
            if((n*i)%6 == 0){
                answer = (n*i)/6;
                break;
            }
        }
        return answer;
    }
}
