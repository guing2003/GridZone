import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.guilhermedelecrode.gridzone.R
import com.guilhermedelecrode.gridzone.data.model.Calendario

class CalendarioFragmentAdapter(
    private val listaCalendario: List<Calendario>,
    private val listener: (Calendario) -> Unit
) :
    RecyclerView.Adapter<CalendarioFragmentAdapter.CalendarioViewHolder>() {


    class CalendarioViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //val imgPiloto: ImageView = itemView.findViewById(R.id.imagem_piloto_fragment)
        val nomeCorrida: TextView = itemView.findViewById(R.id.nome_corrida_fragment)
        val data: TextView = itemView.findViewById(R.id.data_corrida_fragment)

        fun bind(item: Calendario, listener: (Calendario) -> Unit) {
            nomeCorrida.text = item.nome
            data.text = item.data

            itemView.setOnClickListener { listener(item) }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CalendarioViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.calendario_item_layout, parent, false)
        return CalendarioViewHolder(view)
    }


    override fun onBindViewHolder(holder: CalendarioViewHolder, position: Int) {
        val piloto = listaCalendario[position]
        holder.bind(piloto, listener)
    }


    override fun getItemCount() = listaCalendario.size
}
