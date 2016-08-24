package sortTest;

public class PaiXu {  
	   final int MAX=20;  
	   int num[]=new int[MAX];  
	   {  
	       System.out.print("���ɵ���������ǣ�");  
	       for(int i=0;i<20;i++){  
	           num[i]=(int)(Math.random()*100);  
	           System.out.print(num[i]+" ");  
	       }  
	       System.out.println();  
	   }  
	     
	   int num2[]=new int[MAX]; //ֻ���ںϲ�������  
	   {  
	       System.out.print("�ϲ�������Ҫʹ�õ�����2�ǣ�");  
	       for(int i=0;i<20;i++){  
	           num2[i]=(int)(Math.random()*100);  
	           System.out.print(num2[i]+" ");  
	       }  
	       System.out.println();  
	   }  
	     
	   int num3[]=new int[MAX+MAX]; //���ڴ�źϲ������б��ϲ�����õ�����  
	     
	     
	   public PaiXu(){  
	       selsort(num.clone());                        //ѡ������  
	       insort(num.clone());                         //��������  
	       bubsort(num.clone());                        //ð������  
	       shellsort(num.clone());                      //ϣ������  
	       shakersort(num.clone());                     //shake����  
	       heapsort(num.clone());                       //������  
	       quicksort_one(num.clone());                  //�������򷨣�һ��    
	       quicksort_two(num.clone());                  //�������򷨣�����  
	       quicksort_three(num.clone());                //�������򷨣�����  
	       mergesort(num.clone(),num2.clone(),num3);    //�ϲ�����  
	       basesort(num.clone());                       //��������  
	   }  
	    
	   /*----------------------------ѡ������------------------------------------------- 
	          ��Ҫ����Ķ�����������ݣ�һ����������ģ�һ����δ����ģ��Ӻ��δ���򲿷�ѡ��һ����Сֵ��������ǰ�������򲿷ݵ����һ���� 
	   -------------------------------------------------------------------------------*/  
	   public void selsort(int number[]) {  
	        int i, j, k, m, temp;  
	        long start,end;  
	          
	        start=System.nanoTime();  
	        for(i = 0; i < MAX-1; i++) {  
	            m = i;  
	            for(j = i+1; j < MAX; j++){  
	                if(number[j] < number[m]){  
	                 m = j;  
	                }  
	            }  
	            if( i != m){  
	                temp=number[i];  
	                number[i]=number[m];  
	                number[m]=temp;  
	            }  
	        }  
	        end=System.nanoTime();  
	          
	        System.out.println("-----------------ѡ������------------------");  
	        System.out.print("�������:");  
	        for(i=0;i<=MAX-1;i++){  
	            System.out.print(number[i]+" ");  
	        }  
	        System.out.println();  
	        System.out.println("����ʹ��ʱ�䣺"+(end-start)+" ns");  
	    }  
	     
	     
	     
