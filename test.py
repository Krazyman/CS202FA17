x= False
while x != True:
	try:
		money = int(input("Please enter the cost of your groceries: "))
		x= True
	except TypeError:
		continue

if money < 10:
	print("No Coupon")
elif money < 60:
	print("you win a discount coupon of $%.2f. \
(8%% of your purchase)" % (money*.08))
elif money < 150:
    print("you win a discount coupon of $%.2f. \
(10%% of your purchase)" % (money*.1))
elif money<210:
    print("you win a discount coupon of $%.2f. \
(12%% of your purchase)" % (money*.12))
else:
    print("you win a discount coupon of $%.2f. \
(14%% of your purchase)" % (money*.14))