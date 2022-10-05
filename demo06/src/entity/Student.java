package entity;

public class Student extends person {
    // Cac thuoc tinh rieng cua person
    private String studentId;
    private float mark;
    //2.


    public Student() {
    }

    public Student(String name, int age, String address, String phone, String studentId, float mark) {
        super(name, age, address, phone);
        this.studentId = studentId;
        this.mark = mark;
    }
    //3. cac phuong thuc cua rieng no
    //3.1 cac phuong thuc get set rieng

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }
    ///3.2 cac phuong thuc rieng chuc nang
    public void inputDataStudent(){
        super.inputData();
        System.out.println("Nhap thong tin");
    }
    public int add (int num1, int num2){
        return num1+num2;
    }
    public int add(int num1,int num2, int num3){
        return num1+num2+num3;
    }
}
