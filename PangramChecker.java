package assingnment;
import java.util.HashSet;
import java.util.Set;

public class PangramChecker
{
    public static void main(String[] args)
    {
        String input = "The quick brown fox jumps over the lazy dog";

        boolean isPangram = isPangram(input.toLowerCase());
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String s) 
    {
        s = s.replaceAll("[^a-z]", "");

        Set<Character> uniqueChars = new HashSet<>();

        for (char c : s.toCharArray()) 
        {
            uniqueChars.add(c);
        }

        return uniqueChars.size() == 26;
    }
}
