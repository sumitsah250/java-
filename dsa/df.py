#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main(){
    vector <int> arr;
    int milni=1;
    int number;
     cin>>number;
   
    string data[number];
    for(int i=0 ;i<number ;i++){
        cin>>data[i];
    }

    for(int i=0; i<number ;i++){
        if (data[i]==data[i+1])
        milni++;
        if (data[i]!=data[i+1])
         {
        arr.push_back(milni);
        
        milni=1;
         }

    }
    
 int max= *max_element(arr.begin(), arr.end()); 

int sum=1;
 for(int i : arr){
    if(i!=max){
        sum+=i;
    }
 }
 cout<<data[sum]<<endl;
cout<<max;


}