package ch06_for;

public class Ex03_ForEx {

    public static void main(String[] args) {
        /*
         * 1부터 10까지의 합계를 출력
         */
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

}
