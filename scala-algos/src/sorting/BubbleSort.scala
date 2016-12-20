package sorting

/**
 * Scala program for implementation of Bubble Sort
 * 
 * @author Surajeet Sen
 */
object BubbleSort {
  
  def sort(input: Array[Int]) : Array[Int] = {
    
    for(i <- (input.length-2) to 1 by -1) {
      for(j <- 0 to i) {
        if(input(j) > input(j+1)) {
          var temp = input(j)
          input(j) = input(j+1)
          input(j+1) = temp
        } 
      }
    }
    input
  }
  
  def main(args : Array[String]) {
    var input : Array[Int] = Array(7, 4, 1, 3, 2, 6, 5, 9, 10, 8)
    sort(input)
    for(i <- input) { print(i+ " ") }
  }
  
}