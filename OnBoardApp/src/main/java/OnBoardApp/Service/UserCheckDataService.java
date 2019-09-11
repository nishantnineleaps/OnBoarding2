package OnBoardApp.Service;

import OnBoardApp.Model.UserCheckData;
import OnBoardApp.Repository.UserCheckDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserCheckDataService  {

    @Autowired
    UserCheckDataRepository userCheckDataRepository;

    public void save_data(UserCheckData userCheckData) {
        userCheckDataRepository.save(userCheckData);
    }
}
