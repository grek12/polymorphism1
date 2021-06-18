 class Book extends Izdanie {
    private String avtorName;
     public Book(String izName, String avtorName) {
         super(izName);
         this.avtorName=avtorName;
     }

     public String getAvtorName() {
         return avtorName;
     }

     public void setAvtorName(String avtorName) {
         this.avtorName = avtorName;
     }

     @Override
     void print() {
     System.out.println("Издание:" +  getIzName() +"\nАвтор: " + getAvtorName() );
     }
 }
