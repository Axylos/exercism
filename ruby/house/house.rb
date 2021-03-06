class House


  def verse(n, stuff=[], ans="")
    return ans if n < 1
    things = { 
      1=> "the house that", 
      2=> "the malt that lay in", 
      3=>"the rat that ate", 
      4=>"the cat that killed", 
      5=> "the dog that worried", 
      6=> "the cow with the crumpled horn that tossed", 
      7=> "the maiden all forlorn that milked", 
      8=>"the man all tattered and torn that kissed", 
      9=> "the priest all shaven and shorn that married", 
      10=> "the rooster that crowed in the morn that woke", 
      11=> "the farmer sowing his corn that kept", 
      12=> "the horse and the hound and the horn that belonged to"
    }
     stuff.push(things[n])
    ans = "This is #{stuff.join(" ")} Jack built.\n"
    verse(n-1, stuff, ans)
  end

  def verses(a, b)

    (a..b).map {|elem| verse(elem) << "\n"}.join
  end
end



