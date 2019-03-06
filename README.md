
# cs1302-ce19 ImageApp

> The only way to get rid of temptation is to yield to it.
> **-- Oscar Wilde, _The Picture of Dorian Gray_**

This class exercise explores creating graphical user interfaces (GUIs) using the JavaFX library. Students
will create an interactive GUI that loads an image from a specified URL. The program supports images in BMP, 
GIF, JPEG, and PNG formats. In this exercise, starter code containing the basic layout of a JavaFX application
is provided. Implementation details are left to the student.

## References and Prerequisites

* [CSCI 1302 JavaFX 8 Bookmarks and Notes](http://cobweb.cs.uga.edu/~mec/cs1302/gui/)
* [CSCI 1302 JavaFX Tutorial](https://github.com/cs1302uga/cs1302-tutorials/blob/master/javafx/javafx.md)

## Questions

In your notes, clearly answer the following questions. These instructions assume that you are 
logged into the Nike server. 

**NOTE:** If a step requires you to enter in a command, please provide in your notes the full 
command that you typed to make the related action happen. If context is necessary (e.g., the 
command depends on your present working directory), then please note that context as well.

### Getting Started

1. Use Git to clone the repository for this exercise onto Nike into a subdirectory called `cs1302-ce19`:

   ```
   $ git clone --depth 1 https://github.com/cs1302uga/cs1302-ce19.git
   ```

1. Change into the `cs1302-ce19` directory that was just created and look around. There should be
   multiple Java files contained within the directory structure. To see a listing of all of the 
   files under the `src` subdirectory, use the `find` command as follows:
   
   ```
   $ find src
   ```

### Exercise Steps

In this checkpoint, you will focus on creating the basic GUI layout for the `ImageApp`. Don't worry about
adding functionality to the button just yet.  At the end of the checkpoint, your GUI should look like the
following image:

<img src="https://github.com/cs1302uga/cs1302-ce19/blob/master/ScreenShot.png?raw=true" width=300>

1. Consider the following containment heirarchy:

   ```
             Stage                          -|
               |                             |
             Scene                           |
               |           -|                |
              VBox          |                |
              / \           |                 \
             /   \           \                 | Overall
           HBox  ImageView    | Scene Graph    | Containment
           / \               /                 | Hierarchy
          /   \             |                 /
   TextField  Button        |                |
                           -|               -|
   ```
   
   Each node corresponds to an object of some class under the 
   [`javafx`](https://docs.oracle.com/javase/8/javafx/api/toc.htm)
   package. The diagram for the scene graph assumes that child nodes
   are added to their parents in a left-to-right order. For example,
   The `HBox` and `ImageView` objects are added to the collection of
   child nodes for the `VBox` object in that order.
   
1. 
**CHECKPOINT**

1. 
**CHECKPOINT**

<hr/>

[![License: CC BY-NC-ND 4.0](https://img.shields.io/badge/License-CC%20BY--NC--ND%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc-nd/4.0/)

<small>
Copyright &copy; Michael E. Cotterell, Brad Barnes, and the University of Georgia.
This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License</a> to students and the public.
The content and opinions expressed on this Web page do not necessarily reflect the views of nor are they endorsed by the University of Georgia or the University System of Georgia.
</small>
