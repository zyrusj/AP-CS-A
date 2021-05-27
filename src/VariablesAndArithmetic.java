public class VariablesAndArithmetic {
    public static void main(String[] args) {
//        type identifier = data
        int favoriteNumber = 3;
        favoriteNumber = 5;
        System.out.println("My favorite number is " + favoriteNumber);
        System.out.println(1+1);
        System.out.println(1+1+"1");

        //integer whole number from -2,147,483,648 to 2,147,483,647
        double halfMyFavoriteNumber = 2.5 ;
        boolean iLoveCS = true;
        char favoriteLetter = 'Z';
       //Arithmetic operators: +, -, *, /, %

        int side1 = 3, side2 = 4;
        int length = side1 + side2;
        System.out.println(length);

        System.out.println(3 - 4/5);
        System.out.println(3 - (double)(4)/(5));
        System.out.println(((double)3 - 4)/5);

    }
}
//For tutoring and test prep, email ZyrusJoh@gmail.com

/*
Vocabulary
Assign: creating an identifier by giving, or assigning, it a data value

Assignment operator: the symbol used to establish that an identifier corresponds to a
specified data value. In java, the assignment operator is ("="). You can see it use in
the example below
int x = 5

variable: when data is associated with an identifier, the identifier is called a variable

concatenation operator: the operator used to output a string literal and numerical value.
In java, it is the + sign, however it doesn't add them, it outputs them next to each other

primitive data: the basic types of data

integer: represented by the keyword (int), it represents a positive or negative number, or
zero with no decimals or fractions in the range of -2,147,483,648 to 2,147,483,647

double: represents a number that can be postive, negative, or zero and can include decimals
and fractions. It can represents numbers much larger or smaller than integers

boolean: represents a value that is either true or false

char: represented by the keyword (char), it represents any character you can type on a keyboard
To view a comprehensive list, visit unicode-table.com/en

precedence: the order that statements are evaluated in

strongly typed: characteristic of a language in which a variable keeps its type until it is reassigned

casting: forcing data to "look like" another type of data to the compiler
 */