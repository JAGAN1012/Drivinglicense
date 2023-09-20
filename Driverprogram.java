package drivinglicense;

public class Driverprogram {
	public static void main(String []args) {
		GenericDriver tom=new GenericDriver("Tom",true);
		tom.deduct(-25);
		tom.setmedicalReport();
		GenericDriver lily= new CommercialDriver("lily",false,"crackers truck","container");
		lily.deduct(-15);
		lily.setmedicalReport();
		GenericDriver[] arr=new GenericDriver[2];
		arr[0]=tom;
		arr[1]=lily;
		for(int i=0;i<arr.length;i++) {
			System.out.println("Name: "+arr[i].getName());
			   System.out.println("If " +arr[i].getName()+" liscence is provisional: "+
		  arr[i].getProvisional());
			System.out.println(arr[i].getName()+ " has "+
					  arr[i].getPoints()+" points");
			System.out.println(arr[i].getName()+ " has "+
					  arr[i].getmedicalReport());
		}
		System.out.print("hazardousMaterialsType:"+((CommercialDriver) lily).getMaterialsType());
	}

}
