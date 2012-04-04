module m1
    include Helpers
    extend Blah

end

if obj.respond_to?(:server)
    ...
elseif redis.respond_to?(:nodes)
    ...
end

def initialize(args)
    self.prop1 = args[:prop1] || []
    self.prop2 =
        case args[:prop2]
        when 'a' then '1'
        when 'b' then '2'
        else raise "error finding #{some_thing}"
        end
end

def a
    raise "some the roof" unless @other
end


