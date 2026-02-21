
public class TestInterface1 implements TestInterface {
	public int a(int a) {
		System.out.println("a");
		return 0;
	}

	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("Print something I'm void");
		
	}

	@Override
	public int b() {
		// TODO Auto-generated method stub
		int a= 5+1;
		return a;
	}

	
	public static void main(String args[]) {
		
		TestInterface1 t = new TestInterface1();
		t.a();
	int z= 	t.b();
	System.out.println(z);
		
	}
}
