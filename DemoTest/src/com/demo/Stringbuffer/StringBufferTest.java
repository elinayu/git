package com.demo.Stringbuffer;

public class StringBufferTest {
  public static void main(String[] args){
	  //1.append����
	  StringBuffer s1=new StringBuffer("yuhongli");
	  s1.append(" is ");
	  s1.append('a');
	  s1.append(" girl!");
	  s1.append("����");
	  fun(s1);
	  System.out.println(s1);
	  
	  //��String ���ݵĲ����޸����Ƚ�
	  String s2=new String("yuhongli");
	  fun(s2);
	  System.out.println(s2);
	  
	  //2.������λ������ַ���insert����

	 // System.out.println(s1+"�ַ����ĵ�һ���ַ������Ľ����\n"+"\t|-"+s1.insert(0, "ss "));
	  
	  //3.�ַ����ķ�ת����
	// System.out.println(s1+"�ַ�����ת�Ľ��:\n"+"\t|-"+s1.reverse());
	 
	 //4.�滻ָ����Χ������
	// System.out.println(s1+"�滻0-5:\n"+"\t|-"+s1.replace(0, 8," guochao"));
	  
	  //5.�ַ�����ȡ
	 // System.out.println(s1+"��ȡ�ַ���:\n"+"\t|-"+s1.substring(0,8));
	  
	  //6.ɾ��ָ����Χ�ڵ��ַ���
	  //System.out.println(s1+"ɾ���ַ���:\n"+"\t|-"+s1.delete(0, 8));
	  
	  //7.����ָ���������Ƿ����
	  if(s1.indexOf("yuhongli")!=-1)
	  System.out.println(s1+"���ҵ��ַ���:\n");
	  
	  //StringBufferʹ�ó���ΪƵ���޸����ݵ�ʱ��
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
	  sb.append("��˾��������Դ").append("���Թ���ʦ");
  }
  
  public static void fun(String s){
	  s=s+"��˾��������Դ"+"ְλ�����Թ���ʦ";
  }
}
