package com.training.org;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@SpringBootApplication

public class CommandLineRunnerExampleApplication extends SpringBootServletInitializer{
    //    protected final Log logger = LogFactory.getLog(getClass());
    //
    //    @Override
    //    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    //    	System.out.println("SpringBootApplicationBuilder is called");
    //        return application.sources(CommandLineRunnerExampleApplication.class);
    //    }
    //
    //    public static void main(String[] args) {
    //
    //		SpringApplication.run(CommandLineRunnerExampleApplication.class, args);
    //		System.out.println("Main Part of application");
    //	}
    //
    //	@Override
    //	public void run(String... args) throws Exception {
    //		System.out.println("run method ");
    //		logger.info("ApplicationStartupRunner run method Started !!");
    //
    //	}


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        System.out.println("SpringApplicationBuilder is called");
        return application.sources(CommandLineRunnerExampleApplication.class);
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Main is called");
        SpringApplication.run(CommandLineRunnerExampleApplication.class, args);
    }
    @Bean
    public ApplicationStartupRunner schedulerRunner() {
        System.out.println("schedulerRunner is called");
        return new ApplicationStartupRunner();
    }


}


@Order(value=3)
@Component
class ApplicationStartupRunnerOne implements CommandLineRunner {
    protected final Log logger = LogFactory.getLog(getClass());
    @Autowired
    private HelloMessageService helloMessageService;
    @Override
    public void run(String... args) throws Exception {
        System.out.println(helloMessageService.getMessage());
        System.out.println("ApplicationStartupRunnerOne is called");
        logger.info("ApplicationStartupRunnerOne run method Started !!");
    }
}





@Order(value=2)
@Component
class ApplicationStartupRunnerTwo implements CommandLineRunner {
    protected final Log logger = LogFactory.getLog(getClass());
    @Override
    public void run(String... args) throws Exception {


        System.out.println("ApplicationStartupRunnerTwo is called");
        logger.info("ApplicationStartupRunnerTwo run method Started !!");
    }
}














