package ru.stepanoff.score.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
class ScopeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getScopeBySimpleLogin() throws Exception {
        mockMvc.perform(get("/score"))
                .andExpect(status().is2xxSuccessful());
    }

    @Test
    void getScopeByEmptyLogin() throws Exception {
        mockMvc.perform(get("/score/aaaa"))
                .andExpect(status().is4xxClientError());
    }

}