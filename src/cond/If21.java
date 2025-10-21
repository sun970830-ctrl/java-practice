package cond;

public class If21 {
    public static void main(String[] args) {
        int age = 20;
        boolean hasTicket = false;
        boolean hasId = false;

        if (age >= 20 &&(!hasTicket && hasId)){
            System.out.println("영화관람이 가능합니다");
        }
        else {
            System.out.println("영화관람이 불가능합니다");
        }

    }
}
