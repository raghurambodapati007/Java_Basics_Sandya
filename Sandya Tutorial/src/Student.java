public class Student{
	
	 
		private int studentId;
	    private String studentName;
	    private int studentClass;
	    
	    private Location village;
	    private Results marks;
	    
	    
		public int getStudentId() {
			return studentId;
		}
		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public int getStudentClass() {
			return studentClass;
		}
		public void setStudentClass(int studentClass) {
			this.studentClass = studentClass;
		}
	
		public Location getVillage() {
			return village;
		}
		public void setVillage(Location village) {
			this.village = village;
		}
		public Results getMarks() {
			return marks;
		}
		public void setMarks(Results marks) {
			this.marks = marks;
		}
		@Override
		public String toString() {
			return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentClass=" + studentClass
					+ ", village=" + village + ", marks=" + marks + "]";
		}
	
	
	    
}