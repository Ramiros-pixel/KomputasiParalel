package codewars;
public class shorting {
  int[] examp = {1,3,0,4,5};
  int tamp = examp[0];
  void lowHigh(){
    int param;
    for(param = 0; param < (examp.length);param++){
      if(examp[param] < examp[0]){
        tamp = examp[param];
      }
    }
    System.out.println("Nilai paling terkecil" + tamp );
  }

  public static void main(String[] args) {
    shorting kata=new shorting();
    kata.lowHigh();
  }
}