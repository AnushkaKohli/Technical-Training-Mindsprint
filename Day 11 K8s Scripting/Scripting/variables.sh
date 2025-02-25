# Environment variables
# Inherited by script from parent shell
echo "Current User: $USER"
echo "Home Directory: $HOME"

# Constant variables
readonly PI=3.14
echo "Value of PI: $PI"
# PI=3.89 # this line will throw error

echo "Number of arguments $#"
echo "Script Name $0"
echo "First Argument $1"
echo "Second Argument $2"
echo "Third Argument $3"