package com.company.sdacademy.HomeWork;

public class mergeSort {

    public static void main(String[] main) {
        int[] inputArray1 = {91,3,48,2,9};
        int[] inputArray2 = {2,63,1,9,99999};
        int[] overallResult = Merge( inputArray1, inputArray2 );
        for (int a = 0; a<overallResult.length; a++) {
            System.out.print(overallResult[a]);
            System.out.print(" ");
        }
        System.out.println();
    }


    static int[] Merge (int[] arrayA, int[] arrayB){

        if (arrayA.length + arrayB.length <= 1){

            if(arrayA.length > 0){
                return arrayA;
            }

            return arrayB;
        }

        if ((arrayA.length == 1) && (arrayB.length == 1)){

            int[] result = new int[2];

            if (arrayA[0] < arrayB[0]) {
                System.arraycopy(arrayA, 0, result, 0, arrayA.length);
                System.arraycopy(arrayB, 0, result, arrayA.length, arrayB.length);
            }
            else
            {
                System.arraycopy(arrayB, 0, result, 0, arrayB.length);
                System.arraycopy(arrayA, 0, result, arrayB.length, arrayA.length);
            }
            return result;
        }

        boolean evenNumberOfElementsA = (arrayA.length / 2.0 == (double) arrayA.length / 2);

        int[] firstHalfA = new int[arrayA.length / 2];

        int lengthSecondHalfA = arrayA.length / 2;

        if (!evenNumberOfElementsA){
            lengthSecondHalfA++;
        }

        int[] secondHalfA = new int[lengthSecondHalfA];


        System.arraycopy(arrayA, 0, firstHalfA, 0, arrayA.length / 2);

        if(evenNumberOfElementsA) {
            System.arraycopy(arrayA, (arrayA.length / 2), secondHalfA, 0, arrayA.length / 2);
        }
        else
        {
            System.arraycopy(arrayA, (arrayA.length / 2), secondHalfA, 0, arrayA.length / 2 + 1);
        }






        boolean evenNumberOfElementsB = (arrayB.length / 2.0 == (double) arrayB.length / 2);

        int[] firstHalfB = new int[arrayB.length / 2];

        int lengthSecondHalfB = arrayB.length / 2;

        if (!evenNumberOfElementsB){
            lengthSecondHalfB++;
        }

        int[] secondHalfB = new int[lengthSecondHalfB];

        System.arraycopy(arrayB, 0, firstHalfB, 0, arrayB.length / 2);

        if(evenNumberOfElementsB) {
            System.arraycopy(arrayB, (arrayB.length / 2), secondHalfB, 0, arrayB.length / 2);
        }
        else
        {
            System.arraycopy(arrayB, (arrayB.length / 2), secondHalfB, 0, arrayB.length / 2 + 1);
        }



        int[] interimResultA = Merge(firstHalfA, secondHalfA);
        int[] interimResultB = Merge(firstHalfB, secondHalfB);


        int indexA = 0;
        int indexB = 0;
        int indexOverallResult = 0;

        int[] overallResult = new int[interimResultA.length + interimResultB.length];

        while (indexOverallResult < overallResult.length)  {

            if (indexA == interimResultA.length){
                System.arraycopy(interimResultB, indexB, overallResult, indexOverallResult, interimResultB.length - indexB);
                return overallResult;
            }

            if (indexB == interimResultB.length){
                System.arraycopy(interimResultA, indexA, overallResult, indexOverallResult, interimResultA.length - indexA);
                return overallResult;
            }




                if (interimResultA[indexA] < interimResultB[indexB]){
                    overallResult[indexOverallResult] = interimResultA[indexA];
                    indexOverallResult++;
                    indexA++;
                }
                else{
                    overallResult[indexOverallResult] = interimResultB[indexB];
                    indexOverallResult++;
                    indexB++;
                }

        }

        return overallResult;



    }

}
