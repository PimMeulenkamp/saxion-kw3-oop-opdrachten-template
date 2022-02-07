# CD Collection
## Difficulty: ![Filled](../resources/star-filled.svg) ![Outlined](../resources/star-outlined.svg) ![Outlined](../resources/star-outlined.svg)

In this assignment you are going to model a CD collection (as in the actual CD's your parents might have!). The
intention is that you provide an interface to manage this collection, so that you can easily add CDs to this collection,
can remove CD's and determine some statistics of your collection. Obviously, as there are potential mistakes / error that
can occur, we are going to use our own `Exception` to handle these situations.

A CD collection consists of CDs. Each CD has an artist and a title. On each CD there are tracks. Each track has a title
and a length (time). From every CD the total length of all tracks must be retrievable, including all relevant attributes. 
In addition, the `toString()` must return a neatly numbered track listing (see below).

To easily work with all those different CDs, you need to write a `CDCollections` class that keeps track of which CDs you
have in our possession. The following methods must be present in this collection class:

- `void addCD(CD cd)`: this method adds a CD to the collection, except if this album (same artist and title)
  is already present, then a `CDCollectionException` is thrown with a clear error message.
- `void removeCD(CD cd)`: this method removes a CD from the collection and throws a `CDCollectionException` if the album
  is not present in the collection.
- `ArrayList<String> getArtists()`: returns a list of all artists in the collection. Duplicates are removed from the
  list.
- `ArrayList<CD> getAllCDs()`: returns a list of all CDs.
- `ArrayList<CD> findCDsByArtist(String artist)`: returns a list of all CDs by an artist.
- `CD findCD(String artist, String title)`: returns a specific CD by an artist and with a specific title.

Build the above data model and implement the Application class.

## Example
Albums should be printed in the following way:

```text
Album: Coldplay - A rush of blood to the head
Total time: 0:54:08
Tracks:
1. Politik (05:18)
2. In my place (03:48)
3. God put a smile upon my face (04:57)
4. The scientist (05:09)
5. Clocks (05:07)
6. Daylight (05:27)
7. Green eyes (03:43)
8. Warning sign (05:31)
9. A whisper (03:58)
10. A rush of blood to the head (05:51)
11. Amsterdam (05:19)
```

## Hints
* Store the time using the official Java method (look at the `Duration` class). If you struggle getting this to work properly,
you can always use an integer to store the number of seconds.