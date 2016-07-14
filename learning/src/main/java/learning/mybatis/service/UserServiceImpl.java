package learning.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import learning.mybatis.domain.Users;
import learning.mybatis.repo.UsersMapper;

@Component
public class UserServiceImpl implements UserService {

	@Autowired
	UsersMapper um;

	public Users selectByPrimaryKey(Integer id) {
		return um.selectByPrimaryKey(id);
	}
}
