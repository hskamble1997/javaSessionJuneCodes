package javasessions;

public class Test1 {

	public static void main(String[] args) {
		String[] plugin = {"selectorshub","fullpage"};
		Browsercls obj1 = new Browsercls("chrome",100.01,plugin);
		
		System.out.println(obj1.getName());
		
		System.out.println(obj1.getVersion());
		
		String[] plugin1 = obj1.getPlugin();
		for(int i=0; i<plugin1.length; i++) {
			System.out.println(plugin1[i]);
			
		}
		
		
		obj1.setName("Firefox");
		obj1.setVersion(101.09);
		System.out.println(obj1.getName());
		System.out.println(obj1.getVersion());
		
		
		

	}

}
