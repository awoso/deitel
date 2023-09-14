package Chapter3.school;

public class School {
    private int NumberOfStudent;
    private String location;
    private String SchoolName;
    public void setSchoolName(String schoolName) {
        this.SchoolName = schoolName;
    }
    public void setLocation(String location){
        this. location = location;
    }
    public void setNumberOfStudent(int NumberOfStudent){
        this.NumberOfStudent = NumberOfStudent;
    }
    public String getSchoolName() {
        return SchoolName;
    }
    public String getLocation() {
        return location;
    }

    public int getNumberOfStudent() {
        return NumberOfStudent;
    }

}
