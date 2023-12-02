package ticketservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TicketService {
    @Autowired
    private RestTemplate restTemplate;

  
    public User queryTicketInfo(Long id) {
        
        String url = "http://localhost:8081/getUserInfo/"+ id;
        return restTemplate.getForObject(url, User.class);
    }
}