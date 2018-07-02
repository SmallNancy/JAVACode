package simpleFactory;

public class CarFactory {//创建者
    public static Car createCar(String type) {
    	if("奥迪".equals(type)) {
    		return new Audi();
    	}else if("比亚迪".equals(type)) {
    		return new Byd();
    	}else {
    		return null;
    	}
    }
}
