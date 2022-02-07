package nl.saxion.oop.week7;

import java.util.HashMap;

public class Application {
    public static void main(String[] args) {

        // Part 1: Process a single web page
        System.out.println("== Part 1: Processing a single web page ==");
        // TODO: Uncomment me!
//        try {
//            String url = "https://www.reddit.com/";
//            String wordToFind = "reddit";
//
//            // This constructor call should automatically download the page!
//            Webpage page = new Webpage(url);
//
//            System.out.println("The word " + wordToFind + " occurred " + page.search(wordToFind) + " time(s) on " + url + "!");
//        } catch (WebCrawlerException wce) {
//            System.err.println("Error occurred: " + wce.getMessage());
//        }

        System.out.println();

        // Part 2: Process a single web page, show all words that occur more than once!
        System.out.println("== Part 2: Show word occurrences on a web page ==");
        // TODO: Uncomment me!
//        try {
//            String url = "https://www.reddit.com/";
//
//            Webpage page = new Webpage(url);
//
//            HashMap<String, Integer> wordFrequencies = page.getWordFrequencies();
//
//            // Note that we can iterate over all elements in a HashMap using the ".keySet()" method!
//            for (String key : wordFrequencies.keySet()) {
//                int nrOfOccurrences = wordFrequencies.get(key);
//
//                // Limit the spam a little! - Experiment with different values if you want.
//                if(nrOfOccurrences > 1) {
//                    System.out.println("The word [" + key + "] occurred " + nrOfOccurrences + " time(s) on " + url + ".");
//                }
//
//            }
//        } catch (WebCrawlerException wce) {
//            System.err.println("Error occurred: " + wce.getMessage());
//        }

        System.out.println();

        // Part 3: Build the "search engine"
        System.out.println("== Part 3: Build a search engines that searches on multiple pages ==");
        // TODO: Uncomment me!
//        try {
//            SearchEngine se = new SearchEngine();
//
//            se.addWebpage("https://nos.nl/");
//            se.addWebpage("https://cnn.com/");
//            se.addWebpage("https://www.saxion.edu/");
//            se.addWebpage("https://www.saxion.nl/");
//
//            String searchKeyword = "saxion";
//
//            HashMap<Webpage, Integer> searchResults = se.getSearchResults(searchKeyword);
//
//            System.out.println("Printing out the results for the keyword [" + searchKeyword + "]");
//            System.out.println();
//
//            // Note that we can iterate over all elements in a HashMap using the ".keySet()" method!
//            for (Webpage webpage : searchResults.keySet()) {
//                System.out.println(webpage.getUrl() + ": " + searchResults.get(webpage));
//            }
//        } catch (WebCrawlerException wce) {
//            System.err.println("Unable to load webpage: " + wce.getMessage());
//        }

        System.out.println();

        // Part 4: Absolute challenge: Find the most "relevant" site as search result!
        System.out.println("== Part 4: Build a real search engine that returns the found webpages, in order of relevance! ==");
        // TODO: Uncomment me!
//        try {
//            SearchEngine se = new SearchEngine();
//
//            se.addWebpage("https://nos.nl/");
//            se.addWebpage("https://cnn.com/");
//            se.addWebpage("https://www.saxion.edu/");
//            se.addWebpage("https://www.saxion.nl/");
//
//            String searchKeyword = "saxion";
//            ArrayList<Webpage> searchResultsInOrder = se.search(searchKeyword);
//
//            System.out.println("Printing out the most relevant pages for search keyword IN ORDER: " + searchKeyword);
//
//            for (Webpage w : searchResultsInOrder) {
//                System.out.println(w.getUrl());
//            }
//        } catch (WebCrawlerException wce) {
//            System.err.println("Unable to load webpage: " + wce.getMessage());
//        }
    }
}
