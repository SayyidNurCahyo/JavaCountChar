import java.util.Scanner;

public class CountCharCaseInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan string: ");
        String input = scanner.nextLine();
        CharCount(input);
        scanner.close();
    }

    public static void CharCount(String input){
        int upper = 0;
        int lower = 0;
        int digit = 0;
        int symbol = 0;
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upper++;
            } else if (Character.isLowerCase(c)) {
                lower++;
            } else if (Character.isDigit(c)) {
                digit++;
            } else {
                symbol++;
            }
        }
        System.out.println("Uppercase : " + upper);
        System.out.println("Lowercase : " + lower);
        System.out.println("Angka : " + digit);
        System.out.println("Symbol : " + symbol);
    }
}
