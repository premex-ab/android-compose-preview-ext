package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Samtech device specifications for Android Compose previews.
 *
 * This extension provides Samtech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Samtech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Samtech: Any
  get() = object {
      /** Samtech T3G_04 */
      val T3G_04 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Samtech TWIFI-07 */
      val TWIFI_07 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Samtech TWIFI_Q07 */
      val TWIFI_Q07 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
