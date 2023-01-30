import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i<max; i++){
            int currentInt =scanner.nextInt();
            if (currentInt % 6 == 0) sum+=currentInt;
        }
        System.out.println(sum);
        // start coding here
    }
}