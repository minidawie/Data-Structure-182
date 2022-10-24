package phase2;

public class StringRecognizer {
    public static void main(String[] args) {

        //The section “Recognizing Strings in a Language” describes a recognition algorithm for
        //the language 𝐿:
        //𝐿 = {𝑤$𝑤′:𝑤 is a possibly empty string of characters other than $, 𝑤′ = 𝑟𝑒𝑣𝑒𝑟𝑠e(𝑤) }

        StackReferenceBased aStack = new StackReferenceBased();

        String aString = "abcd$abcd";

        int i = 0;
        while(aString.charAt(i)!='$'){
            aStack.push(aString.charAt(i));
            i++;
        }

        i++;

        Boolean inLanguage = true;
        while (inLanguage && i<aString.length()){
            //error here on line 26 probably something to do with the type casting 
            Object stackTop = aStack.pop();
            String top = (String)stackTop;
            try {
                if (top.equals(aString.charAt(i))) {
                    i++;
                } else {
                    inLanguage = false;
                }
            }
            catch(StackException e) {
                inLanguage = false;
            }
        }

        if(inLanguage && aStack.isEmpty()){
            System.out.println("aString is in the Language");
        } else { System.out.println("aString is not in the Language"); }

    }
}
