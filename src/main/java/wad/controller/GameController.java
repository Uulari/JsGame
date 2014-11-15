
package wad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping (value = "*") //lisää polku
public class GameController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String view(Model model){
        
        model.addAttribute("greeting", "Do you want to play a game?");
        //add here the returning of the game instance (?) and the view
      
        return "lol";
    }
    
    
   
    
}
