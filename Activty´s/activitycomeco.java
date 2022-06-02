<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@drawable/whatsapp_image_2022_05_12_at_10_47_43"
    tools:context=".Comeco">

    <TextView
        android:id="@+id/textView2"
        android:layout_width="317dp"
        android:layout_height="192dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="10dp"
        android:layout_marginEnd="8dp"
        android:text="Seja bem vindo ao nosso teste vocacional para encontrar o seu curso ideal ou algo que seja parecido com suas características, aqui faremos perguntas sobre seu estilo de vida e como reagiria a algum tipo de situação cotidiana, o que nos levará a conhecer você melhor e encaixa-lo em um curso que combina com os resultados."
        android:textColor="#FFFFFF"
        android:textColorHint="#F3F3F3"
        android:textSize="18sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.544"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.0" />

    <Button
        android:id="@+id/botao_escolher"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        android:layout_marginTop="50dp"
        android:layout_marginEnd="8dp"
        android:backgroundTint="#000000"
        android:onClick="escolhe"
        android:text="Escolher"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.21"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView6"
        app:layout_constraintVertical_bias="0.0" />

    <Button
        android:id="@+id/botao_começar"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        android:layout_marginTop="50dp"
        android:layout_marginEnd="8dp"
        android:backgroundTint="#000000"
        android:onClick="entrar"
        android:text="Começar"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toEndOf="@+id/botao_escolher"
        app:layout_constraintTop_toBottomOf="@+id/textView6"
        app:layout_constraintVertical_bias="0.0" />

    <TextView
        android:id="@+id/textView6"
        android:layout_width="317dp"
        android:layout_height="107dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="20dp"
        android:layout_marginEnd="8dp"
        android:text="Se já souber a área que deseja cursar ou tenha alguma preferência clique no botão ‘Escolher’, se não clique em ‘Começar’."
        android:textColor="#FFFFFF"
        android:textColorHint="#FFFFFF"
        android:textSize="18sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView2"
        app:layout_constraintVertical_bias="0.0" />

</androidx.constraintlayout.widget.ConstraintLayout>
