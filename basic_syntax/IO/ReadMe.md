### Java里面的文件IO
***
Java的文件IO很复杂，因为有很多不同的类实现了一样的功能，但是这些类之间又有很多差异，所以会导致学起来很烦。
***
**File类**
File类虽然是文件类，但是却不能对文件进行读写，只能获得文件的状态等信息。这个类还是比较有用的，有以下常见功能：
* 判断文件的rwx权限：canRead(),canWrite(),canExecute()
* 判断文件是否存在，以及创建文件：exists(),createNewFile()
* 获得文件路径，名称:getAbsoluteFile(),getAbsolutePath(),getName()...
* 遍历目录，创建目录:list(),mkdir()...
* 设置rwx:setReadable(),setReadOnly()...
* 重命名:rename()

File类同时也作为很多IO类需要的参数，是很重要的类

**FileOutputStream FileInputStream类**
这两个类从字节的角度来读写文件，需要一个File类对象作为构造函数参数来确定读写哪个文件，只有下面这些方法：
* 关闭:close()
* 读写（参数都是byte或者byte数组）：write()/read()
总体来说，如果要从字节方面读写的话用这个。

**RandomAccessFile**
随机读写文件的类，这个类给了不少的读写方法，这个类的构造函数比较像C/C++：需要一个File类对象，以及指定读写（"r","w","rw"...）
* 读操作：
	* read()/readBoolean()/readByte()/readInt()/readChar()/readDouble()/readFloat()/readFully()/readLine()...
* 写操作
	* write()/writeBoolean()/writeByte()/writeInt()/writeChar()/writeDouble()/writeFloat()/writeLine()...

就是一个专门为读写而生的类，用于文本文件的读写。
