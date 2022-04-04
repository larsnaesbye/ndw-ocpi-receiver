package nu.ndw.ncis.ci.o.cecs.it.rabbitmq;

import lombok.Getter;
import org.springframework.amqp.core.Message;

import java.util.ArrayList;
import java.util.List;

@Getter
public abstract class AbstractReceiver {
    protected final List<String> receivedFileNames = new ArrayList<>();

    public abstract void listen(Message message);

    public void reset() {
        receivedFileNames.clear();
    }

    public int getNumberOfReceivedMessages() {
        return receivedFileNames.size();
    }

}
