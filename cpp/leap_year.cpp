#include<iostream>
using namespace std;

int main()
{
	int yr;

	cout<<"\n\nEnter the year:";
	cin>>yr;

	yr = yr % 4;		//fORMULA TO FIND LEAP YEAR

	if(yr == 0)
	{
	 cout<<"Given year are leap.";
	}
	else
	{
	 cout<<"Given year are not leap.\n\n";
	}
}
/*
OUTPUT

Enter the year:2020
Given year are leap.


Enter the year:2022
Given year are not leap.


Enter the year:2018
Given year are not leap.


Enter the year:2019
Given year are not leap.


Enter the year:2016
Given year are leap.
*/
