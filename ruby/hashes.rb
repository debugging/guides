#Hashes
a = {}
a = Hash.new

#defining if not prev defined
a ||= {}
(a ||= {})["key"] = "value"
unless defined? a
    a = {}
end
a["key"] = value


a = Hash.[]{"key", 10, "key2", 11}
a = Hash.[]{"key" =>10, "key2" => 11}
a = {"key",10, "key2", 11}
a = {"key" => 10, "key2" => 11}

#default value
h = Hash.new("empty")
 h.default = "empty" #re-setting default

h["asldkjf;salkj"] # returns 'empty'

h.fetch("some_key") #returns an error if not present, 2ne param will return as default
  h.fetch("some_key", "some_default")

#adding
h["key"] = "value"
h.[]=("key", "value")
a.store("key", "value")
