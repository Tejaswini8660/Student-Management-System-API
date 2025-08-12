package student.restapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name="student2")
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int rollNo;
    @Column(name="student_name")
    private String name;
    @Column(name = "student_percentage")
    private float percentage;
    @Column(name="student_branch")
    private String branch;

    public Student(int rollNo, String name, float percentage, String branch) {
    super();
        this.name = name;
        this.percentage = percentage;
        this.branch = branch;
    }

    public Student(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }



}
