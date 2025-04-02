import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.guilhermedelecrode.gridzone.R
import com.guilhermedelecrode.gridzone.data.model.Equipe
import com.guilhermedelecrode.gridzone.data.model.Piloto

class EquipeFragmentAdapter(private val listaEquipes: List<Equipe>,
                            private val listener: (Equipe) -> Unit) :
    RecyclerView.Adapter<EquipeFragmentAdapter.EquipeViewHolder>() {


    class EquipeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //val imgPiloto: ImageView = itemView.findViewById(R.id.imagem_piloto_fragment)
        val nomeEquipe: TextView = itemView.findViewById(R.id.nome_equipe_fragment)
        val motorEquipe: TextView = itemView.findViewById(R.id.motor_equipe_fragment)

        fun bind(item: Equipe, listener: (Equipe) -> Unit) {
            nomeEquipe.text = item.nome
            motorEquipe.text = item.motor

            // Adiciona o clique ao item
            itemView.setOnClickListener { listener(item) }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EquipeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.equipe_item_layout, parent, false)
        return EquipeViewHolder(view)
    }


    override fun onBindViewHolder(holder: EquipeViewHolder, position: Int) {
        val equipe = listaEquipes[position]
        holder.bind(equipe, listener)


    }


    override fun getItemCount() = listaEquipes.size
}
