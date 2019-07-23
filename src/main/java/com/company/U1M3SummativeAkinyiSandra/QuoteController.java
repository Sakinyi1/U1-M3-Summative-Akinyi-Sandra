package com.company.U1M3SummativeAkinyiSandra;

import com.company.U1M3SummativeAkinyiSandra.Quote;
import com.company.U1M3SummativeAkinyiSandra.Word;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class QuoteController {
    private List<Quote> quoteList;

    public QuoteController() {
        this.quoteList = new ArrayList<>();


            quoteList.add(new Quote("William Shakespeare", "To thine own self be true" ));
            quoteList.add(new Quote("Paulo Coelho", "Impossible is just an opinion" ));
            quoteList.add(new Quote("Bart Gold", "Life is too short" ));
            quoteList.add(new Quote("Ralph Waldo", "Life is a journey, not a destination" ));
            quoteList.add(new Quote("Sherlock Holmes", "To a great mind, nothing is little" ));
            quoteList.add(new Quote("Thoreau", "There is no remedy for love, but to love more" ));
            quoteList.add(new Quote("J.R Tolkien", "Not all those who wander are lost" ));
            quoteList.add(new Quote("William Shakespeare", "Listen to many, speak to few" ));
            quoteList.add(new Quote("Rupi Kaur", "Fall in love with your solitude" ));
            quoteList.add(new Quote("Robert Ingersoll", "We rise by lifting others" ));
        }


    Random rand = new Random();
    @RequestMapping(value = "/quotes", method = RequestMethod.GET)
    public Quote getQuoteBySize(){
        int number = rand.nextInt(quoteList.size());
        return quoteList.get(number);
    }
}