package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SWACONNECT device specifications for Android Compose previews.
 *
 * This extension provides SWACONNECT device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Swaconnect.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Swaconnect: Any
  get() = object {
      /** SWACONNECT SWA310 */
      val SWA310 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
