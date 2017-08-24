# Day 2: Git Intellij Exemple
## Guide on howto share your code from a IntelliJ project

* Create a repo on github
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
* run the commands 
```` 
 $ git init
 
 $ git remote add origin << url to github repo >>
 
 $ git add .
 $ git commit -m "initial commit"
 $ git push -u origin master
 
````      

The other persons in the group should now:

* Create a new project in IntelliJ using 
  * Check out from version control -> Github
     * Auth type -> Password
* Clone repository
