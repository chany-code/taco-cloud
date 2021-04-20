package tacos;

//import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(HomeController.class)
public class HomeControllerTest {

	@Autowired
	private MockMvc mockMvc;//MockMvc를 주입한다 
	
	@Test
	public void testHomePage() throws Exception {
		mockMvc.perform(get("/"))
			.andExpect(status().isOk())//HTTP 200
			.andExpect(view().name("home"))//home 뷰가 있어야 
			.andExpect(content().string(containsString("Welcome to...")));
		
//		fail("Not yet implemented");
	}

}
