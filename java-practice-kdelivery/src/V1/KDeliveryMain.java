package V1;

import java.util.Scanner;

// 클래스를 정의 합니다.
public class KDeliveryMain {
    /**
     * 음식점 등록 개수, 음식 주문 가능 횟수, 리뷰 등록 가능 횟수 정의
     */
    private static int SHOP_MAX = 5;
    private static int ORDER_MAX = 5;
    private static int FEEDBACK_MAX = 5;


    /**
     * 배열을 담을 수 있는 객체 생성
     * 사용 범위, 객체 타입, 객체 이름
     */
    private Shop[] shops;
    private Order[] orders;
    private Feedback[] feedbacks;

    // 해당 변수를 제어하는 Idx변수를 정의하고 초기화


    private Scanner s; // 사용자의 입력을 받는 객체 생성

    /**
     * @KDeliveryMainV1() : 매장 정보, 주문 정보, 리뷰 정보 초기화
     * initValues() 메서드 사용
     */

    void KDeliveryMainV1() {
        initValues();
    }

    /**
     * @initValues() : 객체에 저장될 수 있는 크기 지정
     * SHOP_MAX, ORDER_MAX, FEEDBACK_MAX = 5
     */
    void initValues() {
        String[] shops = new String[SHOP_MAX];
        String[] orders = new String[ORDER_MAX];
        String[] feedbacks = new String[FEEDBACK_MAX];
    }

    /**
     * @close() : 프로그램 종료를 위해 사용되는 메서드
     * 사용자가 종료를 선언하면 동작합니다.
     * main()에서 활용됩니다.
     */
    void close() {
        s.close();
        System.out.println("[안내]이용해 주셔서 감사합니다.");
    }


    /**
     * selectMainMenu() : 기능을 나열하며, 사용자가 원하는 기능을 정수로 받습니다.
     */
    void selectMainMenu(int input) {
        switch (input) {
            case 1:
                selectAddShopMenu();
                break;
            case 2:
                selectDashboardMenu();
                break;
            case 3:
                selectOrderMenu();
                break;
            case 4:
                selectFeedbackMenu();
                break;
            case 5:
                close();
                break;
            default:
                System.out.println("[안내]메뉴에 포함된 번호를 입력하여 주세요.");

        }
    }


    /**
     * @selectAddShopMenu() : 음식점의 정보를 등록합니다.
     * @shops : 가게 정보를 저장합니다.
     * @shopIdx : 가게 정보의 인덱스
     */

    public void selectAddShopMenu() {

        /**
         * @Shop.java 의 Shop 클래스를 활용한 객체 생성
         * @public 클래스 : 동일 패키지 및 다른 패키지에서 사용가능
         * @addFood() : Shop.java 의 Shop 클래스의 addFood() 메서드
         * 해당 메서드는 매장명, 음식명, 가격을 입력받아 객체에 저장
         * 값이 저장될 때 마다 shopIdx 값 증가
         */
        //매장명, 대표메뉴, 메뉴가격 등록
        //가격에 정수만 들어오게
        //shops를 돌면서 해당가게가 존재하는지 찾아야함
        //shopName == 기존의 shop객체의 shopName이 일치하지 않을때만 새로 생성
        //이외에 경우에만 기존 shop에 추가
        //중복해서 등록할 수 없게
        if (shops.length <= SHOP_MAX) {
            System.out.println("[안내] 고객님! 메뉴 주문을 진행하겠습니다!");
            System.out.println("[안내] 주문자 이름을 알려주세요!");
            System.out.print(">>>");
            String orderer = s.nextLine();
            System.out.println("[안내] 주문할 음식점 상호는 무엇인가요?");
            System.out.print(">>>");
            String ipShopName = s.nextLine();
            System.out.println("[안내] 주문할 메뉴 이름을 알려주세요!");
            System.out.print(">>>");
            String ipMenuName = s.nextLine();
            System.out.println("[안내] " + orderer + "님!");
            System.out.println("[안내] 노랑 통닭 매장에 노랑 치킨 주문이 완료되었습니다.");
        }else {
            System.out.println("[시스템] 가게 등록할 수 있는 범위를 초과했습니다.\n");
        }
    }

    /**
     * @selectDashboardMenu() : 해당 메서드는 등록된 가게 정보를 출력합니다.
     * Feedback.java 파일의 클래스 및 메서드를 활용합니다.
     */
    void selectDashboardMenu() {
        //feedback정보 얻음
        //전체 별점
        // 있으면 출력하고 없으면 넘김

    }

    /**
     * @return
     * @selectOrderMenu() : 주문 기능
     * 사용자의 입력을 받아 orders 객체에 저장
     */
     void selectOrderMenu() {
//주문 기능
         if (orders.length <= ORDER_MAX) {
             //메뉴가 있는지 검증
             System.out.println("[안내] 고객님! 메뉴 주문을 진행하겠습니다!");
             System.out.println("[안내] 주문자 이름을 알려주세요!");
             System.out.print(">>>");
             String customerName = s.nextLine();
             System.out.println("[안내] 주문할 음식점 상호는 무엇인가요?");
             System.out.print(">>>");
             String shopName = s.nextLine();
             System.out.println("[안내] 주문할 메뉴 이름을 알려주세요!");
             System.out.print(">>>");
             String foodName = s.nextLine();
             Order order = new Order(customerName, shopName, foodName);
             orders//orders 배열에 넣기
             System.out.printf("[안내] %s님!\n", customerName);
             System.out.printf("[안내] %s 매장에 %s 주문이 완료되었습니다.\n", shopName, foodName);
         }
         System.out.println("[시스템] 5번까지 입력할 수 있습니다.\n");


    }

    /**
     * @selectFeedbackMenu() : 메뉴의 피드백을 입력받는 기능
     */
    void selectFeedbackMenu() {
        //입력받은걸 해당 메소드로 넘겨줘야됨
        // 있는지 없는 확인
        System.out.println("[안내] 고객님! 별점 등록을 진행합니다.");
        System.out.println("[안내] 주문자 이름은 무엇인가요?");
        System.out.println(">>>");
        String orderer = s.nextLine();
        System.out.println("[안내] 음식점 상호는 무엇인가요?");
        System.out.print(">>>");
        String shop = s.nextLine();
        System.out.println("[안내] 주문하신 음식 이름은 무엇인가요?");
        System.out.print(">>>");
        String menu = s.nextLine();
        System.out.println("[안내] 음식 맛은 어떠셨나요? (1점 ~ 5점)");
        System.out.print(">>>");
        int score = s.nextInt();
        System.out.println("[안내] 리뷰 등록이 완료되었습니다.");
    }

    public static void main(String[] args) {

    }
}