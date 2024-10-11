#include<stdio.h>
 void QuickSort(int a[],int N)
    {

        int top = -1;
        int beg;
        int end, pivot;
        int lower[10];
        int upper[10]; 
        if(N > 1)
        {
            top ++;
            lower[top] = 0;
            upper[top] = N -1 ;

        }
        while(top != -1)
        {
            beg = lower[top];
            end = upper[top];
            top--;

            pivot = quick(a,beg,end,pivot); 

            if(pivot - 1  > beg)
            {
                top ++;
                lower[top] = beg;
                upper[top] = pivot -1;
            }
            if(pivot + 1 < end)
            {
                top++;
                lower[top] = pivot   + 1;
                upper[top] = end;
            }
        }

    }
    int quick(int a[],int beg,int end,int pivot) 
    {
        int left ,right,temp;
        left = beg;
        right = end;
        pivot = left;

       step1: while(pivot != right && a[right] >= a[pivot])
        {
            right --;

        }
        if(pivot == right)
        {
            return pivot;
        }
        if(a[pivot] > a[right])
        {
            temp = a[pivot];
            a[pivot] = a[right];
            a[right] = temp;

            pivot =right;
        }

        while(left != pivot && a[pivot] >= a[left])
        {
            left++;
            
        }
        if(left == pivot)
        {
            return pivot;
        }

        if(a[pivot] <= a[left])
        {
            temp = a[pivot];
            a[pivot] = a[left];
            a[pivot] = temp;

            pivot = left;
        }

        goto step1;
    }


int main()
{
    int n;
    int a[12];
    printf("Enter the size of the array :");
    scanf("%d",&n);
    printf("Enter the %d element in :",n);
    for(int i = 0; i< n;i++)
    {
        scanf("%d",&a[i]);

    }
    QuickSort(a,n);
    for(int i = 0; i< n;i++)
    {
      printf("%d  ",a[i]);

    }
   
    }

/*

/////////////////////////////////////////////////
//   INSERTION SORT
{
    int n,i,j;
    int a[10];
    printf("Enter the Range of the Array :");
    scanf("%d",&n);
    printf("Enter the %d element :",n);
    for(i = 0;i< n;i++)
    {
        scanf("%d",&a[i]);
    }
   for(int i = 1; i<n;i++)
   {
    int temp = a[i];
    for(j = i-1; j>= 0 && temp < a[j] ;j--)
    {
        a[j+1] = a[j];
    }
    a[j+1] = temp;
   }
    
    for( i = 0; i< n;i++)
    {
        printf("%d  ",a[i]);
    }

    
    
}


/*
{
    int n;
    int a[10];
    printf("Enter The Range of the array ");
    scanf("%d",&n);
    printf("Enter the array element :");
    for(int i =0; i< n - 1;i++)
    {
        scanf("%d",&a[i]);
    }
    
    for(int i = 0; i< n - 1; i++)
    {
       int  min = a[i];
        int index = i;
        for(int j = i+1; j< n;j++)
        {
           if(min > a[j])
           {
            min = a[j];
            index = j;
           }
        }
        int temp = a[i];
        a[i] = min;
        a[index] = temp;

    }

    printf("Sorting Array :");
    for(int i = 1; i <= n -1;i++)
    {
        printf("%d  ",a[i]);
    }
}



/*
{
    int n ;
    int arr [10];
    printf("Enter the Array size :");
    scanf("%d",&n);
    printf("Enter the %d array element :",n);
    for(int i = 0; i< n;i++)
    {
        scanf("%d",&arr[i]);
    }
   
    for (int i = 0;i< n;i++)
    {
        for(int j = 0;j< n;j++)
        {
            if(arr[j] > arr[j+1])
            {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j+1] = temp;
            }
        }

    }

        printf("Sorted Array is :");
        for(int i = 0; i <= n; i++)
        {
            printf("%d   ",arr[i]);
        }
    
}

*/