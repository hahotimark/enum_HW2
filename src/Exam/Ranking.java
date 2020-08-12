package Exam;

public class Ranking {


    public void rank(Levels mylevel, int mark){

      if (mylevel == Levels.MID){

          if (mark >= 80){
              System.out.println("5");
          }
          if (mark >= 60 && mark < 80){
              System.out.println("4");
          }
          if (mark >= 40 && mark < 60){
              System.out.println("3");
          }
          if (mark >= 20 && mark < 40){
              System.out.println("2");
          }
          if (mark >= 0 && mark < 20){
              System.out.println("1");
          }

      }
      else if(mylevel == Levels.HIGH){

          if (mark >= 70){
              System.out.println("5");
          }
          if (mark >= 50 && mark < 70){
              System.out.println("4");
          }
          if (mark >= 30 && mark < 50){
              System.out.println("3");
          }
          if (mark >= 10 && mark < 30){
              System.out.println("2");
          }
          if (mark >= 0 && mark < 10){
              System.out.println("1");
          }

      }
      else{
          if (mark >= 90){
              System.out.println("5");
          }
          if (mark >= 70 && mark < 90){
              System.out.println("4");
          }
          if (mark >= 50 && mark < 70){
              System.out.println("3");
          }
          if (mark >= 30 && mark < 50){
              System.out.println("2");
          }
          if (mark >= 0 && mark < 30){
              System.out.println("1");
          }

        }

    }

}
