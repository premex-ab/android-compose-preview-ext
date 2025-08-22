package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Hammer device specifications for Android Compose previews.
 *
 * This extension provides Hammer device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hammer.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hammer: Any
  get() = object {
      /** Hammer Energy_2_2022 */
      val ENERGY_2_2022 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Hammer Explorer_Plus */
      val EXPLORER_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Hammer Hammer_Blade_3 */
      val HAMMER_BLADE_3 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Hammer Hammer_Blade_4 */
      val HAMMER_BLADE_4 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Hammer Hammer_Blade_5G */
      val HAMMER_BLADE_5G = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Hammer Hammer_Construction */
      val HAMMER_CONSTRUCTION = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Hammer Hammer_Expl_Pro */
      val HAMMER_EXPL_PRO = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Hammer HS2302x */
      val HS2302X = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hammer HS2401x */
      val HS2401X = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Hammer HS2402 */
      val HS2402 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Hammer HS2403x */
      val HS2403X = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** Hammer HS2404x */
      val HS2404X = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** Hammer HS2512 */
      val HS2512 = "spec:width=720,height=1612,unit=px,dpi=320"

  }
