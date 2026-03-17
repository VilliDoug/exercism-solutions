class Leap {

  boolean isLeapYear(int year) {
    boolean divBy4 = year % 4 == 0;
    boolean divBy100 = year % 100 == 0;
    boolean divBy400 = year % 400 == 0;

    return (divBy4 && (!divBy100 || divBy400));
  }
}
