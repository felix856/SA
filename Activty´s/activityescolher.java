<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@drawable/whatsapp_image_2022_05_12_at_10_47_43"
    tools:context=".escolher">

    <RadioGroup
        android:id="@+id/grupo"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        android:layout_marginTop="10dp"
        android:layout_marginEnd="8dp"
        android:orientation="vertical"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.0">


        <RadioButton
            android:id="@+id/Cagra"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Ciências Agrárias "
            android:textColor="#FFFFFF" />

        <RadioButton
            android:id="@+id/Cbio"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Ciências Biológicas "
            android:textColor="#FFFFFF" />

        <RadioButton
            android:id="@+id/Csau"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Ciências da Saúde "
            android:textColor="#FAFAFA" />

        <RadioButton
            android:id="@+id/Cexa"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Ciências Exatas e da Terra "
            android:textColor="#FFFFFF" />

        <RadioButton
            android:id="@+id/Enge"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Engenharias"
            android:textColor="#F1ECEC" />

        <RadioButton
            android:id="@+id/Chum"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Ciências Humanas "
            android:textColor="#FFFFFF" />

        <RadioButton
            android:id="@+id/Csoc"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Ciências Sociais Aplicadas "
            android:textColor="#FAFAFA" />

        <RadioButton
            android:id="@+id/Ling"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Linguística, Letras e Artes "
            android:textColor="#FFFFFF" />
    </RadioGroup>

    <Button
        android:id="@+id/button4"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        android:layout_marginTop="20dp"
        android:backgroundTint="#362D4C"
        android:onClick="cancelar"
        android:text="Cancelar"
        android:textColor="#FFFFFF"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.25"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/grupo"
        app:layout_constraintVertical_bias="0.0" />

    <Button
        android:id="@+id/button5"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="10dp"
        android:layout_marginEnd="8dp"
        android:backgroundTint="#362D4C"
        android:onClick="começar"
        android:text="Começar"
        android:textColor="#FFFFFF"
        app:layout_constraintBottom_toBottomOf="@+id/button4"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.42"
        app:layout_constraintStart_toEndOf="@+id/button4"
        app:layout_constraintTop_toTopOf="@+id/button4"
        app:layout_constraintVertical_bias="0.9" />

</androidx.constraintlayout.widget.ConstraintLayout>
