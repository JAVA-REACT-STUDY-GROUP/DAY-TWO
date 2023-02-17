public class Main {
    public static void main(String[] args) {
        // function
        // parameter

        // System.out.println("Java class");
        //Java class length (10)
        //printOutWithLength("Udemy Developers Algorithm");

        isPersonOldEnoughToDrink("Amaka", 20);
        isPersonOldEnoughToDrink("Emeka", 30);

        isNumberPrime(2);
        isNumberPrime(3);
        isNumberPrime(5);
        isNumberPrime(7);
        isNumberPrime(13);
        isNumberPrime(17);
        isNumberPrime(10);

    }
    public static void isPersonOldEnoughToDrink(String personName, int personAge){
        if(personAge < 21){
            System.out.println(personName +" IS NOT ELIGIBLE TO DRINK");
        }else{
            System.out.println(personName +" IS ELIGIBLE TO DRINK");
        }
    }


    static void isNumberPrime(int number){
        boolean flag = true;
        for(int i = 2; i < number; i++){
            int temp = number % i;
            if(temp == 0) {
                flag = false;
            }
            if(!flag) break;
        }
        if(flag) System.out.println(number+" is prime");
        if(!flag) System.out.println(number+" is not prime");
    }

    //write a function, that accepts a String
    //counts the number of characters in the String
    //prints the string out
    //tell you the number of characters

    // properties of a function
    // - a name;
    // - it must have a return type
    // - you state the accessibility
    // - may or may not collect an argument


    public static void printOutWithLength(String enterValue){
        int stringLength = enterValue.length();
        System.out.println(enterValue+" length "+"("+stringLength+")");
    }




    // write a function that collects two argument
    // argument 1 = String (personName)
    // arguement 2 = int (personAge)
    // drinking age = 21

    //determin if the person is old enough to drink
    // print out to the console if the person is old enough to drink
















}
