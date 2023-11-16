public class DynamicArray {
    private int arr[];
    private int size;
    DynamicArray(){
        arr = new int[5];
        size=0;
    }

    public int size(){
        return size;
    }

    public void add(int val){
        restructure();
        arr[size]=val;
        size++;
    }

    public int get(int index){
        if(index > size){
            return -1;
        }
        return arr[index];
    }

    public void set(int index, int value){
        if(index>size){
            return;
        }

        if(index<size){
            arr[index] = value;
        }
        else{
            this.add(value);
        }
        
    }

    private void restructure(){
        if(size>=arr.length){
            int temp[] = new int[arr.length*2];
            for(int i=0;i<size;i++){
                temp[i] = arr[i];
            }
            arr=temp;
        }
    }
}


class Polynomial {

    private DynamicArray d = new DynamicArray();

	public void setCoefficient(int degree, int coeff){
		while(degree>=d.size()){
            d.add(0);
        }
        d.set(degree,coeff);
	}
	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print(){
		for(int i=0;i<d.size();i++){
            if(d.get(i)!=0){
                System.out.print(d.get(i)+"x"+i+" ");
            }
        }
	}

	
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){
        int min = Math.min(p.d.size(),this.d.size());
        Polynomial ans = new Polynomial();
        for(int i=0;i<min;i++){
            int sum = this.d.get(i) + p.d.get(i);
            ans.d.add(sum);
        }
		return ans;
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
		int min = Math.min(p.d.size(),this.d.size());
        Polynomial ans = new Polynomial();
        for(int i=0;i<min;i++){
            int sum = this.d.get(i) - p.d.get(i);
            ans.d.add(sum);
        }
		return ans;	
	}
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){
		
        return new Polynomial();
	}

}
