/*
 *Author: Create by 李呈云
 *Description: 演示Java中几种常用的流程控制操作
 *Date: 2016-8-31 下午02:20:25
 */

import java.util.*;

public class FlowDemo {
	public static void main(String[] args){
		int iPara1;
		int iPara2;
		int iEnd;
		if(args.length != 3){
			System.out.println("Use: java flowDemo parameter1 parameter2 circle");
			System.out.println("parameter1:比较条件1，数字类型");
			System.out.println("circle:循环次数");
			System.out.println("eg: java flowDemo 1 2 3");
			return;
		}else{
			iPara1 = Integer.parseInt(args[0]);
			iPara2 = Integer.parseInt(args[1]);
			iEnd = Integer.parseInt(args[2]);
		}
		//if 
		if(iPara2 > iPara1){
			System.out.println("if 条件满足！");
			System.out.println("第2个数比第一个数大!");
		}else{
			System.out.println("if 条件不满足！");
			System.out.println("第2个数比第一个数小！");
		}
		//for 循环
		for(int i = 0; i < iEnd; i++){
			System.out.println("这是for 第 "+ i +"次循环");
		}
		//while循环
		int i = 0;
		while(i < iEnd){
			System.out.println("这是while第"+ i +"次循环");
			i++;
		}
		//do while循环
		int j = 0;
		do{
			System.out.println("这是do while第"+ i +"次循环");
			j++;
		}while(j < iEnd);
	}
}
