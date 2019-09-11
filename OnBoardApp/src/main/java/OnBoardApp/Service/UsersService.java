package OnBoardApp.Service;

import OnBoardApp.Model.Users;
import OnBoardApp.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UsersService {

    @Autowired
    UsersRepository usersRepository;

    public void save_user(Users users) {
        usersRepository.save(users);
    }
}
