package JavaPractice.Oct15;

public class TernaryOperator004 {
    public static void main(String[] args) {
//Find the Maximum number in 1bc using Ternary operator
        int a=67;
        int b=10;
        int c= 20;

        int Max= (a>b) ? (a>c?a:c) :(b>c?b:c);

        System.out.println(Max+" is the Max Number ");

    }
}


// Output

/*
"C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.2.3\lib\idea_rt.jar=51691:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.2.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\AMD\IdeaProjects\ATB9xJavaProgramPractice001\out\production\ATB9xJavaProgramPractice001 JavaPractice.Oct15.TernaryOperator004
67 is the Max Number
 */