$names=@("Alice", "Bob", "Charlie")
$names | foreach-object {Write-Host "Hello, $_"}

# If - else condition
$age = Read-Host "Enter your age"
if ($age -ge 18) {
    Write-Host "You are an adult."
} else {
    Write-Host "You are a minor."
}

# Creating and using a function
function GreetUser {
    param ( 
        $name
    )
    Write-Host "Welcome, $name!"
}

GreetUser "John"

Get-Process
stop-process -name "notepad" -force