import java.util.LinkedList;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Archive {
    private static Scanner in = new Scanner(System.in);
    private String NamePz;
    private String Os;
    private int Size;
    private String Data;
    private LinkedList<Archive> Arr = new LinkedList<>();
    
    public void Delete(){
        int Index = 0;
        Index = FindIndex();
        if(Index!=-1)Arr.remove(Index);
        else
        System.out.println("Такий елемнт відсутній(");
    }
    public int FindIndex(){
        int Index = -1;
        String Name,OC,data;
        int size;
        System.out.println("Введіть данні які знайти");
        System.out.println("Введіть назву ПЗ");
        Name = in.nextLine();
        System.out.println("Введіть OC");
        OC = in.nextLine();
        System.out.println("Введіть розмір програми");
        size = in.nextInt();
        System.out.println("Введіть дату запису");
        data = in.nextLine();
        data = in.nextLine();
        for(int i = 0; i < Arr.size();i++){
            if(Name == Arr.get(i).Arr.get(i).NamePz)Index = i;
        }
        return Index;
    }
    public void Print(){
        
        for(int i = 0;i<Arr.size();i++){
            
        System.out.println("Назва ПЗ:" + Arr.get(i).NamePz);
        System.out.println("OC:" + Arr.get(i).Os);
        System.out.println("Size:" + Arr.get(i).Size);
        System.out.println("Data:" + Arr.get(i).Data);
        System.out.println( "  " );
        }
    }

    public void Enter(){
        Archive archive = new Archive();
        System.out.println("Введіть назву ПЗ");
        archive.Set_NamePz(in.nextLine());
        System.out.println("Введіть OC");
        archive.Set_Os(in.nextLine());
        System.out.println("Введіть розмір програми");
        archive.Set_Size(in.nextInt());
        System.out.println("Введіть дату запису");
        archive.Set_Data(in.nextLine());
        archive.Set_Data(in.nextLine());
        Arr.add(archive); 
    }
    public String Get_NamePz(){
        return NamePz;
    }
    public String Get_Os(){
        return Os;
    }
    public int Get_Size(){
        return Size;
    }
    public String Get_Data(){
        return Data;
    }
    public void Set_NamePz(String namePz){
        NamePz = namePz;
    }
    public void Set_Os(String os){
        Os = os;
    }
    public void Set_Size(int size){
        Size = size;
    }
    public void Set_Data(String data){
         Data = data;
    }
    public Archive(String namePz,String os,int size,String data){
            NamePz = namePz;
            Os = os;
            Size =size;
            Data = data;
    }
    public Archive(){
        NamePz = "";
        Os = "";
        Size = 0;
        Data = "";
}
}
