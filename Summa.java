import java.util.*;
import java.util.Scanner;
public class Summa implements Kalkulaator{


	List<Integer> arvud=new ArrayList<Integer>();


	public void arvuta(){
		Scanner in = new Scanner(System.in);
		Integer num = in.nextInt();
		while(!num.equals("vastus")){
		arvud.add(num);
		num = in.nextInt();
		}
	}
	public int vastus(){
		int i;
		int sum = 0;
		for(i = 0; i < arvud.size(); i++)
    sum += arvud.get(i);
		return sum;
	}

}
