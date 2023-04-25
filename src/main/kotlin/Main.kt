fun main(){
//Question 1;
    val str = "Sally Moraa Makini"
    val analyze = randomString(str)

    val firstChar = analyze.first
    val lastChar = analyze.second
    val length = analyze.third
    val beginsWithVowel = if (analyze.fourth) "begins" else "does not begin"

    println("First character: $firstChar")
    println("Last character: $lastChar")
    println("Length: $length")
    println("String $beginsWithVowel with a vowel.")

//Question 2;
    val password = "nkathamilly18"
    val isValid = validPassword(password)
    println(isValid)
}

//1.Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)

fun randomString(str: String): Triple<Char, Char, Int,>{
    val firstChar = str.first()
    val lastChar = str.last()
    val length = str.length
    val beginsWithVowel = when (firstChar.toLowerCase()) {
        'a', 'e', 'i', 'o', 'u' -> true
        else -> false
    }
    return Triple(firstChar,lastChar,length, beginsWithVowel)
}

//2. Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false (7pts)

fun validPassword(password: String) :Boolean {
    if(password.length < 8 || password.length > 16){
        return false
    }
    if(password == "password"){
        return false
    }
    val digitRegex = Regex("\\d")
    if (!password.contains(digitRegex)) {
        return false
    }
    return true
}

//3. Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)


//4. Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)


//5. Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)












