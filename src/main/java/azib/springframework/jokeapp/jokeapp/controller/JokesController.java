package azib.springframework.jokeapp.jokeapp.controller;

import azib.springframework.jokeapp.jokeapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    @Autowired
    JokeService jokeService;

    /*
    // Dependency injection using constructor
    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }
*/

    @RequestMapping("/jokes")
    public String chuckJokes(Model model){
        model.addAttribute("jokes", jokeService.getJoke());
        return "chucknorris";
    }
}
