package OnBoardApp.Service;

import OnBoardApp.Model.Event;
import OnBoardApp.Repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    @Autowired
    EventRepository eventRepository;

    public void save_event(Event event) {

        eventRepository.save(event);
    }
}
