class CalculatorConundrum {

  public String calculate(int operand1, int operand2, String operation) {
    String result;
    if (operation == null) {
      throw new IllegalArgumentException("Operation cannot be null");
    }
      switch (operation) {
        case "+" -> result = String.format("%d + %d = %d", operand1, operand2, operand1 + operand2);
        case "*" -> result = String.format("%d * %d = %d", operand1, operand2, operand1 * operand2);
        case "/" -> {
          try {
            result = String.format("%d / %d = %d", operand1, operand2, operand1 / operand2);
          } catch (ArithmeticException arithmeticException) {
            throw new IllegalOperationException("Division by zero is not allowed", arithmeticException);
          }
        }
        case "" -> throw new IllegalArgumentException("Operation cannot be empty");
        default -> throw new IllegalOperationException("Operation '" + operation + "' does not exist");
    }
    return result;
  }

}
