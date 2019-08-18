package mySql.day06.AnLi;

import com.alibaba.druid.pool.DruidDataSource;
import mySql.day06.DruidUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {
    JdbcTemplate jdbcTemplate = new JdbcTemplate(DruidUtils.getDataSource());

    //保存用户到数据库
    public int saveUser(User user){
        try{
            return jdbcTemplate.update("insert into user (uname,upasswd) values (?,?);",
                    user.getUname(),user.getUpasswd());
        }catch (Exception e){
            e.printStackTrace();
            //throw new RuntimeException(e);
            return 0;
        }
    }

    //从数据库查询是否有相同的记录
    public User findUser(String uname){
        try{
            //因为queryForObject如果没有找到数据不是返回null,而是抛出异常
            //所以捕获异常，返回null
            String sql = "select * from user where uname = ?";
            return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<User>(User.class),uname);
        }catch (Exception e){

            return null;
        }

    }



}
