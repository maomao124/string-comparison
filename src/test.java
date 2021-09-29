/**
 * Project name(项目名称)：字符串比较
 * Package(包名): PACKAGE_NAME
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/9/29
 * Time(创建时间)： 18:21
 * Version(版本): 1.0
 * Description(描述)： equals() 方法
 * equals() 方法将逐个地比较两个字符串的每个字符是否相同。如果两个字符串具有相同的字符和长度，它返回 true，
 * 否则返回 false。对于字符的大小写，也在检查的范围之内。equals() 方法的语法格式如下：
 * str1.equals(str2);
 * str1 和 str2 可以是字符串变量， 也可以是字符串字面量。 例如， 下列表达式是合法的：
 * "Hello".equals(greeting)
 */

public class test
{
    public static void main(String[] args)
    {
        String str1 = "abcd";
        String str2 = new String("abcd");
        String str3 = "abce";
        System.out.println("1和2比较：");
        if (str1.equals(str2))
        {
            System.out.println("相同");
        }
        else
        {
            System.out.println("不同");
        }
        System.out.println("1和3比较：");
        if (str1.equals(str3))
        {
            System.out.println("相同");
        }
        else
        {
            System.out.println("不同");
        }
    }
}

