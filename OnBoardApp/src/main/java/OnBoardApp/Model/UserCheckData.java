package OnBoardApp.Model;

import javax.persistence.*;
import java.sql.Blob;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name="UserCheckdata")
public class UserCheckData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private boolean enable_attach;
     private String attachment;
    private boolean soft_delete;
    private boolean is_checked;
    private Date issued_at;
    private Date submitted_at;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="Phone",referencedColumnName = "Phone")
    private Users users;
    @ManyToOne
    @JoinColumn(name="item_id",referencedColumnName = "item_id")
    private Item items;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public boolean isSoft_delete() {
        return soft_delete;
    }

    public void setSoft_delete(boolean soft_delete) {
        this.soft_delete = soft_delete;
    }

    public boolean isIs_checked() {
        return is_checked;
    }

    public void setIs_checked(boolean is_checked) {
        this.is_checked = is_checked;
    }

    public Date getIssued_at() {
        return issued_at;
    }

    public void setIssued_at(Date issued_at) {
        this.issued_at = issued_at;
    }

    public Date getSubmitted_at() {
        return submitted_at;
    }

    public void setSubmitted_at(Date submitted_at) {
        this.submitted_at = submitted_at;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Item getItems() {
        return items;
    }

    public void setItems(Item items) {
        this.items = items;
    }
}
