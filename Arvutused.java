import java.util.Scanner;
import java.util.InputMismatchException;
public class Arvutused{
	public static void main(String[] arg){
		//Loendaja abiline=new LihtneLoendaja();
		System.out.println("Vali kas liida(1) v6i korruta(2)");
		Scanner in = new Scanner(System.in);
		Integer num = in.nextInt();

		if (num.equals(1)){
			System.out.println("Sisesta number ja vajuta enter, vastuse jaoks kirjuta vastus");
			Kalkulaator esimene=new Summa();
				try {
				esimene.arvuta();
				}
				catch (InputMismatchException e) {
						System.out.println(esimene.vastus());
						return;
				}
		}
		else{
			System.out.println("Sisesta number ja vajuta enter, vastuse jaoks kirjuta vastus");
			Kalkulaator esimene=new Korrutis();
				try {
					esimene.arvuta();
				}
				catch (InputMismatchException e) {
						System.out.println(esimene.vastus());
						return;
				}
		}
	}
}
