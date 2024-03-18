package abstract_interview;

public class ChildAircruft extends ParentAircruft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildAircruft c=new ChildAircruft();
		c.green();
		//we can't instanciate abstract class
	//	ParentAircruft cc=new ParentAircruft();
	}

	@Override
	public void green() {
		// TODO Auto-generated method stub
		System.out.println("red color");
	}

}
