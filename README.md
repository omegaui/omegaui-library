# omegaui-library
Super Flexible UI Elements Based on Java Swing with animations and a dynamic database management system.

# Available UI Elements

`omegaui.component`

| Name           | Purpose                                                                      |
|----------------|------------------------------------------------------------------------------|
| `Comp`         | Renders a Button (**deprecated** use TextComp instead)                       |
| `TextComp`     | Renders text and image can be used both as a Button and a Label              |
| `EdgeComp`     | Renders a label with a pointing edge background (**clickable**)              |
| `SwitchComp`   | The de facto toggle component                                                |
| `ToggleComp`   | Looks like a toggle button                                                   |
| `RTextField`   | The default JTextField with colored border and hint text                     |
| `NoCaretField` | The Custom JComponent, looks like text field but has **no** caret navigation |
| `SliderComp`   | A Custom Slider Implementation                                               |
| `FlexPanel`    | The Panel with **round** corners, border color and **gradient** background   |

# Available Animations
Animations are only available for `TextComp`

`omegaui.component.animation.Animations`

Available Animations : **4**

| Name                          | Purpose                                                                     |
|-------------------------------|-----------------------------------------------------------------------------|
| `getLineAnimationLayer`       | Renders a growing line below the text from the center                       |
| `getImageBoxAnimationLayer`   | Renders growing lines around the image that ultimately resemble a box       |
| `getImageSizeAnimationLayer`  | Renders a scaling animation by scaling the image up or down from the center |
| `getImageFrameAnimationLayer` | Renders a set of images one by one                                          |

# Available Listeners

### [`KeyStrokeListener`](https://github.com/omegaui/keystrokelistener)

`SlideListener`

`ToggleListener`

# Available D-DBMS

### [dynamic-database](https://github.com/omegaui/dynamic-database)

# Examples or Usage
See [omegaide](https://github.com/omegaui/omegaide)

It's entirely built around with omegaui-library.


