package cn.nancy.test;

/**
 * ö��
 * @author Small
 *
 */
public class TestEnum {
  public static void main(String[] args) {
  	Season s = Season.AUTUMER;
    switch(s){
    case AUTUMER:
    	System.out.println("����");
    	break;
    }
	}
}

enum Season{
	SPING,SUMMER,AUTUMER,WINTER;
}
