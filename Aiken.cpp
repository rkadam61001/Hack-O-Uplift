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
  int choice;
  while(true)
  {
      cout<<"\n1.option \n2.exit";
      cin>>choice;
      if(choice==2)
      {
          break;
      }
      switch(choice)
      {
        case 1:
             while(fout)
            {
            cout<<" Enter the question";
            getline(cin,que);
            if(que=="-1")
            {
                break;
            }
            fout<<" "<<que<<endl;
            cout<<"\n Enter option 1";
            getline(cin,opt1);
            fout<<a+" "<<opt1<<endl;
            cout<<"\n Enter option 2";
            getline(cin,opt2);
            fout<<b+" "<<opt2<<endl;
            cout<<"\n Enter option 3";
            getline(cin,opt3);
            fout<<c+" "<<opt3<<endl;
            cout<<"\n Enter option 4";
            getline(cin,opt4);
            fout<<d+" "<<opt4<<endl;
            cout<<"\n Enter ans";
            getline(cin,ans);
            fout<<"ANSWER: "<<ans<<endl;
            }
      }


      }


     /*   getline(cin,que);
        if(que=="-1")
        {
            break;
        }
        fout<<" "<<que<<endl;*/
    //}

    myfile.close();
}
