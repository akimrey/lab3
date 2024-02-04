# Question 1 
```
akimrey@arden:~/exercises$ git add readme.md
fatal: not a git repository (or any parent up to mount point /)
Stopping at filesystem boundary (GIT_DISCOVERY_ACROSS_FILESYSTEM not set).
```
# Question 2
```
akimrey@arden:~/exercises$ cat ~/.gitconfig
[user]
        name = Ashton Kimrey
        email = akimrey@unca.edu
```
# Question 3
```total 18
drwxr-xr-x  3 akimrey students  4 Jan 30 11:21 .
drwx-----x 12 akimrey students 25 Jan 30 11:34 ..
drwxr-xr-x  7 akimrey students 10 Jan 30 11:34 .git
-rw-r--r--  1 akimrey students 15 Jan 30 11:14 readme.md
```
There is the readme file and then the .git directory. I know its a directory because its highlighted blue, hahaha.

# Question 4 
akimrey@arden:~/software-engineering$ git status
On branch my_lab3_work
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   labs/lab3/exercises/readme.md

Changes not staged for commit:
  (use "git add/rm <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        deleted:    labs/lab3/exercises/readme.md

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        labs/lab2/answers.md
        labs/lab2/src/index.html
        labs/lab2/src/style.css
        labs/lab3/answers.md
        src/
        start-web-prj.sh

# question 5

Use git status

akimrey@arden:~/software-engineering/labs/lab3/exercises$ git commit -m "add readme.md to the repository"
[main (root-commit) 14a7c23] add readme.md to the repository
 1 file changed, 1 insertion(+)
 create mode 100644 readme.md

 # Question 6 

 akimrey@arden:~/software-engineering/labs/lab3/exercises$ git log
commit 14a7c2351904c4280686cf4c810ebb43cc65bb05 (HEAD -> main)
Author: Ashton Kimrey <akimrey@unca.edu>
Date:   Sun Feb 4 13:59:30 2024 -0500

    add readme.md to the repository

# Question 7 

akimrey@arden:~/software-engineering/labs/lab3/exercises$ git status
On branch main
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   readme.md

no changes added to commit (use "git add" and/or "git commit -a")

akimrey@arden:~/software-engineering/labs/lab3/exercises$ git diff
diff --git a/readme.md b/readme.md
index 7304d06..f823661 100644
--- a/readme.md
+++ b/readme.md
@@ -1 +1,22 @@
-# readme header
\ No newline at end of file
+# readme header
+
+1. Write a function that takes in a list of integers as an argument
+and returns true if it contains two integers that are the same, false
+otherwise.
+
+import java.util.List;

# Question 8

git diff - shows the differences betweem the working dir and the staged files and what has
been changed but not yet commited.

git add - stages all changed files

git log - shows the commit history for the current branch

git status - displays the status of staged/modified files 
# question 9

nest loops - This solution involves using two nested loops to compare each element
in the list with every other element.
 The outer loop picks an element, and the inner loop compares this
element with every other element that comes after it in the list.
If a match is found (meaning two elements are the same), it concludes that there are duplicates in the list.

set/map - utilize a set (or a map) to keep track of the elements you've seen so far as you iterate through the
list. For each element, you check if it's already in the set.
If it is, you know that there's a duplicate. If it's not, you add the element to the set and move on to the next on>

trade-offs - The major advantage is its time complexity, where n is the number of elements in the list.
This means that the time taken to run the algorithm increases linearly with the size of the input list.
Space Complexity: as you might need to store every element in the set.

# Question 10

one-set

head now points to main

shows the different commits between the branches.
# question 11

akimrey@arden:~/software-engineering/labs/lab3/java$ git push origin one-set
Username for 'ssh://github.com': akimrey
Password for 'ssh://akimrey@github.com':
remote: Support for password authentication was removed on August 13, 2021.
remote: Please see https://docs.github.com/en/get-started/getting-started-with-git/about-remote-repositories#clonin>



# Question 12

Merge commit - involves creating a new commit in the target branch that ties together the histories of both branche>

Squash and merge - combines all changes from the source branch into a single commit in the target branch.

Rebase and merge - involves moving the entire branch to begin on the tip of the target branch, effectively incorpor>

