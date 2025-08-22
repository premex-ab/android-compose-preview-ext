package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ECONNECT device specifications for Android Compose previews.
 *
 * This extension provides ECONNECT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Econnect.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Econnect: Any
  get() = object {
      /** ECONNECT SQ126G */
      val SQ126G = "spec:width=800,height=1280,unit=px,dpi=160"

  }
