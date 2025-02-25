# Creating znd Writing to a File
echo "This is a test file" > file.txt

# Appending text to a file
echo "Another Line" >> file.txt

# Reading a file
cat file.txt

# Deleting a file
rm file.txt

# Checking if a file exists
if [ -f "file.txt" ]; then
    echo "File exists"
else 
    echo "File does not exist"
fi