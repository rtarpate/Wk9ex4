public static void main(Strings[] args)
{
    //creates scanner
    Scanner myObj = new Scanner(System.in);

    //decalres variable
    double avariable;
    double bvariable;
    double cvariable;
    double tempvariable;

    //promt user input
    Systme.out.println("Enter the lenght of the first side");
    //collect user input
    avariable = Double.parseDouble(myObj.nextLine());

    //promt user input
    Systme.out.println("Enter the lenght of the second side");
    //collect user input
    bvariable = Double.parseDouble(myObj.nextLine());

    //caluate the hypotenuse
    tempvariable = Math.pow(avariable, 2) + Math.pow(bvariable, 2);
    cvariable = Math.sqrt(tempvariable);

    //output resulst
    System.out.println("the legnth of the hypotenuse is: " + cvariable);

}