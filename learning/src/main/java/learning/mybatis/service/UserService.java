package learning.mybatis.service;

import learning.mybatis.domain.Users;

public interface UserService {
	Users selectByPrimaryKey(Integer id);
}
