row = input("Insert odd number => ")
x=int(row)

for i in range(0, x):
    # nested loop for each column
    for j in range(0, i + 1):
        # print star
        print("*", end=' ')
    # new line after each row
    print("\r")