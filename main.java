class UserMainCode {
    public int sumOfSilverNumber(int input1,int input2,int input3) {
        input1 = replaceDigit(input1);
      input2 = replaceDigit(input2);
      input3 = replaceDigit(input3);
      return sumOfDigits(input1+input2+input3);
    }
    public int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum = sum + (number % 10);
            number = number / 10;
        }
        return sum;
    }
    public int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
    public int replaceDigit(int number){
          number = reverseNumber(number);
          int reversed = 0;
          while (number != 0) {
            int digit = number % 10;
            if(digit == 7 || digit == 8 || digit == 9){
              reversed = reversed * 10 + 1;
            }
            else if(digit == 4 || digit == 5 || digit == 6){
              reversed = reversed * 10 + 2;
            }
            else if(digit == 1 || digit == 2 || digit == 3){
              reversed = reversed * 10 + 3;
            }
            else{
              reversed = reversed * 10;
            }
            number /= 10;
        }
      return reversed;
    }
}

