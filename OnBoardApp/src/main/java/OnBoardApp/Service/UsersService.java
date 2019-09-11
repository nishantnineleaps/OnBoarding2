package OnBoardApp.Service;

import OnBoardApp.Interfaces.Profiles;
import OnBoardApp.Model.Users;
import OnBoardApp.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UsersService {

    @Autowired
    UsersRepository usersRepository;

    public void save_user(Users users) {
        usersRepository.save(users);
    }

    public List<Profiles> ProfileInComplete(){

        return usersRepository.getIncompleteProfiles();

    }
    public List<Profiles> ProfileComplete(){

        return usersRepository.getCompleteProfiles();

    }
}
