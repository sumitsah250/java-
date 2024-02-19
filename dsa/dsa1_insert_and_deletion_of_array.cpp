#include<iostream>
using namespace std;
int MAX = 40;

void insert(int a[40],int & size){
    int position,number;
    cout<<"enter positon"<<endl;
    cin>>position;
    cout<<"enter number"<<endl;
    cin>>number;
    for(int i= size-1;i>=position-1;i--){
        a[i+1]=a[i]; 
    }
    a[position-1]=number;
    size++;

}
void deletedata(int a[40],int & size){
    int position;
    cout<<"enter the position from which you want to delete data"<<endl;
    cin>>position;
    for(int i=position;i<=size-1;i++ ){
        a[i]=a[i+1];
    }
    size--;

}


int main(){
     int a[40];
     int size;
   
    cout<<"enter number of element you want to insert";
    cin>>size;
    for(int i=0;i<size;i++){
        cout<<"enter element :"<<i+1<<endl;
        cin>>a[i];
    }
    for(int i=0;i<size;i++){
        cout<<a[i]<<endl; 
    } 
    insert(a,size);
    
     for(int i=0;i<size;i++){
        cout<<a[i]<<endl;
    }
    deletedata(a,size);
    
     for(int i=0;i<size;i++){
        cout<<a[i]<<endl;
    }




    return 0;
}
