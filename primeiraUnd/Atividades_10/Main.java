package primeiraUnd.Atividades_10;

public class Main {

	public static void main(String[] args) {

		Smartphone s1 = new Smartphone("Samsung", "Galaxy S21");
		Smartphone s2 = new Smartphone("Samsung", "Galaxy Z Flip");
		Smartphone s3 = new Smartphone("Apple", "iPhone 16e");
		Smartphone s4 = new Smartphone("Apple", "iPhone XR");
		
		SmartTV t1 = new SmartTV("LG", 55);
		SmartTV t2 = new SmartTV("Samsung", 70);
		SmartTV t3 = new SmartTV("Toshiba", 65);
		
		ControleRemoto.controlarDispositivo(s1);
		System.out.println("---------");
		ControleRemoto.controlarDispositivo(s2);
		System.out.println("---------");
		ControleRemoto.controlarDispositivo(s3);
		System.out.println("---------");
		ControleRemoto.controlarDispositivo(s4);
		System.out.println("---------");
		
		System.out.println("--- Controlando SmartTV ---");
		ControleRemoto.controlarDispositivo(t1);
		System.out.println("---------");
		ControleRemoto.controlarDispositivo(t2);
		System.out.println("---------");
		ControleRemoto.controlarDispositivo(t3);
	}

}
