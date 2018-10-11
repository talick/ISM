package com.sunrisestudio.ism.ism.model;

import com.sunrisestudio.ism.ism.R;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private int icon;
    private String title;

    public Menu(int icon, String title) {
        this.icon = icon;
        this.title = title;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public static List<Menu> generateMenu() {
        List<Menu> list = new ArrayList<>();
        list.add(new Menu(R.drawable.books_ic, "Library"));
        list.add(new Menu(R.drawable.profiles, "Applicant"));
        list.add(new Menu(R.drawable.user, "Student"));
        list.add(new Menu(R.drawable.checklist, "Schedule"));
        list.add(new Menu(R.drawable.passport, "Passport and visa procedure"));
        list.add(new Menu(R.drawable.training, "ISM Student Counsil"));
        list.add(new Menu(R.drawable.calendar, "Events"));
        list.add(new Menu(R.drawable.video, "Video"));
        list.add(new Menu(R.drawable.tickets, "Ticket\nAir"));
        list.add(new Menu(R.drawable.taxi, "Ticket\nTaxi"));
        return list;
    }
}
