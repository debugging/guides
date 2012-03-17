[] overloads
instance.java_send :method_name, [Java::int], some_parameter

class SomeClass
    java_alias :new_method_name, :old_method_name, [Java::type]
end

some_var = some_instance.java_method :method_name, [Java::type]


SomeClass.add_class_annotation ... # requires jruby/core_ext
SomeClass.become_java!  # promotes to real java class

[] implementing java interfaces
# can also use a block if interface has only 1 method
require 'java'
java_import ...
class ABC
    include interface_here

    def implemented_method_here
    end
end

