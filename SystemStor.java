import java.util.Scanner;

public class SystemStor {
    
String StorName;
String openHour;
String CloseHour;


//------- Contonue Us :----------
    String phone ="21892-0000000";
    String FAcount ="HapyyRest";
    String Adrees ="Jamalabdalnaser Street";
    String Email ="info@HapyyRest.org";
//------------ END --------------
    
//------- Start Constrctor ---------
public SystemStor(String SN,String OH,String CH)
{
this.StorName =SN;
this.openHour =OH;
this.CloseHour =CH;

}    
 //------- End Constrctor ---------   

public void menu()
{
    do{
    //============= First menu ================
System.out.print("\n---------------------------------\n");
System.out.print("      WELCOM TO ******** STOR    \n");
System.out.print("---------------------------------\n");
System.out.print("1)Product                        \n");
System.out.print("2)Couction us                    \n");
System.out.print("3)Exit                           \n");
System.out.print("---------------------------------\n");
System.out.print("       PLEASE CHOSE NUMBER       \n");
System.out.print("---------------------------------\n"); 
    //============= End First menu ================
Scanner input =new Scanner(System.in);
int Choise =input.nextInt();
//=========== Strart switch ==============
switch(Choise)
{
    case 1:
        Product();
        break;
    case 2:
        conaction();
        break;
    case 3:
        Exit();
        break;
    default :
        System.out.print("\nYour Choise Wrong.....");
        break;
        
}
//=========== End switch ==============
    }while(true);
}
public void Product()
{
        //============= Product menu ================
        System.out.print("---------------------------------\n");
        System.out.print("           Our  Product          \n");
        System.out.print("---------------------------------\n");
        System.out.print("1)liquids                        \n");
        System.out.print("2)foodstuffs                     \n");
        System.out.print("3)Back                           \n");
        System.out.print("---------------------------------\n");
        System.out.print("       PLEASE CHOSE NUMBER       \n");
        System.out.print("---------------------------------\n");
        //============= End Product menu ================
        
      Scanner input =new Scanner(System.in);
      int Choise =input.nextInt();
    //=========== Strart switch ==============
   switch(Choise)
  {
    case 1:
        liquids();
        break;
    case 2:
        foodstuffs();
        break;
    case 3:
        Product();
        break;
    default :
        System.out.print("\nYour Choise Wrong.....");
        break;    
  }
   //=========== End switch ==============
        
}

public void liquids()
{
//============= liquids menu ================
        System.out.print("---------------------------------\n");
        System.out.print("           Our liquids           \n");
        System.out.print("---------------------------------\n");
        System.out.print("1)Water                          \n");
        System.out.print("2)Soda                           \n");
        System.out.print("3)Juice                          \n");
        System.out.print("4)Milk                           \n");
        System.out.print("5)Back                           \n");
        System.out.print("---------------------------------\n");
        System.out.print("       PLEASE CHOSE NUMBER       \n");
        System.out.print("---------------------------------\n");
//============= End liquids menu ================    
   Scanner input =new Scanner(System.in);
   int Choise =input.nextInt();
  //=========== Strart switch ==============
   switch(Choise)
  {
    case 1:
        Water();
        break;
    case 2:
        Soda();
        break;
    case 3:
        Juice();
        break;    
    case 4:
       Milk();
        break;    
    case 5:
       liquids();
        break;    
    default :
        System.out.print("\nYour Choise Wrong.....");
        break;    
  }
  //=========== End switch ==============
     
}

public void Water()
{
    //============= Water menu ================
        System.out.print("---------------------------------\n");
        System.out.print("              Water              \n");
        System.out.print("---------------------------------\n");
        System.out.print("1) 0.5 liter                     \n");
        System.out.print("2) 1.5 liter                     \n");
        System.out.print("3)Back                           \n");
        System.out.print("---------------------------------\n");
        System.out.print("       PLEASE CHOSE NUMBER       \n");
        System.out.print("---------------------------------\n");
    //============= End Water menu ================
    Scanner input =new Scanner(System.in);
    int Choise =input.nextInt();
    //=========== Strart switch ==============
   switch(Choise)
  {
    case 1:
        liter_0();
        break;
    case 2:
        liter_1();
        break;
    case 3:
        Water();
        break;
    default :
        System.out.print("\nYour Choise Wrong.....");
        break;    
  }
  //=========== End switch ==============
    
}
//=========== MENU Soda ==========
public void Soda()
{ 
        System.out.print("---------------------------------\n");
        System.out.print("              Soda               \n");
        System.out.print("---------------------------------\n");
        System.out.print("1) 0.5 liter                     \n");
        System.out.print("2) 1.5 liter                     \n");
        System.out.print("3) itch drink                    \n");
        System.out.print("4)Back                           \n");
        System.out.print("---------------------------------\n");
        System.out.print("       PLEASE CHOSE NUMBER       \n");
        System.out.print("---------------------------------\n");
        
        Scanner input =new Scanner(System.in);
        int Choise =input.nextInt(); 
   //=========== Strart switch ==============
   switch(Choise)
  {
    case 1:
        liter_0();
        break;
    case 2:
        liter_1();
        break;
    case 3:
        itch_drink();
        break;
    case 4:
        Soda();
        break;
    default :
        System.out.print("\nYour Choise Wrong.....");
        break;    
  }
  //=========== End switch ==============
    
}
//=========== END MENU Soda ==========

//============= MENU Juice ==============
public void Juice()
{
        System.out.print("---------------------------------\n");
        System.out.print("              Juice              \n");
        System.out.print("---------------------------------\n");
        System.out.print("1) 0.5 liter                     \n");
        System.out.print("2) 1.5 liter                     \n");
        System.out.print("3) itch drink                    \n");
        System.out.print("4)Back                           \n");
        System.out.print("---------------------------------\n");
        System.out.print("       PLEASE CHOSE NUMBER       \n");
        System.out.print("---------------------------------\n");
    
        Scanner input =new Scanner(System.in);
        int Choise =input.nextInt(); 
   //=========== Strart switch ==============
   switch(Choise)
  {
    case 1:
        liter_0();
        break;
    case 2:
        liter_1();
        break;
    case 3:
        itch_drink();
        break;
    case 4:
        Juice();
        break;
    default :
        System.out.print("\nYour Choise Wrong.....");
        break;    
  }
  //=========== End switch ==============
}
//============== END MENU Juice ============

//=========== Menu Milk ===========
public void Milk()
{
        System.out.print("---------------------------------\n");
        System.out.print("              Milk               \n");
        System.out.print("---------------------------------\n");
        System.out.print("1) 0.5 liter                     \n");
        System.out.print("2) 1.5 liter                     \n");
        System.out.print("3)Back                           \n");
        System.out.print("---------------------------------\n");
        System.out.print("       PLEASE CHOSE NUMBER       \n");
        System.out.print("---------------------------------\n");
        
        Scanner input =new Scanner(System.in);
        int Choise =input.nextInt(); 
   //=========== Strart switch ==============
   switch(Choise)
  {
    case 1:
        liter_0();
        break;
    case 2:
        liter_1();
        break;
    case 3:
        Milk();
        break;
    default :
        System.out.print("\nYour Choise Wrong.....");
        break;    
  }
  //=========== End switch ==============
 

}
//============ End Menu Milk ============

//===========  0.5 liter ============
public void liter_0()
{
        Scanner input =new Scanner(System.in);
        int price =2;int Totel;int Totelproudect=30;
        System.out.printf("\t\t 0.5 liter  \nPrice :%d\n",price);
        System.out.printf("\nThe Totel Prodect is :%d",Totelproudect);
        System.out.print("\n-------------------------\n");
        System.out.print("Enter How Many DO you Have : ");
        int order =input.nextInt();
        System.out.print("\n-------------------------\n");
        Totel = price*order;
        System.out.printf("The Totel :%d\n",Totel);
        Totelproudect = Totelproudect-order;
        System.out.printf("\nThe Totel Prodect Becom :%d",Totelproudect);
         if(Totelproudect <=25)
        {
            System.out.printf("The product is about to run out = %d",Totelproudect);
        }
}
//=========== END 0.5 liter ============
//===========  1.5 liter ============
public void liter_1()
{
        Scanner input =new Scanner(System.in);
        int price =3;int Totel;int Totelproudect=27;
        System.out.printf("\t\t 1.5 liter  \nPrice :%d\n",price);
        System.out.printf("\nThe Totel Prodect is :%d",Totelproudect);
        System.out.print("\n-------------------------\n");
        System.out.print("Enter How Many DO you Have : ");
        int order =input.nextInt();
        System.out.print("\n-------------------------\n");
        Totel = price*order;
        System.out.printf("The Totel :%d\n",Totel);
        Totelproudect = Totelproudect-order;
        System.out.printf("\nThe Totel Prodect Becom :%d",Totelproudect);
         if(Totelproudect <=25)
        {
            System.out.printf("The product is about to run out = %d",Totelproudect);
        }
}
//=========== END 1.5 liter ============
//===========  itch drink ============
public void itch_drink()
{
        Scanner input =new Scanner(System.in);
        int price =1;int Totel;int Totelproudect=12;
        System.out.printf("\t\t itch_drink  \nPrice :%d\n",price);
        System.out.printf("\nThe Totel Prodect is :%d",Totelproudect);
        System.out.print("\n-------------------------\n");
        System.out.print("Enter How Many DO you Have : ");
        int order =input.nextInt();
        System.out.print("\n-------------------------\n");
        Totel = price*order;
        System.out.printf("The Totel :%d\n",Totel);
        Totelproudect = Totelproudect-order;
        System.out.printf("\nThe Totel Prodect Becom :%d",Totelproudect);
        //===== Maseeg when Soon to be completed ==========
        if(Totelproudect <=10)
        {
            System.out.printf("The product is about to run out = %d",Totelproudect);
        }
}
//=========== END itch drink ============

//============== Menu foodstuffs =================
public void foodstuffs()
{
//=========== (2)==============
        System.out.print("---------------------------------\n");
        System.out.print("           foodstuffs            \n");
        System.out.print("---------------------------------\n");
        System.out.print("1)Egg                            \n");
        System.out.print("2)Cowardice                      \n");
        System.out.print("3)Oil                            \n");
        System.out.print("4)sugar                          \n");
        System.out.print("5)salt                           \n");
        System.out.print("6)biscuit                        \n");
        System.out.print("7)Back                           \n");
        System.out.print("---------------------------------\n");
        System.out.print("       PLEASE CHOSE NUMBER       \n");
        System.out.print("---------------------------------\n");
        
        Scanner input =new Scanner(System.in);
        int Choise =input.nextInt(); 
   //=========== Strart switch ==============
   switch(Choise)
  {
    case 1:
        Egg();
        break;
    case 2:
        Cowardice();
        break;
    case 3:
        Oil();
        break;
    case 4:
        sugar();
        break;
    case 5:
        salt();
        break;
    case 6:
        biscuit();
        break;
    case 7:
        Product();
        break;
    default :
        System.out.print("\nYour Choise Wrong.....");
        break;    
  }
  //=========== End switch ==============
}
//============== End Menu foodstuffs =================
//=========(1)=============
public void Egg()
{
        Scanner input =new Scanner(System.in);
        int price =17;int Totel;int Totelproudect=15;
        System.out.printf("\t\t  EGG  \nPrice :%d\n",price);
        System.out.printf("\nThe Totel Prodect is :%d",Totelproudect);
        System.out.print("\n-------------------------\n");
        System.out.print("Enter How Many DO you Have : ");
        int order =input.nextInt();
        System.out.print("\n-------------------------\n");
        Totel = price*order;
        System.out.printf("The Totel :%d\n",Totel);
        Totelproudect = Totelproudect-order;
        System.out.printf("\nThe Totel Prodect Becom :%d",Totelproudect);
        //===== Maseeg when Soon to be completed ==========
        if(Totelproudect <=10)
        {
            System.out.printf("The product is about to run out = %d",Totelproudect);
        }
}

//============ (2)=============
public void Cowardice()
{
 Scanner input =new Scanner(System.in);
        int price =7;int Totel;int Totelproudect=9;
        System.out.printf("\t\t  Cowardice  \nPrice :%d\n",price);
        System.out.printf("\nThe Totel Prodect is :%d",Totelproudect);
        System.out.print("\n-------------------------\n");
        System.out.print("Enter How Many DO you Have : ");
        int order =input.nextInt();
        System.out.print("\n-------------------------\n");
        Totel = price*order;
        System.out.printf("The Totel :%d\n",Totel);
        Totelproudect = Totelproudect-order;
        System.out.printf("\nThe Totel Prodect Becom :%d",Totelproudect);
        //===== Maseeg when Soon to be completed ==========
        if(Totelproudect <=5)
        {
            System.out.printf("The product is about to run out = %d",Totelproudect);
        }
}

//=========(3)============
public void Oil()
{
 Scanner input =new Scanner(System.in);
        int price=20;int Totel;int Totelproudect=17;
        System.out.printf("\t\t  Oil  \nPrice :%d\n",price);
        System.out.printf("\nThe Totel Prodect is :%d",Totelproudect);
        System.out.print("\n-------------------------\n");
        System.out.print("Enter How Many DO you Have : ");
        int order =input.nextInt();
        System.out.print("\n-------------------------\n");
        Totel = price*order;
        System.out.printf("The Totel :%d\n",Totel);
        Totelproudect = Totelproudect-order;
        System.out.printf("\nThe Totel Prodect Becom :%d",Totelproudect);
        //===== Maseeg when Soon to be completed ==========
        if(Totelproudect <=10)
        {
            System.out.printf("The product is about to run out = %d",Totelproudect);
        }
}
//=========(4)===========
public void sugar()
{
        Scanner input =new Scanner(System.in);
        int price=5;int Totel;int Totelproudect=15;
        System.out.printf("\t\t  sugar  \nPrice :%d\n",price);
        System.out.printf("\nThe Totel Prodect is :%d",Totelproudect);
        System.out.print("\n-------------------------\n");
        System.out.print("Enter How Many DO you Have : ");
        int order =input.nextInt();
        System.out.print("\n-------------------------\n");
        Totel = price*order;
        System.out.printf("The Totel :%d\n",Totel);
        Totelproudect = Totelproudect-order;
        System.out.printf("\nThe Totel Prodect Becom :%d",Totelproudect);
        //===== Maseeg when Soon to be completed ==========
        if(Totelproudect <=10)
        {
            System.out.printf("The product is about to run out = %d",Totelproudect);
        }
}
//==========(5)===========
public void salt()
{
        Scanner input =new Scanner(System.in);
        int price=6;int Totel;int Totelproudect=15;
        System.out.printf("\t\t  salt  \nPrice :%d\n",price);
        System.out.printf("\nThe Totel Prodect is :%d",Totelproudect);
        System.out.print("\n-------------------------\n");
        System.out.print("Enter How Many DO you Have : ");
        int order =input.nextInt();
        System.out.print("\n-------------------------\n");
        Totel = price*order;
        System.out.printf("The Totel :%d\n",Totel);
        Totelproudect = Totelproudect-order;
        System.out.printf("\nThe Totel Prodect Becom :%d",Totelproudect);
        //===== Maseeg when Soon to be completed ==========
        if(Totelproudect <=10)
        {
            System.out.printf("The product is about to run out = %d",Totelproudect);
        }
}
//============(6)===========
public void biscuit()
{
        Scanner input =new Scanner(System.in);
        int price=7;int Totel;int Totelproudect=15;
        System.out.printf("\t\t  biscuit  \nPrice :%d\n",price);
        System.out.printf("\nThe Totel Prodect is :%d",Totelproudect);
        System.out.print("\n-------------------------\n");
        System.out.print("Enter How Many DO you Have : ");
        int order =input.nextInt();
        System.out.print("\n-------------------------\n");
        Totel = price*order;
        System.out.printf("The Totel :%d\n",Totel);
        Totelproudect = Totelproudect-order;
        System.out.printf("\nThe Totel Prodect Becom :%d",Totelproudect);
        //===== Maseeg when Soon to be completed ==========
        if(Totelproudect <=10)
        {
            System.out.printf("The product is about to run out = %d",Totelproudect);
        }
}
 //================= FUN Conaction ==============
  public void conaction()
      {
            System.out.print("\n\n\n------------ Conaction us -----------\n");
            System.out.println(phone);
            System.out.println(Email);
            System.out.println(FAcount);
            System.out.println(Adrees);
            System.out.print("------------ THNCK YOU ---------------\n\n");
      }
 //================= End FUN Conaction ==============
  
 //================= FUN Exit ============== 
  public void Exit()
      {
            System.out.print("\n\n\n-------------------------------------\n");
            System.out.println("         Thank For Use Our Servses      ");
            System.out.print("\n--------------------------------------\n");
            System.exit(0);
      }
 //================= End FUN Exit ==============
}
