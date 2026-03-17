public class ExperimentalRemoteControlCar implements RemoteControlCar {

  int travelUnits;

  public void drive() {
    travelUnits = travelUnits + 20;
  }

  public int getDistanceTravelled() {
    return travelUnits;
  }
}
