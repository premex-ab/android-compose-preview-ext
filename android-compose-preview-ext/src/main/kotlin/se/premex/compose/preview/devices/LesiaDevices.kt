package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * LESIA device specifications for Android Compose previews.
 *
 * This extension provides LESIA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Lesia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Lesia: Any
  get() = object {
      /** LESIA C5 */
      val C5 = "spec:width=480,height=960,unit=px,dpi=198"

      /** LESIA HOT_30 */
      val HOT_30 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** LESIA K2s */
      val K2S = "spec:width=480,height=960,unit=px,dpi=198"

      /** LESIA K6 */
      val K6 = "spec:width=480,height=960,unit=px,dpi=200"

      /** LESIA NEO_9 */
      val NEO_9 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** LESIA SMART_7 */
      val SMART_7 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
