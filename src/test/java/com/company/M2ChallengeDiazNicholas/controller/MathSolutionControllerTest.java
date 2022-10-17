package com.company.M2ChallengeDiazNicholas.controller;

import com.company.M2ChallengeDiazNicholas.models.MathSolution;
import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.Before;
import org.junit.Test;

import org.junit.platform.commons.annotation.Testable;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



@RunWith(SpringRunner.class)
@WebMvcTest(MathSolutionController.class)
public class MathSolutionControllerTest {
    @Autowired
    private MockMvc mockMvc;


    private ObjectMapper mapper = new ObjectMapper();


    @Test
    public void shouldReturnSuccessfulResponseAfterEnteringValidNumbersToAdd() throws Exception {
        MathSolution inputMath = new MathSolution();
        inputMath.setOperand1(1);
        inputMath.setOperand2(2);

        String inputJson = mapper.writeValueAsString(inputMath);

        MathSolution outputMath = new MathSolution();
        outputMath.setOperand1(1);
        outputMath.setOperand2(2);
        outputMath.setOperation("add");
        Integer answer = (3);
        outputMath.setAnswer(answer);
//    outputMath.setAnswer(outputMath.getOperand1() + outputMath.getOperand2());

        String outputJson = mapper.writeValueAsString(outputMath);

        mockMvc.perform(post("/add")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(outputJson));
    }
    @Test
<<<<<<< HEAD
=======
    public void shouldReturn422Response() throws Exception {
        MathSolution inputMath = new MathSolution();
        inputMath.setOperand1(1);
        inputMath.setOperand2(2);

        String inputJson = mapper.writeValueAsString(inputMath);

        MathSolution outputMath = new MathSolution();
        outputMath.setOperand1(1);
        outputMath.setOperand2(2);
        outputMath.setOperation("add");
        Integer answer = (3);
        outputMath.setAnswer(answer);
//    outputMath.setAnswer(outputMath.getOperand1() + outputMath.getOperand2());

        String outputJson = mapper.writeValueAsString(outputMath);

        mockMvc.perform(post("/add")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(outputJson));
    }
    @Test
>>>>>>> 9809ad616c547bd5326cc8847b3c8703533c1b1d
    public void shouldReturn422StatusCodeIfOperandIsNotThere() throws Exception{
        //Arrange
        MathSolution inputObject = new MathSolution();
        String inputJson = mapper.writeValueAsString(inputObject);

        //Act
        mockMvc.perform(
                        post("/add")
                                .content(inputJson)
<<<<<<< HEAD
                                .contentType(MediaType.APPLICATION_JSON))
=======
                                .contentType(MediaType.APPLICATION_JSON)
                )
>>>>>>> 9809ad616c547bd5326cc8847b3c8703533c1b1d
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());

    }

    @Test
    public void shouldSubtractOperand1andOperand2() throws Exception{
        //Arrange
        MathSolution inputObject = new MathSolution(10, 5);
<<<<<<< HEAD
        String inputJson = mapper.writeValueAsString(inputObject);

        MathSolution outputObject = new MathSolution(10, 5, "subtract", 5);
        String outputJson = mapper.writeValueAsString(outputObject);
=======

        MathSolution outputObject = new MathSolution(10, 5, "subtract", 5);

        //Convert object into Json
        String inputJson = mapper.writeValueAsString(inputObject);

        String outputJson = mapper.writeValueAsString(outputObject);

>>>>>>> 9809ad616c547bd5326cc8847b3c8703533c1b1d
        //Act
        mockMvc.perform(
                        post("/subtract")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(outputJson));
    }
    @Test
    public void ShouldMultiplyOperand1AndOperand2() throws Exception {
        //Arrange
        MathSolution inputObject = new MathSolution(10, 4);
<<<<<<< HEAD
        String inputJson = mapper.writeValueAsString(inputObject);

        MathSolution outputObject = new MathSolution(10, 4,"multiply", 40);
=======

        MathSolution outputObject = new MathSolution(10, 4,"multiply", 40);

        String inputJson = mapper.writeValueAsString(inputObject);

>>>>>>> 9809ad616c547bd5326cc8847b3c8703533c1b1d
        String outputJson = mapper.writeValueAsString(outputObject);

        //Act
        mockMvc.perform(
                        post("/multiply")
                                .content(inputJson)
<<<<<<< HEAD
                                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isCreated()) //Assert
                .andExpect(content().json(outputJson));
=======
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated()) //Assert
                .andExpect(content().json(outputJson));

>>>>>>> 9809ad616c547bd5326cc8847b3c8703533c1b1d
    }

    @Test
    public void ShouldReturn422StatusCodeIfOperandIsNotThereForMultiplyRoute() throws Exception {
        //Arrange
        MathSolution inputObject = new MathSolution();
<<<<<<< HEAD
=======

>>>>>>> 9809ad616c547bd5326cc8847b3c8703533c1b1d
        String inputJson = mapper.writeValueAsString(inputObject);

        //Act
        mockMvc.perform(
                        post("/multiply")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void ShouldDivideOperand1andOperand2() throws Exception{
        //Arrange
        MathSolution inputObject = new MathSolution(6, 2);
<<<<<<< HEAD
        String inputJson = mapper.writeValueAsString(inputObject);

        MathSolution outputObject = new MathSolution(6, 2,"multiply", 3);
        String outputJson = mapper.writeValueAsString(outputObject);
=======

        MathSolution outputObject = new MathSolution(6, 2,"multiply", 3);

        String inputJson = mapper.writeValueAsString(inputObject);

        String outputJson = mapper.writeValueAsString(outputObject);

>>>>>>> 9809ad616c547bd5326cc8847b3c8703533c1b1d
        //Act
        mockMvc.perform(
                        post("/divide")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated()) //Assert
                .andExpect(content().json(outputJson));
<<<<<<< HEAD
=======

>>>>>>> 9809ad616c547bd5326cc8847b3c8703533c1b1d
    }

    @Test
    public void ShouldReturn422StatusCodeIfOperandIsNotThereForDivideRoute() throws Exception {
        //Arrange
        MathSolution inputObject = new MathSolution();
<<<<<<< HEAD
=======

>>>>>>> 9809ad616c547bd5326cc8847b3c8703533c1b1d
        String inputJson = mapper.writeValueAsString(inputObject);

        //Act
        mockMvc.perform(
                        post("/divide")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }
}