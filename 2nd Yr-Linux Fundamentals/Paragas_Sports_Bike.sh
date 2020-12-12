echo "__________________________ Sport Bike Store ______________________________"
echo "     _______________________ Please Login _________________________"
echo "Username:"
read username
echo "Passcode:"
read pcode

if [[ $username == "jervx" && $pcode == "helloworld" ]]
     then 
	echo 
	clear
	echo "__________________________ Please Fill Up ________________________________"
	echo "Surname:"
	read sname
	echo "Firstname: "
	read fname
	echo "Middle Initial: "
	read mi
	echo "Contact Number: "
	read ucont
	echo "Address: "
	read uadd
	clear
	echo "_______________________ Your information summary _________________________"
	echo ""
	echo "Welcome $fname $sname! thank you for giving us your information! You are currently lving at $uadd with a contact number of $ucont."
	echo ""
	echo "__________________________ Sports Bike Available __________________________"
	echo ""
	echo "[1] Yamaha YZF R6 : inline 4 , 599cc Super Sports Bike : SRP 749,000"
	echo "[2] Yamaha YZF R1 : inline 4 , 998cc Super Sports Bike : SRP 1,099,000"
	echo "[3] Yamaha R1M : inline 4, 998cc Super Sports Bike : SRP 1,149,950"
	echo ""
	echo "Choose your Sports Bike:"
	read options
	case "$options" in 
	#case 1
		"1")
		clear
		echo "_________________________ Checkout Processing ____________________________"
		echo ""
		echo "You choose Yamaha YZF R6 : Unit Price is 749,000"
		OPTIONPRICE=749000;;
	#case 2
		"2")
		clear
		echo "_________________________ Checkout Processing ____________________________"
		echo ""
		echo "You choose Yamaha YZF R1 : Unit Price is 1,099,000"
		OPTIONPRICE=1099000;;
	#case 3
		"3")
		clear
		echo "_________________________ Checkout Processing ____________________________"
		echo ""
		echo "You choose Yamaha R1M : Unit Price is 1,149,950"
		OPTIONPRICE=1149950;;
	*)
		clear
		echo ""
		echo "_________________ Oops! We don't Have that Sports Bike :( ________________"
		exit;;
	esac
	
	echo ""
	echo "How many bikes of this kind are you going to buying?"
	read qty
	OPTIONPRICE=`echo $OPTIONPRICE \* $qty | bc`
	echo ""
	echo "Total Price is $OPTIONPRICE"
	echo "Please Enter Payment Ammount:"
	read payment
	change=`echo $payment - $OPTIONPRICE | bc`

	
	if [[ $payment > $OPTIONPRICE ]]
		then	
			echo "Here is your change: $change"
	elif [[ $payment == $OPTIONPRICE ]]
		then
			echo "You Payed the exact ammount :)"
	else
		clear
		echo "____________________ Insufficient Payment :( ____________________________"
		exit
	fi
	echo ""
	echo "Thank You $fname $sname For Purchasing Our Sports Bike! Ride Safe!"
else	
	clear
	echo "___________________ Ooops! Wrong login Credential ________________________"
	sh Paragas_Sports_Bike.sh
fi