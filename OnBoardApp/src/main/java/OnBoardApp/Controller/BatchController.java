package OnBoardApp.Controller;

import OnBoardApp.Model.Batch;
import OnBoardApp.Repository.BatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/batch")

public class BatchController {

    @Autowired
    BatchRepository batchRepository;

    @PostMapping("/save")
    public void save_batch(@RequestBody Batch batch){
        System.out.println("aagaya");
      batchRepository.save(batch);
    }
}
