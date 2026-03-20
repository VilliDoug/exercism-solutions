import java.util.Arrays;
import java.util.List;

class ResistorColorDuo {
    int value(String[] colors) {
      String[] orderedColors = {
          "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"
      };
      List<String> colorList = Arrays.asList(orderedColors);
      String stringCode = "" + colorList.indexOf(colors[0]) + "" +
          colorList.indexOf(colors[1]);
      return Integer.parseInt(stringCode);
    }
}
