package com.mobdeve.group5.archersnav;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class HelpSupportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help_support_activity);

        TextView procedureTextView = findViewById(R.id.procedureTextView);
        procedureTextView.setText(Html.fromHtml(getHelpAndSupportText()));
    }

    private String getHelpAndSupportText() {
        return
                "The Help & Support section of your mobile application serves as a vital resource for users who may encounter issues, need guidance, or seek assistance while using the app. A well-organized and user-friendly help section can significantly enhance user experience, reduce frustration, and ensure that users can resolve problems quickly.<br><br>" +

                        "<b>Frequently Asked Questions (FAQs)</b><br><br>" +
                        "Find answers to common questions about using the app, account management, troubleshooting, and more.<br><br>" +

                        "<b>How do I create a new account?</b><br>" +
                        "1. Open the app and click on Sign Up.<br>" +
                        "2. Enter your email address and set a password.<br>" +
                        "3. Follow the instructions sent to your email to verify your account.<br>" +
                        "4. Once verified, you can log in and start using the app!<br><br>" +

                        "<b>How do I reset my password?</b><br>" +
                        "1. On the login screen, click on Forgot Password.<br>" +
                        "2. Enter the email address associated with your account.<br>" +
                        "3. Check your inbox for a password reset link and follow the instructions.<br><br>" +

                        "<b>How can I update my profile information?</b><br>" +
                        "1. Go to the Profile section in the app settings.<br>" +
                        "2. Tap on Edit Profile to update your name, email, and other details.<br>" +
                        "3. Save the changes to update your profile.<br><br>" +

                        "<b>What should I do if the app crashes or freezes?</b><br>" +
                        "1. Try restarting the app.<br>" +
                        "2. Ensure that you have the latest version of the app installed.<br>" +
                        "3. If the problem persists, try uninstalling and reinstalling the app.<br><br>" +

                        "<b>How can I contact customer support?</b><br>" +
                        "You can reach us through the Contact Us section below or email us directly at <a href=\"mailto:support@example.com\">support@example.com</a>.<br><br>" +

        "<b>Frequently Asked Questions (FAQs)</b><br><br>" +
                "Find answers to common questions about using the app, account management, troubleshooting, and more.<br><br>" +

                "<b>How do I create a new account?</b><br>" +
                "1. Open the app and click on Sign Up.<br>" +
                "2. Enter your email address and set a password.<br>" +
                "3. Follow the instructions sent to your email to verify your account.<br>" +
                "4. Once verified, you can log in and start using the app!<br><br>" +

                "<b>How do I reset my password?</b><br>" +
                "1. On the login screen, click on Forgot Password.<br>" +
                "2. Enter the email address associated with your account.<br>" +
                "3. Check your inbox for a password reset link and follow the instructions.<br><br>" +

                "<b>How can I update my profile information?</b><br>" +
                "1. Go to the Profile section in the app settings.<br>" +
                "2. Tap on Edit Profile to update your name, email, and other details.<br>" +
                "3. Save the changes to update your profile.<br><br>" +

                "<b>What should I do if the app crashes or freezes?</b><br>" +
                "1. Try restarting the app.<br>" +
                "2. Ensure that you have the latest version of the app installed.<br>" +
                "3. If the problem persists, try uninstalling and reinstalling the app.<br><br>" +

                "<b>How can I contact customer support?</b><br>" +
                "You can reach us through the Contact Us section below or email us directly at <a href=\"mailto:support@example.com\">support@example.com</a>. <br><br>" +

        "<b>Contact Us</b><br>" +
                "If you can’t find the solution in our FAQs or need further assistance, our support team is here to help! You can reach us through any of the following methods:<br><br>" +

                "<b>Email Support:</b><br>" +
                "Send us an email at <a href=\"mailto:support@example.com\">support@example.com</a>. Please provide a detailed description of your issue, along with any relevant screenshots, so we can assist you as quickly as possible.<br><br>" +

                "<b>Phone Support:</b><br>" +
                "If you prefer to speak directly with a representative, call our customer support hotline at [Insert Phone Number]. Our team is available [Business Hours] for any queries or issues you may have.<br><br>" +

        "<b>Privacy & Security:</b><br>" +
                "We take your privacy seriously. To learn about how we protect your personal data, please read our Privacy Policy.<br><br>" +

                "<b>Data Privacy:</b><br>" +
                "We comply with applicable privacy regulations, including the Data Privacy Act of 2012 (Republic Act No. 10173) in the Philippines, ensuring your data is safe and secure.<br><br>" +

                "<b>Account Security:</b><br>" +
                "We recommend using a strong, unique password for your account.<br>" +
                "If you suspect unauthorized access to your account, please contact us immediately.<br><br>" +

        "<b>Privacy & Security</b><br>" +
                "We take your privacy seriously. To learn about how we protect your personal data, please read our Privacy Policy.<br><br>" +

                "<b>Data Privacy:</b><br>" +
                "We comply with applicable privacy regulations, including the Data Privacy Act of 2012 (Republic Act No. 10173) in the Philippines, ensuring your data is safe and secure.<br><br>" +

                "<b>Account Security:</b><br>" +
                "We recommend using a strong, unique password for your account.<br>" +
                "<br>If you suspect unauthorized access to your account, please contact us immediately.<br><br>" +

        "By providing a comprehensive and user-friendly Help & Support section, you empower users to resolve issues on their own, reducing the need for direct support while enhancing their overall experience with your app.";
    }
}