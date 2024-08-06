import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String word = "";
            while (n > 0) {
                int remainder = n % 26;
                if (remainder == 0) {
                    word = 'a' + word;
                    n = (n / 26) - 1;
                } else {
                    word = (char) ('a' + remainder - 1) + word;
                    n = n / 26;
                }
            }
            System.out.println(word);
        }
    }
}
