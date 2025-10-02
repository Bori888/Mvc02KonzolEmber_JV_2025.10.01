package nezet;

import java.util.Scanner;

public class CuiNezet {

    private static final Scanner sc = new Scanner(System.in);

    public void mutat(String uzenet) {
        System.out.print(uzenet);
    }

    public String nevBeker() {
        mutat("név: ");
        return sc.nextLine();
    }

    public int korBeker() {
        mutat("kor: ");
        return sc.nextInt();
    }
}
