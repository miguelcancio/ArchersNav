package com.mobdeve.group5.archersnav;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class FireEmergencyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire_emergency);

        TextView procedureTextView = findViewById(R.id.procedureTextView);
        procedureTextView.setText(Html.fromHtml(getFireEmergencyProcedureText()));
    }

    private String getFireEmergencyProcedureText() {
            return

                            "This fire emergency procedure outlines the necessary actions to ensure the safety of all students, faculty, and staff in case of a fire emergency at the school. " +
                            "It aims to prevent injury, loss of life, and property damage by ensuring that everyone knows their responsibilities and actions during a fire.<br><br>" +

                            "<b>1. Fire Prevention Measures</b><br>" +
                            "Preventing fires is the first line of defense. Schools must take the following steps to minimize fire risks:<br><br>" +
                            "<b>Regular Fire Drills:</b> <br>Conduct fire drills at least once every quarter to familiarize everyone with the procedure.<br>" +
                            "<br><b>Maintenance of Fire Safety Equipment:</b><br> Ensure all fire extinguishers, alarms, sprinkler systems, and fire exits are in good working condition.<br>" +
                            "<br><b>Electrical Safety:</b><br> Regularly check all electrical wiring and appliances to prevent short circuits or overheating.<br>" +
                            "<br><b>Clear Exits:</b><br> Keep fire exits and escape routes clear of obstructions at all times.<br><br>" +

                            "<b>2. Immediate Actions in Case of Fire</b><br>" +
                            "If you discover a fire or hear the fire alarm:<br><br>" +

                            "<b>A. For Students and Teachers:</b><br><br>" +
                            "<b>Stay Calm and Alert:</b><br> Immediately stop any activity and remain calm. Panic can lead to accidents and confusion.<br>" +
                            "<br><b>Activate the Fire Alarm:</b> <br>If the fire alarm hasn't gone off, pull the nearest alarm station or notify a teacher or staff member about the fire.<br>" +
                            "<b><br>Evacuate the Building:</b><br><br>" +
                            "<b>Follow Evacuation Plan:</b> <br>Go to the nearest designated exit. Teachers must lead students to the assembly area.<br>" +
                            "<br><b>Stay Low if There is Smoke:</b> <br>If smoke is present, crouch down and cover your nose and mouth with a cloth.<br>" +
                            "<br><b>Do Not Use Elevators:</b><br> Always use stairwells. Elevators may malfunction during a fire.<br>" +
                            "<br><b>Do Not Push or Shove:</b><br> Help each other stay orderly during the evacuation.<br>" +
                            "<br><b>Do Not Return for Belongings:</b> <br>Leave all personal items behind to ensure a faster evacuation.<br>" +
                            "<br><b>Go to the Assembly Area:</b> <br>Teachers must check that all students are accounted for in the designated safe zone.<br><br>" +

                            "<b>B. For Teachers and Staff:</b><br><br>" +
                            "<b>Alert the School's Fire Emergency Response Team:</b> <br>If a fire is detected in the classroom, call the school’s emergency number or activate the fire alarm immediately.<br>" +
                            "<br><b>Ensure Students are Safely Evacuated:</b> <br>Lead students to the designated assembly point. Verify that all students are out of the building, especially if there are students with special needs.<br>" +
                            "<br><b>Direct Students Away from the Fire Zone:</b><br> Move them to a safe distance, away from the building or fire trucks.<br>" +
                            "<br><b>Close Doors and Windows:</b><br> If safe, close all doors and windows in classrooms to prevent the fire from spreading.<br>" +
                            "<br><b>Assist with the Fire Department’s Arrival:</b><br> Guide fire responders to the affected area upon their arrival, providing details about the fire’s location and any potential hazards.<br><br>" +

                            "<b>3. Special Considerations</b><br>" +
                            "<b>People with Disabilities:</b> <br>Teachers should be aware of students or staff who may need assistance evacuating, such as those with physical disabilities, hearing or visual impairments, or other special needs.<br>" +
                            "<br><b>Small Children:</b> <br>In elementary schools, teachers and staff must ensure that small children are safely escorted and accounted for, paying extra attention to potential confusion.<br><br>" +

                            "<b>4. Fire Safety Equipment and Fire Response Team (FRT)</b><br>" +
                            "The school should have a Fire Response Team (FRT) trained to handle basic firefighting tasks if needed and responsible for conducting fire drills, maintaining fire safety equipment, and leading emergency responses.<br><br>" +
                            "<b>Fire Safety Equipment Checklist:</b><br><br>" +
                            "Fire Extinguishers<br>" +
                            "Fire Blankets<br>" +
                            "Fire Alarms<br>" +
                            "Smoke Detectors<br>" +
                            "Emergency Lighting<br>" +
                            "First Aid Kits<br><br>" +

                            "<b>5. After the Evacuation</b><br><br>" +
                            "<b>Do Not Re-enter the Building Until Cleared:</b> <br>Only authorities can determine when it is safe.<br>" +
                            "<br><b>Report Missing or Injured Individuals:</b><br> Report any missing persons to the fire department or emergency responders.<br>" +
                            "<br><b>Medical Assistance:</b><br> Provide first aid if needed and call for medical help if necessary.<br>" +
                            "<br><b>Debriefing:</b> <br>Conduct a meeting with all students and staff to discuss the event.<br><br>" +

                            "<b>6. Post-Incident Actions</b><br><br>" +
                            "<b>Investigate the Cause of the Fire:</b> <br>An investigation will take place to identify the cause.<br>" +
                            "<br><b>Psychological Support:</b><br> Ensure counseling services are available.<br>" +
                            "<br><b>Review and Improve the Fire Safety Plan:</b> <br>Update the fire safety plan regularly based on lessons learned.<br><br>" +

                            "<b>7. Emergency Contacts</b><br><br>" +
                            "<b>School Fire Emergency Contact Number:</b><br> [Insert School’s Emergency Number]<br><br>" +
                            "<b>Local Fire Department:</b><br> [Insert Local Fire Department Number]<br><br>" +
                            "<b>Ambulance/Medical Emergency:</b><br> [Insert Ambulance/Medical Emergency Number]<br><br>" +
                            "<b>Philippine National Police (PNP):</b> 117<br><br>" +

                            "<b>REMEMBER:</b> Safety is everyone's responsibility. Stay alert, stay prepared, and always follow the school’s fire safety plan.<br><br>" +

                            "This fire emergency procedure should be shared with all students, staff, and parents. Regular fire drills must be conducted to ensure familiarity with the procedure and the ability to respond appropriately during an emergency.";
        }
    }