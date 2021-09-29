import java.util.Scanner;

/**
 * Project name(项目名称)：字符串比较
 * Package(包名): PACKAGE_NAME
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/9/29
 * Time(创建时间)： 18:38
 * Version(版本): 1.0
 * Description(描述)：
 * equalsIgnoreCase() 方法
 * equalsIgnoreCase() 方法的作用和语法与 equals() 方法完全相同，唯一不同的是 equalsIgnoreCase() 比较时不区分大小写。
 * 当比较两个字符串时，它会认为 A-Z 和 a-z 是一样的。
 */

public class test2
{
    public static void main(String[] args)
    {
        String str1 = "abc";
        String str2 = "ABC";
        System.out.println(str1.equalsIgnoreCase(str2));    // 输出 true

        /*
        在会员系统中需要输入用户名和密码进行检验，下面使用 equalsIgnoreCase() 方法实现检验登录时不区分用户名和密码的大小写，
        具体的代码实现如下所示。
         */
        String sys = "学生信息管理";
        System.out.println("欢迎进入" + sys + "系统");
        System.out.println("请输入管理员名称：");
        Scanner input = new Scanner(System.in);
        String name = input.next(); // 获取用户输入的名称
        System.out.println("请输入管理员密码：");
        input = new Scanner(System.in);
        String pass = input.next(); // 获取用户输入的密码
        // 比较用户名与密码，注意此处忽略大小写
        if (name.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("123"))
        { // 验证
            System.out.println("登录成功。");
        }
        else
        {
            System.out.println("登录失败。");
        }
    }
}
