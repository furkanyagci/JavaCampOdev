package methods1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sayiBulmaca();
	}
		
	public static void sayiBulmaca() {
		int[] sayilar = new int[] {1,2,3,4,5};
		int aranacak =5;
		boolean varMi =false;
		
		for (int sayi : sayilar) {
			if(sayi==aranacak) {
				varMi=true;
				break;
			}
		}
		
		if (varMi) {
			mesajVer("Say� mevcuttur : " + aranacak);
		} else {
			mesajVer("Say� mevcut de�il" + aranacak);
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
	
}
