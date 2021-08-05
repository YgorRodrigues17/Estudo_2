#include<iostream>
#include<stdio.h>

using namespace std;


int big, smaller, result;

int maxValue(int a, int b, int c, int d, int e){
    big = a;
    if(b > a && b > c && b > d && b > e){
        big = b;
    }
    if(c > a && c > b && c > d && c > e){
        big = c;
    }
    if(d > a && d > b && d > c && d > e){
        big = d;
    }
    if(e > a && e > b && e > c && e > d){
        big = e;
    }
    cout << "The max value is: " << big << endl;
    return big;
}

int minValue(int a, int b, int c, int d, int e){
    smaller = a;
    if(b < a && b < c && b < d && b < e){
        smaller = b;
    }
    if(c < a && c < b && c < d && c < e){
        smaller = c;
    }
    if(d < a && d < b && d < c && d < e){
        smaller = d;
    }
    if(e < a && e < b && e < c && e < d){
        smaller = e;
    }
    cout << "The smaller value is: "<< smaller << endl;
    return smaller;
}

int sumGreatarSmaller(int a, int b){
    int result;
    result = a + b;
    return result;
}

int numberPairOdd(int a){
    if(a % 2 == 0){
        cout << "PAIR" << endl;;
    }
    else{
        cout << "ODD" << endl;
    }
}

int isPrime(int a){
    if(a % 2 == 1){
        cout << "Number is prime" << endl;
    }
    else{
        cout << "Number is not prime" << endl;
    }
}

int readNumber(int a, int b, int c, int d, int e){
    cin >> a;
    cin >> b;
    cin >> c;
    cin >> d;
    cin >> e;

    return (a, b, c, d, e);
}

int main(){
    int n1, n2, n3, n4, n5;
    readNumber(n1, n2, n3, n4, n5);
    maxValue(n1, n2, n3, n4, n5);
    minValue(n1, n2, n3, n4, n5);
    sumGreatarSmaller(big, smaller);
    numberPairOdd(result);
    isPrime(result);







    
}