package company.controller;

import company.entity.Student;
import company.service.StudentService;
import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(StudentController.class)
class StudentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    StudentService studentService;



    @Test
    void getStudent_test() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders
                .get("/student")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content()
                        .json("{\"id\": 0, \"firstName\": \"Mike\", \"lastName\": \"Smith\", \"age\": 20}"))
                .andReturn();
    }

    @Test
    void jsonAssert_test() throws JSONException {
        String expected = "{\"id\": 0, \"firstName\": \"Mike\", \"lastName\": \"Smith\"}";
        String actual = "{\"id\": 0, \"firstName\": \"Mike\", \"lastName\": \"Smith\", \"age\": 20}";

        JSONAssert.assertEquals(expected, actual, false);
    }


    @Test
    void getStudentService_test() throws Exception {

        when(studentService.getStudent()).thenReturn(Arrays.asList(
                new Student("John", "Smith", 20),
                new Student("Tom", "Hanks", 50)
        ));

        mockMvc.perform(MockMvcRequestBuilders
                .get("/service/student")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(content().json(""))
                .andExpect(status().isOk());
    }
}