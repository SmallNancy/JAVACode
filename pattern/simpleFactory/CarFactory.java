package simpleFactory;

public class CarFactory {//������
    public static Car createCar(String type) {
    	if("�µ�".equals(type)) {
    		return new Audi();
    	}else if("���ǵ�".equals(type)) {
    		return new Byd();
    	}else {
    		return null;
    	}
    }
}