	   /*-------------------------��������-------------------------------- 
	            �������ӿ�һ�������ǽ��Ʒ������ѣ�ÿ�δӺ���һ�ѵ��Ƴ����ǰ�˵��ƣ�Ȼ�����ǰ��һ���Ƶ��ʵ�λ�� 
	   -----------------------------------------------------------------*/  
	   public void insort(int number[]){  
	        int i, j, k, temp;  
	        long start,end;  
	          
	        start=System.nanoTime();  
	        for(j = 1; j < MAX; j++) {  
	            temp = number[j];  
	            i = j - 1;  
	            while(temp < number[i]) {  
	                number[i+1] = number[i];  
	                i--;  
	                if(i == -1){  
	                    break;  
	                }  
	            }  
	        number[i+1] = temp;  
	        }  
	        end=System.nanoTime();  
	          
	        System.out.println("-----------------��������------------------");  
	        System.out.print("�������:");  
	        for(i=0;i<=MAX-1;i++){  
	            System.out.print(number[i]+" ");  
	        }  
	        System.out.println();  
	        System.out.println("����ʹ��ʱ�䣺"+(end-start)+" ns");  
	   }  
	     
	     
	   /*-----------------------------------------ð������---------------------------------------- 
	                   ����˼�壬��������ʱ������Ԫ�ػ���ͬ����һ�������Ҷˣ������ñȽ�����Ԫ�صķ����������Ԫ�ؽ������Ҷˣ� 
	          ���Դ��Ԫ�ػ᲻�ϵ������ƶ���ֱ���ʵ���λ��Ϊֹ�� 
	                  �������������򷨿����������ķ�ʽ��΢����һЩ�Ƚϵ�ʱ�䣬��Ѱ�������к�û�з����κεĽ��������� 
	         ��ʾ�����Ѿ���ɣ��������ٽ���֮��Ļ�Ȧ�Ƚ��뽻�������� 
	   ----------------------------------------------------------------------------------------*/  
	   public void bubsort(int number[]){  
	        int i, j, k, temp, flag = 1;  
	        long start,end;  
	          
	        start=System.nanoTime();  
	        for(i = 0; i < MAX-1 && flag == 1; i++) {  
	            flag = 0;  
	            for(j = 0; j < MAX-i-1; j++) {  
	                if(number[j+1] < number[j]) {  
	                    temp=number[j+1];  
	                    number[j+1]=number[j];  
	                    number[j]=temp;  
	                    flag = 1;  
	                }  
	            }  
	        }  
	        end=System.nanoTime();  
	          
	        System.out.println("-----------------ð������------------------");  
	        System.out.print("�������:");  
	        for(i=0;i<=MAX-1;i++){  
	            System.out.print(number[i]+" ");  
	        }  
	        System.out.println();  
	        System.out.println("����ʹ��ʱ�䣺"+(end-start)+" ns");  
	   }  
	     
	     
	     
	   /*--------------------------shell��ϣ��������---------------------------- 
	    Shell���Ƚ�����趨Ϊn/2��Ȼ����Ծ���в����������������n/4����Ծ���������������� 
	    ����趨Ϊn/8��n/16��ֱ�����Ϊ1֮������һ��������ֹ��������һ�ε����������Ὣ 
	    �̶�����ڵ�Ԫ������ã����Ե����Խ��ԽСʱ��ĳЩԪ��λ����ȷλ�õĻ���Խ�ߣ���� 
	    ��󼸴ε������������Դ�����͡� 
	    ---------------------------------------------------------------------*/  
	   public void shellsort(int number[]) {  
	        int i, j, k, gap, temp;  
	        long start,end;  
	          
	        start=System.nanoTime();  
	        gap = MAX / 2;  
	        while(gap > 0) {  
	            for(k = 0; k < gap; k++) {  
	                for(i = k+gap; i < MAX; i+=gap) {  
	                    for(j = i - gap; j >= k; j-=gap) {  
	                        if(number[j] > number[j+gap]) {  
	                            temp=number[j];  
	                            number[j]=number[j+gap];  
	                            number[j+gap]=temp;  
	                        }else{  
	                            break;  
	                        }  
	                    }  
	                }  
	            }  
	            gap /= 2;  
	        }  
	        end=System.nanoTime();  
	          
	        System.out.println("-----------------shell(ϣ��)���򷨣��Ľ��Ĳ������򷨣�------------------");  
	        System.out.print("�������:");  
	        for(i=0;i<=MAX-1;i++){  
	            System.out.print(number[i]+" ");  
	        }  
	        System.out.println();  
	        System.out.println("����ʹ��ʱ�䣺"+(end-start)+" ns");  
	   }  
	     
	     
	     
