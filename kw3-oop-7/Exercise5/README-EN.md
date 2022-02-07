# Search Engine
## Difficulty: ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg)  ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg)

In the following assignment, we are going to build the basics of a search engine. A search engine contains a number of 
web pages that have been _scraped_. Scraping a webpage means that the source code of the web page is read and stored 
locally as plain text. A web page, in addition to the text that you can read, also contains elements that deal with the 
structure and formatting of this page (you'll learn more about this in later courses). For a search engine, however, 
these elements are annoying: all web pages have about the same elements and if you want to search for something specific
you want to be able to search the actual _content_, not the layout.

So before we can do anything with the _scraped_ text, we will first have to clean up the source code (e.g. get rid of 
all the elements so that you only have normal text) and further we want to "remove unnecessary text" (like "filler words")
so that searching becomes easier. (Some words can be just left out of a sentence because they are not necessary for 
understanding the sentence.) Because this cleanup is annoying, we have included a class that you can use for this called 
`TextTools`.

The class `TextTools` contains the following helper methods:
- `String getAllTextFromHTML(String htmlPage)`: this method returns all the text from a downloaded web source code (html)
  Thus, we are left with "normal text" after this.
- `String[] getAllWordsFromHTML(String htmlPage)`: this method returns from downloaded web source code (html) an array
  containing all interesting words in the document. All source code is removed and common words are also removed. Note
  that this method uses the `getAllTextFromHTML` method.

Since building a search engine has quite a number of steps, we split the assignment into a few parts. We recommend that 
you complete this exercise using these steps.

## Part 1 - Modeling a Web Page
Each web page that we are going to scrape needs to be modeled in a class `Webpage` which, in addition to the URL of the 
page, can also store the contents of this page. How exactly to store this content is up to you: There are several 
possibilities, each with their own advantages and disadvantages. (Also look at the return type of the `getAllWordsFromHTML` 
method from `TextUtils` if you need an example.)

Next you should implement the _download_  of the actual text in a `download` method. The easiest way to read from a 
webpage is to use the `Scanner` class, in combination with the `URL` class. Read more about the `URL` class in the
Java official documentation [here](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/URL.html).

The code that you want to use for downloading looks something like this:
```java
// The URL class can provide us with a "InputStream", which is basically a connection to a website.
InputStream in = new URL("https://www.reddit.com").openStream(); 

// We can then connect the Scanner class to this stream and start reading data, just like you would with a file or
// the console!
Scanner scanner = new Scanner(in);

while(scanner.hasNext()) {
    // Do stuff with this line!
    System.out.println(scanner.nextLine());
}
```

Make sure that this `download` method is executed immediately when you create a `Webpage`. (Feel free to call this method
immediately from the constructor.) If something goes wrong (both the class URL and the class Scanner can throw exceptions!)
during downloading, you need to throw your own `WebCrawlerException`, which should provide the user with a clear
error message.

Finally, implement a `public int search(String keyword)` method that _counts the number of times the word `keyword`
occurs on the page_ returns. The higher this number, the more often the word appears on the page, and thus
the more _relevant_ this page will be to the search engine (for this keyword)!

## Part 2 - Getting an overview of _all_ words on a page
Presumably in Part 1 you used a loop and looked at _all_ the words in the web page and _counted how many times a word 
occurred_. This is fine for a single word in itself, but especially with larger pages, repeating this is very "slow." 
Often a web page is therefore processed, and a _frequency table_ is created where the number of occurrences per word
are stored. And this is what you are going to do with this assignment. Luckily, most programming languages 
have an _especially useful_ data type for this: the `Map` (sometimes called a "dictionary").

A `Map` is best compared to a table with just two columns: a _key_ column and a _value_ column. The best part
of the `Map` class, however, is that it is _generic_ (just like an `ArrayList` and the `Comparable` interface). You can
thus specify what the _types_ of _key_ and _value_ are. In this case, it makes sense to create a frequency table
of a "word", along with "the number of times this word occurs" (or in other words: A String and an Integer).

However, if you look for the class `Map` in the official documentation you will see that this class is offered 
exclusively as an _interface_, or in other words, we cannot instantiate a "normal" `Map` but need to use a class that 
provides an implementation of this interface. For the rest of this exercise (and course) you should use the `HashMap`
class. (We'll leave out the details for the choice, take it from us: this is very well known and used class!).

To return to the assignment: So, we want to build a frequency table of all the words of a page, e.g:

| Key        | Value           |
| ------------- |:-------------:|
| trending      | 6 |
| ago      | 6      |
| reddit | 3      |
| join   | 9 |
| ...   | ... |

Before you proceed however, study the classes `HashMap` and `Map` carefully:
* [Java Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html)
* [Java HashMap](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/HashMap.html)

Note that a lot of methods will sound familiar to you, such as `remove`, `size`, `clear`, but that certain methods
also have slightly different names than e.g. in an `ArrayList`. For example `add` is now called `put`, `set` (to change 
things) is now called `replace`, etc. You will have to get used to the use of maps and the methods you need to call 
to use them. The basic functionality (adding items, removing items, getting values, etc) is of course still there! You
just need to know how..

If we create the frequency table above using a `HashMap`, it would look like:

```java
// Note the definition of the table below: all KEYS must be of type String, all VALUES of type Integer.
HashMap<String, Integer> myTable = new HashMap<>();

// put has the following form: "put(key, value)"
myTable.put("trending", 6); // Note that put requires the FIRST argument to be a String, the second to be an Integer.
myTable.put("ago", 6);
myTable.put("reddit", 3);
myTable.put("join", 9);
// etc.
```

You can easily get data from a `HashMap` by calling the `get` method, e.g:
```java
int nrOfOccurences = myTable.get("ago"); // should be 6!
```

Or modify the contents via:
```java
myTable.replace("ago", 8); // "ago" has now 8 occurences!
```

Now write a method `public HashMap<String, Integer> getWordFrequencies()` method in the class `Webpage` that returns 
an overview of all words, and their occurrences, of that specific website. Update your `search` method to make use 
of the frequency table (if you want).

If all went well the following will be displayed (approximately):
```text
The word [trending] occured 2 time(s) on https://www.reddit.com/.
The word [ago] occured 6 time(s) on https://www.reddit.com/.
The word [reddit] occured 3 time(s) on https://www.reddit.com/.
The word [join] occured 9 time(s) on https://www.reddit.com/.
```
## Part 3 - Challenge: Your own search engine
Now that the preparations are finished and we finished an individual `Webpage`, we can start using this class in our own 
`SearchEngine` (class).

Write a class `SearchEngine` with the following functionality:
- `void addWebPage(String url)`: to add a web page to the search engine. If something goes wrong with the download
  of this page, a `WebCrawlerException` will be thrown as mentioned earlier in part 1.
- `HashMap<Webpage, Integer> getSearchResults(String keyword)`: this will return a map that provides an overview of
how many times the provided keyword has appeared on websites stored in the search engine. Note that if a website has
  not hits, it does not have to appear in the map.

A possible output could be:
```text
Printing out the results for the keyword [saxion]

https://www.saxion.edu/: 12
https://www.saxion.nl/: 14
```

You have now built your own search engine! Of course, this version is not as good (or commercial) as Google's, but the
foundations are there!

To finish this version however, you might want to put the results in the right order: have the most relevant page show
first. But here you run into a problem: a `Map` is not sortable. We will _ourselves_ have to put the results in a 
correct order using a list. But this is a challenge we will gladly leave to you.

## Part 4 - Challenge: Arranging the search results
Write the `SearchEngine` method `public ArrayList<Webpage> search(String keyword)` which from a given keyword will return 
a list of web pages _in order of relevance_. The page with the most "hits" (number of times the keyword occurs) is thus 
in first position, etc.