package ch04;

public class SwitchExample {
    public static void main(String[] args) {
        // switch문 - 정수, 문자열 값만 대입 가능 (실수, 논리형 불가)

        int num = (int)(Math.random() * 6) + 1;
        //int num = 1;

        switch(num) {
            case 1 :
                System.out.println("1번이 나왔습니다.");
                break; // 가 없다면
                // (num = 1 일 때) break 가 없다면 break가 나오기 전까지 구문 모두 실행 (여기서는 case1~2까지)
                // (num = 2 일 때) case1에 break 가 없어도 case2로 이동하기 때문에 2 구문만 실행
            case 2 :
                System.out.println("2번이 나왔습니다.");
                break;
            case 3 :
                System.out.println("3번이 나왔습니다.");
                break;
            case 4 :
                System.out.println("4번이 나왔습니다.");
                break;
            case 5 :
                System.out.println("5번이 나왔습니다.");
                break;
            default:
                System.out.println("6번이 나왔습니다.");
        }
    }
}
