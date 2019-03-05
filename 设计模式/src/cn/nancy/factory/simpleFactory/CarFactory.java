package cn.nancy.factory.simpleFactory;

public class CarFactory {
  public static Car createBYQ() {
  	return new BYQ();
  }
  
  public static Car createBaoMa() {
  	return new BaoMa();
  }
}
