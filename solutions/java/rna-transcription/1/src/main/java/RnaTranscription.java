import java.util.HashMap;
import java.util.Map;

class RnaTranscription {

    String transcribe(String dnaStrand) {
      Map<String, String> map = new HashMap<>();
      map.put("G", "C");
      map.put("C", "G");
      map.put("T", "A");
      map.put("A", "U");

      char[] dnaStrandArray = dnaStrand.toCharArray();
      String transcription = "";
      for (char c : dnaStrandArray) {
        String letter = String.valueOf(c);
        transcription += map.get(letter);
        }
      return transcription;
    }
}
