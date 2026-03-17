class NeedForSpeed {

  private int speed;
  private int batteryDrain;
  private int batteryCharge = 100;
  private int driven = 0;

  public int getBatteryCharge() {
    return batteryCharge;
  }

  public int getSpeed() {
    return speed;
  }

  public int getBatteryDrain() {
    return batteryDrain;
  }

    NeedForSpeed(int speed, int batteryDrain) {
      this.speed = speed;
      this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
      return batteryCharge < batteryDrain;
    }

    public int distanceDriven() {
      return driven;
    }

    public void drive() {
      if (!batteryDrained()) {
      driven = speed + driven;
      batteryCharge = batteryCharge - batteryDrain ;
      }
    }

    public static NeedForSpeed nitro() {
      int speed = 50;
      int batteryDrain = 4;
      return new NeedForSpeed(speed, batteryDrain);
    }
}

class RaceTrack {

  public int distance;

    RaceTrack(int distance) {
      this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
      double chunk = (double) car.getBatteryCharge() / car.getBatteryDrain();
      double maxDistance = chunk * car.getSpeed();
      return maxDistance >= distance;
    }

}
