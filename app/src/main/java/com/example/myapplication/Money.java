package com.example.myapplication;

public class Money {

    String debit;
    String credit;

    String servicerev;
    String interestrev;///

    String rentexp;
    String salexp;
    String billexp;
    String interestexp;
    String advertexp;
    String insuranceexp;
    String utilitiesexp;//

    String cash;
    String offsupp;
    String sneakers;
    String trainers;
    String grippers;
    String crocs;
    String equipment;
    String furniture;
    String ac_recievables;
    String building;
    String land;
    String prepaidrent;
    String prepaidinsurance;
    String inventoryrec;////
    String interestrec;////
    String noterec;/////

    String accpayable;
    String suppliespayables;
    String unearnedrevenue;
    String advertisementpayables;
    String equipmentpayables;
    String interestpayables;
    String loanpayables;
    String utilitiypayable;///
    String notespayable;////

    String commonstock;///////
    String dividends;////////

    public Money() {
        this.servicerev = "0";
        this.rentexp = "0";
        this.salexp = "0";
        this.billexp = "0";
        this.interestexp = "0";
        this.advertexp = "0";
        this.insuranceexp = "0";
        this.cash = "0";
        this.offsupp = "0";
        this.sneakers = "0";
        this.trainers = "0";
        this.grippers = "0";
        this.crocs = "0";
        this.equipment = "0";
        this.furniture = "0";
        this.ac_recievables = "0";
        this.building = "0";
        this.land = "0";
        this.prepaidrent = "0";
        this.prepaidinsurance = "0";
        this.accpayable = "0";
        this.suppliespayables = "0";
        this.unearnedrevenue = "0";
        this.advertisementpayables = "0";
        this.equipmentpayables = "0";
        this.interestpayables = "0";
        this.loanpayables = "0";
        this.debit = "0";
        this.credit = "0";

        this.interestrev = "0";
        this.utilitiesexp= "0";
        this.inventoryrec= "0";
        this.interestrec= "0";
        this.noterec= "0";
        this.utilitiypayable= "0";
        this.notespayable= "0";
        this.commonstock= "0";
        this.dividends= "0";

    }
    public String calcDebit(){
        int amount=Integer.parseInt(cash)+
                Integer.parseInt(offsupp)+
                Integer.parseInt(sneakers)+
                Integer.parseInt(trainers)+
                Integer.parseInt(grippers)+
                Integer.parseInt(crocs)+
                Integer.parseInt(equipment)+
                Integer.parseInt(furniture)+
                Integer.parseInt(ac_recievables)+
                Integer.parseInt(building)+
                Integer.parseInt(land)+
                Integer.parseInt(prepaidrent)+
                Integer.parseInt(prepaidinsurance)+
                Integer.parseInt(rentexp)+
                Integer.parseInt(salexp)+
                Integer.parseInt(billexp)+
                Integer.parseInt(interestexp)+
                Integer.parseInt(advertexp)+
                Integer.parseInt(insuranceexp)+
                Integer.parseInt(dividends)+
                Integer.parseInt(utilitiesexp)+
                Integer.parseInt(inventoryrec)+
                Integer.parseInt(interestrec)+
                Integer.parseInt(noterec);
        return Integer.toString(amount);
    }
    public String calcCredit(){
        int amount=Integer.parseInt(accpayable)+
                Integer.parseInt(suppliespayables)+
                Integer.parseInt(unearnedrevenue)+
                Integer.parseInt(advertisementpayables)+
                Integer.parseInt(equipmentpayables)+
                Integer.parseInt(interestpayables)+
                Integer.parseInt(loanpayables)+
                Integer.parseInt(servicerev)+
                Integer.parseInt(interestrev)+
                Integer.parseInt(utilitiypayable)+
                Integer.parseInt(notespayable)+
                Integer.parseInt(commonstock);

        return Integer.toString(amount);
    }


