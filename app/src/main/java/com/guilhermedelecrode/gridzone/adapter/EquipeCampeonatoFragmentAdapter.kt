import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.guilhermedelecrode.gridzone.R
import com.guilhermedelecrode.gridzone.model.EquipeCampeonato

class EquipeCampeonatoFragmentAdapter(private val listaEquipe: List<EquipeCampeonato>) :
    RecyclerView.Adapter<EquipeCampeonatoFragmentAdapter.EquipeCampeonatoViewHolder>() {


    class EquipeCampeonatoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //val imgPiloto: ImageView = itemView.findViewById(R.id.imagem_piloto_fragment)
        val nomeEquipe: TextView = itemView.findViewById(R.id.nome_equipe_campeonato_fragment)
        val pontuacaoEquipe: TextView = itemView.findViewById(R.id.pontuacao_equipe_campeonato_fragment)


    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EquipeCampeonatoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.equipe_campeonato_item_layout, parent, false)
        return EquipeCampeonatoViewHolder(view)
    }


    override fun onBindViewHolder(holder: EquipeCampeonatoViewHolder, position: Int) {
        val equipe = listaEquipe[position]
        //holder.imgPiloto.text =  // Define a imagem
        holder.nomeEquipe.text = equipe.nome
        holder.pontuacaoEquipe.text = equipe.pontuacao.toString()
    }


    override fun getItemCount() = listaEquipe.size
}
