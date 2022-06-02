<?xml version="1.0" encoding="utf-8"?>

<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@drawable/whatsapp_image_2022_05_12_at_10_47_43"
    tools:context=".MainActivity">

    <EditText
        android:id="@+id/logintxt"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        android:layout_marginTop="50dp"
        android:layout_marginEnd="8dp"
        android:ems="10"
        android:hint="Login"
        android:inputType="textPersonName"
        android:textAlignment="center"
        android:textColor="#FFFFFF"
        android:textColorHint="#FFFFFF"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView"
        app:layout_constraintVertical_bias="0.0" />

    <EditText
        android:id="@+id/senhatxt"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        android:layout_marginTop="30dp"
        android:layout_marginEnd="8dp"
        android:ems="10"
        android:hint="senha"
        android:inputType="textPersonName"
        android:textAlignment="center"
        android:textColor="#FFFFFF"
        android:textColorHint="#FFFFFF"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/logintxt"
        app:layout_constraintVertical_bias="0.0" />

    <Button
        android:id="@+id/botao_cadastro"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        android:layout_marginTop="20dp"
        android:layout_marginEnd="8dp"
        android:backgroundTint="#000000"
        android:onClick="botao_cadastro"
        android:text="Cadastro"
        android:textColor="#FFFFFF"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/button2"
        app:layout_constraintVertical_bias="0.060000002" />

    <Button
        android:id="@+id/button2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        android:layout_marginTop="50dp"
        android:layout_marginEnd="8dp"
        android:backgroundTint="#000000"
        android:onClick="botao_entrar"
        android:text="Login"
        android:textColor="#FFFCFC"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/senhatxt"
        app:layout_constraintVertical_bias="0.0" />

    <TextView
        android:id="@+id/textView"
        android:layout_width="216dp"
        android:layout_height="86dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="50dp"
        android:layout_marginEnd="8dp"
        android:text="Teste Vocacional"
        android:textColor="#FFFFFF"
        android:textColorHint="#FFFFFF"
        android:textSize="34sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.0" />

</androidx.constraintlayout.widget.ConstraintLayout>
