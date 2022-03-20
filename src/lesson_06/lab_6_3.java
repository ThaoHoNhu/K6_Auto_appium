package lesson_06;

public class lab_6_3 {
    public static void main(String[] args) {
        String inputText = "12345nabc678";
        String outputText = "";
        char [] inputChar = inputText.toCharArray();
        for (char text : inputChar){
            if (Character.isDigit(text)){
                outputText = outputText + "" + text;

            }
        }
        System.out.println(outputText);
    }
}
