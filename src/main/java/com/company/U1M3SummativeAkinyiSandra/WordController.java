package com.company.U1M3SummativeAkinyiSandra;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class WordController {
    private List<Word> wordList;


    public WordController() {
        this.wordList = new ArrayList<>();


            wordList.add(new Word("Eutony", "the pleasantness of a words sound" ));
            wordList.add(new Word("Meliorism", "belief that the world gets better" ));
            wordList.add(new Word("Habitat", "home of an animal or plant" ));
            wordList.add(new Word("Humid", "moist air" ));
            wordList.add(new Word("Herd","group of animals that live together" ));
            wordList.add(new Word("Tarantism", "uncontrollable urge to dance" ));
            wordList.add(new Word("Endangered", "to be at risk" ));
            wordList.add(new Word("Earth", "the planet we live on" ));
            wordList.add(new Word("Conserve", "avoid wasting" ));
            wordList.add(new Word("Ineffable","utterly indescriable" ));

        }

        Random rand = new Random();
        @RequestMapping(value = "/words", method = RequestMethod.GET)
        public Word getWordBySize(){
        int number = rand.nextInt(wordList.size());
                    return wordList.get(number);
                }
            }
