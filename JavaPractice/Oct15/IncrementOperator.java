package JavaPractice.Oct15;

public class IncrementOperator {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        int b = 20;
        System.out.println(--b + b++ + b--);
    }
}


//Output

/*
"C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.2.3\lib\idea_rt.jar=52507:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.2.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\AMD\IdeaProjects\ATB9xJavaProgramPractice001\out\production\ATB9xJavaProgramPractice001 JavaPractice.Oct15.IncrementOperator
34
13
58

 */