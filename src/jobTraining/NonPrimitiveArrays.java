package jobTraining;

import java.util.Arrays;

public class NonPrimitiveArrays {
     public static void main(String[] args){
          String[] names = new String[3];
          Arrays.stream(names).forEach(name->{
                  System.out.println(name);
          });
          names[0] = "Luffy";
          names[1] = "Zoro";
          names[2] = "Sanji";

          for (String name : names){
               System.out.println(name);
          }
     }

}
