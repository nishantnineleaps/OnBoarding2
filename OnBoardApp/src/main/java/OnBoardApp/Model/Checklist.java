package OnBoardApp.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Checklist {

    @Id
    private String checklist_name;
    private boolean enable_attach;

    public String getChecklist_name() {
        return checklist_name;
    }

    public void setChecklist_name(String checklist_name) {
        this.checklist_name = checklist_name;
    }

    public boolean isEnable_attach() {
        return enable_attach;
    }

    public void setEnable_attach(boolean enable_attach) {
        this.enable_attach = enable_attach;
    }
}
