package com.skooch.dao;

import com.skooch.domain.User;
import org.apache.ibatis.annotations.Insert;

public interface UserDao {
    
    @Insert("insert into tbl_user (name, age) values (#{name}, #{age});")
    public void save(User user);
}
