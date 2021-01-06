package com.ma.queue.String;

public interface IString {
    int length();//求串长度
    IString contant(IString anotherString);//串的比较
    IString substring(int start, int end);//求子串
    int indexOf(IString str, int fromIndex);//串定位
    IString append(String str);//串附加
    IString delete(int start, int end);//串删除
    IString insert(int offset, IString str);//串插入
    String a="abc";
    String b="abcd";


}
