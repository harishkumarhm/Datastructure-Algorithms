package string;

import java.util.ArrayList;
import java.util.List;

public class PhoneMnemonics {
private static final String[] MAPING = {"0","1","ABC", "DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ" };
    public static List<String> computeMnemonics(String phoneNumber)
    {
        List<String> mnemonics = new ArrayList<>();
        char[] partialMnemonics = new char[phoneNumber.length()];
        mnemonicsHelper(phoneNumber,0,mnemonics, partialMnemonics);
        return mnemonics;
    }


    public static void mnemonicsHelper(String number, int digit, List<String> list, char[] partialMnemonics)
    {
        if(digit==number.length()-1)
        {
            list.add(new String(partialMnemonics));
        }else
        {
            for(int i=0; i<(MAPING[number.charAt(digit)-'0'].length()); i++)
            {
                char c = MAPING[number.charAt(digit)-'0'].charAt(i);
                partialMnemonics[digit] = c;

                mnemonicsHelper(number,digit+1, list, partialMnemonics);
            }
        }

    }

    public static void main(String[] args)
    {
        List<String> mnemonics = (computeMnemonics("9901370388"));
        System.out.println(mnemonics.size());
        for(String mnemonic: mnemonics)
        {
            System.out.println(mnemonic);
        }
    }
}
