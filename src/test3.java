/**
 * Project name(项目名称)：字符串比较
 * Package(包名): PACKAGE_NAME
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/9/29
 * Time(创建时间)： 18:50
 * Version(版本): 1.0
 * Description(描述)： equals()与==的比较
 */

public class test3
{
    public static void main(String[] args)
    {
        String s1 = "Hello";
        String s2 = new String(s1);
        System.out.println(s1.equals(s2)); // 输出true
        System.out.println(s1 == s2); // 输出false
    }
}
/*
理解 equals() 方法和==运算符执行的是两个不同的操作是重要的。如同刚才解释的那样，equals() 方法比较字符串对象中的字符。
而==运算符比较两个对象引用看它们是否引用相同的实例。
下面的程序说明了两个不同的字符串（String）对象是如何能够包含相同字符的，但同时这些对象引用是不相等的

变量 s1 指向由“Hello”创建的字符串实例。s2 所指的的对象是以 s1 作为初始化而创建的。因此这两个字符串对象的内容是一样的。
但它们是不同的对象，这就意味着 s1 和 s2 没有指向同一的对象，因此它们是不==的。
因此，千万不要使用==运算符测试字符串的相等性，以免在程序中出现糟糕的 bug。从表面上看，这种 bug 很像随机产生的间歇性错误。
对于习惯使用 C++ 的 String 类的人来说，在进行相等性检测的时候一定要特别小心。C++ 的 String 类重载了==运算符以便检测字符串内容的相等性。
可惜 Java 没有采用这种方式，它的字符串“看起来、感觉起来”与数值一样，但进行相等性测试时，其操作方式又类似于指针。
语言的设计者本应该像对 C++ 那样也进行特殊处理， 即重定义==运算符。
当然，每一种语言都会存在一些不太一致的地方。C 程序员从不使用==对字符串进行比较，
而使用 strcmp 函数。Java 的 compareTo 方法与 strcmp 完全类似。
 */