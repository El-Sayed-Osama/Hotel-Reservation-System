/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logins;

/**
 *
 * @author smart
 */
interface Rooms
{
    public double fees(int nn);
}

class SingleRoom implements Rooms
{
    double cost,tip,total;
    public SingleRoom()
    {
        cost=500;
        tip=0.14*cost;
        total=cost+tip;
    }
    @Override
    public double fees(int nn)
    {
        total=(cost*nn)+tip;
        return total;
    }
}

class DoubleRoom implements Rooms
{
    double cost,tip,total;
    public DoubleRoom()
    {
        cost=700;
        tip=0.14*cost;
        total=cost+tip;
    }
    @Override
    public double fees(int nn)
    {
        total=(cost*nn)+tip;
        return total;
    }
}

class TripleRoom implements Rooms
{
    double cost,tip,total;
    public TripleRoom()
    {
        cost=900;
        tip=0.14*cost;
        total=cost+tip;
    }
    @Override
    public double fees(int nn)
    {
        total=(cost*nn)+tip;
        return total;
    }
}
