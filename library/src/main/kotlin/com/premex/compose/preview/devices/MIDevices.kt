package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MI device specifications for Android Compose previews.
 *
 * This extension provides MI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MI: Any
  get() = object {
      /** MI anglee */
      val ANGLEE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MI eva */
      val EVA = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
