package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * PC_Smart device specifications for Android Compose previews.
 *
 * This extension provides PC_Smart device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PcSmart.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PcSmart: Any
  get() = object {
      /** PC_Smart PCSGOB10LTE-V2 */
      val PCSGOB10LTE_V2 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
