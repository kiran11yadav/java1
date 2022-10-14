package marksheetjava;

import java.util.*;
class mar{

    String collegeName,branch;
    
    String studentName;
    int roll,hindi,english,java,ds,os;
    int sum, per, count=0;
    
    
    
    }
    
    class take extends mar{
    
    
    public void details() {
    Scanner in= new Scanner(System.in);
    System.out.println("Enter Instute Name");
    collegeName=in.nextLine();
    System.out.println("Enter Student Name");
    studentName=in.nextLine();
    System.out.println("Enter branch");
    branch=in.nextLine();
    System.out.println("Enter Roll number");
    roll=in.nextInt();
    
    
    }}
    
    class submark extends take{
    public void sub() {
    Scanner in= new Scanner(System.in);
    System.out.print("Enter your hindi marks");
    hindi = in.nextInt();
    System.out.print("Enter your english marks");
    english = in.nextInt();
    System.out.print("Enter your java marks");
    java = in.nextInt();
    System.out.print("Enter your ds marks");
    ds = in.nextInt();
    System.out.print("Enter your os marks");
    os = in.nextInt();
    }
    }
    class percentage extends submark{
    public void percentage() {
    sum=hindi+english+java+ds+os;
    per=sum/5;
    }
    }
    
    class printing extends percentage{
    public void printing() {
    System.out.println();
    System.out.println("SANT SINGAJI INSTITUTE OF SCIENCE & MANAGEMENT, SANDALPUR");
    System.out.println("-------------------------------------------------------");
    System.out.println("Name ="+studentName+"\t\t\t\tRoll_no.="+roll);
    
    System.out.println("-------------------------------------------------------");
    System.out.println("Subject\t\t\t\t\tMarks");
    System.out.println("-------------------------------------------------------");
    System.out.println("HINDI\t\t\t\t\t"+hindi);
    System.out.println("ENGLISH\t\t\t\t\t"+english);
    System.out.println("JAVA\t\t\t\t\t"+java);
    System.out.println("DS\t\t\t\t\t"+ds);
    System.out.println("OS\t\t\t\t\t"+os);
    System.out.println("-------------------------------------------------------");
    System.out.println("Division\t\t\tpercent\t"+per);
    }
    
    }
    class suply extends printing{
    public void suply(){
    if (hindi<40) {
    count++;
    }
    if(english<40) {
    count++;
    }
    if(java<40) {
    count++;
    }
    if(ds<40) {
    count++;
    }
    if(os<40) {
    count++;
    }
    
    }
    
    }
    class div extends suply{
    public void div() {
    if(count<=2) {
    if(hindi>40 && english>40 && java>40 && ds>40 && os>40)
    { if(per > 75) {
    System.out.println("First");
    }
    else if(per > 65 && per <75) {
    System.out.println("Second");
    }
    else if(per > 40 && per <65) {
    System.out.println("Third");
    
    }
    System.out.println("congrats you have passed");
    }
    
    }else {
    System.out.println("FAIl");
    }
    
    }
    }
    class suplycoun extends div{
    public void supfail () {
    if(count>=2 && count!=0) {
    System.out.println("You have supply in "+count+" subject");
    if (hindi<40) {
    System.out.println("Hindi*");
    }
    if(english<40) {
    System.out.println("English*");
    }
    if(java<40) {
    System.out.println("Java*");
    }
    if(ds<40) {
    System.out.println("DS*");
    }
    if(os<40) {
    System.out.println("OS*");
    }
    
    }
    
    }
    }
    
    class supplyexam extends suplycoun{
          Scanner in= new Scanner(System.in);
         
         
          public void examin() {
    if(count<=2  && count!=0) {
    if (hindi<40) {
    System.out.println("Enter your Hindi marks");
    hindi=in.nextInt();
    }
    if(english<40) {
    System.out.println("Enter your English marks");
    english=in.nextInt();
    }
    if(java<40) {
    System.out.println("Enter your java marks");
    java=in.nextInt();
    }
    if(ds<40) {
    System.out.println("Enter your ds marks");
    ds=in.nextInt();
    }
    if(os<40) {
    System.out.println("Enter your os marks");
    os=in.nextInt();
    }
    
    sum=hindi+english+java+ds+os;
    per=sum/5;
    System.out.println();
    System.out.println("SANT SINGAJI INSTITUTE OF SCIENCE & MANAGEMENT, SANDALPUR");
    System.out.println("-------------------------------------------------------");
    System.out.println("Name ="+studentName+"\t\t\t\tRoll_no.="+roll);
    
    System.out.println("-------------------------------------------------------");
    System.out.println("Subject\t\t\t\t\tMarks");
    System.out.println("-------------------------------------------------------");
    System.out.println("HINDI\t\t\t\t\t"+hindi);
    System.out.println("ENGLISH\t\t\t\t\t"+english);
    System.out.println("JAVA\t\t\t\t\t"+java);
    System.out.println("DS\t\t\t\t\t"+ds);
    System.out.println("OS\t\t\t\t\t"+os);
    System.out.println("-------------------------------------------------------");
    System.out.println("Division\t\t\tpercent\t"+per);
    
    
    
    if(hindi>40 && english>40 && java>40 && ds>40 && os>40)
    { if(per > 75) {
    System.out.println("First");
    System.out.println("congrats you have passed");
    }
    else if(per > 65 && per <75) {
    System.out.println("Second");
    System.out.println("congrats you have passed");
    }
    else if(per > 40 && per <65) {
    System.out.println("Third");
    System.out.println("congrats you have passed");
    
    }
    
    }else {
    System.out.println("FAIl");
    }
      }
     }    
    }
    
    
     class markinfo {
    
    
    public static void main(String[] args) {
    // // TODO Auto-generated method stub
    supplyexam  obj = new supplyexam();
    obj.details();
    obj.sub();
    obj.percentage();
    obj.printing();
    obj.suply();
    obj.div();
    obj.supfail();
    obj.examin();
    
    
    
    }
    
    }
    