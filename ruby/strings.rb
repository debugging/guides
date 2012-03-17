m = 'hello world'
m = 'hello world\''
m3 = "hello world's"
%q %Q
s1 = %q[This is a long sentnese that has blah's  in it"]
# can use [] or {} or () or <>
# 'here-document': for long strings use <<EOF
para = <<EOF
This is a ver long string
that keeps going
EOF

s = 'this is a string'
# s.size s.lenth
# s.downcase s.upcase swapcase
# s.capitalize 
# s.each_byte, s.each_char
# s.split s.scan
# sprintf ljust center rjust
# s.reverse
#
# ::substrings
# s1[1,5]
# s1[3, -2]
# s1[2..3]
# s1[/[a,b,c]+/]  #regex
# s1["substring"] nil if not found
# s1[0]  ascii code
# s1.sub(/teh/, "the") substitutes
# s1.gsub is global search, not just first like .sub
#
# ::search
# s1.index("a") 
#   .index(/a/)
#   .index(?a)
# s1.include? "a"
# s1.scan("a") returns array
#
# to_s to_str
# s1.chop s1.chop!
# s1.strip strip!
# s1.lstrip rstrip
# 
# string in strings
# "#{var1} is a sentence"
#
# "abc".to_s returns 0
# Integer("abc") => error!
#
# s1.count("a") counts # of a's
# s1.count("^a")
# s1.count("a-c") 

# ::string manipulation
# s1.squeeze #removes duplicates
# s1.delete("a")
# .dump
#
# md5
# MD5.new("this is cool").hexdigest
#

Regex.compile(....)
/word here/
^ $ . \w \W \d \D [] * {m,n}
