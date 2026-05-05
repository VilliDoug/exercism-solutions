public class Hamming {

  private char[] leftArray = {};
  private char[] rightArray = {};

    public Hamming(String leftStrand, String rightStrand) {
      if (leftStrand.length() != rightStrand.length()) {
        throw new IllegalArgumentException("strands must be of equal length");
      }
      if (!leftStrand.isEmpty()) {
        this.leftArray = leftStrand.toCharArray();
      }

      if (!rightStrand.isEmpty()) {
        this.rightArray = rightStrand.toCharArray();
      }
    }

    public int getHammingDistance() {
      int counter = 0;
        for (int i = 0; i < leftArray.length; i++) {
          if (leftArray[i] != rightArray[i]) {
            counter++;
          }
        }
      return counter;
    }
}
