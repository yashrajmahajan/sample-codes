#include<iostream>
using namespace std;

int main()
{
	int i=0,n,fact=1;

	cout<<"================ WELLCOME TO FACTORIAL PROGRAM =================\n.............Author- Yashraj J mahajan";
	cout<<"\n\n\nenter the number:  ";
	cin>>n;

	if(n != 0)
	{
	 for(i=1;i<=n;i++)	// i starts from 1
	 {
	  fact = fact * i; // factorial formula
	 }
	}

	else
	{
	cout<<"\n\n\nZero gets invalid answer";
	}

	cout<<"The factorial is: "<<fact; // print final ans
	cout<<"\n\n\n";
}

/*
OUTPUT

================ WELLCOME TO FACTORIAL PROGRAM =================


 enter the number:  5
 The factorial is: 120
*/
