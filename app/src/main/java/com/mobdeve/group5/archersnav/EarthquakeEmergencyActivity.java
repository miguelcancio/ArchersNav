package com.mobdeve.group5.archersnav;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EarthquakeEmergencyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earthquake);

        TextView procedureTextView = findViewById(R.id.procedureTextView);
        procedureTextView.setText(Html.fromHtml(getEarthquakeProcedureText()));
    }

    private String getEarthquakeProcedureText() {
        return
                "This Earthquake Emergency Procedure provides clear instructions for students, teachers, and staff on how to respond to an earthquake. The goal is to minimize injuries, ensure safe evacuation, and ensure that everyone knows their roles during and after an earthquake.\n\n<br><br>" +

                "<b>1. Earthquake Preparedness<br></b>" +
                "Before an earthquake occurs, the school must take proactive steps to ensure safety and preparedness:\n\n<br><br>" +

                "<b>Safety Education:\n<br></b>" +
                "Conduct regular drills for students and staff on how to respond during an earthquake.\n<br>" +
                "<br>Teach students how to 'Drop, Cover, and Hold On' during an earthquake.\n\n<br><br>" +

                "<b>Structural Safety:\n<br></b>" +
                "Ensure the school building is compliant with earthquake-resistant standards (based on the National Building Code of the Philippines).\n<br>" +
                "<br>Secure heavy objects, bookshelves, and other items that could fall and cause injury during an earthquake.\n\n<br><br>" +

                "<b>Emergency Supplies:\n<br></b>" +
                "Maintain a first aid kit, emergency water, non-perishable food, and flashlights in accessible locations.\n<br>" +
                "<br>Ensure that emergency exits and evacuation routes are clearly marked and unobstructed.\n\n<br><br>" +

                "<b>2. Immediate Actions During an Earthquake\n<br></b>" +
                "When an earthquake strikes, it is important to stay calm and follow the proper actions. The initial few moments are critical.\n\n<br><br>" +

                "<b>A. If You Are Indoors:\n<br><br></b>" +
                "b>Drop, Cover, and Hold On:</b><br> Drop to your hands and knees, cover your head and neck, and take shelter under sturdy furniture if available.\n<br>" +
                "<br><b>Stay Indoors Until the Shaking Stops:</b> <br>Do not run outside.\n<br>" +
                "<br><b>Avoid Windows and Doors:</b> <br>Stay away from windows, glass doors, mirrors, and anything that could shatter or fall.\n<br>" +
                "<br><b>Do Not Use Elevators:</b> <br>Use stairs only after the shaking stops.\n\n<br><br>" +

                "<b>B. If You Are Outdoors:\n<br><br></b>" +
                "<b>Stay in the Open:</b> <br>Move to an open area away from buildings, trees, and other structures.\n<br>" +
                "<br><b>Drop to the Ground:</b> <br>Drop to your knees, cover your head and neck, and wait for the shaking to stop.\n\n<br><br>" +

                "<b>C. If You Are in a Vehicle:\n<br><br></b>" +
                "<b>Pull Over Safely:</b><br> Stop the vehicle in a safe location away from structures.\n<br><br>" +
                "Stay in the vehicle until the shaking stops.\n\n<br><br>" +

                "<b>3. After the Earthquake (Initial Actions)\n<br></b>" +
                "Once the shaking stops, take the following actions:\n\n<br><br>" +

                "<b>A. For Students and Teachers:\n<br><<br></b>" +
                "<b>Stay Calm and Be Alert:</b> <br>Listen for instructions.\n<br>" +
                "<br><b>Check for Hazards:</b> <br>Look for fires, gas leaks, or structural damage.\n<br>" +
                "<br><b>Evacuate if Safe:</b> <br>Evacuate the building in an orderly manner, avoid elevators, and proceed to the assembly area.\n<br>" +
                "<br><b>Assist Others:</b><br> Help students with injuries or mobility challenges.\n<br>" +
                "<br><b>Account for All Students:</b><br> Teachers must conduct a roll call.\n\n<br><br>" +

                "<b>B. For Teachers and Staff:\n<br></b>" +
                "<b>Ensure Safety of Students:</b> <br>Guide students to evacuation points.\n<br>" +
                "<br><b>Check for Injuries:</b><br> Administer first aid.\n<br>" +
                "<br><b>Check for Hazards:</b><br> Inspect areas for fire, gas leaks, or structural damage.\n<br>" +
                "<br><b>Communicate with Authorities:</b><br> Report any issues to authorities.\n<br>" +
                "<br><b>Keep Students Calm:</b> <br>Maintain order and reassure students.\n\n<br><br>" +

                "<b>4. Evacuation Procedure\n<br></b>" +
                "Evacuate Immediately if the Building is Unsafe.\n<br>" +
                "Follow Pre-Designated Routes: Go to the assembly area.\n<br><br>" +
                "<b>Avoid Damaged Stairs:</b> Use alternate routes if stairs are damaged.\n\n<br><br>" +

                "<b>5. Aftershocks\n<br><br></b>" +
                "<b>Expect Aftershocks:</b> <br>These can occur after the main quake. Drop, Cover, and Hold On as before.\n<br>" +
                "<br><b>Evacuate if Necessary:</b> <br>If the building is unsafe, evacuate again.\n\n<br><br>" +

                "<b>6. Post-Earthquake Actions\n<br><br></b>" +
                "<b>Check for Injuries:</b> <br>Administer first aid and contact emergency services.\n<br>" +
                "<br><b>Avoid Returning to the Building:</b> <br>Wait for authorities to declare the building safe.\n<br>" +
                "<br><b>Stay Informed:</b><br> Listen for updates from school authorities.\n<br>" +
                "<br><b>Psychological Support:</b><br> Provide counseling if needed.\n<br>" +
                "<br><b>Reassess Procedures:</b> <br>Debrief after the event and identify improvements.\n\n<br><br>" +

                "<b>7. Emergency Contacts:\n<br><br></b>" +
                "<b>School Emergency Contact Number:</b><br> [Insert School’s Emergency Number]\n<br><br>" +
                "<b>Philippine National Disaster Risk Reduction and Management Council (NDRRMC):</b> 911\n<br><br>" +
                "<b>Local Police:</b> 117\n<br>" +
                "<b>Fire Department:</b><br> [Insert Local Fire Department Number]\n<br><br>" +
                "<b>Philippine Red Cross (First Aid & Medical Emergency):</b> 143\n\n<br><br>" +

                "<b>REMEMBER:</b>Preparedness is key to minimizing earthquake risks. Everyone should be familiar with these procedures to ensure a swift and safe response during an earthquake.\n\n<br><br>" +
                "This emergency procedure should be reviewed regularly and shared with all students, teachers, and staff.";
    }
}
