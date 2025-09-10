public class Main {
    public static void main(String[] args) {
        Company company = new Company("TechNova");

        company.addDepartment("Engineering");
        company.addDepartment("HR");

        Department eng = company.getDepartment("Engineering");
        eng.addEmployee("Alice", 101);
        eng.addEmployee("Bob", 102);

        Department hr = company.getDepartment("HR");
        hr.addEmployee("Carol", 201);

        company.displayCompanyStructure();

        // Now delete the company
        company.dissolveCompany();
    }
}
