#! /bin/bash

# Update ctags
ctags --recurse=yes -h .java

# Run application
javac ./App.java
java App
