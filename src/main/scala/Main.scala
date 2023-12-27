object Main {

  class node(val TRx:Int,val TRy:Int,val Tx:Int, val Ty: Int, val TLx: Int, val TLy: Int,
             val Rx:Int,val Ry:Int,val Nx:Int, val Ny: Int, val Lx: Int, val Ly: Int,
             val BRx:Int,val BRy:Int,val Bx:Int, val By: Int, val BLx: Int, val BLy: Int)
  { private def checker(x:Int, y:Int):Boolean =true
    def refresh(): Boolean = {
      var count =0
      if checker(TRx,TRy) then count+=1
      if checker(Tx,Ty) then count+=1
      if checker(TLx,TLy) then count+=1
      if checker(Rx,Ry) then count+=1
      if checker(Lx,Ly) then count+=1
      if checker(BRx,BRy) then count+=1
      if checker(Bx,By) then count+=1
      if checker(BRx,BLy) then count+=1

      val Current :Boolean = checker(Nx,Ny)
      if count <= 1 || count >= 4 then false
      else if !Current && count == 3 then true
      else Current
    }
  }
}