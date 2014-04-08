 n = 5
 range = "1 11 31 41 51".split(" ")
 range.map! {|x| x.to_i }
 bin1 = 0
 bin2 = 0
 i = 0
 ans = 0
 def findDiff(a, b, range)
   cntr = 0
   start = range[a]
   while start != range[b]
     cntr += 1
     start = range[a + cntr]
   end
   return cntr
 end

 while i < 2
   res = findDiff(i, (i + 1), range)
   (bin1 == res) ? bin1 = res : bin2 = res
   i += 1
 end

 incr = [bin1, bin2].min
 incr = [bin1, bin2].max if bin1 == 0 || bin2 == 0
 k = range[0]
 puts incr
 for i in range
   if k != i
     ans = k
     break
   end
   k += incr
 end

# print ans
