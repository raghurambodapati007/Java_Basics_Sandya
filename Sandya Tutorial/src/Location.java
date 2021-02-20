public class Location {
  
   private String villageName,dist;
    private long pin;
    
    
     @Override
    public String toString() {
        return "Student1 [villageName=" + villageName + ", dist=" + dist + ", pin=" + pin + "]";
    }
    /* public Student1(String villageName, String dist, long pin) {
            
            this.villageName = villageName;
            this.dist = dist;
            this.pin = pin;
        }*/

	public String getVillageName() {
		return villageName;
	}

	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public long getPin() {
		return pin;
	}

	public void setPin(long pin) {
		this.pin = pin;
	}


}