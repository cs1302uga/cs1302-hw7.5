#!/bin/bash -ex

# Compile the app
javac -d bin -p $JAVAFX_HOME/lib --add-modules javafx.controls src/cs1302/app/ImageApp.java
javac -d bin -cp bin -p $JAVAFX_HOME/lib --add-modules javafx.controls src/cs1302/app/ImageDriver.java

# Run the app
java -cp bin -Dprism.order=sw -p $JAVAFX_HOME/lib --add-modules javafx.controls cs1302.app.ImageDriver
