package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ALIGATOR device specifications for Android Compose previews.
 *
 * This extension provides ALIGATOR device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Aligator.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Aligator: Any
  get() = object {
      /** ALIGATOR ALIGATOR_RX550 */
      val ALIGATOR_RX550 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** ALIGATOR ALIGATOR_RX710 */
      val ALIGATOR_RX710 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ALIGATOR ALIGATOR_RX800 */
      val ALIGATOR_RX800 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ALIGATOR ALIGATOR_S5070 */
      val ALIGATOR_S5070 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** ALIGATOR ALIGATOR_S5520 */
      val ALIGATOR_S5520 = "spec:width=480,height=960,unit=px,dpi=240"

      /** ALIGATOR ALIGATOR_S5540 */
      val ALIGATOR_S5540 = "spec:width=480,height=960,unit=px,dpi=240"

      /** ALIGATOR ALIGATOR_S6000 */
      val ALIGATOR_S6000 = "spec:width=480,height=960,unit=px,dpi=240"

      /** ALIGATOR ALIGATOR_S6500 */
      val ALIGATOR_S6500 = "spec:width=540,height=1200,unit=px,dpi=240"

      /** ALIGATOR RX850 */
      val RX850 = "spec:width=480,height=960,unit=px,dpi=240"

      /** ALIGATOR S5710 */
      val S5710 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
