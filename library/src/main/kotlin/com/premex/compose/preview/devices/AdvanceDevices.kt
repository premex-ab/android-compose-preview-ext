package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Advance device specifications for Android Compose previews.
 *
 * This extension provides Advance device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Advance.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Advance: Any
  get() = object {
      /** Advance Pr5650 */
      val PR5650 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Advance Pr7547 */
      val PR7547 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Advance Tr4986 */
      val TR4986 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
