package com.wrap;

// 包装类的类型转换
public class WrapBox {
    public static void main(String[] args) {
        String numberString = "100";
        int number001 = Integer.parseInt(numberString);
        System.out.println(number001 + 2); // 102
//        隐士转换为int类型
        System.out.println(Integer.valueOf(numberString) + 2);
//        如果数值在-127 - 127之间他们是相等的，不在这个返回不相等
//        Integer.valueOf操作会在缓存区存入，如果在上述范围会之间取对象常量池数据
//        Float Double不能使用应用对象常量池
        System.out.println(Integer.valueOf("188") == Integer.valueOf("188")); // 188 false
        System.out.println(Integer.valueOf(numberString) == Integer.valueOf(numberString)); // 100 true
    }
}
