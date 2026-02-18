void main () {
	int x = 10 , y = 20 , z = 30;
	System.out.println("y: " + y++);    //print y: 20   y=21
	System.out.println("z: " + --z);    //print z: 29   z=29
	int p = x-- + y-- + --z;            //p=59 x=9 y=20 z=28
	System.out.println("p: " + p);      //print p: 59
	x = 10;
	y = 133;
	System.out.println(x + "%" + y + " = " + x % y);    //print 10%133 = 10
	System.out.println(y + "%" + x + " = " + y % x);    //print 133%10 = 3
	int a = 3, b = 8, c = 12 , res = 4;
	res += a * b;                                       //res += 24 res=28
    System.out.println("res: " + res);               //print res: 28

    /**
     * y: 20
     * z: 29
     * p: 59
     * 10%133 = 10
     * 133%10 = 3
     * res: 28
     */
}
