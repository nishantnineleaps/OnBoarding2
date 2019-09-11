package OnBoardApp.Model;

import javax.persistence.*;
import java.sql.Blob;
import java.util.Set;

@Entity

public class ChecklistData {

    @Id
    private Long id;
    private String status;
    private boolean enable_attach;
    private String upload;
    private String download;
    private String item_value;
    private boolean is_checked=false;
    private boolean soft_delete=false;
    @ManyToOne
    @JoinColumn(name="item_id",referencedColumnName = "item_id")
    private Item items;
    @ManyToOne
    @JoinColumn(name="checklist_name",referencedColumnName = "checklist_name")
    private Checklist checklist;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Checklist getChecklist() {
        return checklist;
    }

    public void setChecklist(Checklist checklist) {
        this.checklist = checklist;
    }

    public boolean isIs_checked() {
        return is_checked;
    }

    public void setIs_checked(boolean is_checked) {
        this.is_checked = is_checked;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isEnable_attach() {
        return enable_attach;
    }

    public void setEnable_attach(boolean enable_attach) {
        this.enable_attach = enable_attach;
    }

    public String getUpload() {
        return upload;
    }

    public void setUpload(String upload) {
        this.upload = upload;
    }

    public String getDownload() {
        return download;
    }

    public void setDownload(String download) {
        this.download = download;
    }

    public String getItem_value() {
        return item_value;
    }

    public void setItem_value(String item_value) {
        this.item_value = item_value;
    }



    public boolean isSoft_delete() {
        return soft_delete;
    }

    public void setSoft_delete(boolean soft_delete) {
        this.soft_delete = soft_delete;
    }


    public Item getItems() {
        return items;
    }

    public void setItems(Item items) {
        this.items = items;
    }
}
