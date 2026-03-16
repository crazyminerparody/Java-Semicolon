squared_odd = 1

for number in range(1,11):
    first_number = int(input("Enter numbers: "))
    if first_number % 2 != 0:
        squared_odd = first_number * first_number
    print(squared_odd, "is the squared of all odd numbers between 1-10")
