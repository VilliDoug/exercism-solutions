class Badge {
    public String print(
        Integer id,
        String name,
        String department) {
      if (id == null && department == null) {
        String newOwner = "%s - OWNER";
        return String.format(newOwner, name);
      } else if (id == null) {
        String newEmployee = "%s - %s";
        return String.format(newEmployee, name, department.toUpperCase());
      } else if (department == null) {
        String owner = "[%d] - %s - OWNER";
        return String.format(owner, id, name);
      }
      return String.format("[%d] - %s - %s", id, name, department.toUpperCase());
    }
}


