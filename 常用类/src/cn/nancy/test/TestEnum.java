package cn.nancy.test;

/**
 * Ã¶¾Ù
 * @author Small
 *
 */
public class TestEnum {
  public static void main(String[] args) {
  	Season s = Season.AUTUMER;
    switch(s){
    case AUTUMER:
    	System.out.println("ÇïÌì");
    	break;
    }
	}
}

enum Season{
	SPING,SUMMER,AUTUMER,WINTER;
}
