class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
      String numberString = "" + numberToCheck; //convert number into string for counting digits
      int digits = numberString.length(); //count digits
      int sum = 0; // declare the var
      for (int i = 0; i < digits; i++) {
        int number = numberString.charAt(i) - '0'; // I need to understand this better...!
        sum = sum + (int) Math.pow(number, digits); // also how the calculation is happening here
      } // for each digit, get the number of each digit and calculate the sum of (said number to the power of digits)
      return sum == numberToCheck;
    }

}
