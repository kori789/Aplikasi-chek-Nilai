import java.util.Scanner;
public class projectgagal{

	String nama;

public static void main(String[] args){
projectgagal panggil=new projectgagal();
panggil.menu();

}
void menu(){
Scanner masukan=new Scanner(System.in);
projectgagal panggil=new projectgagal();

String pengulangan="ya";
while(pengulangan.equals("ya")){
System.out.println("-----MENU UTAMA-----");
System.out.println("1. CHECK NILAI DASAR PEMOGRAMAN");
System.out.println("2. EXIT");
System.out.println("MASUKAN PILIHAN ANDA...");
int pilihan_user=masukan.nextInt();
switch(pilihan_user){
 case 1: 
	panggil.program();
	break;
 case 2:
	System.exit(2);
 }

}

       /**/}
void program(){
Scanner masukan=new Scanner(System.in);
projectgagal panggil=new projectgagal();

String pengulangan="ya";

while(pengulangan.equals("ya")){ 
String Nim;

System.out.println(">>~~~~~~~~~~~~~welcom~~~~~~~~~~~~~<<");
System.out.println("_____________________________________________");
System.out.println("- masukan NIM Anda");
System.out.println("1. keluar 2. Menu Utama");
System.out.println(">>example: H1051171024");
Nim=masukan.nextLine();
/*data-data nilai*/ 
int kori=80,user_1=70 , user_2=50;
/*data-data NIM Mahasiswa*/ 
String nimKori="H1051171024", nimUser_1="H1051171025", nimUser_2="H1051171026";

 if(Nim.equals(nimKori)){
 System.out.println("========================================="); System.out.println("==================================== ");
 System.out.println("Nama       : kori");
 System.out.println("Nim        : H1051171024");
 System.out.println("Nilai kamu : "+kori);
 panggil.nilai();
  }


 else if(Nim.equals(nimUser_1)){
 System.out.println("========================================="); System.out.println("==================================== ");
 System.out.println("Nama       : user_1");
 System.out.println("Nim        : H1051171025");
 System.out.println("Nilai kamu : "+user_1);
 panggil.nilai();

  }
 else if(Nim.equals(nimUser_2)){
 System.out.println("========================================="); System.out.println("==================================== ");
 System.out.println("Nama       : user_2");
 System.out.println("Nim        : H1051171026");
 System.out.println("Nilai kamu : "+user_2);
 panggil.nilai();

  }

else if(Nim.equals("1")){
 System.exit(1);
  }
else if(Nim.equals("2")){
 panggil.menu();
  }
 else{
 System.out.println("-----------------------------------------------------");
 System.out.println("-------------Nama Anda belum terdaftar---------------");
 System.out.println("-----------------------------------------------------");
  }
}


       /**/}
void nilai(){
projectgagal panggil=new projectgagal();

Scanner masukan=new Scanner(System.in);
        System.out.println("- bila terjadi ketidak cocokan nilai, Anda dapat memberikan komentar di bawah.");
	System.out.println("====>untuk melanjutkan ketikan yes");
	System.out.println("====>untuk Kembali ketikan no");
 	 String pil=masukan.nextLine();
 	 if(pil.equals("yes")){ System.out.println("========================================="); System.out.println("==================================== ");
  	 System.out.println("=> masukan kometar anda: ");
   	 String komentar=masukan.nextLine();
   	 System.out.println("<=~ komentar terkirim ~=>");}else if(pil.equals("yes")){System.out.println("-----------------------------------");}

        //batas
System.out.println("-----------------------------------------------------");System.out.println("-----------------------------------------------------");System.out.println("-----------------------------------------------------");System.out.println("-----------------------------------------------------");System.out.println("-----------------------------------------------------");
	String pengulangan="tidak";/**/

}


}
