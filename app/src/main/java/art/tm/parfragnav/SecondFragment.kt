package art.tm.parfragnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import art.tm.parfragnav.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentSecondBinding>(
            inflater,
            R.layout.fragment_second,
            container,
            false )

        val args = SecondFragmentArgs.fromBundle(requireArguments())
        Toast.makeText(context, "Arg: ${args.liczba}", Toast.LENGTH_LONG).show()
        binding.text2.text = args.liczba.toString()

        return binding.root
    }


}