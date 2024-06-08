package com.codestates.seb.youtubesub;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class YoutubeSub_V2 {
    static final String admin_id = "admin";
    static final String admin_pw = "0000";
    static Scanner s = new Scanner(System.in);
    /**
     * @static 은 별도의 객체 생성 없이 바로 사용이 가능 합니다.
     * 본 프로그램의 금칙어 리스트와 대체어 리스트를 배열로 정의합니다.
     */
    //순화 기능 메서드
    private static final Map<String, String> wordPurification = new HashMap<>();

    static {
        // 비속어와 비속어를 순화한 단어를 한 쌍으로
        wordPurification.put("킹", "열");
        wordPurification.put("시발", "사랑");
        wordPurification.put("꺼져", "소망");
        wordPurification.put("미친", "희망");
        wordPurification.put("닥쳐", "믿음");
    }

    static boolean isValid(String id, String pw) {
        if (!id.equals(admin_id) || !pw.equals(admin_pw)) {
            System.out.println("[경고] 유튜브 계정의 아이디 및 비밀번호를 다시 확인해 주세요.");
            return false;
        }
        return true;
    }

    public static boolean isBadWord(String word) {
        return wordPurification.containsKey(word);
    }

    public static void main(String[] args) {
        String badWord = "";
        System.out.print("[시스템] 유튜브 계정의 아이디를 입력하세요 {Ex - admin} : ");
        String id = s.nextLine();
        System.out.print("[시스템] 유튜브 계정의 비밀번호를 입력하세요{Ex - 0000} : ");
        String pw = s.nextLine();
        isValid(id, pw);
        if (isValid(id, pw)) {
            System.out.println("[안내] 안녕하세요 " + id + "님.");
            System.out.println("[안내] 유튜브 영상의 자막을 생성해 주세요.");
            String subtitle = s.nextLine();
            String newSubtitle = "";
            if (isBadWord(subtitle)){
                // 금칙어를 대체어로 전환하는 과정은 다음과 같습니다.
                // 2. 해당 금칙어가 자막에 포함되어 있는지 확인합니다.
                //받은 문자열에 해당하는 단어가 있는지 확인
                System.out.println("========================================");
                System.out.println("[알림] 프로그램의 금칙어 리스트입니다.");
                System.out.println(Arrays.toString(wordPurification(key)));
                System.out.println("========================================");
                System.out.println("[알림] 자막 순화 프로그램 결과입니다.");
                for (int i = 0; i < wordPurification(key).length; i++) {
                    newSubtitle = newSubtitle.replace(badWords[i], alternativeWords[i]);

                }
                }
             newSubtitle = wordPurification();
            }

        }


    }
    //최대한 모듈화

    //로그인 정보가 다르다면 같을때까지 재 입력

    //사용된 비속어 출력


}
