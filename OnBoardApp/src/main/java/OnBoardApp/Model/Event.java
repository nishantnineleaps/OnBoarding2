package OnBoardApp.Model;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long event_id;
    private String event_name;
    private Date Doj;


    public Long getEvent_id() {
        return event_id;
    }

    public void setEvent_id(Long event_id) {
        this.event_id = event_id;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public Date getDoj() {
        return Doj;
    }

    public void setDoj(Date doj) {
        Doj = doj;
    }


}
