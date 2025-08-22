package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Intex device specifications for Android Compose previews.
 *
 * This extension provides Intex device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Intex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Intex: Any
  get() = object {
      /** Intex Aqua_Ring */
      val AQUA_RING = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Intex Aqua_Supreme_Plus */
      val AQUA_SUPREME_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

  }
