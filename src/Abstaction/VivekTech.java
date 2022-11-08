package Abstaction;

public class VivekTech implements ITcompany {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       VivekTech vk= new VivekTech();
       vk.working();
	}

	@Override
	public void working() {
		// TODO Auto-generated method stub
		System.out.println("Vivek is working on Java Project");
	}

}
