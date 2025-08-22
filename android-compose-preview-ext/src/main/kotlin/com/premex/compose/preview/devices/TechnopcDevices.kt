package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Technopc device specifications for Android Compose previews.
 *
 * This extension provides Technopc device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Technopc.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Technopc: Any
  get() = object {
      /** Technopc Technopc_UP10S43LA */
      val TECHNOPC_UP10S43LA = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Technopc Technopc_UP10SI36LA */
      val TECHNOPC_UP10SI36LA = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Technopc TM-T10SA */
      val TM_T10SA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Technopc TM-T10SA-V2 */
      val TM_T10SA_V2 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
