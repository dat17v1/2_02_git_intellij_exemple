# Day 2: Git Intellij Exemple
## Guide on howto share your code from a IntelliJ project

 
* Create a _.gitignore_ file in you project on your computer
  * it should exclude all files and folders except for your src folder and its content
  
```` 
.idea/*
out/*
*.iml
````    
* In case that someone in your group is working on VS Code instead of IntelliJ you will also need to exclude the .class files, which will be saved in the same folder as the .java files.

```` 
.idea/*
out/*
*.iml
*.class
````  

