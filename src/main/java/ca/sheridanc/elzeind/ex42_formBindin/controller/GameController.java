package ca.sheridanc.elzeind.ex42_formBindin.controller;

import ca.sheridanc.elzeind.ex42_formBindin.beans.Game;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Controller
public class GameController {

    List<Game> gameList = new CopyOnWriteArrayList<>();

    @GetMapping("/game")
    public String game(Model model) {
        model.addAttribute("game", new Game());
        model.addAttribute("gameList", gameList);
        return "game";
    }

    @PostMapping("/addGame")
    public String addGame(Model model, @ModelAttribute Game game) {
        gameList.add(game);
        model.addAttribute("game", new Game());
        model.addAttribute("gameList", gameList);
        return "game";
    }
}
