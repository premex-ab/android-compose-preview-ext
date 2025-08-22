package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Woxter device specifications for Android Compose previews.
 *
 * This extension provides Woxter device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Woxter.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Woxter: Any
  get() = object {
      /** Woxter Woxter_N200 */
      val WOXTER_N200 = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** Woxter X100 */
      val X100 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Woxter X70 */
      val X70 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
