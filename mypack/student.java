package mypack;

public class student {
	private String StdName;
	private int StdID;
	private String Courses;
	private double Balance;
	public double CourseFee;
	private double paidfee;

	public student()
	{
		
	}
	 
	public double getPaidfee() {
		return paidfee;
	}

	public void setPaidfee(double paidfee) {
		this.paidfee = paidfee;
	}

	public double getCourseFee() {
		return CourseFee;
	}

	public void setCourseFee(double courseFee) {
		CourseFee = courseFee;
	}


	public String getStdName() {
		return StdName;
	}

	public void setStdName(String stdName) {
		StdName = stdName;
	}

	public int getStdID() {
		return StdID;
	}

	public void setStdID(int StdiD) {
		StdID = StdiD;
	}

	public String getCourses() {
		return Courses;
	}

	public void setCourses(String courses) {
		Courses = courses;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}
}
