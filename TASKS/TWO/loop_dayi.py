#display the sum of the square of even numbers btw 1-10

squared_even = 1
total = 0

for number in range(1,11):
    first_number = int(input("Enter numbers: "))
    if first_number % 2 == 0:
        squared_even = first_number * first_number
        total += squared_even

    print(total, "is the total of the squared of all even numbers between 1-10")
