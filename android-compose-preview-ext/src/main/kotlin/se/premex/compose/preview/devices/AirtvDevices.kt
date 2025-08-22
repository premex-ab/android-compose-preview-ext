package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * AirTV device specifications for Android Compose previews.
 *
 * This extension provides AirTV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Airtv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Airtv: Any
  get() = object {
      /** AirTV DV8535 */
      val DV8535 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** AirTV kunlun */
      val KUNLUN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
