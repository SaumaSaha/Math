#! /bin/bash

javac --source-path src -d target src/io/github/saumasaha/math/Main.java

java --class-path target io/github/saumasaha/math/Main