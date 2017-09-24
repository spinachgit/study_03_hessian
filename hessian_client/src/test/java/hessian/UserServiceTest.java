package hessian;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.spinach.spring.dto.UserDTO;
import com.spinach.spring.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext-client-test.xml" })
public class UserServiceTest extends TestCase {
	private static final Logger logger=LoggerFactory.getLogger(UserServiceTest.class);
	@Autowired
	@Qualifier("clientUserService")
	private UserService clientUserService;
	
	@Autowired
	@Qualifier("userServiceRemote")
	private UserService userServiceRemote;
	@Override
	protected void setUp() throws Exception {
		
		super.setUp();
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	@Test
	public void getUserTest1() {
		UserDTO result = clientUserService.loadUser(1);
		logger.debug("result = "+JSON.toJSONString(result));
		System.out.println(result);
	}
	@Test
	public void getUserTest2() {
		UserDTO result = userServiceRemote.loadUser(1);
		logger.debug("result = "+JSON.toJSONString(result));
		System.out.println(result);
	}
}
