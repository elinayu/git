package com.demo.Stringbuffer;

public class StringBufferTest {
  public static void main(String[] args){
	  //1.append方法
	  StringBuffer s1=new StringBuffer("yuhongli");
	  s1.append(" is ");
	  s1.append('a');
	  s1.append(" girl!");
	  s1.append("哈哈");
	  fun(s1);
	  System.out.println(s1);
	  
	  //与String 内容的不可修改做比较
	  String s2=new String("yuhongli");
	  fun(s2);
	  System.out.println(s2);
	  
	  //2.在任意位置添加字符串insert方法

	 // System.out.println(s1+"字符串的第一个字符后插入的结果：\n"+"\t|-"+s1.insert(0, "ss "));
	  
	  //3.字符串的反转操作
	// System.out.println(s1+"字符串反转的结果:\n"+"\t|-"+s1.reverse());
	 
	 //4.替换指定范围的内容
	// System.out.println(s1+"替换0-5:\n"+"\t|-"+s1.replace(0, 8," guochao"));
	  
	  //5.字符串截取
	 // System.out.println(s1+"截取字符串:\n"+"\t|-"+s1.substring(0,8));
	  
	  //6.删除指定范围内的字符串
	  //System.out.println(s1+"删除字符串:\n"+"\t|-"+s1.delete(0, 8));
	  
	  //7.查找指定的内容是否存在
	  if(s1.indexOf("yuhongli")!=-1)
	  System.out.println(s1+"查找到字符串:\n");
	  
	  //StringBuffer使用场景为频繁修改内容的时候；
	  StringBuffer sb2=new StringBuffer();
	  int[] str = new int[10];
	 
	  for(int i=0;i<10;i++)
		  //str[i]=String.valueOf(i+1);
		  str[i]=i+1;
	  for(int i=0;i<10;i++)
		  sb2.append(str[i]);
	  System.out.println(sb2);

  }
  public static void fun(StringBuffer sb){
	  sb.append("公司：天脉聚源").append("测试工程师");
  }
  
  public static void fun(String s){
	  s=s+"公司：天脉聚源"+"职位：测试工程师";
  }
}
