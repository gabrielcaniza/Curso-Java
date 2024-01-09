package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class reservation {
    private Integer roomNumber;
    private Date chekIn;
    private Date chekOut;

    // formatação de datas
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public reservation(Integer roomNumber, Date chekIn, Date chekOut) {
        this.roomNumber = roomNumber;
        this.chekIn = chekIn;
        this.chekOut = chekOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getChekIn() {
        return chekIn;
    }

    public Date getChekOut() {
        return chekOut;
    }

    public long duration() {
        long diff = chekOut.getTime() - chekIn.getTime();

        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public String updateDates(Date chekIn, Date chekOut) {
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            System.out.println("Error in reservation: Reservation dates for update must be future dates ");

        } else if (!checkOut.after(checkIn)) {
            System.out.println("Error in reservation: Check-out date mus be after check=in date");
        }

        else {// metódo utilizado pra Atualizar as datas
            reservation.updateDates(checkIn, checkOut);
            System.err.println("reservation: " + reservation);
        }

        this.chekIn = chekIn;
        this.chekOut = chekOut;
    }

    @Override
    public String toString() {
        return "room" +
                roomNumber +
                ", check-in: "
                + sdf.format(chekIn) +
                ", check-out "
                + sdf.format(chekOut)
                + ", "
                + duration()
                + " nights";
    }

}
