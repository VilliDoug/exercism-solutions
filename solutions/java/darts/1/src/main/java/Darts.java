
class Darts {
    int score(double xOfDart, double yOfDart) {
//      Need to review some mathematics...
      double coordinates = Math.sqrt(xOfDart * xOfDart + yOfDart * yOfDart);
      if (coordinates <= 1) {
        return 10;
      } else if (coordinates <= 5) {
        return 5;
      } else if (coordinates <= 10) {
        return 1;
      } else {
        return 0;
      }

    }
}
