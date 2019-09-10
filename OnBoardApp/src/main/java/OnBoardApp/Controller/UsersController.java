package OnBoardApp.Controller;

import OnBoardApp.Model.Users;
import OnBoardApp.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")

public class UsersController {

    @Autowired
    UsersRepository usersRepository;

    @PostMapping("/save")
    public void save_user(@RequestBody Users users){
        usersRepository.save(users);

    }
}
