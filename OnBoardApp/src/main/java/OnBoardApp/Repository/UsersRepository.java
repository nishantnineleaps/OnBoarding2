package OnBoardApp.Repository;

import OnBoardApp.Interfaces.Profiles;
import OnBoardApp.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface UsersRepository extends JpaRepository<Users,String> {

    @Query(value = "select Phone from users group by phone ",nativeQuery = true)
    List<String> getPhones();

    @Modifying
    @Transactional
    @Query(value="UPDATE users SET profile_complete =1 where phone=?1 ",nativeQuery = true)
    void UpdateProfile(String phone);
    @Modifying
    @Transactional
    @Query(value="UPDATE users SET profile_complete =0 where phone=?1 ",nativeQuery = true)
    void UpdateProfileToNull(String s);

    @Query(value = "select phone,name,id,gender,designation,event_name,address from users where profile_complete=1 ",nativeQuery = true)
    List<Profiles> getCompleteProfiles();


    @Query(value = "select phone,name,id,gender,designation,event_name,address from users where profile_complete=0 ",nativeQuery = true)
    List<Profiles> getIncompleteProfiles();
}
