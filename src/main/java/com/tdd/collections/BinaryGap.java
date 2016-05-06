package com.tdd.collections;

/**
 * Created by Jaskirat on 05-05-2016.
 */
public class BinaryGap {
    public int solution(int N) {

        String binaryForm =Integer.toBinaryString(N);
        System.out.println(binaryForm);

        int len= binaryForm.length();
        int x,last;
        int countGaps =0,presentCount=0,greatestCount=0;
        x= binaryForm.indexOf("1");  // first occurrence of '1'

        while(x<len-1)
        {
            last= binaryForm.indexOf("1", x+1);  // next occurrence of '1'
            if(last==-1) // check if there is no '1' in the string
                break;

            presentCount=last-x-1;
            if(presentCount>0)    // check for binary gap.
            {
                if(presentCount > greatestCount)
                    greatestCount=presentCount;

                countGaps++;
            }

            x=last;   // assignment for next search
        }
        System.out.println("Number of Binary Gaps: "+ countGaps);
        //System.out.println(greatestCount);

        return greatestCount;
    }

}
