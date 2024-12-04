package com.mobdeve.group5.archersnav;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class BullyingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bullying);

        TextView procedureTextView = findViewById(R.id.procedureTextView);
        procedureTextView.setText(Html.fromHtml(getBullyingPreventionProcedureText()));
    }

    private String getBullyingPreventionProcedureText() {
        return
                "This procedure aims to promote a safe, respectful, and supportive learning environment in schools by providing guidelines on how to prevent and respond to violence and bullying incidents. It outlines the steps students, teachers, and staff should take when dealing with violence or bullying, ensuring that every person in the school community feels protected and supported.<br><br>" +
                "<b>Defining Violence and Bullying</b><br><br>" +
                "<b>A. Violence</b><br>" +
                "Violence refers to any behavior that causes harm or threatens to harm another person physically, emotionally, or psychologically. This can include physical fights, verbal abuse, threats, harassment, and other forms of aggression.<br><br>" +

                "<b>B. Bullying:</b><br>" +
                "Bullying is a repetitive, intentional behavior meant to harm, intimidate, or control another person. It can occur in various forms:<br><br>" +

                "<b>Physical Bullying:</b><br>" +
                "Hitting, pushing, tripping, or any other form of physical harm.<br><br>" +

                "<b>Verbal Bullying:</b><br>" +
                "Name-calling, insults, teasing, or making threats.<br><br>" +

                "<b>Social/Relational Bullying:</b><br>" +
                "Spreading rumors, excluding someone from social groups, or deliberately isolating someone.<br><br>" +

                "<b>Cyberbullying:</b><br>" +
                "Using digital platforms (social media, text messages, etc.) to harass, threaten, or hurt others.<br><br>" +

                        "<b>2. Prevention of Violence and Bullying</b><br>" +
                        "Preventing violence and bullying involves creating a culture of respect, kindness, and inclusion. " +
                        "The school should take proactive steps to discourage harmful behavior and promote positive relationships among students.<br><br>" +

                        "<b>A. School Policies:</b><br><br>" +
                        "<b>Zero-Tolerance Policy:</b><br> Establish a clear 'zero tolerance' policy for violence and bullying. All incidents must be taken seriously, with appropriate actions taken to ensure safety.<br>" +
                        "<b><br>Code of Conduct:</b><br> Ensure all students, staff, and parents are familiar with the school's rules on behavior, including specific consequences for bullying or violence.<br><br>" +

                        "<b>B. Awareness Programs:</b><br><br>" +
                        "<b>Anti-Bullying Campaigns:</b><br> Organize regular awareness campaigns and activities to teach students about bullying prevention, conflict resolution, and empathy.<br>" +
                        "<br><b>Workshops and Trainings:</b><br> Offer training programs for teachers, staff, and students on how to recognize and respond to bullying and violence.<br>" +
                        "<br><b>Inclusion Programs:</b><br> Promote diversity and inclusion in school activities to encourage acceptance and understanding among students from different backgrounds.<br><br>" +

                        "<b>C. Peer Support and Mentoring:</b><br>" +
                        "<b>Buddy Systems:</b> <br>Pair older students with younger ones to provide mentorship and guidance, helping to prevent bullying and build positive relationships.<br>" +
                        "<b><br>Peer Mediation:</b> <br>Train students to mediate conflicts between peers in a constructive manner.<br><br>" +

                        "<b>3. Immediate Actions When Bullying or Violence Occurs:</b><br>" +
                        "If a bullying or violent incident is witnessed or reported, immediate action should be taken to ensure the safety of the victim and hold the perpetrator accountable.<br><br>" +

                        "<b>A. For Students:</b><br><br>" +
                        "<b>If You Are a Victim of Bullying or Violence:</b><br>" +
                        "<b>Speak Up:</b> <br>Report the incident to a teacher, school counselor, or trusted adult. If you feel unsafe doing so, ask a friend to report it for you.<br>" +
                        "<b><br>Do Not Retaliate:</b> <br>Responding with violence or aggression can escalate the situation. It is important to stay calm and seek help.<br>" +
                        "<b><br>Document the Incident:</b> <br>If possible, write down what happened, when, where, and who was involved. This can help when reporting the incident.<br>" +
                        "<b><br>If You Are a Witness:</b><br>" +
                        "<b><br>Intervene Safely:</b><br> If you feel safe, try to stop the bullying or violence by speaking out. Say something like, 'Stop, that’s not okay,' or 'Leave them alone.'<br>" +
                        "<b><br>Report the Incident:</b> <br>Report what you saw to a teacher or school staff member, even if the bullying was not directed at you.<br><br>" +

                        "<b>B. For Teachers and Staff:</b><br><br>" +
                        "<b>Intervene Immediately:</b><br><br>" +
                        "<b>Ensure Safety First:</b><br> Separate the individuals involved to prevent further harm. If the situation is violent, call for assistance from school security or the school officials immediately.<br>" +
                        "<b><br>Stay Calm:</b><br>Approach the situation in a calm and non-confrontational manner. Avoid escalation.<br>" +
                        "<b><br>Provide Support to the Victim:</b><br>" +
                        "<b><br>Ensure Emotional Support:</b><br> Reassure the victim that they are safe and offer support. Take them to a quiet area if necessary.<br>" +
                        "<b><br>Document the Incident:</b><br> Record all relevant details of the incident (e.g., time, location, individuals involved, nature of the bullying or violence) to ensure proper follow-up.<br>" +
                        "<b><br>Take Action Against the Perpetrator:</b><br>" +
                        "<b><br>Assess the Situation:</b><br> Determine whether the behavior constitutes bullying or violence. If bullying, ensure it is addressed according to school policy.<br>" +
                        "<b><br>Hold the Perpetrator Accountable:</b><br> Implement consequences as per the school's Code of Conduct, which may include disciplinary action such as warnings, suspension, or counseling.<br>" +
                        "<b><br>Notify Parents:</b><br> Inform the parents or guardians of both the victim and the perpetrator to discuss the incident and necessary steps.<br>" +
                        "<b><br>Follow-Up:</b><br>" +
                        "<b><br>Monitor the Situation:</b><br> Continue to check on the well-being of both the victim and the perpetrator. Ensure that the bullying does not recur.<br>" +
                        "<b><br>Counseling and Support:</b> <br>Arrange counseling or other interventions for the victim and/or perpetrator if necessary to address the emotional impact of the incident.<br><br>" +

                        "<b>4. Reporting Mechanisms</b><br><br>" +
                        "Encourage an open environment where students and staff feel comfortable reporting incidents of bullying or violence.<br><br>" +

                        "<b>A. Report Channels:</b><br><br>" +
                        "<b>Anonymous Reporting:</b> <br>Set up an anonymous reporting system, such as a suggestion box or an online form, for students who feel uncomfortable reporting bullying directly.<br>" +
                        "<br><b>Designated Staff Member:</b> <br>Assign a counselor, school officials, or another trusted adult to handle bullying and violence reports. Ensure they are trained in addressing such issues appropriately.<br><br>" +

                        "<b>B. Incident Documentation and Tracking:</b><br><br>" +
                        "<b>Keep Detailed Records:</b> <br>Document all incidents of bullying and violence, including actions taken and any outcomes. This helps track patterns of behavior and measure the effectiveness of interventions.<br>" +
                        "<br><b>Follow-Up Action:</b> <br>Ensure that every report is followed up on in a timely manner, with the situation reviewed and resolved.<br><br>" +

                        "<b>5. Consequences for Bullying and Violence</b><br><br>" +

                        "<b>A. Disciplinary Action:</b><br>" +
                        "<br><b>Immediate Consequences:</b> <br>Depending on the severity of the incident, consequences may include detention, suspension, or expulsion.<br>" +
                        "<br><b>Restorative Justice:</b> <br>In cases of bullying, a restorative approach may be taken, where the perpetrator meets with the victim to understand the impact of their actions and make amends.<br>" +
                        "<br><b>Counseling or Behavioral Programs:</b> <br>The perpetrator may be required to attend counseling or anger management programs to address the underlying causes of their behavior.<br><br>" +

                        "<b>B. Consequences for School Staff:</b><br><br>" +
                        "<b>Failure to Act:</b> <br>Teachers, staff, or administrators who fail to intervene or respond appropriately to bullying or violence may face disciplinary actions as well, including warnings or termination, depending on the severity of the negligence.<br><br>" +

                        "<b>6. Post-Incident Support</b><br><br>" +

                        "<b>A. For Victims:</b><br><br>" +
                        "<b>Counseling Services:</b> <br>Provide counseling to help the victim deal with the emotional effects of bullying or violence.<br>" +
                        "<br><b>Safe Environment:</b> <br>Ensure that the victim feels safe and supported at school. Monitor the situation closely to prevent reoccurrence.<br><br>" +

                        "<b>B. For Perpetrators:</b><br><br>" +
                        "<b>Behavioral Counseling:</b> <br>Offer counseling and programs aimed at changing the behavior of the perpetrator, addressing underlying issues like anger management or social skills.<br>" +
                        "<br><b>Accountability and Reflection:</b><br> Help the perpetrator understand the impact of their actions and provide an opportunity for them to take responsibility for their behavior.<br><br>" +
                        "<b>7. Role of Parents and Guardians</b><br><br>" +

                        "<b>Communication with the School:</b> <br>Parents should be informed if their child is involved in a bullying incident, whether as a victim or perpetrator, and should work with the school to find a resolution.<br>" +
                        "<br><b>Supporting Positive Behavior at Home:</b> <br>Parents should model respectful behavior, teach empathy, and encourage open communication with their children.<br><br>" +

                        "<b>REMEMBER:</b>Violence and bullying have no place in a safe school environment. By working together—students, teachers, staff, and parents—we can foster a culture of respect, kindness, and inclusion, ensuring that every student feels safe and valued. " +
                        "<br><br>Immediate action, effective prevention programs, and a commitment to supporting all students can significantly reduce incidents of bullying and violence in schools.<br><br>";
    }
}
