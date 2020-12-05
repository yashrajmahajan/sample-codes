#include<iostream>
using namespace std;

main()
{
 int fact = 1, n;
 cout<<"enter value:  "<<endl;
 cin>> n;
 
 for(fact=1;fact < n; ++n)
  {
   n*= fact;
  }
  cout<< "factorial is: %d "<< fact << endl;
}
