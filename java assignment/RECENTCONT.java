import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
      for (int i = 0; i < T; i++) {
            
            int N = scanner.nextInt();
            scanner.nextLine(); 
            String contestCodes = scanner.nextLine();

            
            int start38Count = 0;
            int ltime108Count = 0;
            for (int j = 0; j < N; j++) {
                if (contestCodes.charAt(j) == 'S') {
                    start38Count++;
                } else {
                    ltime108Count++;
                }
            }
            System.out.println(start38Count + " " + ltime108Count);
        }
    }
}

