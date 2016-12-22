package sorting

/**
 * Bubble sort, sometimes referred to as sinking sort, is a simple
 * sorting algorithm that repeatedly steps through the list to be
 * sorted, compares each pair of adjacent items and swaps them if
 * they are in the wrong order. The pass through the list is repeated
 * until no swaps are needed, which indicates that the list is sorted.
 * The algorithm, which is a comparison sort, is named for the way smaller
 * or larger elements "bubble" to the top of the list.
 *
 * https://en.wikipedia.org/wiki/Bubble_sort
 *
 * @author Surajeet Sen
 */
object BubbleSort {

  def sort(input: Array[Int]): Array[Int] = {
    //Base condition
    if (input == null || input.length <= 1) {
      return input
    }

    for (i <- (input.length - 2) to 1 by -1) {
      for (j <- 0 to i) {
        if (input(j) > input(j + 1)) {
          var temp = input(j)
          input(j) = input(j + 1)
          input(j + 1) = temp
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