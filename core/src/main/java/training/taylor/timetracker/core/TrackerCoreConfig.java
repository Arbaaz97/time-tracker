package training.taylor.timetracker.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class TrackerCoreConfig {

    @Bean
    public List<TimeEntry> timeEntries() {
        return new ArrayList<>();
    }
}
