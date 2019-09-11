package OnBoardApp.Service;

import OnBoardApp.Model.UserCheckData;
import OnBoardApp.Repository.UserCheckDataRepository;
import OnBoardApp.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class UserCheckDataService  {

    @Autowired
    UserCheckDataRepository userCheckDataRepository;
    @Autowired
    UsersRepository usersRepository;

    public void save_data(UserCheckData userCheckData) {
        userCheckDataRepository.save(userCheckData);
    }

    public HashMap ProfileComplete(){
        HashMap<String, Integer> map = new HashMap<>();
        int count=0;
        int profilecount=0;
        List<String> phones=new ArrayList<String>();
        //List phones = new ArrayList();
        phones =usersRepository.getPhones();
        System.out.println(phones);
        for(int i=0;i<phones.size();i++)
        {

            int a=userCheckDataRepository.getNamesPhones(phones.get(i));
            System.out.println(a);
            int b=userCheckDataRepository.getCompletePhones(phones.get(i));
            System.out.println(b);
            if(a==b && a!=0){
                usersRepository.UpdateProfile(phones.get(i));
                count++;
            }
            else{
                usersRepository.UpdateProfileToNull(phones.get(i));
            }
        }
        map.put("Complete",count);
        map.put("Incomplete",(phones.size()-count));
        return map;
    }





}
