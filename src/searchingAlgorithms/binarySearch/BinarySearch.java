/*
 * CONDITION: Given an sorted array, numbers[], of n elements, search for a given value from user input.
 * TIME COMPLEXITY: O(log n)
 * AUXILIARY SPACE: O(log n)
 * SOLUTION:
 * 1. Starting from the mid element of the array, compare the element with the value of user input.
 * 2. If the value of the element matches the user input value, return the index.
 * 3. If the value of the search element from the user input is less than the mid element, narrow the
 * interval to the lower half of the array elements.
 * 3. Otherwise, narrow the interval to the upper half of the array elements.
 * 4. Repeatedly compare with the mid element of the new interval until interval is empty.
 * 5. If no match was found, return -1.
 */

package searchingAlgorithms.binarySearch;

import java.util.List;

public class BinarySearch<T extends Comparable <T>> {

  private List<T> list;

  public BinarySearch(List <T> list){
    this.list = list;
  }
  public int indexOf (T item){
    int start = 0;
    int end = list.size() - 1;

    while (start <= end){
      int mid = (start + end) / 2;
      T listItem = list.get(mid);
      if (listItem.equals(item)){
        return mid;
      }

      int comp = item.compareTo(listItem);
      if (comp < 0){
        end = mid - 1;
      } else if (comp > 0){
        start = mid + 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {

  }
}
