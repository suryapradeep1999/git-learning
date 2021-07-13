package JavaA3;

public class Employee {
	int id;

    public Employee(int id) {
        this.id = id;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String toString() {
        return "Employee{" + "id=" + id + '}';
    }

    public boolean equals(Object o) {
     return true;
    }

    public int hashCode() {
        return 1;
	}
}
