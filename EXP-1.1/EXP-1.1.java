#include <iostream>
using namespace std;

class MyStack {
private:
    int capacity;
    int top;
    int stack[100];

public:
    MyStack(int size) {
        capacity = size;
        top = -1;
    }

    void push(int element) {
        if (isFull()) {
            cout << "Stack Overflow! Cannot push " << element << endl;
        } else {
            stack[++top] = element;
            cout << element << " pushed into stack." << endl;
        }
    }

    int pop() {
        if (isEmpty()) {
            cout << "Stack Underflow! Cannot pop." << endl;
            return -1;
        } else {
            return stack[top--];
        }
    }

    int peek() {
        if (isEmpty()) {
            cout << "Stack is empty. No top element." << endl;
            return -1;
        } else {
            return stack[top];
        }
    }

    bool isEmpty() {
        return top == -1;
    }

    bool isFull() {
        return top == capacity - 1;
    }
};

int main() {
    MyStack intStack(5);
    intStack.push(10);
    intStack.push(20);
    intStack.push(30);
    cout << "Top element: " << intStack.peek() << endl;
    cout << "Popped: " << intStack.pop() << endl;
    cout << "Popped: " << intStack.pop() << endl;
    cout << "Is stack empty? " << (intStack.isEmpty() ? "Yes" : "No") << endl;
    cout << "Is stack full? " << (intStack.isFull() ? "Yes" : "No") << endl;
    return 0;
}
