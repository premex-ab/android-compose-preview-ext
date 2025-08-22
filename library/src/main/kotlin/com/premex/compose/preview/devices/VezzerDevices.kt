package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VEZZER device specifications for Android Compose previews.
 *
 * This extension provides VEZZER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vezzer.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vezzer: Any
  get() = object {
      /** VEZZER lakeside */
      val LAKESIDE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** VEZZER piha */
      val PIHA = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
