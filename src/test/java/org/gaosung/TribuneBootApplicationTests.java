package org.gaosung;

import org.gaosung.dao.UserDAO;
import org.gaosung.dao.po.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
//相当于  --spring.profiles.active=dev
//@ActiveProfiles(value="dev")
public class TribuneBootApplicationTests {

	@Autowired
	private UserDAO userDAO;

	@Test
	public void testInsert(){
		User user = new User();
		user.setName("张三");
		user.setAge((byte)23);
		userDAO.insert(user);
		System.out.println("插入用户信息"+user.getName());
	}

}
