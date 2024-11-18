package lv.acodemy;

public class Variables {
    public static void main(String[] args) {

        //this is my comment

        /*
        This is fits lane
        This is second lane
        This is third line
         */

        // int (integer) - whole number/natural number
        int age = 30;
        int currentYear = 2024;
        //currentYear= camelCase (lower came case)
        //current_year = smoke case never do like this!
        // current-year = kebab case never do like this!

        int inventoryItemCount = 100;


        System.out.println(age);
        System.out.println(currentYear);
        System.out.println(inventoryItemCount);

        //double (fractional numbers)

        double temperature = 36.6;
        double price = 19.99;
        double distance = 38400.0;



        System.out.println(temperature);
        System.out.println(price);
        System.out.println(distance);

        // char (symbols)

        char grade = 'A' ;
        char myInitial = 'J';
        char currencySymbol = '$';

        System.out.println(grade);
        System.out.println(myInitial);
        System.out.println(currencySymbol);

        // boolean ( logical type, can keep only two values: true false)
        // How to name? has or is
        // Example: isSummer / if(isSummer){};
        // Example: hasAccess / if(hasAccess) {};

        boolean hasAccess = true;
        boolean isSummer = false;


        System.out.println(hasAccess);
        System.out.println(isSummer);

        //long
        long phoneNumber = 27164325;
        System.out.println(phoneNumber);

        //float

        float interestRate = 4.5f;
        System.out.println(interestRate);

    //Aritmetic aperators

        int a = 10;
        int b = 5;
        int sum = a+b; // add
        System.out.println(sum);

        int c = 20;
        int d = 8;
        int difference = d-c;
        System.out.println(difference);

        int m= 7;
        int n= 3;
        int result = m*n;
        System.out.println(result);

        //Divide

        int num1 = 10;
        int num2= 3;
        int division = num1 / num2;
        System.out.println(division);

        double num3 = 10;
        double num4 = 3;
        double division1 = num3 / num4;
        System.out.println(division1);

        // % (remainder of a devision)

        int f = 16;
        int g = 5;
        int remainder = f % g; // 10 = 3 * 3 + 1
        System.out.println(remainder);

        int number = 8;
        boolean isEven = (number % 2 == 8); // == comprasion operator
        System.out.println(isEven);

        //Increment ++
        //Discrement --

        number++;
        System.out.println(number);

        number--;
        System.out.println(number);

        int counter = 10;
        counter++;
        int postIncrement = counter++;
        int preIncrement = ++counter;
        System.out.println(postIncrement);
        System.out.println(preIncrement);

        String name = "Jurij";
        String lastName = "Vehter";

        System.out.println(name);
        System.out.println(lastName);

        String fullName = name + " " + lastName;
        System.out.println(fullName);

        //%s - for string
        // %d - for numbers

        System.out.println(String.format("My name is: %s, My surname is: %s" ,  name , lastName));
        System.out.printf("My name is: %s, My surname is: %s%n", name , lastName);
        System.out.printf("My name is: %s, My surname is: %s%n", name , lastName);

        var myCurrentAge = 30;
        var text = "Hello World";

        String myVar;
        myVar = "Hello, World";









    }
}
