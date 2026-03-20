import java.util.Arrays;
import java.util.List;

class ResistorColorTrio {
    String label(String[] colors) {
      String[] ordered = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
      List<String> colorList = Arrays.asList(ordered);
      String rawString = "" + colorList.indexOf(colors[0]) +
          "" + colorList.indexOf(colors[1]);
      long firstTwoDigits = Integer.parseInt(rawString);
      long result = firstTwoDigits * (long) Math.pow(10, colorList.indexOf(colors[2]));


      if (result < 1000) {
        return "" + result + " ohms";
      } else if (result < 1000000) {
        return "" + (result / 1000) + " kiloohms";
      } else if (result < 1000000000) {
        return "" + (result / 1000000) + " megaohms";
      } else if (result < 1000000000000L) {
        return "" + (result / 1000000000) + " gigaohms";
      }
      return "";
    }
}
