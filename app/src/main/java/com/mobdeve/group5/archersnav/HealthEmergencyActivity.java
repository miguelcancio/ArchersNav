package com.mobdeve.group5.archersnav;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class HealthEmergencyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_emergency);

        TextView procedureTextView = findViewById(R.id.procedureTextView);
        procedureTextView.setText(Html.fromHtml(getHealthEmergencyProcedureText()));
    }

    private String getHealthEmergencyProcedureText() {
        return
                "In any school setting, health emergencies can occur unexpectedly, and it’s essential to have clear, well-practiced procedures in place to respond quickly and effectively.<br><br>" +
                        "These procedures should cover a wide range of potential health emergencies, from minor injuries to more serious medical events like heart attacks, seizures, or allergic reactions.<br><br>" +
                        "<b>1. General Procedures for Health Emergencies</b><br><br>" +
                        "<b>A. Stay Calm and Assess the Situation</b><br><br>" +
                        "<b>Stay Calm:<br></b> Keep a level head to effectively manage the situation.<br><br>" +
                        "<b>Assess the Emergency:</b> <br>Quickly evaluate the situation. Determine if the emergency is life-threatening (e.g., heart attack, severe bleeding, severe allergic reaction, etc.) or if it can be handled with basic first aid (e.g., cuts, bruises, or minor injuries).<br><br>" +

                        "<b>B. Call for Help</b><br><br>" +
                        "<b>Immediately Alert the School Nurse:</b> If available, contact the school nurse or first aider. They should be the first point of contact for most health emergencies.<br>" +
                        "<b><br>Call Emergency Services (Ambulance):</b> For serious emergencies, call 911 immediately for an ambulance and provide them with clear and concise details about the situation, including:<br>" +
                        "<br>- Location of the school<br>" +
                        "- Type of emergency<br>" +
                        "- Condition of the person involved<br>" +
                        "- Any known medical conditions (if applicable)<br><br>" +

                        "<b>C. Ensure Safety and Comfort</b><br><br>" +
                        "<b>Move to a Safe Area:</b><br> If the student or staff member is in an unsafe location, move them to a safe area, but only if it does not worsen the situation.<br>" +
                        "<br><b>Comfort the Individual:</b><br> If the person is conscious, keep them calm and reassure them that help is on the way.<br><br>" +


                        "<b>2. Specific Health Emergencies and Response Procedures</b><br><br>" +

                        "<b>A. Severe Allergic Reaction (Anaphylaxis)</b><br><br>" +
                        "<b>Recognize Symptoms:</b> <br>Swelling of the face, lips, throat, difficulty breathing, dizziness, or rash.<br>" +
                        "<br><b>Administer Epinephrine:</b> <br>If the student has a prescribed epinephrine auto-injector (e.g., EpiPen), administer it immediately according to the instructions. If unsure, call an ambulance and wait for medical assistance.<br>" +
                        "<br><b>Stay with the Person:</b><br> Monitor the individual closely while awaiting medical help. Reassure them and keep them calm.<br><br>" +

                        "<b>B. Asthma Attack</b><br><br>" +
                        "<b>Recognize Symptoms:</b> <br>Difficulty breathing, wheezing, shortness of breath, coughing.<br>" +
                        "<br><b>Administer Inhaler:</b> <br>If the person has a prescribed inhaler, help them use it. If they do not improve after 10-15 minutes, or if the symptoms worsen, call for an ambulance.<br>" +
                        "<br><b>Monitor Breathing:</b> <br>Keep the person calm and encourage slow, deep breathing.<br><br>" +

                        "<b>C. Seizures</b><br><br>" +
                        "<b>Recognize Symptoms:</b> <br>Loss of consciousness, convulsions, shaking, or stiffening of the body.<br>" +
                        "<br><b>Protect the Person:</b><br> Move any objects around them that could cause injury. Place a soft item (like a folded jacket or cushion) under their head to prevent head injury.<br>" +
                        "<br><b>Do Not Restrain:</b><br> Do not hold down their limbs or try to stop the seizure physically.<br>" +
                        "<br><b>Time the Seizure:</b><br> If the seizure lasts more than 5 minutes, call for an ambulance immediately.<br>" +
                        "<br><b>Post-Seizure Care:</b><br> After the seizure, help the person into a safe position (on their side, with their head slightly tilted). Stay with them until they regain full consciousness.<br><br>" +

                        "<b>D. Heart Attack or Chest Pain</b><br><br>" +
                        "<b>Recognize Symptoms:</b><br> Chest pain or pressure, shortness of breath, dizziness, sweating, nausea, pain in the arm, back, neck, or jaw.<br>" +
                        "<br><b>Call for Help:</b> <br>Immediately call 911 for medical assistance.<br>" +
                        "<br><b>Comfort the Person:</b> <br>Help the person sit down and stay calm. Do not allow them to lie down unless they must.<br>" +
                        "<br><b>Aspirin (If Appropriate):</b> <br>If the person is conscious and not allergic, offer them an aspirin to chew slowly, which may help reduce the severity of a heart attack. However, only do this if advised by a medical professional.<br><br>" +

                        "<b>E. Severe Bleeding</b><br><br>" +
                        "<b>Control the Bleeding:</b><br> Apply direct pressure to the wound using a clean cloth or bandage. If bleeding is severe, elevate the injured area above heart level if possible.<br>" +
                        "<br><b>Cover the Wound:</b><br> Once the bleeding is under control, cover the wound with a sterile dressing or bandage.<br>" +
                        "<br><b>Seek Medical Help:</b> <br>If bleeding does not stop after 10-15 minutes of direct pressure or if the wound is very deep, call for an ambulance immediately.<br><br>" +

                        "<b>F. Broken Bones or Sprains</b><br><br>" +
                        "<b>Recognize Symptoms:</b><br> Swelling, bruising, difficulty moving a limb, or visible deformity in the bone.<br>" +
                        "<br><b>Do Not Move the Person:</b><br> Avoid moving the person unless they are in immediate danger. For a suspected broken bone, immobilize the area using a splint or make-shift support (e.g., a rolled towel or clothing).<br>" +
                        "<br><b>Ice the Injury:</b><br> Apply ice to reduce swelling if possible.<br>" +
                        "<br><b>Seek Medical Attention:</b><br> Call for medical help to transport the person to the hospital for further evaluation.<br><br>" +

                        "<b>G. Heatstroke or Heat Exhaustion</b><br><br>" +
                        "<b>Recognize Symptoms:</b><br> Dizziness, nausea, sweating, confusion, rapid pulse, skin that is hot to the touch.<br>" +
                        "<br><b>Move to a Cooler Place:</b><br> Get the person to a shaded or air-conditioned area.<br>" +
                        "<br><b>Hydrate:</b><br> Offer water or electrolyte solutions, but avoid sugary or caffeinated drinks.<br>" +
                        "<br><b>Cool the Person:</b><br> Use cool, damp cloths on the person's forehead and neck, or use a fan to help lower body temperature.<br>" +
                        "<br><b>Seek Medical Help:</b><br> If the person’s condition does not improve quickly, call for an ambulance.<br><br>" +

                        "<b>3. General First Aid for Minor Injuries</b><br><br>" +

                        "<b>A. Cuts and Scrapes</b><br><br>" +
                        "<b>Clean the Wound:</b><br> Wash the area with clean water and mild soap.<br>" +
                        "<br><b>Stop the Bleeding:</b><br> Apply direct pressure to the cut. Once bleeding stops, cover with a sterile bandage or dressing.<br>" +
                        "<br><b>Watch for Infection:</b><br> Advise the person to avoid touching the wound and to wash the area regularly. If redness, swelling, or pus occurs, seek medical attention.<br><br>" +

                        "<b>B. Burns</b><br><br>" +
                        "<b>Cool the Burn:</b> <br>Run cool (not cold) water over the burn for at least 10-15 minutes or apply a clean, cool cloth.<br>" +
                        "<br><b>Cover the Burn:</b><br> Once cooled, cover the burn with a sterile bandage or cloth. Do not apply creams, oils, or ice directly on the burn.<br>" +
                        "<br><b>Seek Medical Help:</b><br> For burns that blister or cover a large area, call for medical assistance.<br><br>" +


                        "<b>4. School Emergency Contacts</b><br><br>" +

                        "<b>A. Emergency Numbers</b><br><br>" +
                        "<b>Ambulance (Emergency Medical Services):</b> 911<br>" +
                        "<br><b>Local Police Station:</b> [Insert contact number]<br>" +
                        "<br><b>Fire Department:</b> [Insert contact number]<br>" +
                        "<br><b>Nearest Hospital:</b> [Insert contact number]<br>" +
                        "<br><b>School Health Office:</b> [Insert contact number]<br><br>" +

                        "<b>B. First Aid Kit</b><br><br>" +
                        "Ensure that a well-stocked first aid kit is easily accessible in multiple locations throughout the school, especially in areas with high foot traffic, sports facilities, and classrooms. The kit should include:<br>" +
                        "<br>- Bandages, gauze, and medical tape<br>" +
                        "- Antiseptic wipes or solutions<br>" +
                        "- Sterile dressing pads<br>" +
                        "- Scissors, tweezers, and gloves<br>" +
                        "- Pain relievers (e.g., paracetamol, ibuprofen)<br>" +
                        "- A thermometer<br>" +
                        "- Burn cream or gel<br>" +
                        "- Epinephrine auto-injectors (for students with known severe allergies)<br><br>" +

                        "<b>5. Post-Emergency Procedures</b><br><br>" +

                        "<b>A. Report the Incident</b><br><br>" +
                        "Document the health emergency and inform the school clinic or emergency response team.<br><br>" +

                        "<b>B. Notify Parents/Guardians</b><br><br>" +
                        "Contact the parents or guardians of the student involved in the emergency to inform them of the situation.<br><br>" +

                        "<b>C. Counseling and Support</b><br><br>" +
                        "Provide emotional support to affected students and staff. Health emergencies can be traumatic, and counseling may be needed afterward.<br><br>" +

                        "<b>D. Review Procedures</b><br><br>" +
                        "After the incident, review the school’s response and procedures to identify areas for improvement.<br><br>" +

                        "By having clear procedures in place and ensuring that all staff members are trained in basic first aid and emergency response, the school can effectively manage health emergencies and minimize risk to students and staff. Regular drills and maintaining open communication are essential for creating a safe environment for everyone.";
    }
}
