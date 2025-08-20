# Java Logic Questions Collection

This repository contains **91 Java logic questions**, each implemented as a separate Java program. The purpose of this collection is to help practice and understand various programming concepts and logic in Java.

## How to Run the Programs

All Java logic programs are stored in this repository and can be easily compiled and executed using the provided shell script.

### Script: `run_java_by_number.sh`

- **Purpose:** Lists all available Java logic programs, lets you choose one by serial number, and automatically compiles and runs the selected program.
- **Usage:**
  1. Open your terminal in the repository folder.
  2. Run the script:
     ```bash
     ./run_java_by_number.sh
     ```
  3. The script will display a list of all Java programs with serial numbers.
  4. Enter the serial number of the program you want to run.
  5. The script will compile and execute the chosen program.

### Example

```bash
$ ./run_java_by_number.sh
Available Java Programs:
1. DisplayMSB.java
2. ReverseArray.java
3. SumOfDigits.java
...
91. SomeOtherLogic.java

Enter the serial number to run: 1
Compiling DisplayMSB.java ...
Running DisplayMSB.java ...
(Output of the program)
```

## Program Structure

- Each logic question is implemented in a separate `.java` file.
- Files are named according to the logic they implement, e.g., `DisplayMSB.java`, `ReverseArray.java`, etc.
- The script uses the file name and serial number mapping to allow easy selection and execution.

## Example Program: `DisplayMSB.java`

The `DisplayMSB.java` program demonstrates how to display the Most Significant Bit of an integer.

## Requirements

- Java installed (JDK)
- Bash shell to run the script

## How to Compile & Run Manually

You can also compile and run any Java file manually:

```bash
javac DisplayMSB.java
java DisplayMSB
```

## Contributing

Feel free to add new logic questions in the same format or improve existing ones!

---

**Enjoy practicing Java logic questions!**
