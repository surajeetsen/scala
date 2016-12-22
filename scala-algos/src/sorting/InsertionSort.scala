package sorting

/**
 * Insertion sort iterates, consuming one input element each repetition,
 * and growing a sorted output list. Each iteration, insertion sort removes
 * one element from the input data, finds the location it belongs within the
 * sorted list, and inserts it there. It repeats until no input elements remain.
 *
 * https://en.wikipedia.org/wiki/Insertion_sort
 *
 * @author Surajeet Sen
 */
object InsertionSort {

  def sort(input: Array[Int]): Array[Int] = {
    //Base condition
    if (input == null || input.length <= 1) {
      return input
    }

    for (i <- 1 to input.length - 1) {
      var isSorted: Boolean = false;
      for (j <- i to 1 by -1 if !isSorted) {
        if (input(j) > input(j - 1)) {
          isSorted = true
        } else {
          var temp = input(j - 1)
          input(j - 1) = input(j)
          input(j) = temp
        }
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