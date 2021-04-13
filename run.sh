#! /bin/bash

# Update ctags
ctags --recurse=yes -h .java

# Run application
javac -cp ./bin/ ./App.java
java bin.App
