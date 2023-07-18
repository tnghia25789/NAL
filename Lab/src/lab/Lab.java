
package lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab {
    //
    public static void checkRegex(String input,String... args) {
        String regex = "";
        for (String arg : args) {
            regex += arg + "|";
        }
        regex = regex.substring(0, regex.length() - 1);
        int count = 0;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        matcher = pattern.matcher(input);
        List<String> matchedRegexes = new ArrayList<>(); 
        while (matcher.find()) {
            matchedRegexes.add(matcher.group());
            count++;
        }
        String matchedRegexesStr = "(" + String.join(",", matchedRegexes) + ")";
        System.out.println("Output: " + count +"("+matchedRegexesStr+")");  
    };
    
    //
    public static void main(String[] args) {
        String inputString = "";
        Scanner sc = new Scanner(System.in);       
        while (true) {
            System.out.print("Input: ");
            inputString = sc.nextLine();
            if (inputString.matches("[a-zA-Z0-9]+")) {
                break;
            } else {
                System.out.println("Chuỗi không được có khoảng trắng và kí tự đặc biệt. Vui lòng nhập lại!");
            }
        }
        checkRegex(inputString,"aw","aa","dd","ee","oo","ow","w");  
    }
    
}
