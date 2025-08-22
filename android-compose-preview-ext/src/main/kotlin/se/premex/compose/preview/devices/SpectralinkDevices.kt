package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Spectralink device specifications for Android Compose previews.
 *
 * This extension provides Spectralink device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Spectralink.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Spectralink: Any
  get() = object {
      /** Spectralink VC92 */
      val VC92 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Spectralink Versity */
      val VERSITY = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
