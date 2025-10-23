package cond;

public class If5 {
    public static void main(String[] args) {
        int price = 10000;
        int discount = 0;
        int age = 10;

        if  (false) {
            discount += 1000;
            price -= 1000;
            System.out.println("할인된 가격은 :"+discount+"원");
        }
        if (false) {
            discount += 1000;
            price -= 1000;
            System.out.println("1000원할인");
        }
        System.out.println("총할인: "+discount+"원"+" 총 금액은: "+price+"원");
    }
}
