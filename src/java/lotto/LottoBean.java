package lotto;

import java.util.ArrayList;
import java.util.Collections;

public class LottoBean {
//  private ArrayList<Integer> szelveny=new ArrayList<>();
  
  public LottoBean() {
//    while(szelveny.size()<5) {
//      int tipp=(int)(Math.random()*90+1);
//      if(!szelveny.contains(tipp))
//        szelveny.add(tipp);
//    }
//    Collections.sort(szelveny);
  }
  
  public String getLotto() {
    ArrayList<Integer> szelveny=new ArrayList<>();
    while(szelveny.size()<5) {
      int tipp=(int)(Math.random()*90+1);
      if(!szelveny.contains(tipp))
        szelveny.add(tipp);
    }
    Collections.sort(szelveny);    
    String s=""+szelveny.get(0);
    for (int i = 1; i < szelveny.size(); i++)
      s+=", "+szelveny.get(i);
    return s;
  }
  
//  public static void main(String[] args) {
//    System.out.println(new LottoBean().getLotto());
//  }
}
