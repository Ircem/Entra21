package Excercicio_doNada;

import java.util.ArrayList;

public class ex_05 {
public static void main(String[] args) {
  ArrayList<Integer> lista = new ArrayList<Integer>();
  lista.add(10);
  lista.add(13);
  lista.add(15);
  lista.add(5);
  lista.add(8);
  lista.add(50);
  int media = 0;
  for(int val : lista) {
	  media += val;
  }
  media /= lista.size();
  
  for(int va : lista) {
	  if(va > media) {
		  System.out.println(va);
	  }
  }
}
}
