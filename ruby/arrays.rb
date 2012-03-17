a = []
a = Array.new
a = Array.new(10)
a = Array.new(10, "abc") # initial size and default value
a = Array.new(10) { "abc" }

a = [1,2,3]
a[0]
a[-1]
a[1..2]
a[1...2]
a.slice(2)
a.first
a.last
a.values_at(1)
a.values_at(1,2,-1)
a.length
a.size
a.nitems #size but ignore nil
a.empty?

#deleting
a.clear
a.delete_at(index)
a.delete("and")
a.delete_if {|x| x > 4}
a.slice!(a..b)
a.pop #deletes last item
a.shift #deletes first item
a.reject *block*

#adding
a << 123
a.concat(b)
a.unshift 9
a.push 3939

sentence = "hello how are you"
sentence.sort!
or
sentence.sort {|a,b| a.to_s <=> b.to_s}
#custom sort
sentence.sort do |a,b|
  ...
  ..
  .
  a <=> b
end

a.detect *block*  #finds first
a.select or a.find_all *block* #searches all
 a.reject # oppose of select
a.min
a.max
a.index(a.min) #index of min element
a.include?
 a.member? #mixin from comparable

a.grep(/pattern/) # compares each element to pattern
  a.grep(/a/)
  a.grep(1..10)
a.grep(/a/) {|x| x + 's'} #modifies element

a | b #combines all elements
a & b #only elements in both
a - b #all of a minus b

a.collect {|x| ... } #produces new array
  a.map # alias of collect
a.compact #removes nils

#looping
a.each
a.reverse_each
a.each_index
  a.each_with_index do |x,y|

a.join(",") # 1,2,3,4,5 (string)
a.compact # removes nils
a.reverse
a.uniq # removes duplicates
a.zip(b)
a.flatten


