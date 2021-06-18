public abstract class Izdanie {
 private String izName;
 public Izdanie(String izName){
     this.izName = izName;
 }

    public String getIzName() {
        return izName;
    }

    public void setIzName(String izName) {
        this.izName = izName;
    }
abstract void print();
}
