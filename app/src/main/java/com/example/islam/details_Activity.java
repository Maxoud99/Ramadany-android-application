package com.example.islam;

import android.content.Intent;
import android.media.Image;
import android.net.LinkAddress;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class details_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_);
        String[]channel={"On & On Drama","Alhayah","dmc & dmc drama","ON & ON drama","dmc & dmc drama ","Alhayah","dmc & dmc drama ","mbc masr & mbc masr 2","cbc & cbc drama","mbc masr & mbc masr 2","cbc & Alhayah","Nile drama & Al Nahar","mbc masr","Alhayah","mbc masr","dmc","dmc","dmc"};
        String[]displaytime={"(9:00 PM) & (10:15 PM) ","12:00:00 AM","10:30:00 PM & 8:00:00 PM","10:15:00 PM & 11:30:00 PM","6:30:00 PM & 10:00:00 PM","6:45:00 PM","7:45 PM & 11:30:00 PM","10:00:00 PM & 8:00:00 PM","7:45:00 PM & 10:00:00 PM","9:30:00 PM & 7:30:00 PM","10:15:00 PM & 6:30:00 PM","6:00:00 PM & 11:00:00 AM","6:30:00 PM","11:30:00 PM","7:00:00 PM","3:15:00 PM","3:45 AM","4:00:00 PM" };
        String[]Redisp={"(04:00 AM, 09:00 AM, 3:30 PM) & (02:00 AM, 05:45 AM, 1:15 PM)","04:00 AM, 04:30 PM","(6:30:00 AM) & (05:30 AM and 05:15 PM) ","(02:00 AM and 02:00 PM) & (03:15 AM and 05:00 PM)","(01:00:00 AM and 01:00 PM) & (04:00 AM and 04:00 PM)","01:15 AM and 01:45 PM","(02:00 AM and 10:00 AM) & (12:00 PM and 06:30 AM)","(04:30 AM and 09:30 AM and 04:30 PM) & (08:00 AM, 02:00 PM and 12:00 am)","(12:30 AM and 07:30 AM ) & (03:00 AM and 10:30 AM and 05:15 PM)","(05:15 AM and 03:00 PM) & (04:00 Am,11:00AM and 11:00 PM )","(4:15 AM and 11:45 AM) & (7:00:00 AM)","(04:00 AM and 11:00 AM) & (04:00 AM and 07:00 AM)","2:00:00 AM","Nor replay time for this Program","1:00 AM and 12:00 PM","3:45:00 AM","Nor replay time for this Program","5:00:00 AM"};
        String[]mainStrars={"Amir Karara,Ahmed El Awady,Sarah Adel and Dina Foaud","Yasser Galal, Ahmed Salah Hosny, Ahmed Khalil, Mai Omar, Ryad El-Kholy and Naglaa Badr","Yassmine Sabri, Ahmed Magdy, Ayten Amer, Heba Magdy and Ashraf zaki","Youssef El-sherief, Amr Abdel-Galeel, Ahemd Wafeeq, Mohamed Lotfy and Sara Adel","Adel Emam, Dalal Abdel-Aziz, Dalia El-Bhery, Hamdy El-Marghany and Soliman Eid","Nelly Kareem, Aser Yacine, Ola Rushdy and Mostafa Darwish.","Mohamed Ramadan, Ahmed Zaher, Nour, Rougena, Naglaa badr and Mohamed Alaa","Dina El Sherbiny, Ahmed Dawood, Ahmed Safwat and Injy Al Moqaddem","Eyad Nassar, Ghada Adel, Khaled El Sawy and Sabrin.","Hamdy Al-Merghany, Mohamed Osama (Os Os), Bayyumy Fouad and  Entsar","Yousra, Hala Sheeha, Abir Sabri and Bayyumy Fouad","Hasan Al-Raddad, Basma, Hana Shiha and Mohamed Lotfy","Ramez Galal and Arwa","Ibrahim El-Smaan","Ahmed El-Sa'a and Razan Maghraby","Khaled El-gendy and Ramadan Abdel-Moez","Imam Ahmed El-Tayeb","Sheikh Ali Goma'a and Amr Khalil"};
        String[]briefDes={"The series follows the life of Ahmed Saber El-Mansy, the Thunderbolt Forces commander of the battalion 103 who was martyred in the checkpoint of the Burth Square in the Egyptian city of Rafah in 2017 while countering a terrorist attack in Sinai.","The series takes place in 1850 in old Cairo and Local neighborhoods, where these neighborhoods are oragnized and run by some powerful people, who were called (El Fetwah), which bears the responsibility of the neighborhood's people.","The events of the series are about Malak, who loses her memory after a tragic accident because of her shock and cheating of her fiance, Ziad.","In 2120 Jerusalem, an engineer tries to find a solution to the energy problem in light of the restrictions that the regime imposes on the population. However, everything changes when he comes across his robotic doppelganger.","The series' events ara about \"Noor Abdel-Majeed\", Known as \"Valentino\", who owns international schools with his wife; but there are some differences between them throughout the series, and from here begins the adventure and surprises.","Sokkar is a professional swindler who gets outdone by Omar, another swindler. As she enters into a series of conflicts to get her money back from him, she eventually decides to unite with him to carry out bigger defrauding operations.","Within the framework of social drama, The events of the series are about the prince's family, where Radwan El-Prince, who shares many family social relations between him and his family, after the death of his father he founds himfelf responsible for everone; problems occure with his 6 brothers on the legacy, and then they put them in the prison and when he comes out he begins to take the revenge on all who extortion him","Rukia wakes up after a 4-month coma, only to discover that she does not remember anything that happened in the last six years of her life, and that her betrayal brought about her husband's murder.","The events take place in the 1980s, revolving around the life of Hisham. As he returns from the Gulf where he has been working, his life takes a turn when his daughter Gamila gets in an accident with the driver Rady. Gradually, Hisham begins to uncover secrets about his wife, Mariam","The twin brothers Shawqy and Zika wish to change their lives for the better, as Shawqy wants to become an actor and Zika a singer. They pursue their lovers and their dreams, but their job as garbage men stands in the way. All while Mamado, the leader of Zambizy, learns he has twin children in Egypt.","Ahd is a wealthy woman who's the head of the family, and she has always depended on coffee readings to predict significant and life-altering events in her personal and family lives, but she gradually learns that her own family is plotting against her.","A drama that depicts the life of the police officer Omar and his attempts to find his wife, the journalist Nada, whose kidnappers try to delude him into believing she's dead.","Ramez Galal is deceiving his friends again, with the assistance of the singer Arwa, who will redress the victims to make a dialogue and an interview, and then the guest is surprised by the unexpected entrance of Ramez, who will do some punishments to force his guests to do what he ask for, the show this time is different as Ramez now is face to face with his guests.","The idea of the program about taking the customers by El-Smaan's taxi in the streets of Cairo and Giza and making crazy things to anger them.","Ahmed El-Sa'a does some challenges against his guests and who collects more points win and take 100k E.L and then donate the money to any charity.","A religious social program that focuses on renewing religious discourse and aims to raise the awareness of Muslims.","The Grand Imam,Dr.Ahmed El-Tayeb,Sheikh of Al-Azhar Al-Sharif, continue to present his program  for the fourth year in Ramadan, where he deals with a set of values and ethics that must be demonstraded by each muslim and that will advance nations and societies.","Focus on the lanf of Egypt with the prophets of god begins with Idris The wise, through the father of prophets Ibrahim, till yusuf ,Musa and Haroun."};
        String[]promo={"https://youtu.be/gbNrpetRUrE","https://youtu.be/shukofzMq-A","https://youtu.be/_UUV59hevuA","https://youtu.be/1pSB8BPMIJ0","https://youtu.be/8l3kGxJB7KU","https://youtu.be/8idZctyrwKg","https://youtu.be/HY7zGpFp8zE","https://youtu.be/HHGlGav5YJk","https://youtu.be/tlxCiDg09dI","https://youtu.be/8PyG4j869iI","https://youtu.be/bolEYtxt2XI","https://youtu.be/raw5dpPrtb4","https://youtu.be/gWd-Qj0lnUw","https://youtu.be/jAnQcPHAQVM","https://youtu.be/W-ygQYclVKU","https://youtu.be/2vQyAPynDlM","https://youtu.be/ltZLvt6qiz0","https://youtu.be/412Ci8JzI9w"};
        Intent inte=getIntent();
        String type=inte.getStringExtra("type");
        TextView txtchannel=findViewById(R.id.channel);
        TextView txtTitle=findViewById(R.id.mosprogname);
        TextView txtdisply=findViewById(R.id.Display);
        TextView txtRe=findViewById(R.id.Redisp);
        TextView txtstars=findViewById(R.id.stars);
        TextView txtDesc=findViewById(R.id.Desc);
        TextView txtPromo=findViewById(R.id.promo);
        ImageView image=findViewById(R.id.im);

        switch (type){
            case "El Ekhtyar":txtchannel.setText(channel[0]);txtTitle.setText("EL Ekhtyar");
                              txtdisply.setText(displaytime[0]);txtRe.setText(Redisp[0]);
                              txtstars.setText(mainStrars[0]);txtDesc.setText(briefDes[0]);
                              txtPromo.setText(promo[0]);image.setImageResource(R.drawable.ekhtyar);break;
            case "El Fetwah":txtchannel.setText(channel[1]);txtTitle.setText("El Fetwah");
                txtdisply.setText(displaytime[1]);txtRe.setText(Redisp[1]);
                txtstars.setText(mainStrars[1]);txtDesc.setText(briefDes[1]);
                txtPromo.setText(promo[1]);image.setImageResource(R.drawable.elfetwa);break;
            case "Forsa Tanya":txtchannel.setText(channel[2]);txtTitle.setText("Forsa Tanya");
                txtdisply.setText(displaytime[2]);txtRe.setText(Redisp[2]);
                txtstars.setText(mainStrars[2]);txtDesc.setText(briefDes[2]);
                txtPromo.setText(promo[2]);image.setImageResource(R.drawable.forsa_thaniya);break;
            case "El Nehaya":txtchannel.setText(channel[3]);txtTitle.setText("El Nehaya");
                txtdisply.setText(displaytime[3]);txtRe.setText(Redisp[3]);
                txtstars.setText(mainStrars[3]);txtDesc.setText(briefDes[3]);
                txtPromo.setText(promo[3]);image.setImageResource(R.drawable.elnhaya);break;
            case "Valentino":txtchannel.setText(channel[4]);txtTitle.setText("Valentino");
                txtdisply.setText(displaytime[4]);txtRe.setText(Redisp[4]);
                txtstars.setText(mainStrars[4]);txtDesc.setText(briefDes[4]);
                txtPromo.setText(promo[4]);image.setImageResource(R.drawable.valentino);break;
            case "B 100 Wesh":txtchannel.setText(channel[5]);txtTitle.setText("B 100 Wesh");
                txtdisply.setText(displaytime[5]);txtRe.setText(Redisp[5]);
                txtstars.setText(mainStrars[5]);txtDesc.setText(briefDes[5]);
                txtPromo.setText(promo[5]);image.setImageResource(R.drawable.b100wesh);break;
            case "EL Prince":txtchannel.setText(channel[6]);txtTitle.setText("EL Prince");
                txtdisply.setText(displaytime[6]);txtRe.setText(Redisp[6]);
                txtstars.setText(mainStrars[6]);txtDesc.setText(briefDes[6]);
                txtPromo.setText(promo[6]);image.setImageResource(R.drawable.elprince);break;
            case "Luebat Al-Nesyan":txtchannel.setText(channel[7]);txtTitle.setText("Luebat Al-Nesyan");
                txtdisply.setText(displaytime[7]);txtRe.setText(Redisp[7]);
                txtstars.setText(mainStrars[7]);txtDesc.setText(briefDes[7]);
                txtPromo.setText(promo[7]);image.setImageResource(R.drawable.elnesyan);break;
            case "Lyalyna 80":txtchannel.setText(channel[8]);txtTitle.setText("Lyalyna 80");
                txtdisply.setText(displaytime[8]);txtRe.setText(Redisp[8]);
                txtstars.setText(mainStrars[8]);txtDesc.setText(briefDes[8]);
                txtPromo.setText(promo[8]);image.setImageResource(R.drawable.lyalena80);break;
            case "Etneen Fel Sandoq":txtchannel.setText(channel[9]);txtTitle.setText("Etneen Fel Sandoq");
                txtdisply.setText(displaytime[9]);txtRe.setText(Redisp[9]);
                txtstars.setText(mainStrars[9]);txtDesc.setText(briefDes[9]);
                txtPromo.setText(promo[9]);image.setImageResource(R.drawable.etneenfelsandoq);break;
            case "Kheyanet Ahad":txtchannel.setText(channel[10]);txtTitle.setText("Kheyanet Ahad");
                txtdisply.setText(displaytime[10]);txtRe.setText(Redisp[10]);
                txtstars.setText(mainStrars[10]);txtDesc.setText(briefDes[10]);
                txtPromo.setText(promo[10]);image.setImageResource(R.drawable.khyantahd);break;
            case "Shahid Eian":txtchannel.setText(channel[11]);txtTitle.setText("Shahid Eian");
                txtdisply.setText(displaytime[11]);txtRe.setText(Redisp[11]);
                txtstars.setText(mainStrars[11]);txtDesc.setText(briefDes[11]);
                txtPromo.setText(promo[11]);image.setImageResource(R.drawable.shahidayan);break;
            case "Ramez magnoon rasmy":txtchannel.setText(channel[12]);txtTitle.setText("Ramez magnoon rasmy");
                txtdisply.setText(displaytime[12]);txtRe.setText(Redisp[12]);
                txtstars.setText(mainStrars[12]);txtDesc.setText(briefDes[12]);
                txtPromo.setText(promo[12]);image.setImageResource(R.drawable.ramez);break;
            case "Crazy Taxi":txtchannel.setText(channel[13]);txtTitle.setText("Crazy Taxi");
                txtdisply.setText(displaytime[13]);txtRe.setText(Redisp[13]);
                txtstars.setText(mainStrars[13]);txtDesc.setText(briefDes[13]);
                txtPromo.setText(promo[13]);image.setImageResource(R.drawable.crazy);break;
            case "Eghlb El-Sa'a":txtchannel.setText(channel[14]);txtTitle.setText("Eghlb El-Sa'a");
                txtdisply.setText(displaytime[14]);txtRe.setText(Redisp[14]);
                txtstars.setText(mainStrars[14]);txtDesc.setText(briefDes[14]);
                txtPromo.setText(promo[14]);image.setImageResource(R.drawable.el8lb);break;
            case "Lalahom Yafqahoon":txtchannel.setText(channel[15]);txtTitle.setText("Lalahom Yafqahoon");
                txtdisply.setText(displaytime[15]);txtRe.setText(Redisp[15]);
                txtstars.setText(mainStrars[15]);txtDesc.setText(briefDes[15]);
                txtPromo.setText(promo[15]);image.setImageResource(R.drawable.l3lhom);break;
            case "EL-Imam El-Tayeb":txtchannel.setText(channel[16]);txtTitle.setText("EL-Imam El-Tayeb");
                txtdisply.setText(displaytime[16]);txtRe.setText(Redisp[16]);
                txtstars.setText(mainStrars[16]);txtDesc.setText(briefDes[16]);
                txtPromo.setText(promo[16]);image.setImageResource(R.drawable.imam);break;
            case "Ard El-Anbya'a":txtchannel.setText(channel[17]);txtTitle.setText("Ard El-Anbya'a");
                txtdisply.setText(displaytime[17]);txtRe.setText(Redisp[17]);
                txtstars.setText(mainStrars[17]);txtDesc.setText(briefDes[17]);
                txtPromo.setText(promo[17]);image.setImageResource(R.drawable.ard);break;



        }
    }
}
