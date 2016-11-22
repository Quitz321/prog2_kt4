import java.util.*;
public class Ajad implements Loendaja{
  List<Date> ajad = new ArrayList<Date>();
  public void loenda(){
    ajad.add(new Date());

  }
  public int kogus(){
    return ajad.size();
  }
  public String toString(){
    return ajad.toString();
  }
}
