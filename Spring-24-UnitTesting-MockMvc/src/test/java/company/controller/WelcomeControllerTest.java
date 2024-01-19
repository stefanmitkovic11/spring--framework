package company.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(WelcomeController.class)
class WelcomeControllerTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    void welcome_test() throws Exception {
//        call /welcome endpoint

        RequestBuilder request = MockMvcRequestBuilders
                .get("/welcome")
                .accept(MediaType.APPLICATION_JSON);

        MvcResult mvcResult = mockMvc.perform(request).andReturn();

//        verify status and content "welcome" is returned

        assertEquals(200, mvcResult.getResponse().getStatus());
        assertEquals("welcome", mvcResult.getResponse().getContentAsString());
    }

    @Test
    void welcome2_test() throws Exception {

        RequestBuilder request = MockMvcRequestBuilders
                .get("/welcome")
                .accept(MediaType.APPLICATION_JSON);


        mockMvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("Welcome"))
                .andReturn();
    }


}