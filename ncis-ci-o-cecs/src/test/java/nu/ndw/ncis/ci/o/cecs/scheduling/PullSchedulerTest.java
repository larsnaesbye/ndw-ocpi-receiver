package nu.ndw.ncis.ci.o.cecs.scheduling;

import nu.ndw.ncis.ci.o.cecs.service.OcpiService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.BDDMockito.then;

@ExtendWith(MockitoExtension.class)
class PullSchedulerTest {

    @InjectMocks
    private PullScheduler pullScheduler;

    @Mock
    private OcpiService service;

    @Test
    void testPullSchedulerCallsOcpiService() {
        pullScheduler.getAndSaveOcpiData();

        then(service).should().getAndSaveOcpiData();
    }
}
