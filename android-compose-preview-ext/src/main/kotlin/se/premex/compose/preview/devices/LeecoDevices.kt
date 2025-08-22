package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * LeEco device specifications for Android Compose previews.
 *
 * This extension provides LeEco device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Leeco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Leeco: Any
  get() = object {
      /** LeEco le_s2 */
      val LE_S2 = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** LeEco le_s2_na */
      val LE_S2_NA = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** LeEco le_s2_ww */
      val LE_S2_WW = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** LeEco le_x2 */
      val LE_X2 = "spec:width=1440,height=2560,unit=px,dpi=560"

      /** LeEco le_x2_na */
      val LE_X2_NA = "spec:width=1440,height=2560,unit=px,dpi=560"

      /** LeEco le_zl1 */
      val LE_ZL1 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
