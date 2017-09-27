package test.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import test.example.demo.controller.RobotController;
import test.example.demo.service.RobotService;


@EnableSpringDataWebSupport
@RunWith(SpringRunner.class)
@WebMvcTest(RobotController.class)
public class RobotControllerTest {

	/** The mvc. */
	@Autowired
	private MockMvc mvc;

	/** The dev team service. */
	@MockBean
	private RobotService robotService;

	@Test
	public void should_not_have_access_to_save_robot() throws Exception {
		mvc.perform(get("/robot")).andExpect(status().isUnauthorized());
	}

}
