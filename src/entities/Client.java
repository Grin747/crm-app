package entities;

import java.io.Serializable;

public class Client implements Serializable {
    private int client_id;
    private String phone;
    private String name;
    private String surname;
    private String patronymic;
    private String passport_number;

    public Client(String phone, String name, String surname, String patronymic, String passport_number) {
        this.client_id = client_id;
        this.phone = phone;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.passport_number = passport_number;
    }

    public Client(int client_id, String phone, String name, String surname, String patronymic, String passport_number) {
        this.client_id = client_id;
        this.phone = phone;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.passport_number = passport_number;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPassport_number() {
        return passport_number;
    }

    public void setPassport_number(String passport_number) {
        this.passport_number = passport_number;
    }
}
