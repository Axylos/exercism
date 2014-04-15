class Hamming

  def self.compute(a, b)
    nucs = a.chars.zip b.chars
    nucs.count {|(a, b)| a != b and ( a && b)}
  end
end