	   /*---------------------Shake���򷨣�������ð�����򷨣�-------------------------- 
	              �������������������˫����У��������������������ҽ��У�������������������������У� 
	              ������һ������Ķ�������������ʹ��left��right�����������¼���������������Ԫ��λ�á�  
	    --------------------------------------------------------------------*/  
	   public void shakersort(int number[]) {   
	        int i, temp, left = 0, right = MAX - 1, shift = 0;   
	        long start,end;  
	          
	        start=System.nanoTime();  
	        while(left < right) {   
	            // �����M�К�������   
	            for(i = left; i < right; i++) {   
	                if(number[i] > number[i+1]) {   
	                    temp=number[i];  
	                    number[i]=number[i+1];  
	                    number[i+1]=temp;  
	                    shift = i;   
	                }   
	            }   
	            right = shift;    
	      
	            // �����M�К�������   
	            for(i = right; i > left; i--) {   
	                if(number[i] < number[i-1]) {   
	                    temp=number[i];  
	                    number[i]=number[i-1];  
	                    number[i-1]=temp;   
	                    shift = i;   
	                }   
	            }   
	            left = shift;   
	        }  
	        end=System.nanoTime();  
	          
	        System.out.println("-----------------shake���򷨣��Ľ���ð�����򷨣�------------------");  
	        System.out.print("�������:");  
	        for(i=0;i<=MAX-1;i++){  
	            System.out.print(number[i]+" ");  
	        }  
	        System.out.println();  
	        System.out.println("����ʹ��ʱ�䣺"+(end-start)+" ns");  
	    }   
	     
	     
	     
	     
	   /*-----------------------heap���򣨶�����--�Ľ���ѡ������---------------------------- 
	           ���öѻ�����ԭ���ȹ���һ���ѻ��������ѻ����Ķ��壬�ʼǱ����У���Ȼ�󽫸��ڵ�������Ҷ�ӽڵ㽻���������ε����һ��Ҷ�ӽڵ㣬 
	           Ȼ���ٽ�δ�����εĲ������¹���ѻ�����Ȼ�����ظ�����Ĳ��裬ֱ�����е�������˳���źá� 
	    --------------------------------------------------------------------------------*/  
	   public void heapsort(int number[]) {  
	       int i, m, p, s, temp;  
	       long start,end;  
	         
	       start=System.nanoTime();  
	       int number_temp[]=new int[MAX+1];  
	       for(int temp_i=1;temp_i<MAX+1;temp_i++){  
	           number_temp[temp_i]=number[temp_i-1];  
	       }  
	       createheap(number_temp);  
	       m = MAX;  
	       while(m > 1) {  
	           temp=number_temp[1];  
	           number_temp[1]=number_temp[m];  
	           number_temp[m]=temp;  
	           m--;  
	           p = 1;  
	           s = 2 * p;  
	           while(s <= m) {  
	               if(s < m && number_temp[s+1] > number_temp[s])  
	                   s++;  
	               if(number_temp[p] >= number_temp[s])  
	                   break;  
	               temp=number_temp[p];  
	               number_temp[p]=number_temp[s];  
	               number_temp[s]=temp;  
	               p = s;  
	               s = 2 * p;  
	           }  
	       }  
	       for(int temp_j=1;temp_j<MAX+1;temp_j++){  
	           number[temp_j-1]=number_temp[temp_j];  
	       }  
	       end=System.nanoTime();  
	         
	         
	        System.out.println("-----------------heap���򣨶�����--�Ľ���ѡ������------------------");  
	        System.out.print("�������:");  
	        for(i=0;i<=MAX-1;i++){  
	            System.out.print(number[i]+" ");  
	        }  
	        System.out.println();  
	        System.out.println("����ʹ��ʱ�䣺"+(end-start)+" ns");  
	   }  
	     
