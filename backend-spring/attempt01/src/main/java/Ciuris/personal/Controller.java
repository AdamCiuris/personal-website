package Ciuris.personal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    MyRepo repo;
    @PostMapping("/tutorials")
    public ResponseEntity<IpInfo> createTutorial(@RequestBody IpInfo info) {
        try {
            IpInfo ip =
                    repo.save(new IpInfo(
                            info.getIp(),
                            info.getHostname(),
                            info.getCity(),
                            info.getRegion(),
                            info.getCountry(),
                            info.getLoc(),
                            info.getOrg(),
                            info.getPostal(),
                            info.getTimezone()));
            return new ResponseEntity<>(ip, HttpStatus.CREATED);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}