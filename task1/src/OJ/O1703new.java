package OJ;

import java.util.Scanner;

public class O1703new {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] num=new int[n];
		int[] ans=new int[n];
		int a=7;
		for(int i=0;i<n;i++) {
			num[i]=in.nextInt();
			if(num[i]>=0&&num[i]<4)ans[i]=1;
			else if(num[i]>=4&&num[i]<5)ans[i]=2;
			else if(num[i]>=5&&num[i]<7)ans[i]=3;
			else if(num[i]>=a&&num[i]<++a)ans[i]=4;
			else if(num[i]>=a&&num[i]<++a)ans[i]=5;
			else if(num[i]>=a&&num[i]<++a)ans[i]=6;
			else if(num[i]>a&&num[i]<++a)ans[i]=7;
			else if(num[i]>a&&num[i]<a++)ans[i]=8;
			else if(num[i]>=12&&num[i]<++a)ans[i]=9;
			else if(num[i]>=13&&num[i]<++a)ans[i]=10;
			else if(num[i]>=14&&num[i]<++a)ans[i]=11;
			else if(num[i]>=15&&num[i]<++a)ans[i]=13;
			else if(num[i]>=16&&num[i]<++a)ans[i]=14;
			else if(num[i]>=17&&num[i]<++a)ans[i]=15;
			else if(num[i]>=18&&num[i]<++a)ans[i]=16;
			else if(num[i]>=19&&num[i]<++a)ans[i]=18;
			else if(num[i]>=20&&num[i]<++a)ans[i]=19;
			else if(num[i]>=a&&num[i]<++a)ans[i]=20;
			else if(num[i]>=a&&num[i]<++a)ans[i]=22;
			else if(num[i]>=a&&num[i]<++a)ans[i]=23;
			else if(num[i]>=a&&num[i]<++a)ans[i]=24;
			else if(num[i]>=a&&num[i]<++a)ans[i]=26;
			else if(num[i]>=a&&num[i]<++a)ans[i]=27;
			else if(num[i]>=a&&num[i]<++a)ans[i]=29;
			else if(num[i]>=a&&num[i]<++a)ans[i]=30;
			else if(num[i]>=a&&num[i]<++a)ans[i]=31;
			else if(num[i]>=a&&num[i]<++a)ans[i]=33;
			else if(num[i]>=a&&num[i]<++a)ans[i]=34;
			else if(num[i]>=a&&num[i]<++a)ans[i]=36;
			else if(num[i]>=a&&num[i]<++a)ans[i]=37;
			else if(num[i]>=a&&num[i]<++a)ans[i]=39;
			else if(num[i]>=a&&num[i]<++a)ans[i]=41;
			else if(num[i]>=a&&num[i]<++a)ans[i]=42;
			else if(num[i]>=a&&num[i]<++a)ans[i]=44;
			else if(num[i]>=a&&num[i]<++a)ans[i]=45;
			else if(num[i]>=a&&num[i]<++a)ans[i]=47;
			else if(num[i]>=a&&num[i]<++a)ans[i]=48;
			else if(num[i]>=a&&num[i]<++a)ans[i]=50;
			else if(num[i]>=a&&num[i]<++a)ans[i]=52;
			else if(num[i]>=a&&num[i]<++a)ans[i]=53;
			else if(num[i]>=a&&num[i]<++a)ans[i]=55;
			else if(num[i]>=a&&num[i]<++a)ans[i]=57;
			else if(num[i]>=a&&num[i]<++a)ans[i]=58;
			else if(num[i]>=a&&num[i]<++a)ans[i]=60;
			else if(num[i]>=a&&num[i]<++a)ans[i]=62;
			else if(num[i]>=a&&num[i]<++a)ans[i]=63;
			else if(num[i]>=a&&num[i]<++a)ans[i]=65;
			else if(num[i]>=a&&num[i]<++a)ans[i]=67;
			else if(num[i]>=a&&num[i]<++a)ans[i]=68;
			else if(num[i]>=a&&num[i]<++a)ans[i]=70;
			else if(num[i]>=a&&num[i]<++a)ans[i]=72;
			else if(num[i]>=a&&num[i]<++a)ans[i]=74;
			else if(num[i]>=a&&num[i]<++a)ans[i]=75;
			else if(num[i]>=a&&num[i]<++a)ans[i]=77;
			else if(num[i]>=a&&num[i]<++a)ans[i]=79;
			else if(num[i]>=a&&num[i]<++a)ans[i]=81;
			else if(num[i]>=a&&num[i]<++a)ans[i]=82;
			else if(num[i]>=a&&num[i]<++a)ans[i]=84;
			else if(num[i]>=a&&num[i]<++a)ans[i]=86;
			else if(num[i]>=a&&num[i]<++a)ans[i]=88;
			else if(num[i]>=a&&num[i]<++a)ans[i]=90;
			else if(num[i]>=a&&num[i]<++a)ans[i]=91;
			else if(num[i]>=a&&num[i]<++a)ans[i]=93;
			else if(num[i]>=a&&num[i]<++a)ans[i]=95;
			else if(num[i]>=a&&num[i]<++a)ans[i]=97;
			else if(num[i]>=a&&num[i]<++a)ans[i]=99;
			else if(num[i]>=a&&num[i]<++a)ans[i]=101;
			else if(num[i]>=a&&num[i]<++a)ans[i]=102;
			else if(num[i]>=a&&num[i]<++a)ans[i]=104;
			else if(num[i]>=a&&num[i]<++a)ans[i]=106;
			else if(num[i]>=a&&num[i]<++a)ans[i]=108;
			else if(num[i]>=a&&num[i]<++a)ans[i]=110;
			else if(num[i]>=a&&num[i]<++a)ans[i]=112;
			else if(num[i]>=a&&num[i]<++a)ans[i]=114;
			else if(num[i]>=a&&num[i]<++a)ans[i]=116;
			else if(num[i]>=a&&num[i]<++a)ans[i]=117;
			else if(num[i]>=a&&num[i]<++a)ans[i]=119;
			else if(num[i]>=a&&num[i]<++a)ans[i]=121;
			else if(num[i]>=a&&num[i]<++a)ans[i]=123;
			else if(num[i]>=a&&num[i]<++a)ans[i]=125;
			else if(num[i]>=a&&num[i]<++a)ans[i]=127;
			else if(num[i]>=a&&num[i]<++a)ans[i]=129;
			else if(num[i]>=a&&num[i]<++a)ans[i]=131;
			else if(num[i]>=a&&num[i]<++a)ans[i]=133;
			else if(num[i]>=a&&num[i]<++a)ans[i]=135;
			else if(num[i]>=a&&num[i]<++a)ans[i]=137;
			else if(num[i]>=a&&num[i]<++a)ans[i]=139;
			else if(num[i]>=a&&num[i]<++a)ans[i]=141;
			else if(num[i]>=a&&num[i]<++a)ans[i]=143;
			else if(num[i]>=a&&num[i]<++a)ans[i]=145;
			else if(num[i]>=a&&num[i]<++a)ans[i]=147;
			else if(num[i]>=a&&num[i]<++a)ans[i]=149;
			else if(num[i]>=a&&num[i]<++a)ans[i]=150;
			else if(num[i]>=a&&num[i]<++a)ans[i]=152;
			else if(num[i]>=a&&num[i]<++a)ans[i]=154;
			else if(num[i]>=a&&num[i]<++a)ans[i]=156;
			else if(num[i]>=a&&num[i]<++a)ans[i]=158;
			else if(num[i]>=a&&num[i]<++a)ans[i]=160;
			else if(num[i]>=a&&num[i]<++a)ans[i]=162;
			else if(num[i]>=a&&num[i]<++a)ans[i]=164;
			else if(num[i]>=a&&num[i]<++a)ans[i]=167;
			else if(num[i]>=a&&num[i]<++a)ans[i]=169;
			else if(num[i]>=a&&num[i]<++a)ans[i]=171;
			else if(num[i]>=a&&num[i]<++a)ans[i]=173;
		}
	}
}
