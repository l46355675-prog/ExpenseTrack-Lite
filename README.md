# ExpenseTrack-Lite
A lightweight, offline expense tracker built in Java. Add expenses, view your saved records, and calculate averages using a simple command-line interface. No accounts, no cloud, no distractions. Just your data, stored locally in a file. Perfect for beginners, students, and anyone who wants a minimal, transparent way to track spending

# Features
Add expenses with a name and amount
Store expenses locally in a text file
View all saved expenses from the file
Automatically calculate the average expense
Simple command-line menu (Add / View / Quit)
Works fully offline
Beginner-friendly Java code
Lightweight, no external libraries
Data persists between runs using file storage

# How to use
 Install termux 
 Install java by opening termux and running the commands ’’’pkg update
pkg install openjdk-17’’’
Compile the program using ’’’javac expense.java’’’ and finally run it using ’’’java expense’’’

# Using the program
A → Add an expense (name + amount)
E → View all expenses and the average
Q → Exit

# Where is data saved 
Expenses are stored in expense.txt
The file stays saved even after closing the app
You can open it anytime inside Termux:
’’’cat expense.txt’’’
If you find this project useful, consider supporting me → https://ko-fi.com/javamaster
