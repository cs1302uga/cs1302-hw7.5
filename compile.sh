#!/bin/bash -ex

# compile src/cs1302/app/ImageApp.java
javac -d bin \
      -p $JAVAFX_HOME/lib --add-modules javafx.controls \
      src/cs1302/app/ImageApp.java

# compile src/cs1302/app/ImageDriver.java
javac -d bin -cp bin \
      -p $JAVAFX_HOME/lib --add-modules javafx.controls \
      src/cs1302/app/ImageDriver.java

# run the app using cs1302.app.ImageDriver
java -cp bin -Dprism.order=sw \
     -p $JAVAFX_HOME/lib --add-modules javafx.controls \
     cs1302.app.ImageDriver
