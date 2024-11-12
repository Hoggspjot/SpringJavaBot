class Vehicle{
    int passangers;
    int fuelcamp;
    int mpg;

    public Vehicle(int p, int f, int m) {
        passangers = p;
        fuelcamp = f;
        mpg = m;
    }
    
    int range(){
        return fuelcamp * mpg;
        }   

    double fuelNeeded(int miles){
        return (double) miles/mpg;
        }
    }

    