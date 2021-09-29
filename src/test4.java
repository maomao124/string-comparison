/**
 * Project name(项目名称)：字符串比较 string comparison
 * Package(包名): PACKAGE_NAME
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/9/29
 * Time(创建时间)： 18:52
 * Version(版本): 1.0
 * Description(描述)： compareTo() 方法
 */

/*
通常，仅仅知道两个字符串是否相同是不够的。对于排序应用来说，必须知道一个字符串是大于、等于还是小于另一个。
一个字符串小于另一个指的是它在字典中先出现。而一个字符串大于另一个指的是它在字典中后出现。字符串（String）的 compareTo() 方法实现了这种功能。
compareTo() 方法用于按字典顺序比较两个字符串的大小，该比较是基于字符串各个字符的 Unicode 值。compareTo() 方法的语法格式如下：
str.compareTo(String otherstr);
它会按字典顺序将 str 表示的字符序列与 otherstr 参数表示的字符序列进行比较。如果按字典顺序 str 位于 otherster 参数之前，
比较结果为一个负整数；如果 str 位于 otherstr 之后，比较结果为一个正整数；如果两个字符串相等，则结果为 0。
提示：如果两个字符串调用 equals() 方法返回 true，那么调用 compareTo() 方法会返回 0。
 */
public class test4
{
    public static void main(String[] args)
    {
        String str = "A";
        String str1 = "a";
        System.out.println("str=" + str);
        System.out.println("str1=" + str1);
        System.out.println("str.compareTo(str1)的结果是：" + str.compareTo(str1));
        System.out.println("str1.compareTo(str)的结果是：" + str1.compareTo(str));
        System.out.println("str1.compareTo('a')的结果是：" + str1.compareTo("a"));
    }
}
