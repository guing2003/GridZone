import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.guilhermedelecrode.gridzone.R
import com.guilhermedelecrode.gridzone.model.PilotoCampeonato

class PilotoCampeonatoFragmentAdapter(private val listaPilotos: List<PilotoCampeonato>) :
    RecyclerView.Adapter<PilotoCampeonatoFragmentAdapter.PilotoCampeonatoViewHolder>() {


    class PilotoCampeonatoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //val imgPiloto: ImageView = itemView.findViewById(R.id.imagem_piloto_fragment)
        val nomePiloto: TextView = itemView.findViewById(R.id.nome_piloto_campeonato_fragment)
        val equipePiloto: TextView = itemView.findViewById(R.id.equipe_piloto_campeonato_fragment)
        val pontuacaoPiloto: TextView = itemView.findViewById(R.id.pontuacao_piloto_campeonato_fragment)


    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PilotoCampeonatoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.piloto_campeonato_layout, parent, false)
        return PilotoCampeonatoViewHolder(view)
    }


    override fun onBindViewHolder(holder: PilotoCampeonatoViewHolder, position: Int) {
        val piloto = listaPilotos[position]
        //holder.imgPiloto.text =  // Define a imagem
        holder.nomePiloto.text = piloto.nome
        holder.pontuacaoPiloto.text = piloto.pontuacao.toString()
        holder.equipePiloto.text = piloto.equipe
    }


    override fun getItemCount() = listaPilotos.size
}
