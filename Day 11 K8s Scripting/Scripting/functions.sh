# Function to add two numbers
add_numbers() {
    sum=$(( $1 + $2 ))
    echo "Sum of $1 and $2 is: $sum"
}

# Calling the function with two numbers
add_numbers 10 20

# Function to check if file exists
check_file() {
    if [ -f "$1" ]; then
        echo "File '$1' exists"
    else
        echo "File '$1' does not exist"
    fi
}

# Calling the function with filename
check_file "testfile.txt"

# Function to display system info
system_info() {
    echo "Operating system: $(uname -o)"
    echo "Kernel version: $(uname -r)"
    echo "Disk usage:"
    # For mounted disk usage - grep '^/dev/' filters mounted disk usage
    # df -h | grep '^/dev/'
    df -h 
}

# Call the function
system_info
