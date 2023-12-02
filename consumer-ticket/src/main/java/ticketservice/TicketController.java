package ticketservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ticketservice.User;
import ticketservice.TicketService;
@RestController
public class TicketController {
  
    @Autowired 
    TicketService ticketService;
 
    @GetMapping(value = "/getTicketInfo/{id}")
    public User queryTicketInfo(@PathVariable("id") Long id) {
        return ticketService.queryTicketInfo(id);
    }
}