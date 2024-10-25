package JavaPractice.Oct16;

public class MaxNumberLogicusingTernary {
    public static void main(String[] args) {
        int a=10, b=20, c=30;
        int Max=(a>=b && a>=c)?a:(b>=c?b: c);
        System.out.println("Max number is ->"+ Max);
    }
}


//Output
/*
"C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.2.3\lib\idea_rt.jar=56946:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.2.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\AMD\IdeaProjects\ATB9xJavaProgramPractice001\out\production\ATB9xJavaProgramPractice001 JavaPractice.Oct16.MaxNumberLogicusingTernary
Max number is ->30
 */