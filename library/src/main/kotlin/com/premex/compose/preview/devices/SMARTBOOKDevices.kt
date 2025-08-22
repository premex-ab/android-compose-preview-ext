package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SMARTBOOK device specifications for Android Compose previews.
 *
 * This extension provides SMARTBOOK device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SMARTBOOK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SMARTBOOK: Any
  get() = object {
      /** SMARTBOOK S104G */
      val S104G = "spec:width=800,height=1280,unit=px,dpi=240"

      /** SMARTBOOK S204G */
      val S204G = "spec:width=800,height=1280,unit=px,dpi=160"

  }
