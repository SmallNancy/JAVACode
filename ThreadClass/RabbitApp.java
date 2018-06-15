package cn.nancy.threadCreate;

public class RabbitApp {
	public static void main(String[] args) {
		//创建子类对象
		Rabbit rabbit = new Rabbit();
		Tortoise tortoise = new Tortoise();
		//调用start()；
		rabbit.start();
		tortoise.start();
	}

}
