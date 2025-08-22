package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * KAICOM device specifications for Android Compose previews.
 *
 * This extension provides KAICOM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kaicom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kaicom: Any
  get() = object {
      /** KAICOM K901 */
      val K901 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** KAICOM K901_2 */
      val K901_2 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** KAICOM W660 */
      val W660 = "spec:width=640,height=1136,unit=px,dpi=320"

  }
