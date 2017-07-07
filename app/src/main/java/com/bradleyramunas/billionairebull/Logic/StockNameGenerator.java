package com.bradleyramunas.billionairebull.Logic;

import java.util.Random;

/**
 * Created by Bradley on 7/7/2017.
 */

public class StockNameGenerator {

    final static String[] adjectives = {"Crazy", "Silly", "Innovative", "Intense", "Unique", "Creative", "Objective", "Ingenious", "New", "Original", "Acceptable",
    "Valuable", "Exceptional", "Bad", "Great", "Marvelous", "Positive", "Negative", "Capital", "Boss", "Choice", "Prime"};
    final static String[] sectors = {"Drawing","Inventing", "Searching", "Indexing", "Coding", "Engineering", "Managing", "Developing", "Food", "Health",
    "Designing", "Manipulating", "Accounting", "Financing", "Banking", "Taxers", "Adjusting", "Mining", "Manufacturing", "Advertising", "Acommodations",
    "Aerospace", "Agriculture", "Horticulture", "Apparel", "Automotive", "Beauty", "Biotech", "Chemical", "Communications", "Computer", "Construction",
    "Energy", "Technology", "Legal", "Media", "Pharamaceutical", "Music", "Publishing", "Retail", "Service", "Utilities"};
    final static String[] types = {"Industry", "Commerce", "Corporation", "Management", "Company", "Megacorp", "Multinational"};

    public String generateStockName(){
        //TODO: Make sure no duplicate companies are created... chance is super low though
        Random random = new Random();
        String adjective = adjectives[(int)Math.floor(random.nextInt()*(adjectives.length))];
        String sector = sectors[(int)Math.floor(random.nextInt()*(sectors.length))];
        String type = types[(int)Math.floor(random.nextInt()*(types.length))];
        return adjective + sector + type;
    }

    public String generateStockAcronym(String stockName){
        return stockName.split(" ")[0] + "" + stockName.split(" ")[1] + "" + stockName.split(" ")[2];
    }

}
