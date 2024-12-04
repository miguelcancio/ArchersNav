package com.mobdeve.group5.archersnav;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class BombThreatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bomb_threat);

        TextView procedureTextView = findViewById(R.id.procedureTextView);
        procedureTextView.setText(Html.fromHtml(getBombThreatProcedureText()));
    }

    private String getBombThreatProcedureText() {
        return
                "In the event of a bomb threat at a school, it is critical to follow a well-organized set of emergency procedures to ensure the safety of all students, staff, and visitors. These procedures should be communicated clearly to all members of the school community, with regular drills to ensure everyone knows how to respond in an emergency situation.<br><br><br>" +
                "<b>1. Receive and Assess the Threat</b><br><br>" +
                        "<b>If the Threat is Received via Phone:</b><br><br>" +
                        "<b>Stay Calm:</b> <br>Answer the phone in a calm and professional manner.<br><br>" +
                        "<b>Gather information:</b><br> location, detonation time, bomb type, etc.<br><br>" +
                        "Record time of the call.<br><br>" +
                        "Listen for background noise or clues to the caller’s identity.<br><br>" +
                        "Do not hang up.<br><br>" +

                        "<b>If the Threat is Written:</b><br>" +
                        "Do not handle the note to preserve evidence.<br>" +
                        "Secure the note and report to authorities immediately.<br><br>" +

                        "<b>2. Alert Authorities</b><br><br>" +
                        "<b>Contact Local Law Enforcement:</b><br>" +
                        "Call the nearest police station and provide all gathered details.<br><br>" +
                        "Request a bomb disposal unit if needed.<br><br>" +
                        "<b>Notify School Officials:</b><br>" +
                        "Alert the school officials or emergency response team leader.<br><br>" +
                        "Communicate the urgency of the situation.<br><br>" +

                        "<b>3. Activate Emergency Protocols</b><br><br>" +
                        "<b>Evacuate the School:</b><br>" +
                        "Follow the school’s evacuation plan.<br>" +
                        "Use pre-designated evacuation routes; avoid elevators.<br><br>" +
                        "Move to an assembly area at least 500 meters from the building.<br><br>" +
                        "Take attendance to ensure everyone is accounted for.<br><br>" +

                        "<b>Communicate Clearly:</b><br>" +
                        "Use PA system or other tools to give clear instructions.<br><br>" +
                        "Stay calm and avoid panic.<br><br>" +

                        "<b>4. Conduct a Search</b><br><br>" +
                        "<b>Work with Authorities:</b><br> Allow law enforcement to conduct a search.<br><br>" +
                        "<b>Do Not Touch Suspicious Objects:</b><br> Report anything suspicious to the authorities.<br><br>" +

                        "<b>5. Evaluate the Situation</b><br><br>" +
                        "<b>Wait for All Clear:</b><br> Return to the building only after law enforcement declares it safe.<br><br>" +
                        "<b>Monitor for Updates:</b><br> Stay in contact with law enforcement for updates.<br><br>" +

                        "<b>6. Post-Incident Response</b><br><br>" +
                        "<b>Account for All Students and Staff:</b> Reconfirm attendance once safe.<br><br>" +
                        "<b>Provide Support:</b> Offer counseling services to address anxiety and stress.<br><br>" +

                        "<b>7. Follow-Up and Report</b><br><br>" +
                        "<b>Complete Incident Reports:</b><br> File official reports with law enforcement and internally.<br><br>" +
                        "<b>Review the Situation:</b><br> Conduct a debriefing session with key personnel.<br><br>" +
                        "<b>Notify Parents and Guardians:</b><br> Provide details on the threat and response actions.<br><br>" +

                        "<b>Emergency Contacts:</b><br><br>" +
                        "<b>Local Police Station:</b> [Insert contact number]<br><br>" +
                        "<b>Bomb Disposal Unit:</b> [Insert contact number]<br><br>" +
                        "<b>Local Emergency Services:</b> [Insert contact number]<br><br>" +
                        "<b>Nearest Hospital:</b> [Insert contact number]<br><br>" +

                        "<b>REMEMBER:</b><br><br>" +
                        "Do not use mobile phones during evacuation as they may trigger detonators.<br><br>" +
                        "Preserve evidence, such as phone call recordings or notes.<br><br>" +
                        "Regularly conduct bomb threat response drills.<br><br>" +

                        "By following these steps, the school can minimize risk and ensure a quick, organized response, prioritizing safety.<br><br>";
    }

}
