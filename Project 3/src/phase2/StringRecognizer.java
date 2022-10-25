package phase2;

public class StringRecognizer {
    public static void main(String[] args) {

        //The section “Recognizing Strings in a Language” describes a recognition algorithm for
        //the language 𝐿:
        //𝐿 = {𝑤$𝑤′:𝑤 is a possibly empty string of characters other than $, 𝑤′ = 𝑟𝑒𝑣𝑒𝑟𝑠e(𝑤) }

        StackReferenceBased aStack = new StackReferenceBased();

        //result for this string should return not in language
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
            char top = (char)stackTop;
            try {
                if (top==aString.charAt(i)) {
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




        StackReferenceBased aStack2 = new StackReferenceBased();
        //result in this string should return in language
        String aString2 = "abcd$dcba";

        int j = 0;
        while(aString2.charAt(j)!='$'){
            aStack2.push(aString2.charAt(j));
            j++;
        }

        j++;

        Boolean inLanguage2 = true;
        while (inLanguage2 && j<aString2.length()){
            Object stackTop2 = aStack2.pop();
            char top2 = (char)stackTop2;
            try {
                if (top2==aString2.charAt(j)) {
                    j++;
                } else {
                    inLanguage2 = false;
                }
            }
            catch(StackException e) {
                inLanguage2 = false;
            }
        }

        if(inLanguage2 && aStack2.isEmpty()){
            System.out.println("aString is in the Language");
        } else { System.out.println("aString is not in the Language"); }




        StackReferenceBased aStack3 = new StackReferenceBased();
        //result in this string should return not in language
        String aString3 = "abcd$dcb";

        int k = 0;
        while(aString3.charAt(k)!='$'){
            aStack3.push(aString3.charAt(k));
            k++;
        }

        k++;

        Boolean inLanguage3 = true;
        while (inLanguage3 && k<aString3.length()){
            Object stackTop3 = aStack3.pop();
            char top3 = (char)stackTop3;
            try {
                if (top3==aString3.charAt(k)) {
                    k++;
                } else {
                    inLanguage3 = false;
                }
            }
            catch(StackException e) {
                inLanguage3 = false;
            }
        }

        if(inLanguage3 && aStack3.isEmpty()){
            System.out.println("aString is in the Language");
        } else { System.out.println("aString is not in the Language"); }



    }
}
