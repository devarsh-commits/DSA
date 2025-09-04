public class CharacterHashing {
    public static void main(String[] args) {
        String a="abdeaevdcwd";
        //now we gonna do the precomputation of characters
        // creating the hash array in range of 0 to 25 but how?
        //ascii value of a =97 and f=102 therefore,f-a=5 so index val of f=5 this is how hasing will be done
        int dt='a';
        //creating the hash arr for precomputaion
        int []hash=new int[26];
        for(int i=0;i<hash.length;i++){
            hash[i]=0;
        }
        char [] arr=a.toCharArray();
        for (char c : arr) {
            int vala='a';
            int chr=c;
            int indexval=chr-vala;
            //now we gonna perform precomputaion on hash arr to find out letters occurance
            hash[indexval]+=1;
            //above as mentioned on hash each letter repeating their value getting promoted to 1++
        }
        //now fetching
        for (char c : arr) {
             int vala='a';
            int chr=c;
            int indexval=chr-vala;
            System.out.println("Occurance of "+ c +" is "+hash[indexval]);
        }

    }
}
