
public class MyClassD
{
	private int no;
	private String name;
	private String address;
	public void setNo(int no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "MyClassD [no=" + no + ", name=" + name + ", address=" + address + "]";
	}
	
	public static void main(String[] args)
	{
		MyClassD myc=new MyClassD();
		myc.setNo(125);
		myc.setName("kamal");
		myc.setAddress("HYd");
		System.out.println(myc);
		System.out.println(myc.getClass().getCanonicalName());
		
		
	}
}
