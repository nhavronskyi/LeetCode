line_number=0

while IFS= read -r line; do
  ((line_number++))

  if [ "$line_number" -eq 10 ]; then
    echo "$line"
    break
  fi
done < "file.txt"