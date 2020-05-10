package Report3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read_txt {
   
   public int[] count_freq(String address)
   {
      int[] ascii = new int[128];
      int count = 1;
      try{
            //���� ��ü ����
            File file = new File(address);
            //�Է� ��Ʈ�� ����
            FileReader filereader = new FileReader(file);
            int singleCh = 0;
            while((singleCh = filereader.read()) != -1){
                ascii[singleCh] += count;
            }
            filereader.close();
        }catch (FileNotFoundException e) {
            // TODO: handle exception
        }catch(IOException e){
            System.out.println(e);
        }
      
      return ascii;
   }
   
}