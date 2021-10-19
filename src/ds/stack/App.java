package ds.stack;

public class App {
    public static void main(String[] args) {
        System.out.println(reverseString("HelloWorld"));
    }

    public static String reverseString(String str){
        Stack theStack = new Stack(str.length());
        for(int i = 0; i < str.length(); i++){
            theStack.push(str.charAt(i));
        }

        String result = "";

        while(!theStack.isEmpty()){
            char ch = theStack.pop();
            result = result + ch;
        }
        return result;
    }

}
