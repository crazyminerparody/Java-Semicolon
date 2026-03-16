#display the sum of the square of even numbers btw 1-10

squared_all = 1
total = 0

for number in range(1,11):
    first_number = int(input("Enter numbers: "))
        squared_all = first_number * first_number
        total += squared_all

    print(total, "is the total of the squared of all numbers between 1-10")
