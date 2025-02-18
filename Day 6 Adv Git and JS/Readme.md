# Advanced Git and JS

## Git Diff Example

This repository demonstrates how to use the `git diff` command to compare changes in a simple HTML file.

## Steps

1. **Create a Folder for Git Diff Example**
   
   Create a new directory for your project:
     ```bash
     mkdir git-diff-example
     cd git-diff-example
     ```

2. **Create a Simple `index.html` Using Emmet**
   
   Create an `index.html` file with basic HTML structure using Emmet:
     ```html
     <!DOCTYPE html>
     <html lang="en">
     <head>
         <meta charset="UTF-8">
         <meta name="viewport" content="width=device-width, initial-scale=1.0">
         <title>Git Diff Example</title>
     </head>
     <body>
         <h1>Hello, World!</h1>
     </body>
     </html>
     ```

## Usage

1. **Initialize a Git Repository**
   
   Initialize a new Git repository in your project directory:
     ```bash
     git init
     ```

2. **Add and Commit the Initial Version**
   
   Add the `index.html` file to the staging area and commit it:
     ```bash
     git add index.html
     git commit -m "Initial commit with index.html"
     ```

3. **Make Changes to `index.html`**
   
   Edit the `index.html` file to make some changes. For example, add a paragraph:
     ```html
     <p>This is a paragraph added for the Git diff example.</p>
     ```

4. **View the Differences**
   
   Use the `git diff` command to see the changes made to the `index.html` file:
     ```bash
     git diff
     ```

### Note

`git diff` shows the difference between committed code and code in working directory
git diff --staged shows the difference between committed code and code in staging area onl
dit diff <hash value of first commit> <hash vslue of second commit>
git diff 6373233 HEAD

## Rename a file
`git mv <old-file-name> <new-file-name>`

## Restore a previous file
`git restore <file-name>`

`git restore --staged <old-file-name> <new-file-name`>

## Undo the changes
`git reset <commit-ID>`

## To change branch from master to main
`git branch -M main`