module m1
    include Helpers
    extend Blah

end

if obj.respond_to?(:server)
    ...
elseif redis.respond_to?(:nodes)
    ...
end


