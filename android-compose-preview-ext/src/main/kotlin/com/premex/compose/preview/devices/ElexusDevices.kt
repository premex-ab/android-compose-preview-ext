package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Elexus device specifications for Android Compose previews.
 *
 * This extension provides Elexus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Elexus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Elexus: Any
  get() = object {
      /** Elexus G6_pro */
      val G6_PRO = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
