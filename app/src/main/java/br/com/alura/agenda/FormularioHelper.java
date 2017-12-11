package br.com.alura.agenda;

import android.widget.EditText;
import android.widget.RatingBar;

import br.com.alura.agenda.modelo.Aluno;

/**
 * Created by yukio on 11/3/17.
 */

class FormularioHelper {
    private final EditText campoNome;
    private final EditText campoEndereco;
    private final EditText campoSite;
    private final RatingBar campoNota;
    private final EditText campoTelefone;
    private Aluno aluno;

    public FormularioHelper(FormularioActivity activity){
        this.campoNome = (EditText) activity.findViewById(R.id.formulario_nome);
        this.campoEndereco = (EditText) activity.findViewById(R.id.formulario_endereco);
        this.campoSite = (EditText) activity.findViewById(R.id.formulario_site);
        this.campoTelefone = (EditText) activity.findViewById(R.id.formulario_telefone);
        this.campoNota = (RatingBar) activity.findViewById(R.id.formulario_nota);
        this.aluno = new Aluno();

    }

    public Aluno pegaAluno() {
        aluno.setNome(campoNome.getText().toString());
        aluno.setEndereco(campoEndereco.getText().toString());
        aluno.setSite(campoSite.getText().toString());
        aluno.setTelefone(campoTelefone.getText().toString());
        aluno.setNota(Double.valueOf(campoNota.getProgress()));
        return aluno;
    }

    public void preencheFormulario(Aluno aluno) {
        campoNome.setText(aluno.getNome());
        campoTelefone.setText(aluno.getTelefone());
        campoSite.setText(aluno.getSite());
        campoEndereco.setText(aluno.getEndereco());
        campoNota.setProgress(aluno.getNota().intValue());
        this.aluno = aluno;
    }
}
