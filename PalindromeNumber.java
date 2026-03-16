package orrg.study.org.week2;

public class PalindromeNumber {
    public static void main(String[] args) {

        int input = 121;
        int output = 0;

        for(int i = input; i > 0; i = i / 10) {

            int rem = i % 10;
            output = output * 10 + rem;

        }

        if(input == output) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }
    }
}

