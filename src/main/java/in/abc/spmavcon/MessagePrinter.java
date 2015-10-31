/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.abc.spmavcon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Prajapati
 */

@Component
public class MessagePrinter {
    private final MessageService service;
    @Autowired
    public MessagePrinter(MessageService service) {
        this.service = service;
    }
    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}
