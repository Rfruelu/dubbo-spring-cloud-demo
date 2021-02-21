package com.lujia.lesson;

import com.lujia.lesson.dubbo.ILoginService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {


        ApplicationContext
                 applicationContext=new ClassPathXmlApplicationContext("classpath:/META-INF/spring/application.xml");
        ILoginService loginService=(ILoginService)applicationContext.getBean("loginService");

        System.out.println( loginService.login("admin","123456") );
    }
}
