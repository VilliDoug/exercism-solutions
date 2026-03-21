class Acronym {

  private String result = "";


    Acronym(String phrase) {
      String[] splitStringArray = phrase.split("[,\\-_\\s]+");
      for (String s : splitStringArray) {
        String letter = String.valueOf(s.charAt(0));
        result += letter.toUpperCase();
      }
    }

    String get() {
      return result;
    }
}
