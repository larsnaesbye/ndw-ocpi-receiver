package nu.ndw.ncis.ci.o.cecs.it;

import lombok.AllArgsConstructor;
import nu.ndw.ncis.ci.o.cecs.scheduling.PullScheduler;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ActiveProfiles;

@Component
@ActiveProfiles("it")
@AllArgsConstructor
public class PullSchedulerTrigger {
    private final PullScheduler pullScheduler;

    public void triggerPullScheduler() {
        pullScheduler.getAndSaveOcpiData();
    }
}
