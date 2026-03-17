public class Lasagna {

  int expectedMinutes = 40;
  int inOvenMinutes = 10;
  int layers = 5;


  public int expectedMinutesInOven() {
    return expectedMinutes;
  }

  public int remainingMinutesInOven(int inOvenMinutes) {
    Lasagna lasagna = new Lasagna();
    return lasagna.expectedMinutesInOven() - inOvenMinutes;
  }

  public int preparationTimeInMinutes(int layers) {
    return layers * 2;
  }

  public int totalTimeInMinutes(int layers, int inOvenMinutes) {
    Lasagna lasagna = new Lasagna();
    return lasagna.preparationTimeInMinutes(layers) + inOvenMinutes;
  }
}
