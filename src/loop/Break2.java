package loop;

public class Break2 {
    public static void main(String[] args) {
        int endNum = 1000;
        int startNum = 1;
        int sum = 0;

        while (true){
            sum += startNum;
            if (sum > endNum) {
                System.out.println("startNum의 값은: "+startNum);
                break;
            }
            startNum++;


        }
    }
}
