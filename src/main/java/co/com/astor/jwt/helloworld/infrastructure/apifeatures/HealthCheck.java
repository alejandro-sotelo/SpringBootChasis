package co.com.astor.jwt.helloworld.infrastructure.apifeatures;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class HealthCheck implements HealthIndicator {

    @Override
    public Health health(){
        //return Health.outOfService().build();
        return Health.up().build();
    }
}
