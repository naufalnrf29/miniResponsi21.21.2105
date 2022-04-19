fun main(){

   //   Lambda Function
   val luasPersegi : (Int, Int) -> Int = { p:Int, l:Int ->
      val hasil = p * l
      hasil
   }

   //   Extention Function
   fun Int.keliling (p: Int, l:Int):Int{
      return this * (p+l)
   }

   print("Panjang : ")
   var panjangTest = readLine()!!
   var panjang = panjangTest.toInt()
   print("Lebar : ")
   var lebarTest = readLine()!!
   var lebar = lebarTest.toInt()

   val hasil = luasPersegi(panjang,lebar)
   print("Luas : ")
   println(hasil)



   print("Keliling : ")
   println(2.keliling(panjang,lebar))
   }

