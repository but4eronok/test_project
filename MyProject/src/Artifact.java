
public class Artifact {
	int number;
	String culture;
	int century;
	
	public Artifact (int number) {
		this.number = number;
	}
	
	public Artifact (int number, String culture) {
		this.number = number;
		this.culture = culture;
	}
	public Artifact (int number, String culture, int century) {
		this.number = number;
		this.culture = culture;
		this.century = century;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Artifact stone = new Artifact(123578);
	Artifact spear = new Artifact(122456, "Indian");
	Artifact bone = new Artifact(148364, "Russian", 16);
	System.out.println(bone.number);
	System.out.println(spear.culture);
	
	
	}

}