    public String calcAssets(){
        int amount=Integer.parseInt(cash)+
                Integer.parseInt(offsupp)+
                Integer.parseInt(sneakers)+
                Integer.parseInt(trainers)+
                Integer.parseInt(grippers)+
                Integer.parseInt(crocs)+
                Integer.parseInt(equipment)+
                Integer.parseInt(furniture)+
                Integer.parseInt(ac_recievables)+
                Integer.parseInt(building)+
                Integer.parseInt(land)+
                Integer.parseInt(prepaidrent)+
                Integer.parseInt(prepaidinsurance)+
                Integer.parseInt(inventoryrec)+
                Integer.parseInt(interestrec)+
                Integer.parseInt(noterec);

        return Integer.toString(amount);
    }
    public String calcLiabilities(){
        int amount=Integer.parseInt(accpayable)+
                Integer.parseInt(suppliespayables)+
                Integer.parseInt(unearnedrevenue)+
                Integer.parseInt(advertisementpayables)+
                Integer.parseInt(equipmentpayables)+
                Integer.parseInt(interestpayables)+
                Integer.parseInt(loanpayables)+
                Integer.parseInt(utilitiypayable)+
                Integer.parseInt(notespayable);

        return Integer.toString(amount);
    }
    public String calcRevenue(){
        int amount=Integer.parseInt(servicerev)+
                Integer.parseInt(interestrev);


        return Integer.toString(amount);
    }
    public String calcExpenses(){
        int amount=Integer.parseInt(rentexp)+
                Integer.parseInt(salexp)+
                Integer.parseInt(billexp)+
                Integer.parseInt(interestexp)+
                Integer.parseInt(advertexp)+
                Integer.parseInt(insuranceexp)+
                Integer.parseInt(utilitiesexp);

        return Integer.toString(amount);
    }

    public String calcProfit(){
        int rev =Integer.parseInt(calcRevenue());
        int exp =Integer.parseInt(calcExpenses());
        int profit = rev-exp;
        return Integer.toString(profit);
    }
    public String calcBalance(){
        return calcLiabilities();
    }

    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    public void addinsert(String val,int amount){

        if(val.equals("Rent Expenses")==true){
            int temp = amount +Integer.parseInt(rentexp);
            rentexp = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) - amount;
            cash = Integer.toString(temp2);
        }
        else if(val.equals("Salaries Expenses")==true){
            int temp = amount +Integer.parseInt(salexp);
            salexp = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) - amount;
            cash = Integer.toString(temp2);
        }
        else if(val.equals("Bill Expenses")==true){
            int temp = amount +Integer.parseInt(billexp);
            billexp = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) - amount;
            cash = Integer.toString(temp2);
        }
        else if(val.equals("Interest Expenses")==true){
            int temp = amount +Integer.parseInt(interestexp);
            interestexp = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) - amount;
            cash = Integer.toString(temp2);
        }
        else if(val.equals("Advertising Expenses")==true){
            int temp = amount +Integer.parseInt(advertexp);
            advertexp = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) - amount;
            cash = Integer.toString(temp2);
        }
        else if(val.equals("Insurance Expenses")==true){
            int temp = amount +Integer.parseInt(insuranceexp);
            insuranceexp = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) - amount;
            cash = Integer.toString(temp2);
        }
//        else if(val.equals("Cash")==true){
//            int temp = amount +Integer.parseInt(cash);
//            cash = Integer.toString(temp);
//            int temp2 = amount + Integer.parseInt(cash);
//            cash = Integer.toString(temp2);
//        }
        else if(val.equals("Utilities Expense")==true){
            int temp = amount +Integer.parseInt(utilitiesexp);
            utilitiesexp = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) - amount;
            cash = Integer.toString(temp2);
        }
        else if(val.equals("Office Supplies")==true){
            int temp = amount +Integer.parseInt(offsupp);
            offsupp = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) - amount;
            cash = Integer.toString(temp2);
        }
