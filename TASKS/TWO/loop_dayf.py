squared_even = 1

for number in range(1,11):
    first_number = int(input("Enter numbers: "))
    if first_number % 2 == 0:
        squared_even = first_number * first_number
    print(squared_even, "is the squared of all even numbers between 1-10")
