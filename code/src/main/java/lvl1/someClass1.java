package lvl1;

import data.Employee;

import java.util.HashMap;
import java.util.Map;

public class someClass1 implements someInterface {

    Map<Integer, Employee> someMap = new HashMap<>();

    @Override
    public void addEmployee(Employee e1) {
        someMap.put(e1.getID(),e1);
    }

    @Override
    public void displayAllEmp() {
        if (!someMap.isEmpty()) {

            for (Map.Entry<Integer, Employee> entry : someMap.entrySet()) {
                System.out.println("Key = " + entry.getKey() +
                        ", Value = " + entry.getValue().getName());
            }

        }
    }
}
