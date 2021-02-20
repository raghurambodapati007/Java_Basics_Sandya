
public class Main {

 
    public static void main(String[] args) {
    	
    	Location location=new Location();
    	
    	location.setVillageName("ank");
    	location.setDist("prakasam");
    	location.setPin(523190);
        
         Results result=new Results();
         
         result.setStudentmarks(80);
         result.setStudentresult("pass");
         
         
        
        Student student=new Student();
        
        student.setStudentName("abcd");
        student.setStudentId(1234);
        student.setStudentClass(10);
        
    //    student.setMarks(marks);
    
        student.setVillage(location);
        student.setMarks(result);
        
        
        
         System.out.println("Student  class is"+student.getStudentClass());
         
         System.out.println("student2 marks"+student.getMarks().getStudentresult());
        
        
        //Student st=new Student(1234,"sandy",10,new Student1("ank","prakasam",523190),new Student2(70,"pass"));
    //    Student1 village=new Student1("ank","prakasam",523190);
    //    Student2 marks=new Student2(70,"pass");
            /*st.studentId=1234;
            st.studentName="sandy";
            st.studentClass=10;
            st.village.villageName="ank";
            st.village.dist="prakasam";
            st.village.pin=523190;
            st.marks.studentmarks=70;
            st.marks.studentresult="pass";*/
            //Student1 s1=new Student1();default constructors
            //Student2 s2=new Student2();
            //System.out.println(st.toString());
        
            
        }
}
