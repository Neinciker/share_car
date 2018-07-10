package com.car.Service;

import com.car.pojo.Car;
import com.car.pojo.Car_request;
import com.car.pojo.Passenger;
import com.car.pojo.Status_res;

public class Logical {
    static demoDistence caculate_distence = new demoDistence();

    // TODO: 18-7-10  增加时间参数的影响

    public static Status_res check_status(Car car, Car_request car_request, Passenger passenger){
        Status_res status_res = new Status_res();
        if (car.getCar_size()==0){
            status_res = one_time(car, car_request,passenger);
        }
        if (car.getCar_size()==1){
            status_res = two_time(car, car_request,passenger);
        }
        if (car.getCar_size()==2){
            status_res = three_time(car, car_request,passenger);
        }
        if (car.getCar_size()==3){
            status_res = four_time(car, car_request,passenger);
        }
        else {
            status_res.setStatus(false);
        }
        return status_res;

    }
    public static Status_res one_time(Car car, Car_request car_request, Passenger passenger){
        Status_res status_res = new Status_res();
        status_res.setStatus(true);
        status_res.setDiscount(1);
        return status_res;
//        String distance = caculate_distence.distance(car_request.getPassengerLocation().getStartPlace(),car_request.getPassengerLocation().getEndPlace());

    }
    public static Status_res two_time(Car car, Car_request car_request, Passenger passenger){
        Status_res status_res1 = new Status_res();
        Status_res status_res2 = new Status_res();
        String locationA_s = car.getCar_request().get(0).getPassengerLocation().getStartPlace();
        String locationA_e = car.getCar_request().get(0).getPassengerLocation().getEndPlace();
        String locationB_s = car_request.getPassengerLocation().getStartPlace();
        String locationB_e = car_request.getPassengerLocation().getEndPlace();
        double distance_As_Bs = Integer.valueOf(caculate_distence.distance(locationA_s,locationB_s));

        //一种情况
        double distance_Bs_Ae = Integer.valueOf(caculate_distence.distance(locationB_s,locationA_e));
        double distance_Ae_Be = Integer.valueOf(caculate_distence.distance(locationA_e,locationB_e));
        double distance_all1 = distance_As_Bs+distance_Bs_Ae+distance_Ae_Be;

        //第二种情况
        double distance_Bs_Be = Integer.valueOf(caculate_distence.distance(locationB_s,locationB_e));
        double distance_Be_Ae = Integer.valueOf(caculate_distence.distance(locationB_e,locationA_e));
        double distance_all2 = distance_As_Bs+distance_Bs_Be+distance_Be_Ae;





    }
    public static Status_res three_time(Car car, Car_request car_request, Passenger passenger){

    }
    public static Status_res four_time(Car car, Car_request car_request, Passenger passenger){

    }
}
