   
   
   class VehicleDemo{
        public static void main(String[] args) {
            Vehicle minivan = new Vehicle(7, 16, 21);
            Vehicle sportcar = new Vehicle(2, 14, 12);
            ChkNum e = new ChkNum();
            double gallons;
            int dist = 252;

            gallons = minivan.fuelNeeded(dist);

            System.out.println("Для преодоления "+dist+
            " миль минифургону понадобится "+gallons+" топлива");
            
            System.out.println("Минифургон может перевезти "+
            minivan.passangers+" пассажиров на расстояние "+minivan.range());
            
            gallons = sportcar.fuelNeeded(dist);

            System.out.println("Для преодоления "+dist+
            " миль спорткару понадобится "+gallons+" топлива");

            System.out.println("Спорткар может перевезти "+
            sportcar.passangers+" пассажиров на расстояние "+sportcar.range());
            

            if (e.isEven(10)) System.out.println("10 - even");
            if (e.isEven(9)) System.out.println("9 - even"); 
            System.out.println(e.isFactor(10, 4)); 
        }
    }

