package OOP.Polynomial;

public class Polynomial {

    int defCoeff[];

    Polynomial(){
        defCoeff = new int[10];
    }

    public void setCoefficient(int degree, int coeff){
        if(degree > defCoeff.length - 1){
            int temp[] = defCoeff;
            defCoeff = new int[degree + 1];
            for(int i = 0; i < temp.length; i++){
                defCoeff[i] = temp[i];
            }
        }
        defCoeff[degree] = coeff;
    }

    // Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree.
    public void print(){
        for(int i =0; i < defCoeff.length; i++){
            if(defCoeff[i] != 0){
                System.out.print(defCoeff[i] + "x" + i + " ");
            }
        }
    }

        // Adds two polynomials and returns a new polynomial which has result
        public Polynomial add(Polynomial p) {
            Polynomial ans = new Polynomial();
            int plen1 = this.defCoeff.length;
            int plen2 = p.defCoeff.length;
            int len = Math.min(plen1, plen2);

            int i;
            for (i = 0; i < len; i++) {
                ans.setCoefficient(i, this.defCoeff[i] + p.defCoeff[i]);
            }
            while (i < plen1) {
                ans.setCoefficient(i, this.defCoeff[i]);
                i++;
            }
            while (i < plen2) {
                ans.setCoefficient(i, p.defCoeff[i]);
                i++;
            }
            return ans;
        }


        // Subtracts two polynomials and returns a new polynomial which has result
        public Polynomial subtract(Polynomial p){
            Polynomial ans = new Polynomial();
            int plen1 = this.defCoeff.length;
            int plen2 = p.defCoeff.length;
            int len = Math.min(plen1, plen2);

            int i;
            for (i = 0; i < len; i++) {
                ans.setCoefficient(i, this.defCoeff[i] - p.defCoeff[i]);
            }
            while (i < plen1) {
                ans.setCoefficient(i, this.defCoeff[i]);
                i++;
            }
            while (i < plen2) {
                ans.setCoefficient(i, -p.defCoeff[i]);
                i++;
            }
            return ans;
        }

        public int getCoeff(int degree){
            if(degree < this.defCoeff.length){
                return defCoeff[degree];
            } else {
                return 0;
            }
        }

        // Multiply two polynomials and returns a new polynomial which has result
        public Polynomial multiply(Polynomial p){
            Polynomial ans = new Polynomial();
            for(int i = 0; i < this.defCoeff.length; i++){
                for(int j = 0; j < p.defCoeff.length; j++){
                    int termdeg = i + j;
                    int termCoeff = this.defCoeff[i] * p.defCoeff[j];
                    int oldCoeff = ans.getCoeff(termCoeff);
                    ans.setCoefficient(termdeg, termCoeff + oldCoeff);
                }
        }
            return ans;
    }

}
