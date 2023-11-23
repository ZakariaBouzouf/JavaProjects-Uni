// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Address adr = new Address(100, "Sternbuschweg", 100);
        // Month month = Month.MARS;
        Birthday bir = new Birthday(31, Month.MARS, 1994);
        EmployeeID empl1 = new EmployeeID("test1", "test1", adr, bir, SecurityAccessLevel.LEVEL_1);
        EmployeeID empl2 = new EmployeeID("test2", "test2", adr, bir, SecurityAccessLevel.LEVEL_2);
        EmployeeID empl3 = new EmployeeID("test3", "test3", adr, bir, SecurityAccessLevel.LEVEL_3);

        SecuritySystem      system = new SecuritySystem();
        system.addEmployee(empl1);
        system.addEmployee(empl2);
        system.addEmployee(empl3);
          
         
        // System.out.println(system.isEmployed(empl2));
        for (EmployeeID employe : system.employes)
            System.out.println(employe);

        // System.out.println(system.getEmployeeByUID(3));

        system.addArea("Mensa", SecurityAccessLevel.LEVEL_1);
        system.addArea("Bibl", SecurityAccessLevel.LEVEL_2);
        system.addArea("Buro", SecurityAccessLevel.LEVEL_3);

        if (system.hasAccess(empl3, "Buro")) {
            System.out.println("He has access.");
        } else {
            System.out.println("He doesn't have access.");
        }
        ;
    }
}
