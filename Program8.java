class Generics<T, U,S> 
{ 
    T obj1; 
    U obj2;
    S obj3;  
    /*Generics(T obj, U obj2,S obj3) 
    { 
        this.obj1 = obj1; 
        this.obj2 = obj2; 
        this.obj3 = obj3;
    } 
	*/
	Generics(T obja, U objb,S objc) 
	{
		obj1=obja;
		obj2=objb;
		obj3=objc;
	}
	void showTypes()
	{
		System.out.println("Type of 1st parameter is " + obj1.getClass().getName());
        System.out.println("Type of 2nd parameter is " + obj2.getClass().getName());
		System.out.println("Type of 3rd parameter is " + obj3.getClass().getName());
	}
    /*
    public void print() 
    { 
        System.out.println(obj1); 
        System.out.println(obj2);
        System.out.println(obj3);
 
    } 
	*/
	T getobj1()
	{
		return obj1;
	}
	U getobj2()
	{
		return obj2;
	}
	S getobj3()
	{
		return obj3;
	}
} 
  
class Genericsmain 
{ 
    public static void main (String[] args) 
    { 
	    String a,c;
		int b;
        Generics <String,Integer, String> obj = new Generics<String, Integer,String>("disha",2989,"1BM19CS051"); 
		obj.showTypes();
		
        a=obj.getobj1();
		b=obj.getobj2();
		c=obj.getobj3();
		
		System.out.println( a +" "+ b +" "+ c );
        //obj.print(); 
    } 
}
