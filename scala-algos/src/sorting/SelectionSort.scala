package sorting

/**
 * Scala program for implementation of Selection Sort
 * 
 * @author Surajeet Sen
 */
object SelectionSort {
  
  def sort(input: Array[Int]) : Array[Int] = {
    
    for(i <- 0 to input.length-2) {
      var minIndex = i //consider the current element to be the smallest
      for(j <- i+1 to input.length-1) {
        if(input(minIndex) > input(j)) {
          minIndex = j
        }
      }
      
      //If the current element is not the smallest
      //swap the smallest value with the current value 
      if(minIndex != i) {
        var temp = input(i)
        input(i) = input(minIndex)
        input(minIndex) = temp
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