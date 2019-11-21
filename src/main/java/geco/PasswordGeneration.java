package geco;

public abstract  class PasswordGeneration {




    /**
     *
     * renvoit un mot de passe généré aléatoirement de 8 caractère
     * @return String
     */

    public static String getRandomPassword() {
        String mdp = "";
        double nb;
        for (int i = 0; i < 8; ++i) {
            nb = 33 + (Math.random() * (122 - 33));
            mdp += (char)nb;
        }
        return mdp;
    }

}
