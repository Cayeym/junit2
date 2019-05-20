# Test dels accessors?
_____________________________________________________________________
Té sentit si quan fas el set o al get no es unicament this.x = x o return x, ja que en aquest cas els getters i els
setters no poden ser trencats, ja que unicament estas retornant o assignant un valor, en canvi, si el setter es molt
més ampli, amb ifs o coses així, llavors si que pot ser recomendable fer-ho i aixi asegurar-se de que
tot funcioni be