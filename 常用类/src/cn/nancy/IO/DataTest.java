package cn.nancy.IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class DataTest {
	public static void main(String[] args) throws IOException {
		//д��
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(bos);
			dos.writeUTF("��ã�2019");
			dos.writeBoolean(true);
			dos.writeChar('a');
		byte[] datas = bos.toByteArray();
		//��ȡ
		DataInputStream dis = new DataInputStream(new ByteArrayInputStream(datas));
		String str = dis.readUTF();
		System.out.println(str);
	}

}
