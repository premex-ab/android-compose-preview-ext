package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ALPHA_LING device specifications for Android Compose previews.
 *
 * This extension provides ALPHA_LING device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ALPHALING.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ALPHALING: Any
  get() = object {
      /** ALPHA_LING A97GT */
      val A97GT = "spec:width=800,height=1280,unit=px,dpi=213"

  }
