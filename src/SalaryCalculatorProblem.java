public class SalaryCalculatorProblem {
    public int earning(int arr[]){
        int weeklySalary = 0, salary = 0;
        int[] sal = arr;
        for(int i = 0; i < arr.length; i++){
            weeklySalary = arr[i];
        }
        for(int i = 0; i < arr.length; i++){
            if(weeklySalary <= 40){
                if(arr[i] <= 8){
                    sal[i] = arr[i] * 100;
                }else{
                    int count = arr[i] - 8;
                    sal[i] = (arr[i] * 100) + count * 15;

                }
            }
            else if (weeklySalary > 40){
                if(arr[i] <= 8){
                    sal[i] = arr[i] * 100;
                }else{
                    int count = arr[i] - 8;
                    sal[i] = (arr[i] * 100) + count * 25;
                }
            }
        }
        if(weeklySalary < 40){
            //System.out.print(";"+sal[0]+";");
            sal[0] += (sal[0] * 50) / 100;
            sal[6] += (sal[6] * 25) /100;
        }
        for(int i = 0; i < sal.length; i++){
            salary += sal[i];
        }
//        for(int i = 0; i < sal.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//        for(int i = 0; i < sal.length; i++){
//            System.out.print(sal[i] + " ");
//        }
        return salary;
    }
}
