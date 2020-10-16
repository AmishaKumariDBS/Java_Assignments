package com.training.org;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController


@ConfigurationProperties(prefix = "mail")
public class OrgApplication {

    Logger l = LoggerFactory.getLogger(OrgApplication.class);
    private String hostname;
    private int port;
    private String from;
    private List<String> mailCollection;
    private Map<String,String>  additionalHeaders;
    private DatabaseProperties dbProp;

    public Map<String,String> getAdditionalHeaders(){return additionalHeaders;}
    public void setAdditionalHeaders(Map<String, String> additionalHeaders) {
        this.additionalHeaders = additionalHeaders;
    }

    public DatabaseProperties getDbProp() {
        return dbProp;
    }

    public void setDbProp(DatabaseProperties dbProp) {
        this.dbProp = dbProp;
    }

    public List<String> getMailCollection() {
        return mailCollection;
    }

    public void setMailCollection(List<String> mailCollection) {
        this.mailCollection = mailCollection;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public int getPort() {
        return port;
    }
    public void InitBinder(@Value("${init.numbers}"), int []numbers){
        System.out.println(numbers);
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    @GetMapping("/")
    public String getDetails() {

        l.debug("This is debug message");
        l.info("INFO Message");
        l.warn("WARN Message");
        l.error("ERROR");
        l.trace("This is a trace message");
        return " "+ hostname+" "+port+" "+from+" "+mailCollection+dbProp+additionalHeaders;
    }

    public static void main(String[] args) {
        ApplicationContext ctx=SpringApplication.run(OrgApplication.class, args);
        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames){
            System.out.println(beanName);
        }
    }
}
