package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * XB device specifications for Android Compose previews.
 *
 * This extension provides XB device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Xb.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Xb: Any
  get() = object {
      /** XB XB-T11i */
      val XB_T11I = "spec:width=1200,height=2000,unit=px,dpi=240"

  }
