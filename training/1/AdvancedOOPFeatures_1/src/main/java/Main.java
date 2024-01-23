import java.util.Collections;
import java.util.List;

public class Main {

    public static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        System.out.println(staff);
        sortBySalaryAndAlphabet(staff);
        System.out.println(staff);
    }

    public static void sortBySalaryAndAlphabet(List<Employee> someStaff) {
        Collections.sort(someStaff, (o1, o2) -> {
             int cmp = o1.getSalary().compareTo(o2.getSalary());
            if (cmp !=0) return cmp;
            return o1.getName().compareTo(o2.getName());
        });

        //TODO Метод должен отсортировать сотрудников по заработной плате и алфавиту.
    }
}