import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SortOfSortTester {

    // Tests an array of an even amount of elements which should be the easeiest,
    // i.e. shouldn't have any issues
    @Test
    public void test1(){
        int[] a = {4,3,6,5,2,1};
        SortOfSort.sortOfSort(a);
        int[] exp = {4,3,1,2,5,6};
        Assert.assertArrayEquals(exp, a);
    }


    // Tests an array of an odd amount of elements in no particular order
    @Test
    public void test2(){
        int[] a = {4,7,3,6,5,2,1};
        SortOfSort.sortOfSort(a);
        int[] exp = {5,4,1,2,3,6,7};
        Assert.assertArrayEquals(exp, a);
    }

    // Tests an array of an even amount of elements that's sorted in ascending order
    @Test
    public void test3(){
        int[] a = {1,2,3,4,5,6};
        SortOfSort.sortOfSort(a);
        int[] exp = {4,3,1,2,5,6};
        Assert.assertArrayEquals(exp, a);
    }

    // Tests an array of an odd amount of elements that's sorted in ascending order
    @Test
    public void test4(){
        int[] a = {1,2,3,4,5,6,7};
        SortOfSort.sortOfSort(a);
        int[] exp = {5,4,1,2,3,6,7};
        Assert.assertArrayEquals(exp, a);
    }

    // Tests an array of larger than normal amount of elements
    @Test
    public void test5(){
        int[] a = {15,18,12,14,13,4,3,7,8,2,1,5,6,10,9,11,17,16};
        SortOfSort.sortOfSort(a);
        int[] exp = {16,15,12,11,8,7,4,3,1,2,5,6,9,10,13,14,17,18};
        Assert.assertArrayEquals(exp, a);
    }

    // Tests a smaller than normal amount of elements
    @Test
    public void test6(){
        int[] a = {3,2,1};
        SortOfSort.sortOfSort(a);
        int[] exp = {1,2,3};
        Assert.assertArrayEquals(exp, a);
    }

    // Tests an empty array
    @Test
    public void test7(){
        int[] a = {};
        SortOfSort.sortOfSort(a);
        int[] exp = {};
        Assert.assertArrayEquals(exp, a);
    }

}
