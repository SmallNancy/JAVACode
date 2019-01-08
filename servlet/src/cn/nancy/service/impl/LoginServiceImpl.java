package cn.nancy.service.impl;

import cn.nancy.dao.LoginDao;
import cn.nancy.dao.impl.LoginDaoImp;
import cn.nancy.pojo.User;
import cn.nancy.service.LoginService;

public class LoginServiceImpl implements LoginService{
    LoginDao ld =new LoginDaoImp();
	@Override
	public User checkLoginService(String uname, String pwd) {
		return ld.checkLoginDao(uname, pwd);
	}

}
