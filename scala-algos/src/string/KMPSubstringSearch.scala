package string

/**
 * Scala implementation of KMP Algorithm for Substring search
 * 
 * @author Surajeet Sen 
 */
object KMPSubstringSearch {
  
  def hasSubstring(text : String, pattern : String) : Boolean = {
    val suffixArr : Array[Int] = computeSuffixArr(pattern)
    
    var i = 0
    var j = 0
    
    while(i < text.length() && j < pattern.length) {
      if(text(i) == pattern(j)) {
        i = i + 1
        j = j + 1
      } else {
        if(j != 0) {
          j = suffixArr(j-1)
        } else {
          i = i + 1
        }
      }
    }
    
    if(j == pattern.length()) {
      return true
    }
    
    return false
  }
  
  def computeSuffixArr(pattern : String) : Array[Int] = {
    var suffixArr : Array[Int] = new Array[Int](pattern.length());
    var i = 1
    var j = 0
    
    while(i < pattern.length()) {
      if(pattern(j) == pattern(i)) {
        suffixArr(i) = j + 1
        j = j + 1
        i = i + 1
      } else {
        if(j != 0) {
          j = suffixArr(j-1)
        } else {
          suffixArr(i) = 0
          i = i + 1
        }
      }
    }
    suffixArr
  }
  
  def main(args : Array[String]) {
    val text : String = "abcdfabcdfabcdfabcdfabcdfabcdfabcdfabcdfabcdfabcdfabcdefabcd";
    val pattern : String = "abcde";
    
    println(hasSubstring(text, pattern))
  }
  
}