import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        int perfect = 0;
        int fixed = 0;
        int reject = 0;
        for (int i = 0; i<max; i++){
            int currentInt =scanner.nextInt();
            if (currentInt == 0) perfect++;
            if (currentInt == -1) reject++;
            if (currentInt == 1) fixed++;

        }
        System.out.print(perfect);
        System.out.print(" ");
        System.out.print(fixed);
        System.out.print(" ");
        System.out.print(reject);
        // start coding here
    }
}