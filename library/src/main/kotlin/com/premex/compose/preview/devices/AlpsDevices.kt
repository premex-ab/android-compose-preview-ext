package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * alps device specifications for Android Compose previews.
 *
 * This extension provides alps device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Alps.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Alps: Any
  get() = object {
      /** alps hct77_jb */
      val HCT77_JB = "spec:width=480,height=800,unit=px,dpi=240"

      /** alps 8227L_demo */
      val _8227L_DEMO = "spec:width=600,height=1024,unit=px,dpi=160"

  }
