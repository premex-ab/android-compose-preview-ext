package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AZOM device specifications for Android Compose previews.
 *
 * This extension provides AZOM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AZOM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AZOM: Any
  get() = object {
      /** AZOM River1 */
      val RIVER1 = "spec:width=1080,height=2400,unit=px,dpi=480"

  }
