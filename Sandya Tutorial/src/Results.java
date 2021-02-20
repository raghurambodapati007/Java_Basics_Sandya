
public class Results {

    private int studentmarks;
    private String studentresult;

    
    @Override
    public String toString() {
        return "Student2 [studentmarks=" + studentmarks + ", studentresult=" + studentresult + "]";
    }
    /*public Student2(int studentmarks, String studentresult) {
        
        this.studentmarks = studentmarks;
        this.studentresult = studentresult;
    }*/
//getter and setter methods
    
    public int getStudentmarks() {
        return studentmarks;
    }

 

    public void setStudentmarks(int studentmarks) {
        this.studentmarks = studentmarks;
    }

 

    public String getStudentresult() {
        return studentresult;
    }

 

    public void setStudentresult(String studentresult) {
        this.studentresult = studentresult;
    }
    
    

 

}
