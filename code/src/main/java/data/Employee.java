package data;

import java.util.Objects;

public class Employee {
    int ID;
    String Name;
    String DEPT;



    public Employee(int ID, String name, String DEPT) {

        this.ID = ID;
        Name = name;
        this.DEPT = DEPT;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDEPT() {
        return DEPT;
    }

    public void setDEPT(String DEPT) {
        this.DEPT = DEPT;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return ID == employee.ID &&
                Name.equals(employee.Name) &&
                DEPT.equals(employee.DEPT);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, Name, DEPT);
    }
}
