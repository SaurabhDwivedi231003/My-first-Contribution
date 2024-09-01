#include<bits/stdc++.h>
using namespace std;
 

set <int> remove_duplicates(int arr[],int n){
    set<int>s;
    //set not allowed duplicates and sorted in order
    for(int i=0;i<n;i++){
        s.insert(arr[i]); 
    }
    
    return s;
}

int main() {

    int n;
    
    //"Enter number of elements in array: ";
    //example:- 6
    cin>>n;

    //decleared an array

    int arr[n];

    for(int i =0;i<n;i++) cin>>arr[i];//1 2 2 3 3 4

    set <int> s =remove_duplicates(arr,n);

    for(auto k:s)cout<<k<<" ";
    
    return 0;
}