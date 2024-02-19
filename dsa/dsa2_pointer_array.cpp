#include <iostream>
using namespace std;
struct node
{
    int data;
    node *next;
};
void display(node **head)
{
    node *temp;
    temp = *head;
    while (temp != 0)
    {
        cout << temp->data << endl;
        temp = temp->next;
    }
}
void deletedata(node **head){
    node *temp,*temp1;
    temp =*head;
    temp1= temp->next;
    while(temp1 != 0){
        temp1=temp1->next;
        temp=temp->next;
    }
    temp->next=0;
    // delete temp;

}
void insert_at_bigining(node **head){
    node *newnode;
    newnode= new node;
    cout<<"enter the data"<<endl;
    cin>>newnode->data;
    newnode->next=*head;
    *head=newnode;
}void insert_at_end(node **head){
    node *newnode,*temp;
    temp=*head;
    newnode= new node;
    cout<<"enter the data"<<endl;
    cin>>newnode->data;
    newnode->next=0;
    while(temp->next!=0){
        temp=temp->next;
    }
    temp->next=newnode;
    
}

void insert(node **head)
{
    int choice = 1;
    node *newnode, *temp;
    while (choice)
    {
        newnode = new node;
        cout << "enter the data" << endl;
        cin >> newnode->data;
        newnode->next = 0;
        if (*head == 0)
        {
            *head = newnode;
            temp = newnode;
        }
        else
        {
            temp->next = newnode;
            temp = newnode;
        }
        cout << "do you want to insert more data then press 1 if not press 0: ";
        cin >> choice;
    }
}
int main()
{
    node *head, *newnode, *temp;
    head = 0;
    insert(&head);
    display(&head);
    // insert_at_bigining(&head);
    // display(&head);
    // insert_at_end(&head);
    // display(&head);
    deletedata(&head);
    display(&head);
    return 0;
}
