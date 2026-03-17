public class Lasagna {

  int expectedMinutes = 40;
  int inOvenMinutes = 10;
  int layers = 5;


    // TODO: define the 'expectedMinutesInOven()' method
  public int expectedMinutesInOven() {
    return expectedMinutes;
  }

    // TODO: define the 'remainingMinutesInOven()' method
  public int remainingMinutesInOven(int inOvenMinutes) {
    return expectedMinutes - inOvenMinutes;
  }

    // TODO: define the 'preparationTimeInMinutes()' method
  public int preparationTimeInMinutes(int layers) {
    return layers * 2;
  }

    // TODO: define the 'totalTimeInMinutes()' method
  public int totalTimeInMinutes(int layers, int inOvenMinutes) {
    Lasagna lasagna = new Lasagna();
    return (lasagna.preparationTimeInMinutes(layers) + inOvenMinutes);
  }
}
