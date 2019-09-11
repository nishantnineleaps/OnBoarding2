package OnBoardApp.Model;

import javax.persistence.*;
import java.sql.Blob;
import java.util.Set;

@Entity

public class Checklist {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long check_id;
    private String new_item;
    private String status;
    private boolean enable_attach;

    private String attachment;

    private String file_attach;
    private String item_value;
    private boolean is_checked;
    private boolean soft_delete;
    @ManyToOne
    @JoinColumn(name="item_id",referencedColumnName = "item_id")
    private Item items;

    public Long getCheck_id() {
        return check_id;
    }

    public void setCheck_id(Long check_id) {
        this.check_id = check_id;
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

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public String getFile_attach() {
        return file_attach;
    }

    public void setFile_attach(String file_attach) {
        this.file_attach = file_attach;
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

    public String getNew_item() {
        return new_item;
    }

    public void setNew_item(String new_item) {
        this.new_item = new_item;
    }

    public Item getItems() {
        return items;
    }

    public void setItems(Item items) {
        this.items = items;
    }
}
