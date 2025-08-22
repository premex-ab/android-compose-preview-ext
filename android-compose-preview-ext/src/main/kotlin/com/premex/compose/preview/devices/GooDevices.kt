package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Goo device specifications for Android Compose previews.
 *
 * This extension provides Goo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Goo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Goo: Any
  get() = object {
      /** Goo v12dn */
      val V12DN = "spec:width=720,height=1440,unit=px,dpi=320"

  }
