package ThreadPool;

/**
 * @author Picker
 * @date 2022/4/10 21:30
 */
public class test {
    public static void main(String[] args) {
        System.out.println("(@x)(P(x)>(Q(x)&R(x)))&(@x)(P(x)&S(x))&~(#x)(S(x)&R(x))\n" +
                "消除蕴含和等价：(@x)(~P(x)|(Q(x)&R(x)))&(@x)(P(x)&S(x))&~(#x)(S(x)&R(x))\n" +
                "将 否 定 符 号 紧 贴 原 子 符 号 ， 并 且 重 复 的 否 定 符 号 自 动 消 除 ：\n" +
                "(@x)(~P(x)|(Q(x)&R(x)))&(@x)(P(x)&S(x))&(@x)(~S(x)|~R(x))\n" +
                "把 辖 域 内 的 对 应 的 字 符 都 转 换 为 另 一 种 字 符 ( 标 准 化 ) ：\n" +
                "(@a)(~P(a)|(Q(a)&R(a)))&(@b)(P(b)&S(b))&(@c)(~S(c)|~R(c))\n" +
                "量词提取：(@a)(@b)(@c)((~P(a)|(Q(a)&R(a)))&(P(b)&S(b))&(~S(c)|~R(c)))\n" +
                "删除存在量词：(@a)(@b)(@c)((~P(a)|(Q(a)&R(a)))&(P(b)&S(b))&(~S(c)|~R(c)))\n" +
                "删除全称量词和多余括号：(~P(a)|(Q(a)&R(a)))&(P(b)&S(b))&(~S(c)|~R(c))\n" +
                "化为合取范式：(~P(a)|Q(a))&(~P(a)|R(a))&P(b)&S(b)&(~S(c)|~R(c))\n" +
                "消除合取符号：['(~P(a)|Q(a))', '(~P(a)|R(a))', 'P(b)', 'S(b)', '(~S(c)|~R(c))']\n" +
                "标准化子句集：['(~P(a)|Q(a))', '(~P(b)|R(b))', 'P(c)', 'S(d)', '(~S(e)|~R(e))']\n" +
                "内部分解：[['~P(a)', '|', 'Q(a)'], ['~P(b)', '|', 'R(b)'], ['P(c)'], ['S(d)'], ['~S(e)', '|', '~R(e)']]\n" +
                "所有的因子式：['~P(a)', 'Q(a)', '~P(b)', 'R(b)', 'P(c)', 'S(d)', '~S(e)', '~R(e)']\n" +
                "函数字典：{'P': [['a'], ['b'], ['c']], 'Q': [['a']], 'R': [['b'], ['e']], 'S': [['d'], ['e']]}\n" +
                "合一之后的字典：{'P': ['d'], 'Q': ['d'], 'R': ['d'], 'S': ['d']}\n" +
                "原子式合一：[['~P(d)', 'Q(d)'], ['~P(d)', 'R(d)'], ['P(d)'], ['S(d)'], ['~S(d)', '~R(d)']]\n" +
                "原子式内互补消除：[['~P(d)', 'Q(d)'], ['~P(d)', 'R(d)'], ['P(d)'], ['S(d)'], ['~S(d)', '~R(d)']]\n" +
                "归结第 1 次[['Q(d)'], ['R(d)'], ['~P(d)', '~S(d)'], ['Q(d)'], ['R(d)'], ['~R(d)'], ['~S(d)', '~P(d)'], ['~R(d)']]\n" +
                "归结第 2 次[[], [], [], [], [], [], [], []]\n" +
                "可以归结的原子式在归结过程中推出了 Nil，成功推出\n" +
                "最一般合一：{'d': ['b', 'c', 'e', 'a']}");
    }
}
