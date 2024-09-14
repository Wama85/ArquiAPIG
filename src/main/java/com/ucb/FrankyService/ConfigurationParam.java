package com.ucb.FrankyService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class ConfigurationParam {

    MessageSource messageSource;
    public  ConfigurationParam(MessageSource messageSource){
        this.messageSource=messageSource;
    }

     String getGreetingMessage(String language){
        Locale locale=new Locale(language);
        return messageSource.getMessage("greetingMessage",null,locale);}
}
