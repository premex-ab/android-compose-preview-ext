package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * 8849 device specifications for Android Compose previews.
 *
 * This extension provides 8849 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices._8849.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices._8849: Any
  get() = object {
      /** 8849 OB-A98 */
      val OB_A98 = "spec:width=1440,height=3200,unit=px,dpi=560"

      /** 8849 OB-P08 */
      val OB_P08 = "spec:width=1200,height=1920,unit=px,dpi=260"

      /** 8849 OB-P10 */
      val OB_P10 = "spec:width=1200,height=1920,unit=px,dpi=260"

      /** 8849 TANK2 */
      val TANK2 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** 8849 TANK2PRO */
      val TANK2PRO = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** 8849 TANK3 */
      val TANK3 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** 8849 TANK_MINI_1 */
      val TANK_MINI_1 = "spec:width=540,height=1200,unit=px,dpi=260"

  }
