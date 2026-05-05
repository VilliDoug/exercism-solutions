import java.util.HashSet;
import java.util.Set;

public class PangramChecker {

    public boolean isPangram(String input) {
      Set<Character> characterSet = new HashSet<>();
      String formatted = input
          .toLowerCase()
          .replaceAll("[0-9\\p{P}\\p{S}]", " ")
          .replaceAll("\\s+", "");

      for (int i = 0; i < formatted.length(); i++) {
        characterSet.add(formatted.charAt(i));
      }
      return characterSet.size() == 26;
    }
}
