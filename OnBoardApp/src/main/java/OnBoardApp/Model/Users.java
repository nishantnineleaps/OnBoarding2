package OnBoardApp.Model;

import javax.persistence.*;

@Entity
@Table(name="Users")
public class Users {
    @Id
    private String Phone;
    private String Name;
    private Long id;
    private String Gender;
    private String Designation;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="event_id",referencedColumnName = "event_id")
    private Event event;
    private String Address;
    private String Otp;
    private String Otp_Expiry;
    private boolean Soft_Delete;
    private boolean Profile_Complete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }


    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getOtp() {
        return Otp;
    }

    public void setOtp(String otp) {
        Otp = otp;
    }

    public String getOtp_Expiry() {
        return Otp_Expiry;
    }

    public void setOtp_Expiry(String otp_Expiry) {
        Otp_Expiry = otp_Expiry;
    }

    public boolean isSoft_Delete() {
        return Soft_Delete;
    }

    public void setSoft_Delete(boolean soft_Delete) {
        Soft_Delete = soft_Delete;
    }

    public boolean isProfile_Complete() {
        return Profile_Complete;
    }

    public void setProfile_Complete(boolean profile_Complete) {
        Profile_Complete = profile_Complete;
    }
}
