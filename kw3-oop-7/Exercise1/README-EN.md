# Reading the file system
## Difficulty: ![Filled](../resources/star-filled.svg) ![Outlined](../resources/star-outlined.svg) ![Outlined](../resources/star-outlined.svg)

As an IT professional, you will be dealing with the file system on a regular basis, whether it is to create files,
remove files, read from files, etc.

In this assignment we are going to write a script that explores a folder and all its subfolders of your operating
system.

For this we are going to use the `java.io.File`class which can be found in the standard library of Java. Because you (
from this moment on) need to use classes that you don't know about _yet_ and you thus should get familiar with reading
official documentation, we're not going to explain too much about this class, but redirect you to the official
documentation of this class instead.

Therefore, study the following page
carefully: [Java File documentation](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html)

**Please note:** With this command we are going to use the file system and *so* you have to be a bit careful with
what you actually instruct Java to do with your file system. It is possible to actually "break" something if you invoke 
a method without understanding what it does.

## Collect all file names in folders
There are several ways to access files and folders. We have provided a sample folder with some files and a few
subfolders.

- samplefolder
    - subfolder1
        - style.css
        - website.html
    - subfolder2
        - LostFile.java
    - description.txt
    - elephant.png
    - giraffe.png
    - README.md

Now in the `Application` class you must implement the method `listAllFiles(String directory)`. We are going to
focus on the files in the root directory and the names of the subdirectories (NOT the contents of the subdirectories,
see bonus).

The idea is to open the root folder and list the names of all the subfolders and the files in that folder. We will first
show all subfolders before showing all the files. Of the files you can print out the file size in `bytes`. You have to
figure out which method you can use to get the length of each individual file.

Your result will look like this:
```
Directories:
- subfolder1
- subfolder2

Files:
- description.txt (63 bytes)
- document.csv (120 bytes)
- elephant.png (14426 bytes)
- giraffe.png (11633 bytes)
- README.md (344 bytes)
```

Make sure to implement error handling, so that if you provide a non-existing directory your program terminates.

## Bonus: Subdirectories ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg)
Expand your current program to show the contents of the subdirectories as well. Note that you can use the same method
you have created in the first part of the exercise. Reusing the same method (on a smaller part of the file system) is also known as _applying_ recursion in programming. (You are now writing your first "recursive" algorithm.)    
i.e. Inside `listAllFiles(String directory)` when looping through the files, if the file is a directory call method `listAllFiles(file.getAbsolutePath())`.

Finally, make sure that a directory can now also print its total size. This should be done by taking the sum of all file
sizes together from that specific directory. (Note that directories themselves do not have a size!)