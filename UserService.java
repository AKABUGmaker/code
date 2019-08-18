package mySql.day06.AnLi;

public class UserService {
    private UserDao userDao = new UserDao();

    //注册

    public boolean register(User user) {
        //保存用户信息到数据库
        return userDao.saveUser(user) > 0;
    }

    //判断用户是否存在
    public boolean isExist(String name) {
        return userDao.findUser(name) != null;
    }
}
