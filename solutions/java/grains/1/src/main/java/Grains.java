import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
      BigInteger grains = BigInteger.valueOf(1);
      if (square < 1 || square > 64) {
        throw new IllegalArgumentException("square must be between 1 and 64");
      } else if (square == 1) {
        return grains;
      } else {
        for (int i = 1; i < square; i++) {
          grains = BigInteger.TWO.pow(square - 1);
        }
        return grains;
      }
    }

    BigInteger grainsOnBoard() {
    //  The sum of a power series $2^0 + 2^1 + 2^2 ... + 2^{n-1}$
    //  is always equal to $2^n - 1$. **Gemini**
      return BigInteger.TWO.pow(64).subtract(BigInteger.ONE);
    }

}
