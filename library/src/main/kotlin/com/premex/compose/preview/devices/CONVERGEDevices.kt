package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CONVERGE device specifications for Android Compose previews.
 *
 * This extension provides CONVERGE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CONVERGE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CONVERGE: Any
  get() = object {
      /** CONVERGE T7045PS */
      val T7045PS = "spec:width=600,height=1024,unit=px,dpi=160"

  }
