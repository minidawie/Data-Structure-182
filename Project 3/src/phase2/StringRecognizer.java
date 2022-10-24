package phase2;

public class StringRecognizer {
    public static void main(String[] args) {

        //The section “Recognizing Strings in a Language” describes a recognition algorithm for
        //the language 𝐿:
        //𝐿 = {𝑤$𝑤′:𝑤 is a possibly empty string of characters other than $, 𝑤′ = 𝑟𝑒𝑣𝑒𝑟𝑠e(𝑤) }

        StackReferenceBased aStack = new StackReferenceBased();

        String test = "$";
        String aString = "abcd$abcd";

        int i = 0;
        while(aString.charAt(i)!='$'){
            aStack.push(aString.charAt(i));
            i++;
        }

//        aStack.createStack()
// push the characters before $, that is, the
// characters in w, onto the stack
//        i = 0
//       ch = character at position i in aString
//     while (ch is not '$') {
//       aStack.push(ch)
//             ++i
//           ch = character at position i in aString
// } // end while


// skip the $
        // ++i
// match the reverse of w
        //  inLanguage = true // assume string is in language
        //  while (inLanguage and i < length of aString) {
        //      ch = character at position i in aString
        //      try {
        //          stackTop = aStack.pop()
        //          if (stackTop equals ch) {
        //              ++i // characters match
        //          }
//else {
//    }// top of stack is not ch (characters do not match)
//                inLanguage = false // reject string
//            } // end if
//        } // end try
//catch (StackException e) {

// aStack.pop() failed, aStack is empty (first half of
// string is shorter than second half)
//            inLanguage = false
//        } // end catch
//    } // end while
//if (inLanguage and aStack.isEmpty()) {
//       aString is in language
//    }
//else {
//        aString is not in language
//    } // end if
    }
}
