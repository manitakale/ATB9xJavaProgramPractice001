package JavaPractice.Oct23;

public class Lab001functions {
    public static void main(String[] args) {


        //Without parameter and with return Type
        //With parameter and without return Type
        //With parameter and with return Type

        //static function can be called in static



        greet();

        String returned_value=greet_with_Hello();
        System.out.println(returned_value);
    }


        //Without parameter and without return Type //Declaration
        static void greet(){
            System.out.println("Hi, How are you");
        }



    //Without parameter and with return Type
    static String greet_with_Hello()
    {
        //Write a code
        System.out.println("Hi, How r u ");
        return "Hi, Awesome";
    }

    }
