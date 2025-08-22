package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ALPINE device specifications for Android Compose previews.
 *
 * This extension provides ALPINE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ALPINE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ALPINE: Any
  get() = object {
      /** ALPINE INE-AW409S */
      val INE_AW409S = "spec:width=720,height=1280,unit=px,dpi=160"

      /** ALPINE INE-AX809 */
      val INE_AX809 = "spec:width=720,height=1280,unit=px,dpi=160"

  }
