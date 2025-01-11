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
node *insert_beg(node *start)
{
    node *new_node,*ptr;
    int num;
    cout<<" enter the data : ";
    cin>>num;
    new_node=new node();
    new_node->data=num;
    rear->next=new_node;
    new_node->next=start;
    start=new_node;
    return start;
}