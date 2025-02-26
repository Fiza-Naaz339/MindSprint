echo "Hello from Bash"
name="Fiza Naaz"
echo "Hello $name"
salary=2000

echo "salary $salary"
sum=30
echo "sum $sum"
echo "salary $((salary*20))"


num1=10
num2=20
echo "sum $((num1+num2))"

numbers=(10 20 30 40 50 60)
echo "Fourth number ${numbers[3]}"

names=("alex" "bob" "cat" "dev")
echo "First name ${names[0]}"


echo "Current user: $(whoami)"
echo "Home directory: $HOME"


readonly PI=3.14
echo "PI value: $PI"
PI=3.89  # This line will cause an error because PI is readonly

