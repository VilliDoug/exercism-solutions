import java.util.HashMap;
import java.util.Map;

public class DialingCodes {

  Map<Integer, String> codesMap = new HashMap<>();

    public Map<Integer, String> getCodes() {
      return codesMap;
    }

    public void setDialingCode(Integer code, String country) {
      codesMap.put(code, country);
    }

    public String getCountry(Integer code) {
      return codesMap.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
      if (!codesMap.containsKey(code) && !codesMap.containsValue(country)) {
        codesMap.put(code, country);
      }
    }

    public Integer findDialingCode(String country) {
      for (Map.Entry<Integer, String> code : codesMap.entrySet()) {
        if (code.getValue().equals(country)) {
          return code.getKey();
        }
      }
      return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
      Integer oldCode = findDialingCode(country);
      if (oldCode != null) {
        codesMap.remove(oldCode);
        codesMap.put(code, country);
      }
    }
}
