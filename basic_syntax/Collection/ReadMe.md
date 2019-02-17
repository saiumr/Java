### Java里面的容器一览

***

和C++不一样，Java里面的容器采用接口继承和实现的方式，所以产生了一些奇特的用法。

首先来看看继承图:

![1](/Users/visualgmq/Documents/program/Java8/basic_syntax/Collection/1.png)

总共的接口，不算上Iterator迭代器系列的，其实就只有Collection,Map,List,Set和Queue。其中Collection是所有容器的根接口，List,Set,Queue和Map都是继承它的。然后List接口又有ArrayList(顺序表)和LinkedList(链表)，Map有HashMap(哈希表)和TreeMap。

这里有一点要注意的是，这里的LinkedList同时实现Set，List和Queue。也就是说如果你这么写：

```java
List<String> list = new LinkedList<String>()
```

那么就是转换为List接口，就要使用List接口给出的方法，而如果这么写：

```java
Queue<String> queue =new LinkedList<String>()
```

就是转换为Queue，要使用Queue的方法。

所以出现这种情况的时候，你可以向上转型来让一个类有不同的使用方法。



基本的成员函数的话请看Dash，毕竟Java这个东西每一版本都不一样。