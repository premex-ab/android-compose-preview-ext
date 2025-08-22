package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * VSP device specifications for Android Compose previews.
 *
 * This extension provides VSP device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vsp.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vsp: Any
  get() = object {
      /** VSP beaudry */
      val BEAUDRY = "spec:width=720,height=1280,unit=px,dpi=213"

  }
