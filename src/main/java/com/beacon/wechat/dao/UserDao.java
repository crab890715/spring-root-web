package com.beacon.wechat.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.beacon.wechat.model.User;

public interface UserDao {
	@Select("SELECT * FROM t_user WHERE id = #{id}")
	User get(@Param("id") Long id);
}
