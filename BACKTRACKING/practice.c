#include<stdio.h>

struct node{
    struct node * next;
    int data;
};
struct node * start = 0;
struct node * cn()
{
    struct node * d1;
    d1 = (struct node *) malloc(sizeof(struct node));
    printf("Enter data");
    scanf("%d",& d1 -> data);
    d1 -> next = 0;

    return d1;
}

void is()
{
    struct node * s;
     s = cn();
     if(start == 0)
     {
        start = s;
     }
     else
     {
        s -> next = start;
        start = s;
     }
}

void ie()
{
    struct node * x1, * g1;
    x1 = cn();
   
    if(start == 0)
    {
        start = x1;
    }
    else{
        g1 = start;
        while(g1 -> next != 0)
        {
            g1 = g1 -> next;
        }
        g1 -> next = x1;
    }
}
 void im()
 {
    struct node * x1 , * h1 , *p1;
    int v;
    x1 = cn();
    if(start == 0)
    {
        start = x1;
    }
    else{
       printf("Enter the value when you store the Element in linked list ");
       scanf("%d",&v);
       
       while(p1 -> data != v)
       {
        p1 = p1 -> next;
       }
       h1 = p1 -> next;
       p1 -> next = x1;
       x1 -> next = h1;
    }

 }

 void ds()
    {
        struct node * j;
        if(start == 0)
        {
            printf("No node to be Deleted ");

        }
        else{
            j =start;
            start = start-> next;
            j -> next = 0;
            free(j);
        }
    }
 void de()
 {
    struct node * k ,* j1;
    if(start == 0)
    {
        printf("There is no node to be deleted");
    }
    else{
        k = start;
        while(k -> next -> next != NULL)
        {
            k = k -> next;
        }
         j1 = k -> next;
         k -> next = 0;
         free(j1);
    }
 }

 void dm()
 {
    struct node *x ,*y;
    int v;
    if(start == 0)
    {
        printf("no node to be deleted ");
    }
    else
    {
        printf("Enter a data that you want to be daleted ");
        scanf("%d",&v );
        x = start;
        while(x -> next -> data != v)
        {
            x = x -> next;
        }
        y = x -> next;
        y -> next = y -> next;
        y -> next = 0;
    }
 }
  void display()
  {
    struct node * d;
    if(start == 0)
    {

        printf("There is no node to be deleted ");
    }
    else{
        d = start;
        while(d != 0)
        {
            printf("%d  ",d->data);
          d = d -> next;
        }

    }
  }
 
int main()
{
    int ch;
    printf("\n 1.Insertion from Start .");
    printf("\n 2.insert from end .");
    printf("\n 3.Insertion from middle.");
     
    printf("\n 4.Deletiontion from Start .");
    printf("\n 5.Deletion from end .");
    printf("\n 6.Deletion from middle.");
    printf("\n 7. Display");
    printf("\n 8.Exit");
   

   while(1)
   {
    
    printf("\n ------ Enter Your Choice ----- \n");
    scanf("%d",&ch);
    switch(ch)
    {
        case 1:
        {
            is();
            break;
        }
        
        case 2:
        {
            ie();
            break;
            
        }
        case 3:
        {
           im();
           break;            
        }
        case 4:
        { 
            ds();
            break;
            
        }
        case 5:
        {
            de();
            break;
        }
        case 6:
        {
            dm();
            break;
        }
        case 7:
        {
            display();
            break;
            
        }
    
        case 8:
        {
           exit(0);
           
        }
        default:
        {
            printf("Wrong input .");
        }
     }
   }
}































/*



void quicksort(int arr[] , int N)
{
    int top = -1;
    int beg;
    int end;
    int pivot ;
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
    }

    pivot = quick(arr,beg,end,pivot);
    if(pivot - 1 > beg)
    {
        top++;
        lower[top] = beg;
        upper[top] = pivot -1;

    }
    if(pivot + 1  < end )
    {
        top++;
        lower[top] = pivot + 1;
        upper[top] = end;
    }
}


int quick(int a[] , int beg , int end , int pivot)
{
    int left = beg;
    int right = end;
    pivot = left;
    step1 : 
    while(pivot != right && a[pivot] <= a[right])
    {
       right --;
    }
    if(right == pivot)
    {
        return pivot;
    }
    if(a[pivot] > a[right])
    {
        int temp = a[pivot];
        a[pivot] = a[right];
        a[right] = temp;
        pivot = right;
    }

    while(pivot != left && a[pivot] >= a[left])
    {
        left ++;
    }
    if(pivot == left)
    {
        return pivot;
    }
    if(a[pivot] < a[left])
    {
        int temp = a[pivot];
        a[pivot] = a[left];
        a[left] = temp;

        pivot = left;
    }

    goto step1;
}

void printArray(int a[] ,int n)
{
printf("sorted array :");
    for(int i = 0; i<n;i++)
    {
        printf("%d  ",a[i]);
    }
}
int main()
{
   int a[20];
    int N;
    printf("Enter the range of the array :");
    scanf("%d",&N);
    printf("Enter %d Nunber in the Array ",N);
    for(int i = 0; i < N; i++)
    {
	scanf("%d",&a[i]);
	}
    quicksort(a,N);
    
    printf("Sorted Array :");
    for(int i = 0; i < N; i++)
    {
	printf("%d   ",a[i]);
	}

    
}

*/