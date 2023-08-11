import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import com.example.ex1_login.R


class LoginActivity : AppCompatActivity() {

    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var termsCheckBox: CheckBox
    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_screen)

        usernameEditText = findViewById(R.id.usernameEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        termsCheckBox = findViewById(R.id.termsCheckBox)
        loginButton = findViewById(R.id.loginButton)

        loginButton.setOnClickListener {
            performLogin()
        }
    }


    private fun performLogin() {
        val username = usernameEditText.text.toString()
        val password = passwordEditText.text.toString()
        val termsAccepted = termsCheckBox.isChecked

        if (username.isNotEmpty() && password.isNotEmpty() && termsAccepted) {
            // Aqui você pode implementar a lógica de autenticação
            // Por enquanto, apenas mostraremos uma mensagem de sucesso.
            showToast("Login bem-sucedido!")
        } else {
            showToast("Preencha todos os campos e aceite os termos.")
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}