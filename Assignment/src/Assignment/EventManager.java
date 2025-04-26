
package Assignment;

import java.util.ArrayList;
import java.util.List;

class EventManager implements EventManagement {
    private List<Event> events;

    public EventManager() {
        events = new ArrayList<>();
    }

    @Override
    public void createEvent(Event event) {
        events.add(event);
        System.out.println("Event created: " + event.getName());
    }

    @Override
    public void updateEvent(Event event) {
    }

    @Override
    public void deleteEvent(Event event) {
        boolean removed = events.remove(event);
        if (removed) {
            System.out.println("Event deleted: " + event.getName());
        } else {
            System.out.println("Event not found: " + event.getName());
        }
    }
}


