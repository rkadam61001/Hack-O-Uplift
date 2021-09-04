#include<bits/stdc++.h>
#include<string.h>
using namespace std;
int main()
{
    ofstream myfile("Aiken.txt");
    string que,opt1,opt2,opt3,opt4,ans;
    string a="A.";
    string b="B.";
    string c="C.";
    string d="D.";
    ofstream fout;
    fout.open("Aiken.txt");
  string choice;
  while(choice != "n")
  {
      cout<<"\nEnter option u want to perform\n y.queans \n n.exit: ";
      getline(cin,choice);
      if(choice=="n")
      {
          break;
      }
      if(choice=="y")
      {
             while(fout)
            {
                cout<<" Enter the question: ";
                getline(cin,que);
               if(que=="-1")
               {
                    break;
                }
                else{
                        fout<<que<<endl;
                }
                cout<<"\n Enter option A: ";
                getline(cin,opt1);
                fout<<a+" "<<opt1<<endl;
                cout<<"\n Enter option B: ";
                getline(cin,opt2);
                fout<<b+" "<<opt2<<endl;
                cout<<"\n Enter option C: ";
                getline(cin,opt3);
                fout<<c+" "<<opt3<<endl;
                cout<<"\n Enter option D: ";
                getline(cin,opt4);
                fout<<d+" "<<opt4<<endl;
                cout<<"\n Enter ans as A/B/C/D: ";
                getline(cin,ans);
               fout<<"ANSWER: "<<ans<<endl;
               fout<<endl;
            }
      }
  }
    myfile.close();
}
