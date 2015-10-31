/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.abc.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Prajapati
 */
@Configuration
@ComponentScan
public class Application {

    @Bean
    public AccountDao accountDao() {
        return new AccountDaoInMemoryImpl();
    }

    @Bean
    public AccountService accountService() {
        return new AccountServiceImpl(accountDao());
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        AccountService service =  context.getBean("accountService",AccountService.class);

        System.out.println("Before transaction");
        System.out.println(service.getAccount(1).getBalance());
        System.out.println(service.getAccount(2).getBalance());
        service.transferMoney(1, 2, 10);
        System.out.println("After transaction");
        System.out.println(service.getAccount(1).getBalance());
        System.out.println(service.getAccount(2).getBalance());
    }
}
