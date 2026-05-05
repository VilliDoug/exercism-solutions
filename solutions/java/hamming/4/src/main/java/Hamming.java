public class Hamming {

  private String leftStrand = "";
  private String rightStrand= "";
  int counter = 0;

    public Hamming(String leftStrand, String rightStrand) {
      if (leftStrand.length() != rightStrand.length()) {
        throw new IllegalArgumentException("strands must be of equal length");
      } else if (!leftStrand.isEmpty() || !rightStrand.isEmpty()) {
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
      }
      for (int i = 0; i < leftStrand.length(); i++) {
        if (leftStrand.charAt(i) != rightStrand.charAt(i)) {
          counter++;
        }
      }
    }

    public int getHammingDistance() {
      return counter;
    }
}
