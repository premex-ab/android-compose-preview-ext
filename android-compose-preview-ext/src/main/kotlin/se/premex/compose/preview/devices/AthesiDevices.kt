package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Athesi device specifications for Android Compose previews.
 *
 * This extension provides Athesi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Athesi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Athesi: Any
  get() = object {
      /** Athesi AP5501 */
      val AP5501 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Athesi AP5701 */
      val AP5701 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Athesi AP5801 */
      val AP5801 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** Athesi AT-E8T */
      val AT_E8T = "spec:width=800,height=1280,unit=px,dpi=320"

      /** Athesi E55 */
      val E55 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Athesi E65 */
      val E65 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Athesi E6A */
      val E6A = "spec:width=720,height=1280,unit=px,dpi=240"

      /** Athesi RT4500 */
      val RT4500 = "spec:width=480,height=854,unit=px,dpi=240"

  }
