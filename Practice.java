
class Echo {
 int count = 0;
 void hello() {
 System.out.println("helloooo... ");
 }
 }

 class EchoTestDrive {
 public static void main(String [] args) {
 Echo e1 = new Echo();
 Echo e2 = new Echo();
 int x = 0;
 while ( x<4 ) {
 e1.hello();
 e1.count = e1.count + 1;
 if ( x >0 ) {
 e2.count = e2.count + 1;
 }
 if ( x>1 ) {
 e2.count = e2.count + e1.count;
 }
 x = x + 1;
 }
 System.out.println(e2.count);
 System.out.println("First change");
 }
}

// so to clone a repo first you have to make a folder on
//the local device i.e laptop
//open the terminal and direct to the created folder
//open the folder and clone the repo
//hello