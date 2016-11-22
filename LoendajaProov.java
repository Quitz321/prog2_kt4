import java.io.*;
public class LoendajaProov{
  public static void main(String[] arg) throws IOException{
    Loendaja abiline=new Aejad();
    BufferedReader klaver = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Vajuta entereid, lopetamiseks 'valmis'");
    String rida = klaver.readLine();
    while(!rida.equals("valmis")){
      abiline.loenda();
      System.out.println(abiline.kogus());
      rida=klaver.readLine();
    }
    System.out.println(abiline);
  }
}
