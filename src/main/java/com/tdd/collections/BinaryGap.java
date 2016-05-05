package com.tdd.collections;

/**
 * Created by Jaskirat on 05-05-2016.
 */
public class BinaryGap {
    public int solution(int N) {

        StringBuilder binary = binaryForm(N);
        int lastCount = 0, presentCount = 0, numberOfGaps = 0;

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') // looks for occurence of 1 for chain break/initiation
            {
                if (i > 1 && binary.charAt(i - 1) == '1') // check for consecutive 1's
                {
                    presentCount = 0; // if so then break the chain
                } else {

                    if (lastCount <= presentCount) // look for greater value
                    {
                        lastCount = presentCount;
                        presentCount = 0;
                    }
                    numberOfGaps++;
                }
            }

            else {
                if (i == binary.length()-1) {
                    presentCount = 0; //
                    numberOfGaps--;
                } else {
                    presentCount++; // increasing chain count
                }
            }
        }

        System.out.println(lastCount + " : " + presentCount + " : " + numberOfGaps);
        return lastCount;
    }

    public StringBuilder binaryForm(int N) {
        int rem;
        int quotient = N;
        StringBuilder revBinary = new StringBuilder("");
        while (quotient > 1) {
            rem = quotient % 2;
            quotient /= 2;
            revBinary.append(rem);
        }
        revBinary.append(quotient);
        return revBinary.reverse();
    }

}
