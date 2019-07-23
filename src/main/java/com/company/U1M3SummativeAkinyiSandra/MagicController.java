package com.company.U1M3SummativeAkinyiSandra;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class MagicController {
    private List<Magic> magicList;


    public MagicController() {
        this.magicList = new ArrayList<>();


        magicList.add(new Magic ("", "As I see it, yes" ));
        magicList.add(new Magic("", "It is decidedly so" ));
        magicList.add(new Magic("", "Reply hazy, try again" ));
        magicList.add(new Magic("", "Ask again later" ));
        magicList.add(new Magic("","Don't count on it" ));
        magicList.add(new Magic("", "My reply is no" ));
}
    Random rand = new Random();
    @RequestMapping(value="/magics", method= RequestMethod.POST)
    public Magic getMagicBySize(@RequestBody Magic magic){
        int number = rand.nextInt(magicList.size());
        return magicList.get(number);
    }
}

