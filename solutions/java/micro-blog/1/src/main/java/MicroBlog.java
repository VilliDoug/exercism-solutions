class MicroBlog {
    public String truncate(String input) {
      int lengthLimit = 5;
      if (input.codePointCount(0, input.length()) <= lengthLimit) {
        return input;
      } else {
        int endIndex = input.offsetByCodePoints(0, lengthLimit);
        return input.substring(0, endIndex);
      }
    }
}
