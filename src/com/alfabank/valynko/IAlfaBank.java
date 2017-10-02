package com.alfabank.valynko;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public interface IAlfaBank {

    List initArray(List<Integer> arrayList);
    List sortArray(List<Integer> arrayList);
    int bsearch(List<Integer> arrayList, int X);

}
