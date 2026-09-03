import java.util.Scanner;
Public class counter{
static int countDigits(int n){
int count=0;
while(n>0){
n=n/10;
count++;
}
return count;
}
Public static void main(String args[]){
Scanner sc=new Scanner(Systeem.in);
int n=sc.nextInt();
Sysoln(countDigits(n));
}
}
