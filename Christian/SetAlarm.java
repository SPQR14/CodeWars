/*
https://www.codewars.com/kata/568dcc3c7f12767a62000038/train/java
*/

public static boolean setAlarm(boolean employed, boolean vacation) {
    return(employed == true && vacation == false) ? true: false;
  }

/*Segunda solución más fea*/
public static boolean setAlarm(boolean employed, boolean vacation) {
        boolean alarma = false;
            if (employed == true && vacation == false){
                alarma = true;
            } else{
                alarma = false;
            }
        return alarma;
    }
