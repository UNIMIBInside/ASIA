package it.unimib.disco.asia.cucumber.stepdefs;

import it.unimib.disco.asia.AsiaApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = AsiaApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
