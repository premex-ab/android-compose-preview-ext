package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TIWELL device specifications for Android Compose previews.
 *
 * This extension provides TIWELL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tiwell.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tiwell: Any
  get() = object {
      /** TIWELL AP-115G */
      val AP_115G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** TIWELL AS_601L */
      val AS_601L = "spec:width=720,height=1440,unit=px,dpi=320"

  }
