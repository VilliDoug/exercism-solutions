public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
      return daysSkipped >= 5 ? 0.85 : 1.0;
    }

    public int bonusMultiplier(int productsSold) {
      return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
      return bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
      int baseSalary = 1000;
      int maxSalary = 2000;
      double addedSalary = baseSalary * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
      return addedSalary > maxSalary ? maxSalary : addedSalary;
    }
}
