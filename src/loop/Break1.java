package loop;

public class Break1 {
    public static void main(String[] args) {
        int sum = 0;
        int  i = 0;

        while(true) {
            sum = sum + i;
            if (sum > 10) {
                System.out.println("합이 10보다크면: i=" + i + "sum=" + sum);
                break;

            }
            i++;

        }
    }
}
