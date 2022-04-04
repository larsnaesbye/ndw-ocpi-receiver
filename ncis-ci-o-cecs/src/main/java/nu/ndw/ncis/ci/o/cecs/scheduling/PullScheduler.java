package nu.ndw.ncis.ci.o.cecs.scheduling;

import lombok.AllArgsConstructor;
import nu.ndw.ncis.ci.o.cecs.service.OcpiService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PullScheduler {

    private final OcpiService ocpiService;

    @Scheduled(cron = "${scheduling.cron-schedule}")
    public void getAndSaveOcpiData() {
        ocpiService.getAndSaveOcpiData();
    }
}
