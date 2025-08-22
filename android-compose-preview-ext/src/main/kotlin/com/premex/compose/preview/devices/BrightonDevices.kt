package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Brighton device specifications for Android Compose previews.
 *
 * This extension provides Brighton device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Brighton.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Brighton: Any
  get() = object {
      /** Brighton MAL-FWTVTB */
      val MAL_FWTVTB = "spec:width=800,height=1280,unit=px,dpi=160"

  }
