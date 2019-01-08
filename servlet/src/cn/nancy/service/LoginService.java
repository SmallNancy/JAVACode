package cn.nancy.service;

import cn.nancy.pojo.User;

public interface LoginService {
  User checkLoginService(String uname,String pwd);
}
