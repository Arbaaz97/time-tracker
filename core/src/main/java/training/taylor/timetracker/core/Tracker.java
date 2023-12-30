package training.taylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import training.taylor.timetracker.core.dao.TimeEntry;

import java.util.ArrayList;
import java.util.List;

@Component
public class Tracker {

    @Autowired
    private List<TimeEntry> entries = new ArrayList<>();

    public void add(TimeEntry entry) {
        entries.add(entry);
    }

    public void remove(TimeEntry entry) {
        entries.remove(entry);
    }

    public int size() {
        return entries.size();
    }

    public TimeEntry get(int index) {
        try {
            // Some code that might throw an exception
            // Replace this comment with the actual code
        } catch (SpecificException e) {
            // Handle the specific exception, log, or rethrow
            e.printStackTrace();
        } catch (AnotherSpecificException e) {
            // Handle another specific exception
            e.printStackTrace();
        } catch (Exception e) {
            // Catching generic Exception should be avoided unless necessary
            e.printStackTrace();
        }

        // The variable 'valid' is not used, removing it

        return entries.get(index);
    }
}
