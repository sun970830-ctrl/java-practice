package loop;

public class DoWhile1 {
    public static void main(String[] args) {
        int sum = 10;
        int num = 1;
        int endNum = 100;
        do {
            sum += num;
            System.out.println("sum의 값은 "+sum+"num의 값은: "+num);
            num++;
        }
        while (num <= endNum);


    }
}
