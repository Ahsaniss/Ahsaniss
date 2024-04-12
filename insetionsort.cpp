#include<iostream>
using namespace std;
int main(){
    int array[]={1,7,1,2,4,6,7};
    int n=sizeof(array)/sizeof(array[0]);
    for (int i = 1; i < n; i++)
    {
        int temp=array[i];
        int j=i-1;
    while ( j>=0 && array[j]>temp)
    {
        array[j+1]=array[j];
        j--;

    }
    
    array[j+1]=temp;
    }
    cout<<"sorted array is: ";
    for(int i=0;i<n;i++){
        cout<<array[i]<<" ";
    }
    cout<<endl;
}