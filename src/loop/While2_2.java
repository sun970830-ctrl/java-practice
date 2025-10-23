package loop;

public class While2_2 {
    public static void main(String[] args) {

        int sum = 0;
        int count = 50;
        int endNum = 100;

        while (count <= endNum ) {
            sum += count;
            System.out.println("count의 값은: " + count + "sum의 값은: " + sum);
            count++;
        }

    }
}
