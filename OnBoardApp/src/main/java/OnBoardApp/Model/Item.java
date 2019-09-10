package OnBoardApp.Model;

import javax.persistence.*;
import java.sql.Blob;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long item_id;
    private String items;
    private String status;
    private boolean enable_attach;

    private String  file_attach;


    public Long getItem_id() {
        return item_id;
    }

    public void setItem_id(Long item_id) {
        this.item_id = item_id;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
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

    public String getFile_attach() {
        return file_attach;
    }

    public void setFile_attach(String file_attach) {
        this.file_attach = file_attach;
    }
}
