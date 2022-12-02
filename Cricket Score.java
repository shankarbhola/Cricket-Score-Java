import java.util.*;

class p1{                                                //Player 1
    private String name;
    public int score;
    void init(String n, int s){
        name=n;
        score=s;
    }
    void disp(){
        System.out.println("Score Of "+name+" is "+score);
    }
}

class p2{                                           //Player 2
    private String name;
    public int score;
    void init(String n, int s){
        name=n;
        score=s;
    }
    void disp(){
        System.out.println("Score Of "+name+" is "+score);
    }
}

class p3{                                           //Player 3
    private String name;
    public int score;
    void init(String n, int s){
        name=n;
        score=s;
    }
    void disp(){
        System.out.println("Score Of "+name+" is "+score);
    }
}


class p4{                                           //Player 4
    private String name;
    public int score;
    void init(String n, int s){
        name=n;
        score=s;
    }
    void disp(){
        System.out.println("Score Of "+name+" is "+score);
    }
}

class p5{                                           //Player 5
    private String name;
    public int score;
    void init(String n, int s){
        name=n;
        score=s;
    }
    void disp(){
        System.out.println("Score Of "+name+" is "+score);
    }
}

class p6{                                           //Player 6
    private String name;
    public int score;
    void init(String n, int s){
        name=n;
        score=s;
    }
    void disp(){
        System.out.println("Score Of "+name+" is "+score);
    }
}

class p7{                                           //Player 7
    private String name;
    public int score;
    void init(String n, int s){
        name=n;
        score=s;
    }
    void disp(){
        System.out.println("Score Of "+name+" is "+score);
    }
}

class p8{                                           //Player 8
    private String name;
    public int score;
    void init(String n, int s){
        name=n;
        score=s;
    }
    void disp(){
        System.out.println("Score Of "+name+" is "+score);
    }
}

class p9{                                           //Player 9
    private String name;
    public int score;
    void init(String n, int s){
        name=n;
        score=s;
    }
    void disp(){
        System.out.println("Score Of "+name+" is "+score);
    }
}

class p10{                                           //Player 10
    private String name;
    public int score;
    void init(String n, int s){
        name=n;
        score=s;
    }
    void disp(){
        System.out.println("Score Of "+name+" is "+score);
    }
}

class p11{                                           //Player 11
    private String name;
    public int score;
    void init(String n, int s){
        name=n;
        score=s;
    }
    void disp(){
        System.out.println("Score Of "+name+" is "+score);
    }
}




class Cricket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("-----------------------------\nWELCOME TO T20 CRICKET MATCH\n-----------------------------");
        
        //Player 1
        p1 a=new p1();
        System.out.println("Enter player 1 Name and Score");
        a.init(sc.nextLine(), sc.nextInt());
        sc.nextLine();
        //Player 2
        p2 b=new p2();
        System.out.println("Enter player 2 Name and Score");
        b.init(sc.nextLine(), sc.nextInt());
        sc.nextLine();
        //Player 3
        p3 c=new p3();
        System.out.println("Enter player 3 Name and Score");
        c.init(sc.nextLine(), sc.nextInt());
        sc.nextLine();
        //Player 4
        p4 d=new p4();
        System.out.println("Enter player 4 Name and Score");
        d.init(sc.nextLine(), sc.nextInt());
        sc.nextLine();
        //Player 5
        p5 e=new p5();
        System.out.println("Enter player 5 Name and Score");
        e.init(sc.nextLine(), sc.nextInt());
        sc.nextLine();
        //Player 6
        p6 f=new p6();
        System.out.println("Enter player 6 Name and Score");
        f.init(sc.nextLine(), sc.nextInt());
        sc.nextLine();
        //Player 7
        p7 g=new p7();
        System.out.println("Enter player 7 Name and Score");
        g.init(sc.nextLine(), sc.nextInt());
        sc.nextLine();
        //Player 8
        p8 h=new p8();
        System.out.println("Enter player 8 Name and Score");
        h.init(sc.nextLine(), sc.nextInt());
        sc.nextLine();
        //Player 9
        p9 i=new p9();
        System.out.println("Enter player 9 Name and Score");
        i.init(sc.nextLine(), sc.nextInt());
        sc.nextLine();
        //Player 10
        p10 j=new p10();
        System.out.println("Enter player 10 Name and Score");
        j.init(sc.nextLine(), sc.nextInt());
        sc.nextLine();
        //Player 11
        p11 k=new p11();
        System.out.println("Enter player 11 Name and Score");
        k.init(sc.nextLine(), sc.nextInt());
        sc.nextLine();

        //Display
        System.out.println("-----------------\nINDIVISUAL SCORES\n-----------------");
        a.disp();
        b.disp();
        c.disp();
        d.disp();
        e.disp();
        f.disp();
        g.disp();
        h.disp();
        i.disp();
        j.disp();
        k.disp();

        //Total score
        System.out.println("-----------------------\nTOTAL TEAM INDIA SCORES\n-----------------------");

        System.out.println("Total Score = "+(a.score+b.score+c.score+d.score+e.score+f.score+g.score+h.score+i.score+j.score+k.score));
        
        
    }
}