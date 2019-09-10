package OnBoardApp.Model;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Batch {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Batch_id;
    private String batch_name;
    private Date Doj;


    public Long getBatch_id() {
        return Batch_id;
    }

    public void setBatch_id(Long batch_id) {
        Batch_id = batch_id;
    }

    public String getBatch_name() {
        return batch_name;
    }

    public void setBatch_name(String batch_name) {
        this.batch_name = batch_name;
    }

   public Date getDoj() {
        return Doj;
    }

    public void setDoj(Date doj) {
        Doj = doj;
    }


}
