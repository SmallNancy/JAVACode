package cn.nancy.IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class DataTest {
	public static void main(String[] args) throws IOException {
		//Ð´³ö
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(bos);
			dos.writeUTF("ÄãºÃ£¬2019");
			dos.writeBoolean(true);
			dos.writeChar('a');
		byte[] datas = bos.toByteArray();
		//¶ÁÈ¡
		DataInputStream dis = new DataInputStream(new ByteArrayInputStream(datas));
		String str = dis.readUTF();
		System.out.println(str);
	}

}
