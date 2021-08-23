/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorover;

/**
 *
 * @author Hasnain Gakhar
 */
//2nd class name is ConstructorOver 

public class AbcConst 
{
    double a,b,c;
    AbcConst(double A,double B,double C) //value given by main class object
    {
        a=A;
        b=B;
        c=C;
    }
    double volume()
    {
    return (a*b*c);
    }
    AbcConst () //the construter block have values
    {
        a=10;
        b=10;
        c=10;
    }
}
