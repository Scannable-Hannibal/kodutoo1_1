import java.util.Random;

public class Expenses {
    int num_of_employees = 5;

    int[] salaries = new int[num_of_employees];
    void fill_array(int min, int max){
        Random rand = new Random();
        for(int i=0; i<num_of_employees; i++){
            salaries[i] = min + rand.nextInt(max - min);
        }
    }
    void change_salary(int percent, int salary){
        for(int i = 0; i<num_of_employees; i++){
            if(salaries[i]<salary){
                salaries[i]+=salaries[i]*percent/100;
            }
        }
    }
    void show_salaries(){
        for(int i = 0; i<num_of_employees; i++){
            System.out.printf("%d ", salaries[i]);
        }
        System.out.println();
    }
}