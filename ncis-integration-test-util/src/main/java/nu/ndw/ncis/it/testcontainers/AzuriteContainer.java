package nu.ndw.ncis.it.testcontainers;

import org.testcontainers.containers.GenericContainer;
import org.testcontainers.utility.DockerImageName;

public class AzuriteContainer extends GenericContainer<AzuriteContainer> {

    public AzuriteContainer(DockerImageName dockerImageName) {
        super(dockerImageName);
    }
}
