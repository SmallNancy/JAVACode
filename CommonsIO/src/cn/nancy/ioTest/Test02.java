package cn.nancy.ioTest;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

public class Test02 {
	public static void main(String[] args) {
		try {
			FileUtils.copyFile(new File("a.png"), new File("acopy.png"));
			String url = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1549953139913&di=6794598f93917ebcc5066d6f0d9dabcb&imgtype=jpg&src=http%3A%2F%2Fimg2.imgtn.bdimg.com%2Fit%2Fu%3D3806610977%2C3560646154%26fm%3D214%26gp%3D0.jpg";
			FileUtils.copyURLToFile(new URL(url), new File("co.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
