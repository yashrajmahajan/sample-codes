#include<iostream>
using namespace std;

int main()
{
	int n1,n2;
	char ch;

	cout<<"============= MENU of CALCULATOR =============";
	cout<<"\n\n calculate as normal calculator:(using symbols +,-,*,/) \n\n";
	cin>>n1;
	cin>>ch;	//input char input
	cin>>n2;


	switch (ch)
	{

	case '+':
		cout<<"\n\n\n"<<n1<<ch<<n2<<"="<<n1+n2;				//Addition case
		cout<<"\n\n\n";
		break;

	case '-':
		 cout<<"\n\n\n"<<n1<<ch<<n2<<"="<<n1-n2;			//substraction case
                 cout<<"\n\n\n";
                 break;

	case '*':
                 cout<<"\n\n\n"<<n1<<ch<<n2<<"="<<n1*n2;			//Multiplication case
                 cout<<"\n\n\n";
                 break;

	case '/':
                 cout<<"\n\n\n"<<n1<<ch<<n2<<"="<<n1/n2;			//Division case
                 cout<<"\n\n\n";
                 break;

	default:
		cout<<"It use only for + , - , * , / ";

	}
}

/*
OUTPUT

============= MENU of CALCULATOR =============

calculate as normal calculator:(using symbols +,-,*,/) 

2+3



2+3=5

*/
