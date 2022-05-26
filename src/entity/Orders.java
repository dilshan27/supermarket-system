package entity;

import java.time.LocalDate;

public class Orders {
    private String OrderID;
    private LocalDate OrderDate;
    private String CusID;

    public Orders() {
    }

    public Orders(String orderID, LocalDate orderDate, String cusID) {
        OrderID = orderID;
        OrderDate = orderDate;
        CusID = cusID;
    }

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String orderID) {
        OrderID = orderID;
    }

    public LocalDate getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        OrderDate = orderDate;
    }

    public String getCusID() {
        return CusID;
    }

    public void setCusID(String cusID) {
        CusID = cusID;
    }
}
