object Solution {
    def fib(n: Int): Int = {
        var mem: Array[Int] = Array.fill(n+1)(-1)
        mFib(n, mem)
        
    }
    
    def mFib(N : Int, mem: Array[Int]):Int ={
        if (mem(N) == -1){
            N match {
                case 0 => mem(0) = 0
                case 1 => mem(1) = 1
                case _ => mem(N) = mFib(N-1, mem) + mFib(N-2, mem)
            }
        }
        
        mem(N)
    }
}