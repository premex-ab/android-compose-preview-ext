package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SITI_Playtop device specifications for Android Compose previews.
 *
 * This extension provides SITI_Playtop device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SitiPlaytop.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SitiPlaytop: Any
  get() = object {
      /** SITI_Playtop DTC2141 */
      val DTC2141 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
