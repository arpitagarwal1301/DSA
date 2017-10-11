
//import for Scanner and other utility  classes
        import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
*/
        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        for (int i = 0; i < N; i++) {
            int n = s.nextInt();
            for(int q=0;q<n;q++){
                String str = s.next();
                char[] arr = str.toCharArray();

                int x=0;
                int y =0;
                //Iterating through char arr and finding out the final coordinates
                for(int j=0; j < arr.length;j++){

                    int direction = 5;
                    if(arr[j]=='R'){

                        if(direction==8){
                            direction=5;
                        }else{
                            direction++;
                        }

                    }else if(arr[j]=='L'){

                        if(direction==5){
                            direction=8;
                        }else{
                            direction--;
                        }
                    }else{

                        switch(direction){
                            case 5:y++;
                                break;
                            case 6:x++;
                                break;
                            case 7:y--;
                                break;
                            case 8:x--;
                                break;
                        }

                    }

                }

                if(x>0 && y>0){
                    //case 1
                }else if(x<0 && y>0){
                    //case 2
                }else if(x<0 && y<0){
                    //case 3
                }else if(x>0 && y<0){
                    //case 4
                }else if(x==0){
                    //case 5
                    while(y!=0){
                        if(y<0){
                            System.out.print("8");
                            y++;
                        }else{
                            System.out.print("6");
                            y--;
                        }
                    }

                }else if(y == 0 ){
                    while(x!=0){
                        if(x<0){
                            System.out.print("7");
                            x++;
                        }else{
                            System.out.print("5");
                            x--;
                        }
                    }
                }else{
                    System.out.println("0");
                }


                System.out.print("0");
            }
        }



    }


}
