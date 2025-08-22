package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BALMUDA device specifications for Android Compose previews.
 *
 * This extension provides BALMUDA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BALMUDA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BALMUDA: Any
  get() = object {
      /** BALMUDA A101BM */
      val A101BM = "spec:width=1080,height=1920,unit=px,dpi=450"

      /** BALMUDA X01A */
      val X01A = "spec:width=1080,height=1920,unit=px,dpi=450"

  }
