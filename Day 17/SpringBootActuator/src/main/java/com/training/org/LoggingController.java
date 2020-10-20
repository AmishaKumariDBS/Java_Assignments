package com.training.org;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoggingController {

    Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @RequestMapping("/")
    public String index() {
        logger.trace("This is a TRACE message.");
        logger.debug("This is a DEBUG message.");
        logger.info("This is an INFO message.");
        logger.warn("This is a WARN message.");
        logger.error("You guessed it, an ERROR message.");

        return "Welcome to Spring Logging! Check the console to see the log messages.";
    }
    @RequestMapping("/greeting")
    public ModelAndView welcome(){
        System.out.println("------");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Greeting.html");
        return modelAndView;
    }
    @GetMapping (value="/welcome", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String welcomeAsHTML(){
        return "<html>\n" + "<header><title></header>\n"+"<body>\n"+ "HELLO \n"+ "</body>\n"+"</html";
    }
}


