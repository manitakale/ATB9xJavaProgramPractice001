package JavaPractice.Oct15;

public class TernaryOperator005 {
    public static void main(String[] args) {


        // if Score is 90 or above - Grade will be A
        // if Score between 80 to 89 - Grade will be B
        // if Score between 70 to 79 - Grade will be C
        // if Score between 60 to 69 - Grade will be D
        // if Score below 60  - Grade will be F

        int score = 90;
        String grade = (score >=90)?"A": (score>=80)?"B":(score>=70)?"C":(score>=60)?"D":"F";

        System.out.println("Your grade is "+ grade);
    }
}

//Output
/*
"C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.2.3\lib\idea_rt.jar=52304:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.2.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\AMD\IdeaProjects\ATB9xJavaProgramPractice001\out\production\ATB9xJavaProgramPractice001 JavaPractice.Oct15.TernaryOperator005
Your grade is A
 */
