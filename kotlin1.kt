fun main() { 
  print("Enter text: ")
    var input = readLine()!!
   var k =  input.toString()
   

var k1 = ArrayList<String>()
for(i in k){
    if(i in '1'..'9'){
        k1.add("$i")
        
    }
}
print(k1)
        
 
       
}