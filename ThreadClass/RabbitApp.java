package cn.nancy.threadCreate;

public class RabbitApp {
	public static void main(String[] args) {
		//�����������
		Rabbit rabbit = new Rabbit();
		Tortoise tortoise = new Tortoise();
		//����start()��
		rabbit.start();
		tortoise.start();
	}

}
