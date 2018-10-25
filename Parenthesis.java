import java.util.*;

public class Parenthesis
{
   static int top=-1;
   static char stack[] = new char[100];
   public static void push(char c)
   {
     top++;
     stack[top]=c;
   }
   public static void pop()
   {
      top--;
   }
 
   public static void checkparenthesis(String str,int len,int i)
   {
      if(i==len)
      {
         return;
      }
      else 
      {
	char c = str.charAt(i);
         if(c=='(' || c=='{' || c=='[')
         {
            push(c);
         }
         else if(c==')')
         {
            if(stack[top]=='(')
            {
               pop();
            }
         }
         else if(c=='}')
          {
            if(stack[top]=='{')
            {
               pop();
            }
          }
         else if(c==']')
          {
            if(stack[top]=='[')
            {
               pop();
            }
          }
      }
      i++;
      checkparenthesis(str,len,i);
 
   }

    public static void main(String args[])
    {
         Scanner sc= new Scanner(System.in);
         String str;
         str=sc.next();
	 int len=str.length();
         int i=0;
         checkparenthesis(str,len,i);
         if(top==-1)
         {
            System.out.println("Balanced");
         }
         else
         {
           System.out.println("unbalanced");  
         }

    }

}

