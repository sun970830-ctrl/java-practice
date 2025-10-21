package cond;

public class If221 {
    public static void main(String[] args) {
        int age = 70;
        boolean memberShip = false;
        int discount = 0;

        if(age >=65||age<=13){
            discount+=10;
            System.out.println("할인율" + discount + "%입니다");
        }
        else {
            System.out.println("할인율" + discount + "%입니다");
        }
        if (memberShip){
            discount+=5;
            System.out.println("추가할인율"+discount+"%입니다");
        }
        else{
            System.out.println("추가할인율 0%입니다");
        }
            System.out.println("총 할인율: " + discount + "%");

    }
}
