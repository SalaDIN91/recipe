package com.saladin.demo.controllers;

import com.saladin.demo.services.RecipeService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.eq;

public class IndexControllerTest {

    @Mock
    RecipeService recipeService;

    @Mock
    Model model;

    IndexController controller;

    @Before
   public void setUp() throws Exception{
       MockitoAnnotations.initMocks(this);

       controller = new IndexController(recipeService);
   }


    @Test
    public void getIndexPage() {
        String viewName = controller.getIndexPage(model);
        assertEquals("index", viewName);
        Mockito.verify(recipeService, Mockito.times(1)).getRecipes();
        Mockito.verify(model, Mockito.times(1)).addAttribute(eq("recipes"), Mockito.anySet());
    }
}