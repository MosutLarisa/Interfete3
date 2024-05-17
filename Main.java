public class Main {

	public static void main(String[] args) {

		Banca bt = new Banca("BT");
		
		ContBancar ba1 = new ContLei("100",500);
		ContBancar ba2 = new ContEuro("300",390);
		ContBancar ba3 = new ContEuro("257",100);
		
		Client c1 = new Client("Larisa","Nufarul");
		Client c2 = new Client("Madalina","Nufarul");
		
		c1.adaugaCont(ba1);
		c1.adaugaCont(ba2);
		c2.adaugaCont(ba3);
		
		bt.adauga(c1);
		bt.adauga(c2);
		
		ba2.transfera(ba1, 500);
		bt.afiseazaInformatiiClient("Larisa");
		bt.afiseazaInformatiiClient("Madalina");
	}

}
