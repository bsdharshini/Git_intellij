package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Git version control in Intellij");
        System.out.println("I) Git commit, push");
	System.out.println("Step:0 VCS-> Enable version control-> Git" +
            "Step:1 Download .ignore plugin in intellij" +
            " Step:2 Add new .gitignore file (Click Project name-> new-> ignore file-> .gitignore)" +
            "Step:3 Add unversioned files in ignore file(Note: remove SRC in that)" +
            "Step:4 Commit to local repository and select the files" +
            "Step:5 Create a github repository and make it empty" +
            "Step:6 Go to VCS-> Git-> Remotes-> Add the copied URL from the github page" +
            "Step:7 Now push to remote repository(VCS->git->push)");
	System.out.println("II) Git Clone");
	System.out.println("Step:1 Copy the clonable link from the git repository" +
            "Step: 2 In the local directory opene the directory where you need to paste the project" +
            "Step:3 Open the cmd here or at address bar at top enter cmd" +
            "Step:4 git clone (paste the link)" +
            "Step: 5 To know the branch (git branch)");



    }
}
