#!/bin/bash
# Script to compile and run any Java file by number

# Get all .java files and store in an array
files=($(ls -1 *.java))

# Show the list with numbers
echo "Select a Java file to run:"
for i in "${!files[@]}"; do
    num=$((i+1))
    echo "$num) ${files[$i]}"
done

# Prompt for user input
read -p "Enter a number (1-${#files[@]}): " choice

# Validate input
if [[ $choice -ge 1 && $choice -le ${#files[@]} ]]; then
    file="${files[$((choice-1))]}"
    classname=$(basename "$file" .java)
    echo "Compiling $file..."
    javac "$file"
    if [ $? -eq 0 ]; then
        echo "Running $classname..."
        java "$classname"
    else
        echo "Compilation failed."
    fi
else
    echo "Invalid choice."
fi
