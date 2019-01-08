package cn.nancy.dao;

import cn.nancy.pojo.User;

public interface LoginDao {
  User checkLoginDao(String uname,String pwd);
}
