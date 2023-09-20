package drivinglicense;

public class CommercialDriver extends GenericDriver {
    private String hazardousMaterialsType;
    private String carType;
	private int points;
	private String name;

    public CommercialDriver(String name, boolean provisional, String materialType, String car) {
        super(name, provisional);
        this.name=name;
        points=15;
        hazardousMaterialsType = materialType;
        carType = car;
    }
  
     
    public String getMaterialsType() {
        return hazardousMaterialsType;
    }
    public int getPoints() {
		return points;
	}
    
    public void setmedicalReport() {
        medicalReport = "Approved to drive " + carType;
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
