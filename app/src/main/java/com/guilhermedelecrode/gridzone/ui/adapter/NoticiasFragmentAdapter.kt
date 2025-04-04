import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.guilhermedelecrode.gridzone.R
import com.guilhermedelecrode.gridzone.data.model.Noticia

class NoticiasFragmentAdapter(
    private val lista: List<Noticia>
) : RecyclerView.Adapter<NoticiasFragmentAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imagem: ImageView = view.findViewById(R.id.imagem_fragment_noticia)
        val titulo: TextView = view.findViewById(R.id.titulo_fragment_noticia)
        val subtitulo: TextView = view.findViewById(R.id.subtitulo_fragment_noticia)
        val data: TextView = view.findViewById(R.id.data_fragment_noticia)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.noticia_item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = lista.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val noticia = lista[position]
        holder.titulo.text = noticia.titulo
        holder.subtitulo.text = noticia.subtitulo
        holder.data.text = noticia.dataPublicacao

        holder.imagem.load(noticia.imagemUrl.ifEmpty { R.drawable.imagem_padrao })

    }
}
