public static boolean isPalindrome(int number) {

        int num = number;
        int reverse = 0;
        int lastDigit = 0;

        while(num != 0) {

            lastDigit = num % 10;
            num /= 10;

            reverse *= 10;
            reverse = reverse + lastDigit;

        }

        if (number == reverse) {
            return true;
        } else {
            return false;
        }

    }