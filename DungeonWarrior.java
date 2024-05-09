import java.util.Random; import java.util.Scanner;
public class DungeonWarrior {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
Random rand = new Random(); System.out.println("Dungeon Warrior"); System.out.print("Would you like to play?(yes/no) "); String play = scan.nextLine();
System.out.println(""); System.out.println(""); System.out.println(""); int enemyhealth = 20; if (play.equals("yes")){
int health = 100;
System.out.println("You will go through 5 rounds of enemies, eliminate each before you can move on. Type Block to protect. Type Attack to fight back, its turned based. Try to remain above 0 Health.");
System.out.println("");
System.out.println("");
System.out.println("");
for (int enemies = 1; enemies<=5;enemies++ ){
enemyhealth = 25;
for (int num = 20; num>0;num-- ){
System.out.println(""); }
if (enemies == 1 ){
System.out.println("Enemy Number "+enemies); System.out.println("You should've ran away."); System.out.println("^---^"); System.out.println("(030)");
System.out.println(" | |");
}
else if (enemies ==2 ){
System.out.println("Enemy Number "+enemies); System.out.println("My brother lost but I wont."); System.out.println("^---^"); System.out.println("(`0`)");
System.out.println(" | |"); }
else if (enemies == 3 ){
System.out.println("Enemy Number "+enemies);
 System.out.println("They were weak, unlike me!"); System.out.println("()_/)"); System.out.println("(-^-)");
System.out.println(" | |");
}
else if (enemies == 4 ){
System.out.println("Enemy Number "+enemies); System.out.println("He had too much ego, its over for real now!"); System.out.println("[~~~]");
System.out.println("|@*@|");
System.out.println(" | |");
}
else if (enemies == 5 ){
System.out.println("Enemy Number "+enemies); System.out.println("It's the endgame now."); System.out.println("{}___{}"); System.out.println("(- x O)"); System.out.println("/> . <| ");
}
while(enemyhealth>0){ if (health <= 0){
break; }
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("Enemy Health: "+enemyhealth+"/25"); System.out.println("Health: "+health+"/100"); System.out.print("attack (1) or block (2): ");
int move = scan.nextInt();
int enemymove = (int) ( Math.random() * 2 + 1); int myaccuracy = (int) ( Math.random() * 2 + 1); int hisaccuracy = (int) ( Math.random() * 2 + 1);
if (move == 1 && enemymove == 1){ System.out.println("Enemy: "+enemymove); if (hisaccuracy==1){
health -= 5; }
else{ System.out.println("");

 System.out.println("Enemy Missed"); }
if (myaccuracy==1){ enemyhealth -= 5;
} else{
System.out.println("");
System.out.println("You Missed"); }
}
else if (move == 2 && enemymove == 2){
System.out.println("Enemy: "+enemymove); health -= 0;
enemyhealth -= 0;
}
else if (move == 2 && enemymove == 1){ System.out.println("Enemy move: "+enemymove); if (hisaccuracy==1){
health -= 2; }
else{
System.out.println(""); System.out.println("Enemy Missed");
} }
else if (move == 1 && enemymove == 2){ System.out.println("Enemy: "+enemymove); if (myaccuracy==1){
enemyhealth -= 2; }
else{
System.out.println("You Missed");
} }
}
if (health <= 0){
System.out.println(""); System.out.println("Game Over"); break;
}

}
for (int num = 20; num>0;num-- ){
System.out.println(""); }
if (health >0){ System.out.println("YOU WON!!!");
}
}
if (play.equals("no")){
System.out.println("That's too bad.");
System.out.println("You will go through me, eliminate me before you can leave. Type Block to protect. Type Attack to fight back, its turned based. Try to remain above 0 Health.");
int health = 100;
System.out.println("");
System.out.println("");
System.out.println("");
for (int enemies = 1; enemies<=2;enemies++ ){
enemyhealth = 25;
for (int num = 20; num>0;num-- ){
System.out.println(""); }
if (enemies == 1 ){
enemyhealth=5;
System.out.println("Enemy Number ?????"); System.out.println("TRY TO HARM ME."); System.out.println("ヽ༼ຈ͜لຈ༽ノ"); while(enemyhealth>0){
if (health <= 0){
break; }
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("Enemy Health: "+enemyhealth+"/5"); System.out.println("Health: "+health+"/100"); System.out.print("attack (1) or block (2): ");
int move = scan.nextInt();
int enemymove = (int) ( Math.random() * 2 + 1); int myaccuracy = (int) ( Math.random() * 2 + 1); int hisaccuracy = (int) ( Math.random() * 2 + 1);
 if (move == 1 && enemymove == 1){ System.out.println("Enemy: "+enemymove); if (hisaccuracy==1){
health -= 5; }
else{
System.out.println(""); System.out.println("Enemy Missed");
}
if (myaccuracy==1){
enemyhealth -= 5; }
else{
System.out.println(""); System.out.println("You Missed");
} }
else if (move == 2 && enemymove == 2){ System.out.println("Enemy: "+enemymove); health -= 0;
enemyhealth -= 0;
}
else if (move == 2 && enemymove == 1){ System.out.println("Enemy move: "+enemymove); if (hisaccuracy==1){
health -= 2; }
else{
System.out.println(""); System.out.println("Enemy Missed");
} }
else if (move == 1 && enemymove == 2){ System.out.println("Enemy: "+enemymove); if (myaccuracy==1){
enemyhealth -= 2; }
else{
System.out.println("You Missed");
} }

 } }
else if (enemies ==2 ){
enemyhealth=10000;
System.out.println("Enemy Number !?!?!?!?!?"); System.out.println("HAHAHAHAHA."); System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣤⣤⣤⣤⣶⣦⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀ "); System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⡿⠛⠉⠙⠛⠛⠛⠛⠻⢿⣿⣷⣤⡀⠀⠀⠀⠀⠀ "); System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⠋⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⠈⢻⣿⣿⡄⠀⠀⠀⠀ "); System.out.println("⠀⠀⠀⠀⠀⠀⠀⣸⣿⡏⠀⠀⠀⣠⣶⣾⣿⣿⣿⠿⠿⠿⢿⣿⣿⣿⣄⠀⠀⠀ "); System.out.println("⠀⠀⠀⠀⠀⠀⠀⣿⣿⠁⠀⠀⢰⣿⣿⣯⠁⠀⠀⠀⠀⠀⠀⠀⠈⠙⢿⣷⡄⠀ "); System.out.println("⠀⠀⣀⣤⣴⣶⣶⣿⡟⠀⠀⠀⢸⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣷⠀ "); System.out.println("⠀⢰⣿⡟⠋⠉⣹⣿⡇⠀⠀⠀⠘⣿⣿⣿⣿⣷⣦⣤⣤⣤⣶⣶⣶⣶⣿⣿⣿⠀ "); System.out.println("⠀⢸⣿⡇⠀⠀⣿⣿⡇⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠀ "); System.out.println("⠀⣸⣿⡇⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠉⠻⠿⣿⣿⣿⣿⡿⠿⠿⠛⢻⣿⡇⠀⠀ "); System.out.println("⠀⣿⣿⠁⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣧⠀⠀ "); System.out.println("⠀⣿⣿⠀⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⠀⠀ "); System.out.println("⠀⣿⣿⠀⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⠀⠀ "); System.out.println("⠀⢿⣿⡆⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⡇⠀⠀ "); System.out.println("⠀⠸⣿⣧⡀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⠃⠀⠀ "); System.out.println("⠀⠀⠛⢿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⣰⣿⣿⣷⣶⣶⣶⣶⠶⠀⢠⣿⣿⠀⠀⠀ "); System.out.println("⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⠀⠀⠀⣿⣿⡇⠀⣽⣿⡏⠁⠀⠀⢸⣿⡇⠀⠀⠀ "); System.out.println("⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⠀⠀⠀⣿⣿⡇⠀⢹⣿⡆⠀⠀⠀⣸⣿⠇⠀⠀⠀ "); System.out.println("⠀⠀⠀⠀⠀⠀⠀⢿⣿⣦⣄⣀⣠⣴⣿⣿⠁⠀⠈⠻⣿⣿⣿⣿⡿⠏⠀⠀⠀⠀ "); System.out.println("⠀⠀⠀⠀⠀⠀⠀⠈⠛⠻⠿⠿⠿⠿⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
for(int each = 0; each<=10;each++){ if (health <= 0){
break; }
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("Enemy Health: ???????/???????"); System.out.println("Health: "+health+"/100"); System.out.print("attack (1): ");
int move = scan.nextInt();
int enemymove = (int) ( Math.random() * 2 + 1); int myaccuracy = (int) ( Math.random() * 2 + 1); int hisaccuracy = (int) ( Math.random() * 2 + 1);

if (move == 1){ System.out.println("Enemy: ????"); if (myaccuracy==1){
enemyhealth -= 5; }
else{
System.out.println(""); System.out.println("You Missed");
} }
}
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println ("My turn.");
System.out.println ("Enemy: dealt 10000 damage!"); health-=10000;
}
if (health <= 0){
System.out.println(""); System.out.println("Game Over: Poor Child"); break;
}
}
for (int num = 20; num>0;num-- ){
System.out.println(""); }
if (health >0){ System.out.println("YOU WON!!!");
}
} }
}