package cond;

public class If22 {
    public static void main(String[] args) {
        int age = 70;
        boolean memberShip = false;
        int ageDiscount = 0;
        int membershipDiscount = 0;
        int sumDiscount = 0;

        if(false){
            ageDiscount=10;
            System.out.println("할인율"+ageDiscount+"%입니다");
        }
        System.out.println("할인율" +ageDiscount+"%입니다");

        if (memberShip==true){
            membershipDiscount=5;
            System.out.println("추가할인율"+membershipDiscount+"%입니다");


        }
        System.out.println("추가할인율 0%입니다");
        sumDiscount=ageDiscount+membershipDiscount;
        System.out.println("총 할인율: " + sumDiscount + "%");

    }
}
