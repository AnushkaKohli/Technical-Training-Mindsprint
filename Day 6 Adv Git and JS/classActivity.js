class Account {
    constructor(accNo, holderName, balance) {
        this.accNo = accNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    getBalance() {
        return this.balance;
    }

    deposit(amount) {
        this.balance += amount;
        console.log(`${amount} is credited to the account no. ******${this.accNo.slice(6)}`);
        console.log("Available balance: ", this.balance);
    }

    withdraw(amount) {
        if (this.balance > amount) {
            this.balance -= amount;
            console.log(`${amount} is debited from the account no. ******${this.accNo.slice(6)}`);
            console.log("Available balance: ", this.balance);
        } else {
            console.log("Insufficient Balance");
        }
    }
}

const acc1 = new Account('1900129876', "Anushka Kohli", 1000000);
acc1.deposit(10000);
acc1.withdraw(80000);