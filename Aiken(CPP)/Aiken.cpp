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
  char choice;
  while(choice != 'n')
  {
      cout<<"\nEnter option u want to perform\n y.queans \n n.exit\n";
      cin>>choice;
      if(choice=='n')
      {
          break;
      }
      if(choice=='y')
      {

      //  case 'y':
             while(fout)
            {
                cout<<" Enter the question: ";
                getline(cin,que);
                      fout<<" "<<que<<endl;
               if(que=="-1")
               {
                    break;
                }
            /*  else{

               }*/

            cout<<"\n Enter option 1: ";
            getline(cin,opt1);
            fout<<a+" "<<opt1<<endl;
            cout<<"\n Enter option 2: ";
            getline(cin,opt2);
            fout<<b+" "<<opt2<<endl;
            cout<<"\n Enter option 3: ";
            getline(cin,opt3);
            fout<<c+" "<<opt3<<endl;
            cout<<"\n Enter option 4: ";
            getline(cin,opt4);
            fout<<d+" "<<opt4<<endl;
            cout<<"\n Enter ans: ";
            getline(cin,ans);
            fout<<"ANSWER: "<<ans<<endl;
            }
      }


  }

    myfile.close();
}
