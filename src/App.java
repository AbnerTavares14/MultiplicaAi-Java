import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner x = new Scanner(System.in);
        System.out.println("Digite um número");
        int num = x.nextInt();
        for (int i = 1; i <= 10; i++) {
            int y = num * i;
            System.out.println(y);
        }
    }
}
