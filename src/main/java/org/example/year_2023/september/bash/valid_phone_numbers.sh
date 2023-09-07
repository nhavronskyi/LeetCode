regex_phone1="^[0-9]{3}-[0-9]{3}-[0-9]{4}$"
regex_phone2="^\([0-9]{3}\) [0-9]{3}-[0-9]{4}$"

while file= read -r line; do
    if [[ $line =~ ($regex_phone1)|($regex_phone2) ]]; then
        echo $line
    fi
done < "file.txt"