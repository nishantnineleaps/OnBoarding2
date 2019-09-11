package OnBoardApp.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="Users")
public class Users implements Serializable {
    @Id
    private String Phone;
    private String Name;
    private Long id;
    private String Gender;
    private String Designation;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="event_name",referencedColumnName = "event_name")
    private Event event_name;

    private String Address;
    private String Otp;
    private String Otp_Expiry;
    private boolean Soft_Delete=false;
    private boolean Profile_Complete=false;

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

    public Event getEvent_name() {
        return event_name;
    }

    public void setEvent_name(Event event_name) {
        this.event_name = event_name;
    }

    @Override
    public String toString() {
        return "Users{" +
                "Phone='" + Phone + '\'' +
                ", Name='" + Name + '\'' +
                ", id=" + id +
                ", Gender='" + Gender + '\'' +
                ", Designation='" + Designation + '\'' +
                ", event_name=" + event_name +
                ", Address='" + Address + '\'' +
                ", Otp='" + Otp + '\'' +
                ", Otp_Expiry='" + Otp_Expiry + '\'' +
                ", Soft_Delete=" + Soft_Delete +
                ", Profile_Complete=" + Profile_Complete +
                '}';
    }
}
