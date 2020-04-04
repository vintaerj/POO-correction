# POO-correction

Il s'agit d'un dépot contenant les corrections (subjectives) de TP de POO à l'IUT A.

# Principe de conception


> Identifiez les aspects de votre application qui **varient** et
  séparez-les de ceux qui demeurent **constants**.
  
> Progammer une interface, non une implementation.

> Préférer la composition à l'héritage.

> Efforcer-vous de coupler faiblement les objets qui interagissent.

> Les classes doivent être ouvertes à l'extension, mais fermées à la modification.

> Dépendez d'abstractions. Ne dépendez pas de classes concrètes.

> Ne parler pas aux inconnus - ne parlez qu'a vos amis immédiats. (**Loi de Déméter**)

> Ne nous appelez pas, nous vous appelerons. (**Principe d'Hollywood**)

# Stratégie (Strategy)

> Le pattern **Stratégie** définit une famille d'algorithmes, encapsule chacun d'eux et les rends interchangeables.
Stratégie permets à l'algorithme de varier indépendamment des clients qui l'utilisent.

# Observateur (Observer)

> Le pattern **Observateur** définit une relation entre objets de type un-à-plusieurs, de façon que,
lorsque un objet change d'état, tous ceux qui en dépendent en soient notifiés et soient mis à jour automatiquement.

# Décorateur (Decorator)

> Le pattern **Décorateur** attache dynamiquement des responsabilités supplémentaires à un objet. Il fournit
une alternative souple à la dérivation, pour étendre les fonctionnalités.

# Fabriquation (Factory Method)

> Le pattern **Fabrication** définit une interface pour la création d'un objet, mais en laissant au sous-classes le choix des classes à instancier. Fabrication permet à une classe de déléguer l'instanciation à des sous classes.

# Singleton

> Le pattern **Singleton** garantit qu'une classe n'a qu'une seule instance et fournit un point d'accés globale à cette instance.

# Commande (Command)

> Le pattern **Commande** encapsule une requête comme un objet, autorisant ainsi le paramétrage des clients par différentes requêtes, files d'attente et récapitulatifs de requêtes, et de plus, permettant la réversibilité des opérations.

# Adaptateur (Adapter)

> Le pattern **Adaptateur** convertit l'interface d'une classe en une autre conforme à celle du client. L'Adaptateur permet à des classes de collaborer, alors qu'elle n'auraient pas pu le faire du fait d'interfaces incompatibles.

# Façade (Facade)

> Le pattern **Façade** fournit une interface unifiée à l'ensemble des interfaces d'un sous-système. La façade fournit une interface de plus
haut niveau qui rend le sous-système plus facile à utiliser.

# Patron de méthode (Template Method)

> Le pattern **Patron de méthode** définit le squelette d'un algorithm dans une méthode, en déléguant certaines étapes aux sous-classes. Patron de méthode permet aux sous-classes de redéfinir certaines étapes d'un algorithme sans modifier la structure de celui-ci.
