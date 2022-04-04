package nu.ndw.ncis.ci.o.cecs.it.rabbitmq;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("it")
public class ITStatusPublicationReceiver extends AbstractReceiver {

    @Override
    @RabbitListener(queues = "${it.rabbitmq.status-publication-queue}")
    public void listen(Message message) {
        byte[] bytes = message.getBody();
        String fileName = new String(bytes);
        receivedFileNames.add(fileName);
    }
}