package sorting

/**
 * The algorithm divides the input list into two parts: the sublist of items
 * already sorted, which is built up from left to right at the front (left)
 * of the list, and the sublist of items remaining to be sorted that occupy
 * the rest of the list. Initially, the sorted sublist is empty and the unsorted
 * sublist is the entire input list. The algorithm proceeds by finding the smallest
 * (or largest, depending on sorting order) element in the unsorted sublist, exchanging
 * (swapping) it with the leftmost unsorted element (putting it in sorted order), and
 * moving the sublist boundaries one element to the right.
 *
 * https://en.wikipedia.org/wiki/Selection_sort
 *
 * @author Surajeet Sen
 */
object SelectionSort {

  def sort(input: Array[Int]): Array[Int] = {
    //Base condition
    if (input == null || input.length <= 1) {
      return input
    }

    for (i <- 0 to input.length - 2) {
      var minIndex = i //consider the current element to be the smallest
      for (j <- i + 1 to input.length - 1) {
        if (input(minIndex) > input(j)) {
          minIndex = j
        }
      }

      //If the current element is not the smallest
      //swap the smallest value with the current value 
      if (minIndex != i) {
        var temp = input(i)
        input(i) = input(minIndex)
        input(minIndex) = temp
      }
    }

    input
  }

  def main(args: Array[String]) {
    var input: Array[Int] = Array(7, 4, 1, 3, 2, 6, 5, 9, 10, 8)
    sort(input)
    for (i <- input) { print(i + " ") }
  }

}