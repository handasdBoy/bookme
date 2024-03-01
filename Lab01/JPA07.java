public class JPA07{
    public static void main(String[] args){
        int action = 1;
        int skill = 2;
        int team = 3;
        System.out.println("The basketball grade is " + Basketball.calGrade(action,skill,team));
        System.out.println("The baseball grade is " + Baseball.calGrade(skill,team));
    }
}

class Basketball{
    public static int calGrade(int a,int s,int t)  {
        return a+s+t;
    }
}

class Baseball{
    public static int calGrade(int s,int t)  {
        return 10+s+t;
    }
}





