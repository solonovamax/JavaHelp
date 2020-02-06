package reddit.javahelp.u.bennymal;

//this code takes an array that represent species quantity and calculates the shannon diversity index


class ShannonIndex {
    //initializing arrays
    static double[] speciesCountArr = {2, 3, 5};
    static double[] proportionVal   = {10, 10, 10};
    
    public static void main(String[] args) {
        double shannonWeinerDiversityIndex = 0;
        //finding the Psubi for the index aka the proportion of each species in regards to the whole population
        for (int i = 0; i < speciesCountArr.length; i++) {
            shannonWeinerDiversityIndex += getDiversity(speciesCountArr[i] / proportionVal[i]);
        }
        System.out.println("The Shannon Weiner Diversity Index for this population is:" +
                           -shannonWeinerDiversityIndex + "\n");
    }
    
    static double getDiversity(double sProportion) {
        return Math.log(sProportion) * sProportion;
    }
}