package Company;

public class MainApp {
    public static void main(String[] args){
        Employee e1 = new Employee();
        manager m1 = new manager();
        m1.ShowSalary();
        System.out.println(e1.salary);
        System.out.println(e1.name);
    }
    
}
