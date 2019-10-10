var text_script = document.querySelector("#script_program");
var code = text_script.value;
var result = "";
var text_name_program = document.querySelector("#name_program");
var text_colors = document.querySelector("#text-colors");
/*let text_result = document.querySelector("#result_program");*/
let logger = document.getElementById("result_program");
var btn_colors = document.querySelector("#btn-colors");
var btn_ejecutar = document.querySelector("#btn-ejecutar");
var btn_limpiar = document.querySelector("#btn-limpiar");

var div_color_palette = document.querySelector("#color-palette");

btn_colors.onclick = function() {
	if(btn_colors.classList.contains("fa-chevron-up")) {
		btn_colors.classList.remove("fa-chevron-up");
		btn_colors.classList.add("fa-chevron-down");
		div_color_palette.style.display = "none";
		text_colors.textContent = "Mostrar paleta de colores";
	} else {
		btn_colors.classList.remove("fa-chevron-down");
		btn_colors.classList.add("fa-chevron-up");
		div_color_palette.style.display = "block";
		text_colors.textContent = "Ocultar paleta de colores";
	}
}

btn_limpiar.onclick = function() {
	logger.textContent = "";
};

btn_ejecutar.onclick = function() {
	try {
		// Adding log method from our console object
		console.log = text =>
		{
			let element = document.createElement("div");
			let txt = document.createTextNode(text);
		
			element.appendChild(txt);
			logger.appendChild(element);
		}

		code = text_script.value;
		if(code == "") {
			text_result.value = "Nada que analizar...";
		} else {
            // testing
			eval(code);
		}
	} catch (Ex) {
		console.log(Ex);
	}
}