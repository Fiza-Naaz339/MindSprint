echo "Enter your age"
read age
echo "Are u Indian"
read citizen
if [ $age -ge 18 ] && [ $citizen == "yes" ] || [ $citizen == "YES" ]; then
    echo "You are eligible to vote"
else    
    echo "You are eligible to vote"
    fi

echo "Enter a number: "
read num

if [ $num -gt 10 ]; then
    echo "The number is grater than 10"
else 
    echo "The number is 10 or less than 10"

fi