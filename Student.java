public class Student {
    // Atribut (private) -> encapsulation
    private int studentID;
    private String name;
    private String department; // bisa juga Integer kalau ingin kode jurusan
    private String address;

    // Constructor
    public Student(int studentID, String name, String department, String address) {
        this.studentID = studentID;
        this.name = name;
        this.department = department;
        this.address = address;
    }

    // Getter & Setter
    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Utility: untuk cetak ringkas
    public void displayInfo() {
        System.out.println("ID: " + studentID + ", Name: " + name
                + ", Department: " + department + ", Address: " + address);
    }

    // Optional: toString() supaya mudah saat print koleksi
    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
