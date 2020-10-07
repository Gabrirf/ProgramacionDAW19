public class threadimplimentation extends Thread implements Runnable{
  
  String name;
  int ms;
  
  public threadimplimentation(){
    this("thread", 1000);    
  }
  public threadimplimentation(int ms){
    this("thread", ms);
  }
  public threadimplimentation(String name, int ms){
    this.name = name;
    this.ms = ms;
  }

  
  public void run(){
    System.out.println();
    for(int i=1;i<5;i++){  
      try{
        Thread.sleep(ms);
    }
    catch(InterruptedException e){
      System.out.println(e);
    }  
    System.out.println("Thread "+name+" is running: " + i);  
    }
  } 
  public static void main(String args[]){
    threadimplimentation ob1 = new threadimplimentation("1", 1000);
    threadimplimentation ob2 = new threadimplimentation("2", 2000);
    ob1.start();
    ob2.start();
  }
}