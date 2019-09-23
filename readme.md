# Github bootcamp!

0. (Be aware that if something goes wrong, you can always reset your local repository to match the remote by `git fetch origin` and then `git reset --hard origin/<branch name>`.
1. Create personal repo on github.com
2. Clone this project
3. Push the project to your own personal repository. Hint: You need to change the remote url by `git remote set-url origin <URL>`
4. Check github.com to make sure it’s there.
5. `git status` - how does this look?
6. Edit a file - Change the Main class to include your own username and password.
7. `git status` again. How does it look now?
8. Put the file that you edited into “staging”. Do this through the `git add <filename>` command. Hint you can user either a * or a . as a wildcard to add all files to staging
9. `git status` again. How does it look now?
10. `git commit -m "your message"` to commit your changes. Note that it’s very important to make good commit messages, so people can easily identify what you changed. For instance “I created a new method to compute a hash value” is good, where “i edited file” is bad.
11. `git push` and check github if your changes was pushed correctly
12. Find a partner
13. Play rock, paper, scissors. The winner invites the looser to collaborate on the winner’s repo.
14. The “looser” clones the winner repository.
15. Create new branch with `git checkout -b <branch-name>`
16. Edit the “winner’s” code.
17. `git commit`
18. `git push`
19. Go back to the master branch.
20. Merge the new branch into master by `git merge <branch name>`
21. You should get a merge conflict
22. In IntelliJ you can fix merge conflicts visually by going to VCS -> Git -> Resolve conflicts. Pick the changed code.
23. `git commit`
24. `git push`
25. On the “winner’s” computer, you use the command `git pull` to get the new changes.
26. On a piece of paper, try to illustrate the how git has changed. You can use the same structure as https://learngitbranching.js.org/ if you’d like.
27. Use `git log`. Does the log fit your illustration? Tip: If you want to save the log in a file, you can use the command `git log > log.txt`. This command add the output of `git log` to a textfile called `log.txt`

Hvis i har mere tid, kan i lave øvelse 1-4 på https://learngitbranching.js.org/
