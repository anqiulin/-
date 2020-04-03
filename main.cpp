#include<stdio.h>
int fun(int a[],int n)
{
    int sum=0,b=0;
    for(int i=1;i<n;i++)
    {
        if(b>0)
            b+=a[i];
        else
            b=a[i];
        if(b>sum)
            sum=b;
    }
    return sum;
}
int main()
{
    int n;
    scanf("%d",&n);
    int a[100];
    for(int i=1;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    int sum=fun(a,n);
    printf("%d",sum);
    return 0;
}
