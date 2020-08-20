


import java.sql.Time;
import java.util.Date;



import com.thoughtworks.gauge.Step;

import io.appium.java_client.MobileElement;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
public class HomePage extends HookImple {



        
        @Step({"Bilet al butonuna tıklanır."})
        public void openTicket(){
            elementClickById(OPEN_TICKED_BUTTON);

        }
        @Step({"Tek yön uçuş seçilir"})
        public void oneWay(){
            elementClickById(ONE_WAY_BUTTON);

        }
        @Step({"SAW "})
        public void sawCheck(){
            elementClickById(TO_FROM_BUTTON);
            elementSendKeysById(TO_SEARCH_AREA,"SAW");
            elementClickByXpath(TO_SELECT_FLY);


        }
        @Step({"ESB "})
        public void toESB(){
            elementClickById(GO_FROM_BUTTON);

            elementSendKeysById(GO_SEARCH_AREA,"ESB");

            elementClickByXpath(GO_SELECT_FLY);

        }
        @Step({"Tarih "})
        public void inToDate(){
            elementClickById(IN_TO_DATE_BUTTON);

        }
        @Step({"<value> Tarih bilgisi günün tarihinden 2 gün sonraya seçilir"})
        public void goToDay(int value){
            Date now=new Date();

            String goDate=String.valueOf(now.getDate()+value);
            elementClickByXpath("//*[@class='android.widget.TextView' and @text='"+goDate+"']");
            elementClickById(DONE_BUTTON);


        }

        @Step({"Yetişkin bilgisi 2 olarak seçilir"})
        public void upperPassengers(){

            elementClickById(UPPER_PASSENGERS_BUTTON);

        }

        @Step({"Uçuş ara butonuna tıklanır."})
        public void goToDay(){

            elementClickById(SEARCH_BUTTON);


        }




        @Step({"Ekonomik uçuş seçilir"})
        public void goFlyEconomy(){

            elementClickByXpath(ECHONOMY_FLY);


        }



    }

