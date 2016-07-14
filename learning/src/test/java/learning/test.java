package learning;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import learning.mybatis.repo.UsersMapper;

public class test {

	@Autowired
	UsersMapper um;

	@Test
	public void test() {
		System.out.println(um.selectByPrimaryKey(1));
	}

}
