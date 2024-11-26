package apicloud.Services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Component
public class Facade {
    public Facade() {
    }

    public Map<Integer, Integer> getSalaires(String nom){
        Map<Integer, Integer> historicalSalaryData = new HashMap<>();

        historicalSalaryData.put(2023, 33628);  // First 9 months
        historicalSalaryData.put(2022, 34920);
        historicalSalaryData.put(2021, 36211);
        historicalSalaryData.put(2020, 41136);
        historicalSalaryData.put(2019, 40534);
        historicalSalaryData.put(2018, 39732);
        historicalSalaryData.put(2017, 42497);
        historicalSalaryData.put(2016, 38616);
        historicalSalaryData.put(2015, 38060);
        historicalSalaryData.put(2014, 37548);
        historicalSalaryData.put(2013, 37032);
        historicalSalaryData.put(2012, 36372);
        historicalSalaryData.put(2011, 35352);
        historicalSalaryData.put(2010, 34620);
        historicalSalaryData.put(2009, 34308);
        historicalSalaryData.put(2008, 33276);
        historicalSalaryData.put(2007, 32184);
        historicalSalaryData.put(2006, 31068);
        historicalSalaryData.put(2005, 30192);
        historicalSalaryData.put(2004, 29712);
        historicalSalaryData.put(2003, 29284);
        historicalSalaryData.put(2002, 23224);
        historicalSalaryData.put(2001, 179400);
        historicalSalaryData.put(2000, 175400);
        historicalSalaryData.put(1999, 173640);
        historicalSalaryData.put(1998, 169080);
        historicalSalaryData.put(1997, 164640);
        historicalSalaryData.put(1996, 158200);
        historicalSalaryData.put(1995, 155940);
        historicalSalaryData.put(1994, 153120);
        historicalSalaryData.put(1993, 149829);
        historicalSalaryData.put(1992, 144120);
        historicalSalaryData.put(1991, 137720);
        historicalSalaryData.put(1990, 119975);
        historicalSalaryData.put(1989, 113534);
        historicalSalaryData.put(1988, 106833);
        historicalSalaryData.put(1987, 101283);
        historicalSalaryData.put(1986, 92702);
        historicalSalaryData.put(1985, 82200);
        historicalSalaryData.put(1984, 49573);
        historicalSalaryData.put(1983, 1020);
        historicalSalaryData.put(1982, 12705);
        if(nom.equals("assa")){
        return historicalSalaryData;}
        throw new RuntimeException();
    }


}
