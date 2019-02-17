### Java异常简述
***
Java的异常的根类是Throwable，然后派生了三个重要的类：Error用于JVM虚拟机异常，Exception用于普通异常（一般我们关注的就是这个异常），RuntimeException用于运行时异常。

Java的异常和C++很像，使用try...catch块来捕获，或者使用finally在来做最后的操作。使用throw来抛出一个异常，使用throws来告诉客户我这个函数要抛出异常（C++里面使用noexception告诉客户不会抛出异常）。
值得注意的是,含有throws的函数在调用的时候必须捕获异常（即使你确定这个函数在你的操作下不会发生异常）。
