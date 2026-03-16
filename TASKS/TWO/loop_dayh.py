total = 0
mean = 0

for number in range(1,11):
    first_number = int(input("Enter numbers: "))
    total += first_number
    mean = total/10
    print(mean, "is the mean of all numbers between 1-10")
