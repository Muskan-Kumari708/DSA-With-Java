package loopspatterns;

public class HollowButterfly {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            for (int s = 1; s <= (4 - i) * 2; s++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                if (k == 1 || k == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
            for (int r = 4; r >= 1; r--) {
                for (int c = 1; c <= r; c++) {
                    if (c == 1 || c == r) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                for (int sp = 1; sp <= (4-r)*2; sp++) {
                    System.out.print(" ");

                }
                for (int p = 1; p <= r; p++) {
                    if (p == 1 || p == r) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }


    }
}


