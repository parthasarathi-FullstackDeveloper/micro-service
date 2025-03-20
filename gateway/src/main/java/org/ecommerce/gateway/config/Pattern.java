package org.ecommerce.gateway.config;

public class Pattern {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("   ");
            }
            if (i % 2 == 1) {
                for (int k = 1; k <= 4; k++) {
                    count += 1;
                    System.out.print(count + "  ");


                }

            } else {
                for (int k = 1; k <= 4; k++) {
                    count += 1;

                }
                int clone = count;
                for (int k = 1; k <= 4; k++) {
                    System.out.print(clone + "  ");
                    clone--;

                }
            }


            System.out.println();
        }
    }
}
