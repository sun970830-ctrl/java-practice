package loop;

public class Break1_1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        for (;;){
            sum += i;
            if (sum > 10) {
                System.out.println("합이 10보다크면: i=" + i + "sum=" + sum);
                break;
            }
            i++;
        }
    }
}
