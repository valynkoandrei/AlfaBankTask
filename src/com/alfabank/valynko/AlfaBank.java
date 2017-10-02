package com.alfabank.valynko;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.*;

public class AlfaBank implements IAlfaBank {
    private Random random = new Random();

    public static void main(String[] args) throws IOException, URISyntaxException {
        AlfaBank controller = new AlfaBank();
        List<Integer> arrayList = new ArrayList<>();
        arrayList=controller.initArray(arrayList);
        arrayList=controller.sortArray(arrayList);
        System.out.println(arrayList);
        int result = controller.bsearch(arrayList,5);
        System.out.println(arrayList.get(result));
    }


    @Override
    public List initArray(List<Integer> arrayList) {
        int size = random.nextInt(10);
        for (int i=0; i<size; i++)
            arrayList.add(random.nextInt(10));
        return arrayList;
    }

    @Override
    public List sortArray(List<Integer> arrayList) {
        Collections.sort(arrayList, Collections.reverseOrder());
        return arrayList;
    }

    @Override
    public int bsearch(List<Integer> arrayList, int X) {
        int index = Collections.binarySearch(arrayList,X,Collections.reverseOrder());
        int returnIndex = index < 0 ? (index * (-1) - 1) : index;
        if (returnIndex != arrayList.size()-1 && arrayList.get(returnIndex) == X) returnIndex++;
        return returnIndex;
    }

}
