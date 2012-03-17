FLOAT::MIN/MAX
5/8 #0
5.0/8 #0.626

a = 10
a/100 #0
a.to_f/100 #0.10
Float(a)/100 #0.10

# / ** + - 
1.2345.round # 1

#eval(sprintf(  ) )

require 'bigdecimal'
a = BigDecimal("12.5")
b = BigDecimal("10.0")
a - b
(a-b).to_s("F")
a.add(b,4) # a.add a.sub a.div

