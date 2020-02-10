package org.example;

//project done for epam week 3 submission
//Done on 10 feb 2020 by hemanth sagar
public class App 
{
    public static void main( String[] args )
    {
        //taking inputs from Class Class for io
        Classforio io=new Classforio();
        float[] arr=io.takeip();

        //Calculating
        Operations calc=new Operations();
        String res=calc.compute(arr);

        //Printing Output
        io.printop(res);
    }
}
