import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int ans=0; // converts the binery number into decimal number
        int pw = 1; // 2 ^ 0=1; pw repersent power of number


        while(num >0){
           int unit_digit = num % 10; // we use module for seprate unit_digit from binary_digit
           ans += (unit_digit * pw); // after that we multiple unit_digit to two to power and store into ans
           num /= 10; // divide the binay_number into ten
           pw *= 2; // multiple the power of 2 for increasing
        }
        System.out.println(ans);
    }
}