	   //��ԭ���鹹��Ϊ���±�1��ʼ��һ�������飬���ڴ���ͬʱ����������鹹��Ϊ���ʼ�Ķѻ����ṹ  
	   public void createheap(int number[]) {  
	       int i, s, p, temp;  
	       int heap[] = new int[MAX+1];  
	       for(i = 1; i <= MAX; i++) {  
	           heap[i] = number[i];  
	           s = i;  
	           p = i / 2;  
	           while(s >= 2 && heap[p] < heap[s]) {  
	               temp=heap[p];  
	               heap[p]=heap[s];  
	               heap[s]=temp;  
	               s = p;  
	               p = s / 2;  
	           }  
	       }  
	       for(i = 1; i <= MAX; i++){  
	          number[i] = heap[i];   
	       }  
	   }  
	     
	     
	     
	     
	     
	     
	   /*-----------------------�������򷨣�һ��--------------------------------------------- 
	    ��������ܵĿ����������£�������ߵ����趨Ϊ�ᣬ����¼��ֵΪs 
	    �hȦ���� 
	    ������i �����������ҷ��ң�ֱ���ҵ�����s ���� 
	    ������j ���������ҷ������ң�ֱ���ҵ�С��s ���� 
	    ���i >= j�����뿪��Ȧ 
	    ���i < j���򽻻�����i��j������ֵ 
	    ����������j ���н��� 
	    ������߽��еݻ� 
	    �����ұ߽��еݻ�   
	    --------------------------------------------------------------------------------*/  
	   public void quicksort_one(int number[]){  
	       long start,end;  
	         
	       start=System.nanoTime();  
	       quicksort_1(number,0,MAX-1);  
	       end=System.nanoTime();  
	         
	        System.out.println("-----------------�������򷨣� һ ��------------------");  
	        System.out.print("�������:");  
	        for(int i=0;i<=MAX-1;i++){  
	            System.out.print(number[i]+" ");  
	        }  
	        System.out.println();  
	        System.out.println("����ʹ��ʱ�䣺"+(end-start)+" ns");  
	         
	         
	   }  
	     
	     
	   public void quicksort_1(int number[],int left,int right) {  
	       int i, j, s, temp;  
	       if(left < right) {  
	           s = number[left];  
	           i = left;  
	           j = right + 1;  
	           while(true) {  
	               // ������  
	               while(i + 1 < number.length && number[++i] < s) ;  
	               // ������  
	               while(j -1 > -1 && number[--j] > s) ;  
	               if(i >= j)  
	                   break;  
	               temp=number[i];  
	               number[i]=number[j];  
	               number[j]=temp;  
	           }  
	       number[left] = number[j];  
	       number[j] = s;  
	       quicksort_1(number, left, j-1); // ����߽��еݻ�  
	       quicksort_1(number, j+1, right); // ���ұ߽��еݻ�  
	       }  
	   }  
	     
	     
	     