//        else if(val.equals("Office Supplies on account")==true){
//            int temp = amount +Integer.parseInt(offsupp);
//            offsupp = Integer.toString(temp);
//            int temp2 = amount + Integer.parseInt(accpayable);
//            accpayable = Integer.toString(temp2);
//        }
        else if(val.equals("Item-Sneakers")==true){
            int temp = amount +Integer.parseInt(sneakers);
            sneakers = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) - amount;
            cash = Integer.toString(temp2);
        }
//        else if(val.equals("Item-Sneakers on account")==true){
//            int temp = amount +Integer.parseInt(sneakers);
//            sneakers = Integer.toString(temp);
//            int temp2 = amount + Integer.parseInt(accpayable);
//            accpayable = Integer.toString(temp2);
//        }
        else if(val.equals("Item-Trainers")==true){
            int temp = amount +Integer.parseInt(trainers);
            trainers = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) - amount;
            cash = Integer.toString(temp2);
        }
//        else if(val.equals("Item-Trainers on account")==true){
//            int temp = amount +Integer.parseInt(trainers);
//            trainers = Integer.toString(temp);
//            int temp2 = amount + Integer.parseInt(accpayable);
//            accpayable = Integer.toString(temp2);
//        }
        else if(val.equals("Item-Grippers")==true){
            int temp = amount +Integer.parseInt(grippers);
            grippers = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) - amount;
            cash = Integer.toString(temp2);
        }
//        else if(val.equals("Item-Grippers on account")==true){
//            int temp = amount +Integer.parseInt(grippers);
//            grippers = Integer.toString(temp);
//            int temp2 = amount + Integer.parseInt(accpayable);
//            accpayable = Integer.toString(temp2);
//        }
        else if(val.equals("Item-Crocs")==true){
            int temp = amount +Integer.parseInt(crocs);
            crocs = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) - amount;
            cash = Integer.toString(temp2);
        }
//        else if(val.equals("Item-Crocs on account")==true){
//            int temp = amount +Integer.parseInt(crocs);
//            crocs = Integer.toString(temp);
//            int temp2 = amount + Integer.parseInt(accpayable);
//            accpayable = Integer.toString(temp2);
//        }
        else if(val.equals("Equipment")==true){
            int temp = amount +Integer.parseInt(equipment);
            equipment = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) - amount;
            cash = Integer.toString(temp2);
        }
//        else if(val.equals("Equipment on account")==true){
//            int temp = amount +Integer.parseInt(equipment);
//            equipment = Integer.toString(temp);
//            int temp2 = amount + Integer.parseInt(accpayable);
//            accpayable = Integer.toString(temp2);
//        }
        else if(val.equals("Furniture")==true){
            int temp = amount +Integer.parseInt(furniture);
            furniture = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) - amount;
            cash = Integer.toString(temp2);
        }
