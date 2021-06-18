 class Journal extends Izdanie {
    private int jSt;
     public Journal(String izName,int jSt) {
         super(izName);
         this.jSt= jSt;
     }

     public void setjSt(int jSt) {
         this.jSt = jSt;
     }

     public int getjSt() {
         return jSt;
     }

     @Override
     void print() {
         System.out.print("Издание:" +  getIzName() +"\nКоличество статей: " + getjSt());

     }
 }
