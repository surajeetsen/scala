package sorting

/**
 * Scala program for implementation of Quick Sort
 * 
 * @author Surajeet Sen
 */
object QuickSort {
  
  //Random number generator
  val r = scala.util.Random
  
  def sort(input : Array[Int]) : Array[Int] = {
    var n = input.length
    if(n <= 1) {
      return input
    }
    return sortUtil(input, 0, n-1)
  }
  
  def sortUtil(input: Array[Int], low: Int, high: Int) : Array[Int] = {
    var pivot = low + r.nextInt(high - low) //selecting a random index to be the pivot
    
    var i = low
    var j = high
    
    while(i <= j) {
      while(input(i) < input(pivot)) {
        i = i + 1
      }
      
      while(input(j) > input(pivot)) {
        j = j - 1
      }
      
      if(i <= j) {
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
  
  def main(args : Array[String]) {
    var input : Array[Int] = Array(7, 4, 1, 3, 2, 6, 5, 9, 10, 8)
    sort(input)
    for(i <- input) { print(i+ " ") }
  }
  
}