//        else if(val.equals("Furniture on account")==true){
//            int temp = amount +Integer.parseInt(furniture);
//            furniture = Integer.toString(temp);
//            int temp2 = amount + Integer.parseInt(accpayable);
//            accpayable = Integer.toString(temp2);
//        }
        else if(val.equals("A/c Receivables")==true){
            int temp = amount +Integer.parseInt(ac_recievables);
            ac_recievables = Integer.toString(temp);
            int temp2 =Integer.parseInt(cash) -  amount ;
            cash = Integer.toString(temp2);
        }
        else if(val.equals("Building")==true){
            int temp = amount +Integer.parseInt(building);
            building = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) - amount;
            cash = Integer.toString(temp2);
        }
        else if(val.equals("Land")==true){
            int temp = amount +Integer.parseInt(land);
            land = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) - amount;
            cash = Integer.toString(temp2);
        }
        else if(val.equals("Prepaid Rent")==true){
            int temp = amount +Integer.parseInt(prepaidrent);
            prepaidrent = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) - amount;
            cash = Integer.toString(temp2);
        }
        else if(val.equals("Prepaid Insurance")==true){
            int temp = amount +Integer.parseInt(prepaidinsurance);
            prepaidinsurance = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) - amount;
            cash = Integer.toString(temp2);
        }
        else if(val.equals("Inventory Receivables")==true){
            int temp = amount +Integer.parseInt(inventoryrec);
            inventoryrec = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) - amount;
            cash = Integer.toString(temp2);
        }
        else if(val.equals("Interest Receivables")==true){
            int temp = amount +Integer.parseInt(interestrec);
            interestrec = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) - amount;
            cash = Integer.toString(temp2);
        }
        else if(val.equals("Notes Receivables")==true){
            int temp = amount +Integer.parseInt(noterec);
            noterec = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) - amount;
            cash = Integer.toString(temp2);
        }

        else if(val.equals("Account Payable")==true){
            int temp = amount +Integer.parseInt(accpayable);
            accpayable = Integer.toString(temp);
            int temp2 = amount + Integer.parseInt(cash);
            cash = Integer.toString(temp2);
        }
        else if(val.equals("Supplies Payable")==true){
            int temp = amount +Integer.parseInt(suppliespayables);
            suppliespayables = Integer.toString(temp);
            int temp2 = amount + Integer.parseInt(offsupp);
            offsupp = Integer.toString(temp2);
        }
        else if(val.equals("Unearned Revenue")==true){
            int temp = amount +Integer.parseInt(unearnedrevenue);
            unearnedrevenue = Integer.toString(temp);
            int temp2 = amount + Integer.parseInt(cash);
            cash = Integer.toString(temp2);
        }
        else if(val.equals("Advertisement Payable")==true){
            int temp = amount +Integer.parseInt(advertisementpayables);
            advertisementpayables = Integer.toString(temp);
            int temp2 = amount + Integer.parseInt(advertexp);
            advertexp = Integer.toString(temp2);
        }
        else if(val.equals("Equipment Payable")==true){
            int temp = amount +Integer.parseInt(equipmentpayables);
            equipmentpayables = Integer.toString(temp);
            int temp2 = amount + Integer.parseInt(equipment);
            equipment = Integer.toString(temp2);
        }
        else if(val.equals("Interest Payable")==true){
            int temp = amount +Integer.parseInt(interestpayables);
            interestpayables = Integer.toString(temp);
            int temp2 = amount + Integer.parseInt(interestexp);
            interestexp = Integer.toString(temp2);
        }
        else if(val.equals("Loan Payable")==true){
            int temp = amount +Integer.parseInt(loanpayables);
            loanpayables = Integer.toString(temp);
            int temp2 = amount + Integer.parseInt(cash);
            cash = Integer.toString(temp2);
        }

        else if(val.equals("Notes Payable")==true){
            int temp = amount +Integer.parseInt(notespayable);
            notespayable = Integer.toString(temp);
            int temp2 = amount + Integer.parseInt(cash);
            cash = Integer.toString(temp2);
        }

        else if(val.equals("Common stock")==true){
            int temp = amount +Integer.parseInt(commonstock);
            commonstock = Integer.toString(temp);
            int temp2 = amount + Integer.parseInt(cash);
            cash = Integer.toString(temp2);
        }
        else if(val.equals("Dividends")==true){
            int temp = amount +Integer.parseInt(dividends);
            dividends = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) - amount;
            cash = Integer.toString(temp2);
        }
    }
    public void decinsert(String val,int amount) {

        if(val.equals("Office Supplies")==true){
            int temp =Integer.parseInt(offsupp) -  amount ;
            offsupp = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) + amount;
            cash = Integer.toString(temp2);
        }
        else if(val.equals("Item-Sneakers")==true){
            int temp = Integer.parseInt(sneakers) -  amount ;
            sneakers = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) + amount;
            cash = Integer.toString(temp2);
        }
        else if(val.equals("Item-Trainers")==true){
            int temp = Integer.parseInt(trainers) -  amount ;
            trainers = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) + amount;
            cash = Integer.toString(temp2);
        }
        else if(val.equals("Item-Grippers")==true){
            int temp = Integer.parseInt(grippers) -  amount ;
            grippers = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) + amount;
            cash = Integer.toString(temp2);
        }
        else if(val.equals("Item-Crocs")==true){
            int temp = Integer.parseInt(crocs) -  amount ;
            crocs = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) + amount;
            cash = Integer.toString(temp2);
        }
        else if(val.equals("Equipment")==true){
            int temp = Integer.parseInt(equipment) -  amount ;
            equipment = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) + amount;
            cash = Integer.toString(temp2);
        }
        else if(val.equals("Furniture")==true){
            int temp = Integer.parseInt(furniture) -  amount ;
            furniture = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) + amount;
            cash = Integer.toString(temp2);
        }
        else if(val.equals("A/c Receivables")==true){
            int temp = Integer.parseInt(ac_recievables) -  amount ;
            ac_recievables = Integer.toString(temp);
            int temp2 =Integer.parseInt(cash) +  amount ;
            cash = Integer.toString(temp2);
        }
        else if(val.equals("Building")==true){
            int temp = Integer.parseInt(building) -  amount ;
            building = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) + amount;
            cash = Integer.toString(temp2);
        }
        else if(val.equals("Land")==true){
            int temp = Integer.parseInt(land) -  amount ;
            land = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) + amount;
            cash = Integer.toString(temp2);
        }
        else if(val.equals("Prepaid Rent")==true){
            int temp = Integer.parseInt(prepaidrent) -  amount ;
            prepaidrent = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) + amount;
            cash = Integer.toString(temp2);
        }
        else if(val.equals("Prepaid Insurance")==true){
            int temp = Integer.parseInt(prepaidinsurance) -  amount ;
            prepaidinsurance = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) + amount;
            cash = Integer.toString(temp2);
        }
        else if(val.equals("Inventory Receivables")==true){
            int temp = Integer.parseInt(inventoryrec) -  amount ;
            inventoryrec = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) + amount;
            cash = Integer.toString(temp2);
        }
        else if(val.equals("Interest Receivables")==true){
            int temp = Integer.parseInt(interestrec) -  amount ;
            interestrec = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) + amount;
            cash = Integer.toString(temp2);
        }
        else if(val.equals("Notes Receivables")==true){
            int temp = Integer.parseInt(noterec) -  amount ;
            noterec = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) + amount;
            cash = Integer.toString(temp2);
        }

        else if(val.equals("Account Payable")==true){
            int temp = Integer.parseInt(accpayable) -  amount ;
            accpayable = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) -  amount ;
            cash = Integer.toString(temp2);
        }
        else if(val.equals("Supplies Payable")==true){
            int temp = Integer.parseInt(suppliespayables) -  amount ;
            suppliespayables = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) -  amount ;
            cash = Integer.toString(temp2);
        }
        else if(val.equals("Unearned Revenue")==true){
            int temp = Integer.parseInt(unearnedrevenue) -  amount ;
            unearnedrevenue = Integer.toString(temp);
            int temp2 = Integer.parseInt(servicerev) +  amount ;
            servicerev = Integer.toString(temp2);
        }
        else if(val.equals("Advertisement Payable")==true){
            int temp = Integer.parseInt(advertisementpayables) -  amount ;
            advertisementpayables = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) - amount;
            cash = Integer.toString(temp2);
        }
        else if(val.equals("Equipment Payable")==true){
            int temp = Integer.parseInt(equipmentpayables) -  amount ;
            equipmentpayables = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) - amount;
            cash = Integer.toString(temp2);
        }
        else if(val.equals("Interest Payable")==true){
            int temp = Integer.parseInt(interestpayables) -  amount ;
            interestpayables = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) - amount;
            cash = Integer.toString(temp2);
        }
        else if(val.equals("Loan Payable")==true){
            int temp = Integer.parseInt(loanpayables) -  amount ;
            loanpayables = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) - amount;
            cash = Integer.toString(temp2);
        }

        else if(val.equals("Notes Payable")==true){
            int temp =     Integer.parseInt(notespayable) -  amount ;
            notespayable = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) - amount;
            cash = Integer.toString(temp2);
        }
    }
    public void incinsertservicerev(String val,int amount) {
        if(val.equals("Service Revenue")==true){
            int temp = amount +Integer.parseInt(servicerev);
            servicerev = Integer.toString(temp);
            int temp2 = amount + Integer.parseInt(cash);
            cash = Integer.toString(temp2);
        }
        else if(val.equals("Interest Revenue")==true){
            int temp = amount +Integer.parseInt(interestrev);
            interestrev = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) + amount;
            cash = Integer.toString(temp2);
        }


        else if(val.equals("Item-Sneakers")==true){
            int temp = Integer.parseInt(sneakers) - amount ;
            sneakers = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) + amount;
            cash = Integer.toString(temp2);
        }
        else if(val.equals("Item-Trainers")==true){
            int temp = Integer.parseInt(trainers) - amount ;
            trainers = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) + amount;
            cash = Integer.toString(temp2);
        }
        else if(val.equals("Item-Grippers")==true){
            int temp = Integer.parseInt(grippers) - amount ;
            grippers = Integer.toString(temp);
            int temp2 = Integer.parseInt(cash) + amount;
            cash = Integer.toString(temp2);
        }

    }



    public void initinsert(String val,int amount) {
        if(val.equals("cash")==true){
            int temp = amount +Integer.parseInt(cash);
            cash = Integer.toString(temp);
        }
        else if(val.equals("Item-Sneakers")==true){
            int temp = amount +Integer.parseInt(sneakers);
            sneakers = Integer.toString(temp);
        }
        else if(val.equals("Item-Trainers")==true){
            int temp = amount +Integer.parseInt(trainers);
            trainers = Integer.toString(temp);
        }
        else if(val.equals("Item-Grippers")==true){
            int temp = amount +Integer.parseInt(grippers);
            grippers= Integer.toString(temp);
        }
        else if(val.equals("Land")==true){
            int temp = amount +Integer.parseInt(land);
            land = Integer.toString(temp);
        }
        else if(val.equals("Building")==true){
            int temp = amount +Integer.parseInt(building);
            building = Integer.toString(temp);
        }
        else if(val.equals("Prepaid Rent")==true){
            int temp = amount +Integer.parseInt(prepaidrent);
            prepaidrent = Integer.toString(temp);
        }
        else if(val.equals("Furniture")==true){
            int temp = amount +Integer.parseInt(furniture);
            furniture = Integer.toString(temp);
        }
        else if(val.equals("Account Payable")==true){
            int temp = amount +Integer.parseInt(accpayable);
            accpayable = Integer.toString(temp);
        }
        else if(val.equals("Service Revenue")==true){
            int temp = amount +Integer.parseInt(servicerev);
            servicerev = Integer.toString(temp);
        }
    }


    public String getServicerev() {
        return servicerev;
    }

    public void setServicerev(String servicerev) {
        this.servicerev = servicerev;
    }

    public String getRentexp() {
        return rentexp;
    }

    public void setRentexp(String rentexp) {
        this.rentexp = rentexp;
    }

    public String getSalexp() {
        return salexp;
    }

    public void setSalexp(String salexp) {
        this.salexp = salexp;
    }

    public String getBillexp() {
        return billexp;
    }

    public void setBillexp(String billexp) {
        this.billexp = billexp;
    }

    public String getInterestexp() {
        return interestexp;
    }

    public void setInterestexp(String interestexp) {
        this.interestexp = interestexp;
    }

    public String getAdvertexp() {
        return advertexp;
    }

    public void setAdvertexp(String advertexp) {
        this.advertexp = advertexp;
    }

    public String getInsuranceexp() {
        return insuranceexp;
    }

    public void setInsuranceexp(String insuranceexp) {
        this.insuranceexp = insuranceexp;
    }

    public String getCash() {
        return cash;
    }

    public void setCash(String cash) {
        this.cash = cash;
    }

    public String getOffsupp() {
        return offsupp;
    }

    public void setOffsupp(String offsupp) {
        this.offsupp = offsupp;
    }

    public String getSneakers() {
        return sneakers;
    }

    public void setSneakers(String sneakers) {
        this.sneakers = sneakers;
    }

    public String getTrainers() {
        return trainers;
    }

    public void setTrainers(String trainers) {
        this.trainers = trainers;
    }

    public String getGrippers() {
        return grippers;
    }

    public void setGrippers(String grippers) {
        this.grippers = grippers;
    }

    public String getCrocs() {
        return crocs;
    }

    public void setCrocs(String crocs) {
        this.crocs = crocs;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getFurniture() {
        return furniture;
    }

    public void setFurniture(String furniture) {
        this.furniture = furniture;
    }

    public String getAc_recievables() {
        return ac_recievables;
    }

    public void setAc_recievables(String ac_recievables) {
        this.ac_recievables = ac_recievables;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public String getPrepaidrent() {
        return prepaidrent;
    }

    public void setPrepaidrent(String prepaidrent) {
        this.prepaidrent = prepaidrent;
    }

    public String getPrepaidinsurance() {
        return prepaidinsurance;
    }

    public void setPrepaidinsurance(String prepaidinsurance) {
        this.prepaidinsurance = prepaidinsurance;
    }

    public String getAccpayable() {
        return accpayable;
    }

    public void setAccpayable(String accpayable) {
        this.accpayable = accpayable;
    }

    public String getSuppliespayables() {
        return suppliespayables;
    }

    public void setSuppliespayables(String suppliespayables) {
        this.suppliespayables = suppliespayables;
    }

    public String getUnearnedrevenue() {
        return unearnedrevenue;
    }

    public void setUnearnedrevenue(String unearnedrevenue) {
        this.unearnedrevenue = unearnedrevenue;
    }

    public String getAdvertisementpayables() {
        return advertisementpayables;
    }

    public void setAdvertisementpayables(String advertisementpayables) {
        this.advertisementpayables = advertisementpayables;
    }

    public String getEquipmentpayables() {
        return equipmentpayables;
    }

    public void setEquipmentpayables(String equipmentpayables) {
        this.equipmentpayables = equipmentpayables;
    }

    public String getInterestpayables() {
        return interestpayables;
    }

    public void setInterestpayables(String interestpayables) {
        this.interestpayables = interestpayables;
    }

    public String getLoanpayables() {
        return loanpayables;
    }

    public void setLoanpayables(String loanpayables) {
        this.loanpayables = loanpayables;
    }


    public String getInterestrev() {
        return interestrev;
    }

    public void setInterestrev(String interestrev) {
        this.interestrev = interestrev;
    }

    public String getUtilitiesexp() {
        return utilitiesexp;
    }

    public void setUtilitiesexp(String utilitiesexp) {
        this.utilitiesexp = utilitiesexp;
    }

    public String getInventoryrec() {
        return inventoryrec;
    }

    public void setInventoryrec(String inventoryrec) {
        this.inventoryrec = inventoryrec;
    }

    public String getInterestrec() {
        return interestrec;
    }

    public void setInterestrec(String interestrec) {
        this.interestrec = interestrec;
    }

    public String getNoterec() {
        return noterec;
    }

    public void setNoterec(String noterec) {
        this.noterec = noterec;
    }

    public String getUtilitiypayable() {
        return utilitiypayable;
    }

    public void setUtilitiypayable(String utilitiypayable) {
        this.utilitiypayable = utilitiypayable;
    }

    public String getNotespayable() {
        return notespayable;
    }

    public void setNotespayable(String notespayable) {
        this.notespayable = notespayable;
    }

    public String getCommonstock() {
        return commonstock;
    }

    public void setCommonstock(String commonstock) {
        this.commonstock = commonstock;
    }

    public String getDividends() {
        return dividends;
    }

    public void setDividends(String dividends) {
        this.dividends = dividends;
    }




}









