import java.util.Objects;
import java.util.Scanner;

/*
在第一次进入系统时要求管理员设置一个密码，出于安全考虑密码需要输入两次，
如果两次输入的密码一致才生效，否则提示失败。具体实现代码如下：
 */
public class pass
{
    public static void main(String[] args)
    {
        String sys = "学生信息管理";
        System.out.println("欢迎进入" + sys + "系统");
        System.out.println("请设置一个管理员密码：");
        Scanner input = new Scanner(System.in);
        String pass = input.next();
        System.out.println("请再次输入：");
        String pass2 = input.next();
        if (Objects.equals(pass, pass2))
        {
            System.out.println("设置的密码已经生效，密码为" + pass);
        }
        else
        {
            System.out.println("两次输入的密码不一致！！！");
        }
    }
}