	   /*-----------------------�������򷨣�����--------------------------------------------- 
	    ����������У�ȡ�м��Ԫ��s���Ƚϣ�ͬ�����ȵ����ұ�s�������i��Ȼ���ұ�sС�� 
	    ����j��ֻҪ���ߵ�������û�н��ᣬ�ͽ���i ��j ��Ԫ��ֵ����β����ٽ�����Ľ����ˣ� 
	    ��Ϊ��Ѱ�ҽ����Ĺ����У���λ�õ�Ԫ��Ҳ����뽻���Ķ��������磺 
	    41 24 76 11 45 64 21 69 19 36 
	    ����leftΪ0��rightΪ9��(left+right)/2 = 4��ȡ�������̣���������Ϊ����4��λ�ã��Ƚϵ�Ԫ���� 
	    45���������ұ�45��ģ������ұ�45С�Ľ��н����� 
	    41 24 76* 11 [45] 64 21 69 19 *36 
	    41 24 36 11 45* 64 21 69 19* 76 
	    41 24 36 11 19 64* 21* 69 45 76 
	   [41 24 36 11 19 21] [64 69 45 76] 
	    �������֮���ٳ��������������ұ����ŵĲ��ݽ��еݻأ���˾Ϳ�����������Ŀ�ġ� 
	   --------------------------------------------------------------------------------*/  
	   public void quicksort_two(int number[]){  
	       long start,end;  
	         
	       start=System.nanoTime();  
	       quicksort_2(number,0,MAX-1);  
	       end=System.nanoTime();  
	         
	        System.out.println("-----------------�������򷨣� �� ��------------------");  
	        System.out.print("�������:");  
	        for(int i=0;i<=MAX-1;i++){  
	            System.out.print(number[i]+" ");  
	        }  
	        System.out.println();  
	        System.out.println("����ʹ��ʱ�䣺"+(end-start)+" ns");  
	   }  
	     
	     
	   public void quicksort_2(int number[], int left, int right) {  
	       int i, j, s, temp;  
	       if(left < right) {  
	           s = number[(left+right)/2];  
	           i = left - 1;  
	           j = right + 1;  
	           while(true) {  
	               while(number[++i] < s) ; // ������  
	               while(number[--j] > s) ; // ������  
	               if(i >= j)  
	                   break;  
	               temp=number[i];  
	               number[i]=number[j];  
	               number[j]=temp;  
	           }  
	       quicksort_2(number, left, i-1); // ����߽��еݻ�  
	       quicksort_2(number, j+1, right); // ���ұ߽��еݻ�  
	       }  
	   }  
	     
	     
	     
	     
	   /*-----------------------�������򷨣�����--------------------------------------------- 
	            ��˵������������򷨵ĸ���������ұߵ�ֵs���Ƚϵı�׼�����������з�Ϊ�������ݣ� 
	    һ����С��s�Ĳ��ݣ�һ���Ǵ���s�Ĳ��ݣ�һ����δ����Ĳ��ݣ�������ʾ�� 
	            i           j 
	    --------|-----------|----------|s 
	        С��s     ����s         δ���� 
	    ������Ĺ����У�i ��j ���᲻�ϵ����ҽ��бȽ��뽻����������л��Ϊ���µ�״̬�� 
	    -------------|-----------------|s 
	        С��s             ����s 
	    Ȼ��s��ֵ�����м䣬������������ͬ�Ĳ�����������ߵ����н�������Ķ�����������ʾ�� 
	    -------------|s|--------------- 
	        С��s             ����s 
	    Ȼ����õݹ�ķ����ظ�����Ĳ��裬�Ϳ���ʵ�������ˡ� 
	   --------------------------------------------------------------------------------*/  
	   public void quicksort_three(int number[]){  
	       long start,end;  
	         
	       start=System.nanoTime();  
	       quicksort_3(number,0,MAX-1);  
	       end=System.nanoTime();  
	         
	        System.out.println("-----------------�������򷨣� �� ��------------------");  
	        System.out.print("�������:");  
	        for(int i=0;i<=MAX-1;i++){  
	            System.out.print(number[i]+" ");  
	        }  
	        System.out.println();  
	        System.out.println("����ʹ��ʱ�䣺"+(end-start)+" ns");  
	         
	   }  
	     
	     
	   public int partition(int number[], int left, int right) {  
	       int i, j, s, temp;  
	       s = number[right];  
	       i = left - 1;  
	       for(j = left; j < right; j++) {  
	           if(number[j] <= s) {  
	               i++;  
	               temp=number[i];  
	               number[i]=number[j];  
	               number[j]=temp;  
	           }  
	       }  
	       temp=number[i+1];  
	       number[i+1]=number[right];  
	       number[right]=temp;  
	       return i+1;  
	   }  
	     
	   public void quicksort_3(int number[], int left, int right) {  
	       int q;  
	       if(left < right) {  
	           q = partition(number, left, right);  
	           quicksort_3(number, left, q-1);  
	           quicksort_3(number, q+1, right);  
	       }  
	   }  
	     
	     
	     
	     
	     
	   /*-----------------------�ϲ�����--------------------------------------------- 
	             �ϲ����򷨻����ǽ���������������Ϻϲ���������������������������δ���� 
	             ��������������������ʽ���������������ϣ�Ȼ���ٽ�����õ����������Ϻϲ��� 
	             �ϲ��������õ���  �������򷨣����� 
	   --------------------------------------------------------------------------------*/  
	     
