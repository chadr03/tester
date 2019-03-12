/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc2582.bet.triggers;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.Trigger;

public class ExampleButton extends Button {

    Button a;
    Button b;

    public ExampleButton(Button a, Button b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean get() {
        return a.get() && b.get();
    }

}
