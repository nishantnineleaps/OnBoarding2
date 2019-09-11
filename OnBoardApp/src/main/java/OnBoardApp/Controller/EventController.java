package OnBoardApp.Controller;

import OnBoardApp.Model.Event;
import OnBoardApp.Repository.EventRepository;
import OnBoardApp.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/batch")

public class EventController {

    @Autowired
    EventService eventService;

    @PostMapping("/save")
    public String save_event(@RequestBody Event event){
      eventService.save_event(event);
      return  "Saved";
    }
}
