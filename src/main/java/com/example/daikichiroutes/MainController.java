package com.example.daikichiroutes;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @RequestMapping("/")
    public String index(){
        return "＼(゜ロ＼)ココハドコ? (／ロ゜)／アタシハダアレ?\n";

    }
    @RequestMapping("/daikichi")
    public String japaneseWelcome(){
        return "いらっしゃい！　（Welcome！）";

    }
    @RequestMapping("/today")
    public String todayFortune(){
        return "Today, you will find luck in all your endeavors.";

    }
    @RequestMapping("/tomorrow")
    public String tomorrowFortune(){
        return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas.";

    }
    @RequestMapping("/daikichi/travel/{location}")
    public String travelThere(@PathVariable("location") String location){
        return "Congratulations!! You will soon travel to " + location + "!";
    }
    @RequestMapping("/daikichi/lotto/{num}")
    public String yourFortune(@PathVariable("num") double num){
        if (Math.floor(Math.abs(num) % 2) == 0){
            return "You will take a grand journey in the near future, but be wary of tempting offers.";
        } else {
            return "You have enjoyed the fruits of your labor, but now is a great time to spend time with family and friends.";
        }
    }

}
