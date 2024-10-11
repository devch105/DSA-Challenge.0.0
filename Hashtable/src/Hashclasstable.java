import javax.swing.tree.AbstractLayoutCache;
import java.security.Key;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Hashclasstable {

    private  int size=7;
    private  Node[] datamap;


    class Node{
        private  String key;
        private int value;
        private Node next;

        Node(String key, int value){
            this.key=key;
            this.value=value;
        }
    }

    public Hashclasstable(){
        datamap =new Node[size];
    }


    public void Printtable(){
        for(int i=0; i<datamap.length; i++){
            System.out.println(i+ ":" );
            Node temp=datamap[i];
            while(temp!=null){
                System.out.print(" {"+temp.key+" = " +temp.value+"} ");
                temp=temp.next;
            }

        }
    }

    public int Hash(String EncryptKey){
        int hash=0;
        char[] Keychar=EncryptKey.toCharArray();
        for(int i=0; i<Keychar.length; i++){
            int ascival=Keychar[i];
            hash=(hash+ascival*37)%datamap.length;
        }

        return hash;
    }

    public void set(String key,int value){
        int index=Hash(key);
        Node newnode=new Node(key, value);
        if(datamap[index]==null){
            datamap[index]=newnode;
        }else{
            Node temp=datamap[index];
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }

    public int get(String key){
        int index=Hash(key);
        Node temp=datamap[index];
        while (temp!=null){
            if(temp.key == key) return temp.value;
            temp=temp.next;
        }
        System.out.println();
        System.out.println(key+" element not found ");
        return -1;
    }

    public ArrayList keys(){
        ArrayList<String> Keylist=new ArrayList<>();

        for(int i=0; i<datamap.length; i++){
            Node temp=datamap[i];
            while(temp!=null){
                Keylist.add(temp.key);
                temp=temp.next;
            }
        }

        return Keylist;

    }






    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
  Hashclasstable hstable=new Hashclasstable();

    while (true){
        System.out.println(" 1. Set Method");
        System.out.println(" 2. key Method");
        System.out.println(" 3. Get method");
        System.out.println(" 4. Print Method");
        System.out.println(" Any number  for exit ");
        System.out.println("-------------------");
        System.out.println();
        System.out.print(" Enter your Choice = ");
        int choice=sc.nextInt();

          switch (choice){
              case 1:
                  System.out.println(" Enter value =");
                  int val=sc.nextInt();

                  System.out.println(" Enter key =");
                  String x=sc.nextLine();
                  hstable.set(x,val);

              case 2:     hstable.keys();


              case 3:    System.out.println();
                         System.out.print(" Enter Key =");
                         String y=sc.nextLine();
                         hstable.get(y);

              case 4:    hstable.Printtable();

              default:
                  System.out.println(" out");
          }


    }


    }


}
