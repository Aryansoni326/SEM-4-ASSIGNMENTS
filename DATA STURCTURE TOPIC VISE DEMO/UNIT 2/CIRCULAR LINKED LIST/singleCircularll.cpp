#include<iostream>
using namespace std;
class node
{
    public:
    int data;
    node *next;
};
node *start=NULL;
node *rear=NULL;
node *create_ll(node *start)
{
    node *new_node,*ptr;
    int num;
    cout<<" enter -1 to quite "<<endl;
    cout<<" enter the data : ";
    cin>>num;
    while(num!=-1)
    {
        new_node=new node();
        new_node->data=num;
        if(start==NULL)
        {
            start=new_node;
            new_node->next=start;
            rear=new_node;
        }
        else
        {
            rear->next=new_node;
            new_node->next=start;
            rear=new_node;
        }
    }
}
node *display(node *start)
{
    node *ptr;
    ptr=start;
    if(start==NULL)
    {
        cout<<"List is empty\n";
    }
    else
    {
        while(ptr->next != start)
        {
            cout<<ptr->data<<"\t";
            ptr=ptr->next;
        }
        cout<<ptr->data<<endl;
    }
}
int main() 
{
    int option;
    do
    {
        cout<<"1. Create a List"<<endl;
        cout<<"2. Display a List"<<endl;
        cout<<" 3. reverse linkedlist"<<endl;
        cout<<"9. Exit"<<endl;
        cout<<"Enter your Choice = "<<endl;
        cin>>option;
        switch(option)
        {
            case 1:
                start=create_ll(start);
                cout<<"Linked List Created"<<endl;
                break;
            case 2:
            display(start);
            break;
        }
    }while(option!=9);
}