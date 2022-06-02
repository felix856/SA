<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@drawable/whatsapp_image_2022_05_12_at_10_47_43"
    tools:context=".perguntas">

    <RadioGroup
        android:id="@+id/RG"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView4"
        app:layout_constraintVertical_bias="0.73">

        <RadioButton
            android:id="@+id/rb1"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:buttonTint="#FF0000"
            android:textColorLink="#FF0000" />

        <RadioButton
            android:id="@+id/rb2"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:buttonTint="#C31A1A"
            android:textColorLink="#FF0202" />

        <RadioButton
            android:id="@+id/rb3"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:buttonTint="#9F2A2A"
            android:textColorLink="#FB0B0B" />

        <RadioButton
            android:id="@+id/rb4"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:buttonTint="#CAB70E"
            android:textColorLink="#E4D01C" />

        <RadioButton
            android:id="@+id/rb5"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:buttonTint="#1DCF24"
            android:textColor="#DFDEDE"
            android:textColorHint="#803131"
            android:textColorLink="#20D627" />

        <RadioButton
            android:id="@+id/rb6"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:buttonTint="#10E318"
            android:textColorLink="#18C61F" />

        <RadioButton
            android:id="@+id/rb7"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:buttonTint="#00FF0A"
            android:textColorLink="#1BCC22" />
    </RadioGroup>

    <TextView
        android:id="@+id/textView3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        android:layout_marginTop="50dp"
        android:layout_marginEnd="8dp"
        android:text="Pergunta"
        android:textColor="#FFFFFF"
        android:textSize="24sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.0" />

    <TextView
        android:id="@+id/textView4"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="20dp"
        android:text="TextView"
        android:textColor="#FFFFFF"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView3" />

    <Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="20dp"
        android:layout_marginEnd="50dp"
        android:backgroundTint="#362D4C"
        android:onClick="selecionar"
        android:text="Selecionar"
        android:textColor="#FFFFFF"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/RG"
        app:layout_constraintVertical_bias="0.0" />

    <Button
        android:id="@+id/button3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        android:layout_marginTop="20dp"
        android:backgroundTint="#362D4C"
        android:onClick="cancelar"
        android:text="Cancelar"
        android:textColor="#FFFFFF"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toStartOf="@+id/button"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/RG"
        app:layout_constraintVertical_bias="0.0" />

</androidx.constraintlayout.widget.ConstraintLayout>
