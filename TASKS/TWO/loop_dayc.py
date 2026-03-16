total = 0

for number in range(1, 11):
    first_number = int(input("Enter ten numbers: "))

    total += first_number
    if first_number % 2 == 0:
        print(total, "is the sum of even numbers between 1-10")
