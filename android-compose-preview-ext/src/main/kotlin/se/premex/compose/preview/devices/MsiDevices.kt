package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MSI device specifications for Android Compose previews.
 *
 * This extension provides MSI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Msi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Msi: Any
  get() = object {
      /** MSI caoya */
      val CAOYA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MSI ND52-Gen2 */
      val ND52_GEN2 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
