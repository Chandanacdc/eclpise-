package interface_interview;

public class AustralianTraffic implements CentralTraffic,IndianTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic a=new AustralianTraffic();
		IndianTraffic b=new AustralianTraffic();
		AustralianTraffic c=new AustralianTraffic();
		
		a.flushYellow();
		a.greenGo();
		b.redgolf();
		c.just();
	
		
	}
	public void just() {
		System.out.println("Just");
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("GreenGo");
	}

	@Override
	public void redstop() {
		// TODO Auto-generated method stub
		System.out.println("redStop");
	}

	@Override
	public void flushYellow() {
		// TODO Auto-generated method stub
		System.out.println("flushYellow");
	}


	@Override
	public void redgolf() {
		// TODO Auto-generated method stub
		System.out.println("redGolf");
	}

}
