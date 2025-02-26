add_number() {
    sum=$(( $1 + $2 ))
    echo "Sum of $1 and $2 is: $sum"
}

add_number 10 20

check_file() {
    if [ -f "$1" ]; then
        echo "File '$1' exists." 
    else 
        echo "File '$1' does not exists." 
    fi
}
check_file "file1.sh"

system_info() {
    echo "Operationg System: $(uname -o)"
    echo "Kernel version: $(uname -r)"
    echo "Disk usage"
    df -h | grep '^/dev/'
}
system_info