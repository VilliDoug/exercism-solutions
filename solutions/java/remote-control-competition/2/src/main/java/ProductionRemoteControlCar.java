class ProductionRemoteControlCar implements RemoteControlCar,
    Comparable<ProductionRemoteControlCar> {

  int travelUnits;
  int victories;

//   pfffff...
  @Override
  public int compareTo(ProductionRemoteControlCar car) {
    return car.victories - this.victories;
  }

  public void drive() {
    travelUnits = travelUnits + 10;
  }

  public int getDistanceTravelled() {
    return travelUnits;
  }

  public int getNumberOfVictories() {
    return victories;
  }

  public void setNumberOfVictories(int numberOfVictories) {
    this.victories = numberOfVictories;
  }
}
