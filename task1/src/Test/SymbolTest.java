package Test;

import java.util.Scanner;
import java.util.Stack;


public class SymbolTest {
public static void main(String[] args) {
System.out.println(readSymbol());


}


private static boolean readSymbol() {
Scanner in = new Scanner(System.in);
//�洢���ŷ��ţ�������
Stack<String> stack = new Stack<>();
String readStrs = in.nextLine();
//ת�����飬�Ա�����ж�
char[] charArr = readStrs.toCharArray();
for (int i = 0; i < charArr.length; i++) {
String readStr = String.valueOf(charArr[i]);
if (isOpenSymbol(readStr)) {//�ǿ��ŷ��ţ�ѹ��ջ��
stack.push(readStr);


} else if (isCloseSymbol(readStr)) {//�ǹرշ�����ִ�У������ַ�����
if (stack.isEmpty()) {//ջΪ�գ�֤���ַ�������ֻ�йرշ��ţ�����false
in.close();
return false;
} else {//���Ų���һ�ԣ�����false
if (!isTwin(stack.peek(), readStr)) {
in.close();
return false;
} else {//������һ�ԣ������ŵ���ջ
stack.pop();
}
}


}


}
if (!stack.isEmpty()) {//���ַ������������ж��Ƿ�Ϊ�գ�����֤��û�йرշ��ŷ���false
in.close();
return false;
} else {//�շ���true
in.close();
return true;
}


}
/**
* �ж��ǲ��ǿ��ŷ��ţ�Ҳ�������ŵ�������
* @param symbol
* @return
*/
public static boolean isOpenSymbol(String symbol) {
String symbolList = "{[(";
if (symbolList.contains(symbol))
return true;
return false;
}
/**
* �ж��ǲ��ǹرշ��ţ�Ҳ�������ŵ��Ұ����
* @param symbol
* @return
*/
public static boolean isCloseSymbol(String symbol) {
String symbolList = "}])";
if (symbolList.contains(symbol))
return true;
return false;
}
/**
* �жϷ����Ƿ���һ��
* @param openSymbol
* @param closeSymbol
* @return
*/
public static boolean isTwin(String openSymbol, String closeSymbol) {
if (openSymbol.equals("(") && closeSymbol.equals(")"))
return true;
else if (openSymbol.equals("{") && closeSymbol.equals("}"))
return true;
else if (openSymbol.equals("{") && closeSymbol.equals("}"))
return true;
return false;
}
}
