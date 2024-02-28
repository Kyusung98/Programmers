package com.example.programmers.starter;

import java.util.HashMap;

public class Solution_day8 {
    //외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
    //정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.
    public int[] solution1(int[] emergency) {
        int[] answer = new int[emergency.length];

        for(int i = 0; i < emergency.length; i++){
            for(int j = 0; j < emergency.length; j++){
                if(emergency[i] <= emergency[j]){
                    answer[i]++;
                }
            }
        }
        return answer;
    }

    //순서쌍이란 두 개의 숫자를 순서를 정하여 짝지어 나타낸 쌍으로 (a, b)로 표기합니다.
    //자연수 n이 매개변수로 주어질 때 두 숫자의 곱이 n인 자연수 순서쌍의 개수를 return하도록 solution 함수를 완성해주세요.
    public int solution2(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++){
            if(n%i == 0){
                answer++;
            }
        }
        return answer;
    }

    //개미 군단이 사냥을 나가려고 합니다. 개미군단은 사냥감의 체력에 딱 맞는 병력을 데리고 나가려고 합니다.
    //장군개미는 5의 공격력을, 병정개미는 3의 공격력을 일개미는 1의 공격력을 가지고 있습니다.
    //예를 들어 체력 23의 여치를 사냥하려고 할 때, 일개미 23마리를 데리고 가도 되지만, 장군개미 네 마리와 병정개미 한 마리를 데리고 간다면 더 적은 병력으로 사냥할 수 있습니다.
    //사냥감의 체력 hp가 매개변수로 주어질 때, 사냥감의 체력에 딱 맞게 최소한의 병력을 구성하려면 몇 마리의 개미가 필요한지를 return하도록 solution 함수를 완성해주세요.
    public int solution3(int hp) {
        int answer = 0;

        while(hp > 0) {
            if(hp >= 5) {
                answer++;
                hp -= 5;
            } else if(hp >= 3) {
                answer++;
                hp -= 3;
            } else {
                answer++;
                hp -= 1;
            }
        }
        return answer;
    }

    //머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다.
    //그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다.
    //문자열 letter가 매개변수로 주어질 때, letter를 영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
    public String solution4(String letter) {
        String answer = "";
        HashMap<String, String> m = new HashMap<>();
        m.put(".-","a");
        m.put("-...","b");
        m.put("-.-.","c");
        m.put("-..","d");
        m.put(".","e");
        m.put("..-.","f");
        m.put("--.","g");
        m.put("....","h");
        m.put("..","i");
        m.put(".---","j");
        m.put("-.-","k");
        m.put(".-..","l");
        m.put("--","m");
        m.put("-.","n");
        m.put("---","o");
        m.put(".--.","p");
        m.put("--.-","q");
        m.put(".-.","r");
        m.put("...","s");
        m.put("-","t");
        m.put("..-","u");
        m.put("...-","v");
        m.put(".--","w");
        m.put("-..-","x");
        m.put("-.--","y");
        m.put("--..","z");

        String[] words = letter.split(" ");
        for (String word : words) {
            answer += m.get(word);
        }
        return answer;
    }
}
