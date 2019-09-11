package OnBoardApp.Repository;

import OnBoardApp.Model.UserCheckData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserCheckDataRepository extends JpaRepository<UserCheckData,Long> {

    @Query(value = "select count(*) from user_checkdata where status='public' and phone=?1 ",nativeQuery = true)
    int getNamesPhones(String phone);


    @Query(value = "select count(*) from user_checkdata where status='public' and phone=?1 and is_checked=1",nativeQuery = true)
    int getCompletePhones(String phone);

}
