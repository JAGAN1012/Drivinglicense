package drivinglicense;

public class GenericDriver {
	private String name;
	private int points;
	private boolean provisional; 
	protected String medicalReport;// access modifier  it will allow access within package and outside package it will access through child class
	
	 GenericDriver(String name,boolean provisional) {
		this.name=name;
		points=25;
		this.provisional=provisional;
		
	}
	public String getName() {
		return name;
	}
	public int getPoints() {
		return points;
	}
	public boolean getProvisional() {
		return provisional;
	}  
  public String getmedicalReport() {
	  return medicalReport;
  }
  public void setmedicalReport() {
	  medicalReport="Approved to drive private car";
  }
  public void deduct(int p) {
	  // it will check any negative points will carry
	  if(points>=p) {
		  points+=p;
	  }
	  else if(points<=p) {
		  points-=p;
	  }
	  else {
		  points=0;
	  }
	  
	 if(points==0) {
		  System.out.println(name+" License Suspended");
	  }
  }

}
