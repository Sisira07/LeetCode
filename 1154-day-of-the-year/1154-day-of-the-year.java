class Solution {
    public int dayOfYear(String date) {
        int[] months=new int[12];
        int year=Integer.valueOf(date.substring(0,4));
        
        for(int i=0;i<12;i++){
            if(i==0 || i==2 || i==4 ||i==6||i==7||i==9||i==11){
                months[i]=31;
            }
            else if(i==3||i==5||i==8||i==10) months[i]=30;
            else{
                if(year%400==0 || (year % 4 == 0 && year % 100 != 0)) months[i]=29;
                else months[i]=28;
            }
        }
        int month=Integer.valueOf(date.substring(5,7));
        int day=Integer.valueOf(date.substring(8));
        int days=0;

        if(month==1) return day;
        for(int i=0;i<month-1;i++){
            days+=months[i];
        }
        days+=day;
        return days;
    }
}