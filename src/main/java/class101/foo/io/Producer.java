package class101.foo.io;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendTo(String message) {
        this.rabbitTemplate.convertAndSend("CREATE_POST_QUEUE", message);
    }
}
