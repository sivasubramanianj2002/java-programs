class Panagram {
    public boolean checkIfPangram(String sentence) {
        char [] words = sentence.toCharArray();
        int [] arr = new int [26];
             for (char word : words) {
            if (word >= 'a' && word <= 'z') {
                arr[word - 'a']++;
            }
        }

        for(int i =0; i<arr.length;i++)
        {
            if(arr[i]<1)
            {
                return false;
            }
        }
        return true;
    }
}

