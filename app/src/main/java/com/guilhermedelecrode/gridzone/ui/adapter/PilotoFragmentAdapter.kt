import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.guilhermedelecrode.gridzone.R
import com.guilhermedelecrode.gridzone.data.model.Piloto

class PilotoFragmentAdapter(
    private val listaPilotos: List<Piloto>,
    private val listener: (Piloto) -> Unit
) : RecyclerView.Adapter<PilotoFragmentAdapter.PilotoViewHolder>() {

    class PilotoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nomePiloto: TextView = itemView.findViewById(R.id.nome_piloto_fragment)
        val siglaPiloto: TextView = itemView.findViewById(R.id.sigla_piloto_fragment)
        val equipePiloto: TextView = itemView.findViewById(R.id.equipe_piloto_fragment)
        val numeroPiloto: TextView = itemView.findViewById(R.id.numero_piloto_fragment)

        fun bind(item: Piloto, listener: (Piloto) -> Unit) {
            nomePiloto.text = item.nome
            siglaPiloto.text = item.sigla
            equipePiloto.text = item.equipe
            numeroPiloto.text = item.numero.toString()

            // Adiciona o clique ao item
            itemView.setOnClickListener { listener(item) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PilotoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.piloto_item_layout, parent, false)
        return PilotoViewHolder(view)
    }

    override fun onBindViewHolder(holder: PilotoViewHolder, position: Int) {
        val piloto = listaPilotos[position]
        holder.bind(piloto, listener)
    }

    override fun getItemCount() = listaPilotos.size
}
