public class CarsAssemble {

    public double productionRatePerHour(int speed) {
      int flatProduction = 221;
      double perHour = speed * flatProduction;
      if (speed >= 5 && speed <= 8) {
      return perHour * 0.9;
      } else if (speed == 9) {
        return perHour * 0.8;
      } else if (speed == 10) {
        return perHour * 0.77;
      }
      return perHour;
    }

      public int workingItemsPerMinute(int speed) {
      double doublePerMinute = productionRatePerHour(speed) / 60;
      int unitsPerMinute = (int) doublePerMinute;
      return unitsPerMinute;
    }
}
