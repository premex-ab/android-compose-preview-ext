package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * PCSMART device specifications for Android Compose previews.
 *
 * This extension provides PCSMART device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Pcsmart.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Pcsmart: Any
  get() = object {
      /** PCSMART PCSGOB10MVA-A */
      val PCSGOB10MVA_A = "spec:width=800,height=1280,unit=px,dpi=160"

  }
