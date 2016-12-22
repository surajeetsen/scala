package sorting

/**
 * Quicksort is a divide and conquer algorithm. Quicksort first divides a large array
 * into two smaller sub-arrays: the low elements and the high elements. Quicksort can
 * then recursively sort the sub-arrays.
 *
 * The steps are:
 * -> Pick an element, called a pivot, from the array.
 *
 * -> Partitioning: reorder the array so that all elements with values less than the
 * 		pivot come before the pivot, while all elements with values greater than the
 * 		pivot come after it (equal values can go either way). After this partitioning,
 * 		the pivot is in its final position. This is called the partition operation.
 *
 * -> Recursively apply the above steps to the sub-array of elements with smaller
 *    values and separately to the sub-array of elements with greater values.
 *
 * https://en.wikipedia.org/wiki/Quicksort
 *
 * @author Surajeet Sen
 */
object QuickSort {

  //Random number generator
  val r = scala.util.Random

  def sort(input: Array[Int]): Array[Int] = {
    //Base condition
    if (input == null || input.length <= 1) {
      return input
    }

    return sortUtil(input, 0, input.length - 1)
  }

  def sortUtil(input: Array[Int], low: Int, high: Int): Array[Int] = {
    //selecting a random index to be the pivot
    var pivot = low + r.nextInt(high - low)

    var i = low
    var j = high

    while (i <= j) {
      while (input(i) < input(pivot)) {
        i = i + 1
      }

      while (input(j) > input(pivot)) {
        j = j - 1
      }

      if (i <= j) {
        var temp = input(i)
        input(i) = input(j)
        input(j) = temp
        i = i + 1
        j = j - 1
      }
    }

    if (low < j) {
      sortUtil(input, low, j);
    }

    if (i < high) {
      sortUtil(input, i, high);
    }

    input
  }

  def main(args: Array[String]) {
    var input: Array[Int] = Array(7, 4, 1, 3, 2, 6, 5, 9, 10, 8)
    sort(input)
    for (i <- input) { print(i + " ") }
  }

}