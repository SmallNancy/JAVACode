package cn.nancy.test;

public class DownLoad extends Thread{
	private String url;
	private String name;
	public DownLoad(String url,String name) {
		this.url = url;
		this.name = name;
	}
  @Override
  public void run() {
  	WebDown wd = new WebDown();
  	wd.downLoad(url, name);
  }
  
  public static void main(String[] args) {
  	DownLoad dt1 = new DownLoad("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1549972720666&di=b75e76af705742da78a742141cb37e8d&imgtype=0&src=http%3A%2F%2Fdn-p-tystore.qbox.me%2Fp%2Fchapter%2Fattachment%2FEt6wetISEA%2FEgfvEBfvegMS4gjsEBAV40uFKheSgb1M8UuPimolfmOW6veke6mg8N2.jpg", "water.jpg");
  	DownLoad dt2 = new DownLoad("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1549972520702&di=3a07db0769050e6ed2a39048fb0435d4&imgtype=0&src=http%3A%2F%2Fimgsrc.baidu.com%2Fimgad%2Fpic%2Fitem%2F503d269759ee3d6dcff622c249166d224f4ade83.jpg", "flower.jpg");
  	DownLoad dt3 = new DownLoad("https://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E7%AB%8B%E5%8D%8E%E5%A5%8F&step_word=&hs=0&pn=1&spn=0&di=167970&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&istype=2&ie=utf-8&oe=utf-8&in=&cl=2&lm=-1&st=-1&cs=2767761220%2C1582306223&os=1881235371%2C2411275272&simid=4137160787%2C552191973&adpicid=0&lpn=0&ln=1443&fr=&fmq=1549962514798_R&fm=result&ic=&s=undefined&hd=&latest=&copyright=&se=&sme=&tab=0&width=&height=&face=undefined&ist=&jit=&cg=&bdtype=0&oriquery=&objurl=http%3A%2F%2Fimg3.duitang.com%2Fuploads%2Fitem%2F201508%2F21%2F20150821110210_WEzSv.jpeg&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3B17tpwg2_z%26e3Bv54AzdH3Fks52AzdH3F%3Ft1%3D99na0m8b0&gsm=0&rpstart=0&rpnum=0&islist=&querylist=&force=undefined","mylove.jpg");
  	dt1.start();
  	dt2.start();
  	dt3.start();
	}
}
