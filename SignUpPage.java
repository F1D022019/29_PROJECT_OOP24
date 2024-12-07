import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;

public class SignUpPage extends JFrame {
    public SignUpPage() {
        setTitle("Sign Up - SaSaMbo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(800, 600);

        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(new Color(51, 102, 0));
        leftPanel.setLayout(new BorderLayout());
        JLabel illustration = new JLabel(new ImageIcon("C:\\Users\\ADIT\\OneDrive\\Documents\\SEMESTER 5\\PBO\\coba\\ppp\\asset\\foto animasi sasambo.png")); // Add illustration image
        leftPanel.add(illustration, BorderLayout.CENTER);
        leftPanel.add(new JLabel("Jelajahi warisan, temukan sejarah dan hayati budaya!"), BorderLayout.SOUTH);
        add(leftPanel, BorderLayout.WEST);

        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new GridBagLayout());
        rightPanel.setBackground(Color.WHITE);

        JLabel logo = new JLabel("SaSaMbo");
        logo.setFont(new Font("SansSerif", Font.BOLD, 24));
        logo.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel createAccount = new JLabel("Buat Akun");
        createAccount.setFont(new Font("SansSerif", Font.PLAIN, 16));

        JButton googleSignUp = new JButton("Daftar dengan Google");
        JButton facebookSignUp = new JButton("Daftar dengan Facebook");

        JLabel orLabel = new JLabel("-OR-");

        JTextField usernameField = new JTextField(20);
        usernameField.setBorder(BorderFactory.createTitledBorder("Nama Pengguna"));

        JTextField emailField = new JTextField(20);
        emailField.setBorder(BorderFactory.createTitledBorder("Alamat Email"));

        JPasswordField passwordField = new JPasswordField(20);
        passwordField.setBorder(BorderFactory.createTitledBorder("Kata Sandi"));

        JButton signUpButton = new JButton("Sign Up");
        JLabel loginLabel = new JLabel("Sudah punya akun? Login");
        loginLabel.setForeground(Color.BLUE);
        loginLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        // Action Listeners
        loginLabel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dispose();
                new LoginPage().setVisible(true);
            }
        });

        signUpButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "Account Created Successfully!"));

        // Adding Components
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        rightPanel.add(logo, gbc);

        gbc.gridy++;
        rightPanel.add(createAccount, gbc);

        gbc.gridy++;
        rightPanel.add(googleSignUp, gbc);

        gbc.gridy++;
        rightPanel.add(facebookSignUp, gbc);

        gbc.gridy++;
        rightPanel.add(orLabel, gbc);

        gbc.gridy++;
        rightPanel.add(usernameField, gbc);

        gbc.gridy++;
        rightPanel.add(emailField, gbc);

        gbc.gridy++;
        rightPanel.add(passwordField, gbc);

        gbc.gridy++;
        rightPanel.add(signUpButton, gbc);

        gbc.gridy++;
        rightPanel.add(loginLabel, gbc);

        add(rightPanel, BorderLayout.CENTER);
    }
}
