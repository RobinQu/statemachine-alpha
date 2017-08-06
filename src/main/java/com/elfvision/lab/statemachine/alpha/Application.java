package com.elfvision.lab.statemachine.alpha;

import com.elfvision.lab.statemachine.alpha.model.Events;
import com.elfvision.lab.statemachine.alpha.model.States;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.statemachine.StateMachine;

/**
 * @author long.qul
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private StateMachine<States, Events> stateMachine;

    @Override
    public void run(String... strings) throws Exception {
        stateMachine.sendEvent(Events.E1);
        stateMachine.sendEvent(Events.E2);
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
