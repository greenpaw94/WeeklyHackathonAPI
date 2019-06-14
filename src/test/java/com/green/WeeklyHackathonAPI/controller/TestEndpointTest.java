package com.green.WeeklyHackathonAPI.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class TestEndpointTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void givenAppCanReachEndpoint_ReceiveOkayMessage() throws Exception{
        mvc.perform(get("/test"))
                .andExpect(status().isOk())
                .andExpect(content().string("weekly-hackathon-endpoint is running"));
    }
}
