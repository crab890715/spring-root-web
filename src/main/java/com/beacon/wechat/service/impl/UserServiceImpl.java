/**  
 * @Title: UserService.java
 * @Prject: InternalService
 * @Package: io.springcat.internal.service.impl
 * @Description: TODO
 * @author: adampeng  
 * @date: 2015年2月26日 下午2:35:32
 * @version: V1.0  
 */
package com.beacon.wechat.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.beacon.wechat.dao.UserDao;
import com.beacon.wechat.model.User;
import com.beacon.wechat.service.UserService;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @author: adampeng
 * @date: 2015年2月26日 下午2:35:32
 */
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDAO;

	@Override
	public User findUserById(Long id) {
		return userDAO.get(id);
	}
	
	

}
