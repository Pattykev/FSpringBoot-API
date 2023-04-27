package com.apiRest.api;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
@AutoConfigureMockMvc

//integration test
public class EmployeeControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void testGetEmployees() throws Exception{
        mockMvc.perform(get("/employees"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$[0].firstName", is("Laurent")));
    }

//unit test
/**
 * @WebMvcTest(controllers=EmployeeController.class)
 * 
 * public class EmployeeControllerTest{
 * 
 * @Autowired
 * private MockMvc mockMvc;
 * 
 * @MockBean
 * private EmployeeService employeeService;
 * 
 * public void testGetEmployees() throws Exception{
 * 
 * mockMvc.perform(get("/employees"))
 * .andExpect(status().isOk());
 * }
 * }
 * 
 */
  
}