	   public void mergesort(int number1[],int number2[],int number3[]){  
	       long start,end;  
	         
	       start=System.nanoTime();  
	       quicksort_3(number1,0,MAX-1);  
	       quicksort_3(number2,0,MAX-1);  
	       mergesort_merge(number1,MAX,number2,MAX,number3);  
	       end=System.nanoTime();  
	         
	       System.out.println("-----------------�ϲ�����------------------");  
	       System.out.print("�������:");  
	       for(int i=0;i<=MAX+MAX-1;i++){  
	            System.out.print(number3[i]+" ");  
	       }  
	       System.out.println();  
	       System.out.println("����ʹ��ʱ�䣺"+(end-start)+" ns");     
	   }  
	     
	     
	   public void mergesort_merge(int number1[], int M, int number2[], int N, int number3[]) {  
	       int i = 0, j = 0, k = 0;  
	       while(i < M && j < N) {  
	           if(number1[i] <= number2[j]){  
	               number3[k++] = number1[i++];  
	           }else{  
	               number3[k++] = number2[j++];  
	           }     
	       }  
	       while(i < M){  
	           number3[k++] = number1[i++];  
	       }    
	       while(j < N){  
	           number3[k++] = number2[j++];  
	       }  
	   }  
	     
	     
	     
	     
	   /*-----------------------��������--------------------------------------------- 
	            ��������ķ�ʽ���Բ���LSD��Least sgnificant digital����MSD��Most sgnificant digital���� 
	    LSD������ʽ�ɼ�ֵ�����ұ߿�ʼ����MSD���෴���ɼ�ֵ������߿�ʼ�� 
	    ��LSDΪ��������ԭ����һ����ֵ������ʾ�� 
	    73, 22, 93, 43, 55, 14, 28, 65, 39, 81 
	    ���ȸ��ݸ�λ������ֵ�����߷���ֵʱ�����Ƿ��������0��9��Ͱ���У� 
	    0   1   2   3   4   5   6   7   8   9 
	        81              65              39 
	                43  14  55          28 
	                93 
	            22  73 
	    ����������ЩͰ���е���ֵ���´�����������Ϊ���µ����У� 
	    81, 22, 73, 93, 43, 14, 55, 65, 28, 39 
	    �����ٽ���һ�η��䣬����Ǹ���ʮλ�������䣺 
	    ����������ЩͰ���е���ֵ���´�����������Ϊ���µ����У� 
	    0   1   2   3   4   5   6   7   8   9 
	            28  39 
	        14  22      43  55  65  73  81  93 
	    14, 22, 28, 39, 43, 55, 65, 73, 81, 93 
	    ��ʱ�����������Ѿ�������ϣ��������Ķ�������λ�����ϣ�������������ϵĶ���ֱ���� 
	    ��λ��Ϊֹ�� 
	    LSD�Ļ�������������λ��С�����У����λ����Ļ���ʹ��MSD��Ч�ʻ�ȽϺã�MSD�ķ� 
	    ʽǡ��LSD�෴�����ɸ�λ��Ϊ���׿�ʼ���з��䣬���������㷽ʽ����ͬ��       
	   --------------------------------------------------------------------------------*/  
	   public void basesort(int number[]){  
	       int temp[][] = new int[MAX][MAX];  
	       int order[] = new int[MAX];  
	       int i, j, k, n, lsd;  
	       long start,end;  
	       k = 0;  
	       n = 1;  
	         
	         
	       start=System.nanoTime();  
	       while(n <= 10) {  
	           for(i = 0; i < MAX; i++) {  
	               lsd = ((number[i] / n) % 10);  
	               temp[lsd][order[lsd]] = number[i];  
	               order[lsd]++;  
	           }  
	           //��������  
	           for(i = 0; i < MAX; i++) {  
	               if(order[i] != 0)  
	                   for(j = 0; j < order[i]; j++) {  
	                       number[k] = temp[i][j];  
	                       k++;  
	                   }  
	               order[i] = 0;  
	           }  
	           n *= 10;  
	           k = 0;  
	        }  
	       end=System.nanoTime();  
	         
	       System.out.println("-----------------��������------------------");  
	       System.out.print("�������:");  
	       for(int ii=0;ii<=MAX-1;ii++){  
	            System.out.print(number[ii]+" ");  
	       }  
	       System.out.println();  
	       System.out.println("����ʹ��ʱ�䣺"+(end-start)+" ns");  
	   }  
	     
	  
	   public static void main(String[] args){  
	       System.out.println("���µĲ���ʱ������ο�...");  
	       new PaiXu();  
	   }  
	     
	}  

