package nu.ndw.ncis.ci.o.cecs.model;

import eu.datex.energyinfrastructure.EnergyInfrastructureStatusPublication;
import eu.datex.energyinfrastructure.EnergyInfrastructureTablePublication;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class EnergyInfrastructurePublications {
    EnergyInfrastructureTablePublication tablePublication;
    EnergyInfrastructureStatusPublication statusPublication;
}
