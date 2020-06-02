#include<bits/stdc++.h>
/*struct Node{
       int data;
       Node *left;
       Node *right;

       Node(int val):data(val),left(nullptr),right(nullptr){}
       ~Node(){}
};*/
class Node{
       int data;
       Node *left;
       Node *right;

       public:
       Node(int val):data(val),left(nullptr),right(nullptr){}
       ~Node(){}

       int getData(){ return this->data; }
       Node* getLeft(){ return this->left;}
       Node* getRight() { return this->right;}
       void setLeft(Node *l){ this->left=l;}
       void setRight(Node *r){ this->right=r;}

};
int main()
{
    Node root(1);
    Node n2(2);
    Node n3(3);
    Node n4(4);

    root.setLeft(&n2);
    root.setRight(&n3);
    n3.setLeft(&n4);

    std::cout<<root.getLeft()->getData();
    std::cout<<std::endl<<root.getRight()->getLeft()->getData();
/*
    root.left=&n2;
    root.right=&n3;
    n3.left=&n4;

    std::cout<<root.left->data;//2
    std::cout<<std::endl<<root.right->left->data;//4
*/
}