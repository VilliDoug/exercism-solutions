import java.util.HashMap;
import java.util.Map;

class SqueakyClean {
    static String clean(String identifier) {

//      Declare a map with the assigned leetspeak (K) and respective values (V)
      Map<String, String> leetConverterMap = new HashMap<>();
      leetConverterMap.put("4" , "a");
      leetConverterMap.put("3" , "e");
      leetConverterMap.put("0" , "o");
      leetConverterMap.put("1" , "l");
      leetConverterMap.put("7" , "t");
//      go through each map entry set and replace key with value
      for (Map.Entry<String, String> entry : leetConverterMap.entrySet()) {
        identifier = identifier.replace(entry.getKey(), entry.getValue());
      }
//      declare string builder and camelCase boolean
      StringBuilder builder = new StringBuilder();
      boolean nextToUpper = false;
//  loop goes as:
//      is char '-'?
//      if no, skip it
//      if yes, loop goes over and the next char is checked
//      char is not '-', but nextToUpper is set to true, which means char is appended into builder
//      as uppercase.
//      otherwise, simply append the character as is.
      for (char c : identifier.toCharArray()) {
        if (c == '-') {
          nextToUpper = true;
        } else {
          if (nextToUpper) {
            builder.append(Character.toUpperCase(c));
            nextToUpper = false;
          } else {
            builder.append(c);
          }
        }

      }
//      this is a bit of a messy one, not proud of it.
//      builder is converter into string
      String camelString = builder.toString();
//      replace empty spaces with _
      String cleanString = camelString.replace(" ", "_" );
//      regex check for symbols OTHER than letters, numbers (have been looked at before in leet check)
//      and change them into nothing
      String finalString = cleanString.replaceAll("\\W+", "");
      return finalString;

    }
}
