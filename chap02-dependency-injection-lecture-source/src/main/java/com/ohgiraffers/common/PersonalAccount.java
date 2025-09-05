package com.ohgiraffers.common;

public class PersonalAccount implements Account {
    private final int BANK_CODE; //은행 코드
    private final String ACC_NO; //계좌 번호
    private int balance; // 잔액

    public PersonalAccount(String ACC_NO, int BANK_CODE) {
        this.BANK_CODE = BANK_CODE;
        this.ACC_NO = ACC_NO;
    }

    @Override
    public String getBalance() {
        return this.ACC_NO + "계좌의 현재 잔액은 " + this.balance + "원 입니다.";
    }

    @Override
    public String deposit(int money) {
        String str = "";
        if(money > 0){
            this.balance += money;
            str = money + "원이 입급되었습니다.";
        }else{
            str= "금액을 잘못 입력하였습니다.";
        }
        return str;
    }

    @Override
    public String withdraw(int money) {
        String str = "";

        if(this.balance >= money) {
            this.balance -= money;
            str = money + "원이 출금되었습니다.";
        }else{
            str = "잔액이 부족합니다.";
        }
        return str;
    }

    @Override
    public String toString() {
        return "PersonalAccount{" +
                "BANK_CODE=" + BANK_CODE +
                ", ACC_NO='" + ACC_NO + '\'' +
                ", balance=" + balance +
                '}';
    }
}
