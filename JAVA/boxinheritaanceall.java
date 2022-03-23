class Box{
  private int height , width, depth ;
    Box()
    {   
        height=-1;
        width=-1;
        depth=-1;
        System.out.println(height*width*depth  + " base");
    }
    Box(int height, int width, int depth){
        this.height=height;
        this.width=width;
        this.depth=depth;
    }
  void customConstructorDis(){
      System.out.println("Box width height depth "+width*depth*height);
  }
      void customConstructor( int width, int height,int depth){
          this.width=width;
          this.height=height;
          this.depth=depth;
          System.out.println(this.width*this.depth*this.depth);
        
  }
}


class BoxWeight extends Box{
    int weight;
    BoxWeight(){
        System.out.println("Nice");
    }
    BoxWeight(int width, int height, int depth,int weight){
     super(width, height, depth); // super class access private
     this.weight = weight;
     }

    void show(){
        System.out.println("box weight "+ weight);
    }
}

class boxinheritaanceall{
    public static void main(String args[]){
        BoxWeight box1 = new BoxWeight(1,2,3,5);
        BoxWeight box2 = new BoxWeight();
        box2.show();
        box1.show();
        box1.customConstructorDis();

        //box1.customConstructor(10, 10, 10);
    }
}