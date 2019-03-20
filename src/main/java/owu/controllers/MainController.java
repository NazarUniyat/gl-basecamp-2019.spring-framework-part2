package owu.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import owu.service.Game;
import owu.wire.GameResponse;
import owu.wire.Message;

@RestController
public class MainController {

    @Autowired
    Game game;


    @GetMapping("/{guess}")
    @ResponseBody
    public ResponseEntity<GameResponse> playGame(@PathVariable int guess){
        return ResponseEntity.ok().body(game.play(guess));
    }

    @GetMapping("/")
    @ResponseBody
    public ResponseEntity hello(){
        return ResponseEntity.ok().body(new Message());
    }

}
